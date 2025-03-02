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

package io.dingodb.client;

/**
 * Bin type for byte[] values.
 */
public final class ParticleType {
    public static final int NULL = 0;
    public static final int INTEGER = 1;
    public static final int DOUBLE = 2;
    public static final int STRING = 3;
    public static final int BLOB = 4;
    public static final int JBLOB = 7;
    public static final int BOOL = 17;
    public static final int MAP = 19;
    public static final int LIST = 20;
}
