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

import java.util.List;

public class PartitionRule implements Partition {

    String strategy;

    List<String> cols;

    List<PartitionDetailDefinition> details;

    public PartitionRule(String strategy, List<String> cols, List<PartitionDetailDefinition> details) {
        this.strategy = strategy;
        this.cols = cols;
        this.details = details;
    }

    @Override
    public String strategy() {
        return strategy;
    }

    @Override
    public List<String> cols() {
        return cols;
    }

    @Override
    public List<PartitionDetailDefinition> details() {
        return details;
    }
}
