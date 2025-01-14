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

package io.dingodb.sdk.common.table;

import io.dingodb.sdk.common.type.DingoType;
import io.dingodb.sdk.common.type.DingoTypeFactory;

public interface Column {

    void setName(String name);

    String getName();

    void setType(String type);

    String getType();

    void setElementType(String elementType);

    String getElementType();

    void setPrecision(int precision);

    int getPrecision();

    void setScale(int scale);

    int getScale();

    void nullable(boolean nullable);

    boolean isNullable();

    void setPrimary(int primary);

    int getPrimary();

    void setDefaultValue(String defaultValue);

    String getDefaultValue();

    default DingoType getDingoType() {
        return DingoTypeFactory.fromName(getType(), getElementType(), isNullable());
    }

    default boolean isPrimary() {
        return getPrimary() > -1;
    }

}
