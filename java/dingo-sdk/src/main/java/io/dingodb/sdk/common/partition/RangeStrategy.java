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

package io.dingodb.sdk.common.partition;

import io.dingodb.sdk.common.codec.DingoKeyValueCodec;
import io.dingodb.sdk.common.codec.KeyValueCodec;
import io.dingodb.sdk.common.utils.ByteArrayUtils;
import io.dingodb.sdk.common.utils.ByteArrayUtils.ComparableByteArray;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeMap;

public class RangeStrategy extends PartitionStrategy<ComparableByteArray> {

    private final NavigableSet<ComparableByteArray> ranges;

    private final transient KeyValueCodec codec;

    public RangeStrategy(
            NavigableSet<ComparableByteArray> ranges,
             KeyValueCodec codec) {
        this.ranges = ranges;
        this.codec = codec;
    }

    @Override
    public int getPartNum() {
        return ranges.size();
    }

    @Override
    public ComparableByteArray calcPartId(Object @NonNull [] keyTuple) {
        try {
            return calcPartId(codec.encodeKey(keyTuple));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ComparableByteArray calcPartId(byte @NonNull [] keyBytes) {
        return ranges.floor(new ComparableByteArray(keyBytes));
    }

    @Override
    public Map<byte[], byte[]> calcPartitionRange(
            byte @NonNull [] startKey,
            byte @NonNull [] endKey,
            boolean includeEnd
    ) {
        Map<byte[], byte[]> keyMap = new TreeMap<>(ByteArrayUtils::compare);
        LinkedHashSet<ComparableByteArray> keySet = new LinkedHashSet<>();
        // Support > < condition when deleting
        if (startKey == null) {
            for (ComparableByteArray key : ranges) {
                if (ByteArrayUtils.lessThanOrEqual(key.getBytes(), endKey)) {
                    keySet.add(key);
                }
            }
        } else if (endKey == null) {
            for (ComparableByteArray key : ranges) {
                if (ByteArrayUtils.greatThanOrEqual(key.getBytes(), startKey)) {
                    keySet.add(key);
                }
            }
        } else {
            for (ComparableByteArray key : ranges) {
                if (ByteArrayUtils.greatThanOrEqual(key.getBytes(), startKey)
                        && ByteArrayUtils.lessThanOrEqual(key.getBytes(), endKey)) {
                    keySet.add(key);
                }
            }
        }
        LinkedHashSet<ComparableByteArray> subSet = keySet;

        byte[] start = startKey;
        byte[] end;
        Iterator<ComparableByteArray> iterator = subSet.iterator();
        while (iterator.hasNext()) {
            ComparableByteArray sKey = iterator.next();

            if (start == null) {
                start = sKey.getBytes();
            }
            if (iterator.hasNext()) {
                end = null;
            } else {
                end = endKey;
            }

            keyMap.put(start, end);
            start = null;
        }

        return keyMap;
    }

    @Override
    public Map<byte[], byte[]> calcPartitionPrefixRange(
            byte @NonNull [] startKey,
            byte @NonNull [] endKey,
            boolean includeEnd,
            boolean prefixRange
    ) {
        Map<byte[], byte[]> keyMap = new TreeMap<>(ByteArrayUtils::compare);

        SortedSet<ComparableByteArray> subSet = ranges.subSet(
                ranges.floor(new ComparableByteArray(startKey)), true,
                new ComparableByteArray(endKey, prefixRange), includeEnd
        );

        byte[] start = startKey;
        byte[] end;
        Iterator<ComparableByteArray> iterator = subSet.iterator();
        while (iterator.hasNext()) {
            ComparableByteArray sKey = iterator.next();

            if (start == null) {
                start = sKey.getBytes();
            }
            if (iterator.hasNext()) {
                end = null;
            } else {
                end = endKey;
            }

            keyMap.put(start, end);
            start = null;
        }

        return keyMap;
    }

    @Override
    public Map<byte[], byte[]> calcPartitionByPrefix(byte @NonNull [] prefix) {
        Map<byte[], byte[]> keyMap = new TreeMap<>(ByteArrayUtils::compare);
        LinkedHashSet<ComparableByteArray> keySet = new LinkedHashSet<>();

        // Identify left boundary
        boolean isLeft = true;
        ComparableByteArray previousKey = null;
        // Traverse to find partitions
        for (ComparableByteArray key : ranges) {
            if (isLeft) {
                if (ByteArrayUtils.lessThanOrEqual(prefix, key.getBytes())) {
                    if (previousKey != null) {
                        keySet.add(previousKey);
                    } else {
                        keySet.add(key);
                    }
                    isLeft = false;
                }
            } else {
                if (ByteArrayUtils.greatThanOrEqual(prefix, key.getBytes())) {
                    keySet.add(key);
                }
            }
            previousKey = key;
        }

        // If there is no satisfied partition, take the last partition
        if (keySet.size() == 0) {
            keyMap.put(ranges.last().getBytes(), null);
            return keyMap;
        }

        // Traverse all keys, add them to the map, and return
        LinkedHashSet<ComparableByteArray> subSet = keySet;
        Iterator<ComparableByteArray> iterator = subSet.iterator();
        while (iterator.hasNext()) {
            ComparableByteArray sKey = iterator.next();
            keyMap.put(sKey.getBytes(), null);
        }

        return keyMap;
    }
}
