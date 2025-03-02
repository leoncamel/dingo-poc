/*
 * Copyright 2021 DataCanvas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.dingodb.sdk.common.utils;

import com.google.protobuf.ByteString;
import io.dingodb.common.Common;
import io.dingodb.meta.Meta;
import io.dingodb.sdk.common.DingoClientException;
import io.dingodb.sdk.common.codec.KeyValueCodec;
import io.dingodb.sdk.common.partition.PartitionDetailDefinition;
import io.dingodb.sdk.common.table.Column;
import io.dingodb.sdk.common.table.ColumnDefinition;
import io.dingodb.sdk.common.table.Table;
import io.dingodb.sdk.common.table.TableDefinition;
import io.dingodb.sdk.common.table.metric.TableMetrics;
import io.dingodb.sdk.common.type.TypeCode;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_ANY;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_ARRAY;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_BIGINT;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_BOOLEAN;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_BYTES;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_DATE;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_DOUBLE;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_FLOAT;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_INTEGER;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_MULTISET;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_TIME;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_TIMESTAMP;
import static io.dingodb.meta.Meta.SqlType.SQL_TYPE_VARCHAR;
import static io.dingodb.sdk.common.utils.ByteArrayUtils.EMPTY_BYTES;
import static io.dingodb.sdk.common.utils.Parameters.cleanNull;

public class EntityConversion {

    public static Meta.TableDefinition mapping(Table table, Meta.DingoCommonId tableId) {
        Optional.ofNullable(table.getColumns())
                .filter(__ -> __.stream()
                        .map(Column::getName)
                        .distinct()
                        .count() == __.size())
                .orElseThrow(() -> new DingoClientException("Table field names cannot be repeated."));
        List<Meta.ColumnDefinition> columnDefinitions = table.getColumns().stream()
                .map(EntityConversion::mapping)
                .collect(Collectors.toList());

        return Meta.TableDefinition.newBuilder()
                .setName(table.getName())
                .setVersion(table.getVersion())
                .setTtl(table.getTtl())
                .setTablePartition(calcRange(table, tableId))
                .setEngine(Common.Engine.valueOf(table.getEngine()))
                .addAllColumns(columnDefinitions).build();
    }

    public static Table mapping(Meta.TableDefinition tableDefinition) {
        return new TableDefinition(
                tableDefinition.getName(),
                tableDefinition.getColumnsList().stream().map(EntityConversion::mapping).collect(Collectors.toList()),
                tableDefinition.getVersion(),
                (int) tableDefinition.getTtl(),
                null,
                tableDefinition.getEngine().name(),
                tableDefinition.getPropertiesMap());
    }

    public static Column mapping(Meta.ColumnDefinition definition) {
        return new ColumnDefinition(
                definition.getName(),
                mapping(definition.getSqlType()),
                definition.getElementType().name(),
                definition.getPrecision(),
                definition.getScale(),
                definition.getNullable(),
                definition.getIndexOfKey(),
                definition.getDefaultVal()
        );
    }

    public static TableMetrics mapping(Meta.TableMetrics metrics) {
        return new TableMetrics(
                metrics.getMinKey().toByteArray(),
                metrics.getMaxKey().toByteArray(),
                metrics.getRowsCount(),
                metrics.getPartCount()
        );
    }

    public static Meta.PartitionRule calcRange(Table table, Meta.DingoCommonId tableId) {
        KeyValueCodec codec = table.createCodec(tableId);
        if (table.getPartDefinition() == null) {
            try {
                Meta.RangePartition rangePartition = Meta.RangePartition.newBuilder().addRanges(
                        Common.Range.newBuilder()
                                .setStartKey(ByteString.copyFrom(codec.encodeMinKeyPrefix()))
                                .setEndKey(ByteString.copyFrom(codec.encodeMaxKeyPrefix()))
                                .build()
                ).build();
                return Meta.PartitionRule.newBuilder()
                        .setRangePartition(rangePartition)
                        .build();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        List<Integer> keyList = table.getKeyColumnIndices();
        int columnCount = table.getColumns().size();
        List<PartitionDetailDefinition> partDetails = table.getPartDefinition().details();

        List<Column> cols = keyList.stream().map(table::getColumn).collect(Collectors.toList());

        for (PartitionDetailDefinition partDetail : partDetails) {
            if (partDetail.getOperand().size() > keyList.size()) {
                throw new IllegalArgumentException(
                    "Partition values count must be <= key columns count, but values count is "
                    + partDetail.getOperand().size()
                );
            }
            for (int i = 0; i < partDetail.getOperand().size(); i++) {
                String simpleName = partDetail.getOperand().get(i).getClass().getSimpleName().toUpperCase();
                int simpleCode = TypeCode.codeOf(simpleName);
                String sqlType = cols.get(i).getType().toUpperCase();
                int sqlTypeCode = TypeCode.codeOf(sqlType);
                if (simpleCode != sqlTypeCode) {
                    throw new IllegalArgumentException(
                        "partition value type: (" + simpleName + ") must be the same as the primary key type: (" + sqlType + ")"
                    );
                }
            }
        }

        Iterator<byte[]> keys = partDetails.stream()
                .map(PartitionDetailDefinition::getOperand)
                .map(operand -> operand.toArray(new Object[columnCount]))
                .map(NoBreakFunctions.wrap(codec::encodeKey))
                .collect(Collectors.toCollection(() -> new TreeSet<>(ByteArrayUtils::compare)))
                .iterator();

        byte[] start = EMPTY_BYTES;
        Meta.RangePartition.Builder rangePartitionBuilder = Meta.RangePartition.newBuilder();
        while (keys.hasNext()) {
            rangePartitionBuilder
                    .addRanges(Common.Range.newBuilder()
                            .setStartKey(ByteString.copyFrom(start))
                            .setEndKey(ByteString.copyFrom(start = keys.next()))
                            .build());
        }
        Common.Range range = Common.Range.newBuilder()
                .setStartKey(ByteString.copyFrom(start))
                .build();
        Meta.RangePartition rangePartition = rangePartitionBuilder.addRanges(range).build();

        return Meta.PartitionRule.newBuilder()
                .setRangePartition(rangePartition)
                .build();
    }

    public static Meta.ColumnDefinition mapping(Column column) {
        return Meta.ColumnDefinition.newBuilder()
                .setName(column.getName())
                .setNullable(column.isNullable())
                .setElementType(Meta.ElementType.ELEM_TYPE_STRING)
                .setDefaultVal(cleanNull(column.getDefaultValue(), ""))
                .setPrecision(column.getPrecision())
                .setScale(column.getScale())
                .setIndexOfKey(column.getPrimary())
                .setSqlType(mapping(column.getType()))
                .build();
    }

    private static String mapping(Meta.SqlType sqlType) {
        switch (sqlType) {
            case SQL_TYPE_VARCHAR:
                return "STRING";
            case SQL_TYPE_INTEGER:
                return "INTEGER";
            case SQL_TYPE_BOOLEAN:
                return "BOOLEAN";
            case SQL_TYPE_DOUBLE:
                return "DOUBLE";
            case SQL_TYPE_BIGINT:
                return "LONG";
            case SQL_TYPE_FLOAT:
                return "FLOAT";
            case SQL_TYPE_DATE:
                return "DATE";
            case SQL_TYPE_TIME:
                return "TIME";
            case SQL_TYPE_TIMESTAMP:
                return "TIMESTAMP";
            case SQL_TYPE_ARRAY:
                return "ARRAY";
            case SQL_TYPE_MULTISET:
                return "MULTISET";
            case SQL_TYPE_ANY:
                return "ANY";
            case SQL_TYPE_BYTES:
                return "BINARY";
            default:
                break;
        }
        throw new IllegalArgumentException("Unrecognized type name \"" + sqlType.name() + "\".");
    }

    private static Meta.SqlType mapping(String type) {
        switch (type.toUpperCase()) {
            case "STRING":
            case "VARCHAR":
                return SQL_TYPE_VARCHAR;
            case "INT":
            case "INTEGER":
                return SQL_TYPE_INTEGER;
            case "BOOL":
            case "BOOLEAN":
                return SQL_TYPE_BOOLEAN;
            case "LONG":
            case "BIGINT":
                return SQL_TYPE_BIGINT;
            case "DOUBLE":
                return SQL_TYPE_DOUBLE;
            case "FLOAT":
                return SQL_TYPE_FLOAT;
            case "DATE":
                return SQL_TYPE_DATE;
            case "TIME":
                return SQL_TYPE_TIME;
            case "TIMESTAMP":
                return SQL_TYPE_TIMESTAMP;
            case "ARRAY":
                return SQL_TYPE_ARRAY;
            case "LIST":
            case "MULTISET":
                return SQL_TYPE_MULTISET;
            case "ANY":
                return SQL_TYPE_ANY;
            case "BYTES":
            case "BINARY":
            case "BLOB":
                return SQL_TYPE_BYTES;
            default:
                break;
        }
        throw new IllegalArgumentException("Unrecognized type name \"" + type + "\".");
    }
}
