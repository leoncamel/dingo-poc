// Copyright (c) 2023 dingodb.com, Inc. All Rights Reserved
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

#ifndef DINGODB_COMMON_CONSTANT_H_
#define DINGODB_COMMON_CONSTANT_H_

#include <cstdint>
#include <string>

namespace dingodb {

class Constant {
 public:
  // Define Global Region Id for Coordinator(As only One)
  static const int64_t kCoordinatorRegionId = 0;

  // Define Global TableID for Coordinator(As only one)
  static const uint64_t kCoordinatorTableId = 0;

  // Define Global SchemaId for Coordinator(As only one)
  static const uint64_t kCoordinatorSchemaId = 0;

  // Define Store data column family.
  static const std::string kStoreDataCF;
  // Define Store meta column family.
  static const std::string kStoreMetaCF;
  // Define store meta prefix.
  static const std::string kStoreRegionMetaPrefix;
  // Define store raft prefix.
  static const std::string kStoreRaftMetaPrefix;

  // rocksdb config
  inline static const std::string kDbPath = "store.dbPath";
  inline static const std::string kColumnFamilies = "store.columnFamilies";
  inline static const std::string kBaseColumnFamily = "store.base";

  inline static const std::string kBlockSize = "block_size";
  inline static const std::string kBlockCache = "block_cache";
  inline static const std::string kArenaBlockSize = "arena_block_size";
  inline static const std::string kMinWriteBufferNumberToMerge = "min_write_buffer_number_to_merge";
  inline static const std::string kMaxWriteBufferNumber = "max_write_buffer_number";
  inline static const std::string kMaxCompactionBytes = "max_compaction_bytes";
  inline static const std::string kWriteBufferSize = "write_buffer_size";
  inline static const std::string kPrefixExtractor = "prefix_extractor";
  inline static const std::string kMaxBytesForLevelBase = "max_bytes_for_level_base";
  inline static const std::string kTargetFileSizeBase = "target_file_size_base";
  inline static const std::string kMaxBytesForLevelMultiplier = "max_bytes_for_level_multiplier";

  // scan config
  inline static const std::string kStoreScan = "store.scan";
  inline static const std::string kStoreScanTimeoutMs = "timeout_ms";
  inline static const std::string kStoreScanMaxBytesRpc = "max_bytes_rpc";
  inline static const std::string kStoreScanMaxFetchCntByServer = "max_fetch_cnt_by_server";
  inline static const std::string kStoreScanScanIntervalMs = "scan_interval_ms";
};

}  // namespace dingodb

#endif  // DINGODB_COMMON_CONSTANT_H_
