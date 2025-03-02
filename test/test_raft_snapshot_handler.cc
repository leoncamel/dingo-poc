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

#include <gtest/gtest.h>
#include <unistd.h>

#include <filesystem>
#include <iostream>
#include <memory>
#include <numeric>
#include <string>
#include <vector>

#include "braft/raft.pb.h"
#include "braft/snapshot.h"
#include "butil/status.h"
#include "common/context.h"
#include "common/helper.h"
#include "config/config.h"
#include "config/yaml_config.h"
#include "engine/raw_rocks_engine.h"
#include "handler/raft_snapshot_handler.h"
#include "proto/common.pb.h"
#include "proto/store_internal.pb.h"
#include "server/server.h"

const std::string kYamlConfigContent =
    "cluster:\n"
    "  name: dingodb\n"
    "  instance_id: 12345\n"
    "  coordinators: 127.0.0.1:19190,127.0.0.1:19191,127.0.0.1:19192\n"
    "  keyring: TO_BE_CONTINUED\n"
    "server:\n"
    "  host: 127.0.0.1\n"
    "  port: 23000\n"
    "  heartbeatInterval: 10000 # ms\n"
    "raft:\n"
    "  host: 127.0.0.1\n"
    "  port: 23100\n"
    "  path: /tmp/dingo-store/data/store/raft\n"
    "  electionTimeout: 1000 # ms\n"
    "  snapshotInterval: 3600 # s\n"
    "log:\n"
    "  logPath: /tmp/dingo-store/log\n"
    "store:\n"
    "  dbPath: /tmp/dingo-store/data/store/db\n"
    "  base:\n"
    "    block_size: 131072\n"
    "    block_cache: 67108864\n"
    "    arena_block_size: 67108864\n"
    "    min_write_buffer_number_to_merge: 4\n"
    "    max_write_buffer_number: 4\n"
    "    max_compaction_bytes: 134217728\n"
    "    write_buffer_size: 4194304\n"
    "    prefix_extractor: 8\n"
    "    max_bytes_for_level_base: 41943040\n"
    "    target_file_size_base: 4194304\n"
    "  default:\n"
    "  instruction:\n"
    "    max_write_buffer_number: 3\n"
    "  columnFamilies:\n"
    "    - default\n"
    "    - meta\n"
    "    - instruction\n";

static const std::string& kDefaultCf = "default";

const std::string RAFT_SNAPSHOT_PATH = "/tmp/dingo-store/data/store/raft/snapshot";

const char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                         's', 't', 'o', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

// rand string
std::string genRandomString(int len) {
  std::string result;
  int alphabet_len = sizeof(alphabet);
  for (int i = 0; i < len; ++i) {
    result.append(1, alphabet[rand() % alphabet_len]);
  }

  return result;
}

class RaftSnapshotTest : public testing::Test {
 protected:
  static void SetUpTestSuite() {
    std::srand(std::time(nullptr));

    std::shared_ptr<dingodb::Config> config = std::make_shared<dingodb::YamlConfig>();
    if (config->Load(kYamlConfigContent) != 0) {
      std::cout << "Load config failed" << std::endl;
      return;
    }

    engine = std::make_shared<dingodb::RawRocksEngine>();
    if (!engine->Init(config)) {
      std::cout << "RawRocksEngine init failed" << std::endl;
    }

    std::filesystem::create_directories(RAFT_SNAPSHOT_PATH);
  }

  static void TearDownTestSuite() {
    engine->Close();
    // engine->Destroy();

    // std::filesystem::remove_all(RAFT_SNAPSHOT_PATH);
  }

  void SetUp() override {}

  void TearDown() override {}

  static std::shared_ptr<dingodb::RawRocksEngine> engine;
};

std::shared_ptr<dingodb::RawRocksEngine> RaftSnapshotTest::engine = nullptr;

TEST_F(RaftSnapshotTest, RaftSnapshot) {
  auto reader = RaftSnapshotTest::engine->NewReader(kDefaultCf);
  // Ready data
  auto writer = RaftSnapshotTest::engine->NewWriter(kDefaultCf);
  const std::vector<std::string> prefixs = {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "mm"};
  dingodb::pb::common::KeyValue kv;
  for (int i = 0; i < 10000; ++i) {
    int pos = i % prefixs.size();

    kv.set_key(prefixs[pos] + genRandomString(30));
    kv.set_value(genRandomString(256));
    writer->KvPut(kv);
  }

  // Save snapshot
  std::unique_ptr<dingodb::RaftSnapshot> raft_snapshot =
      std::make_unique<dingodb::RaftSnapshot>(RaftSnapshotTest::engine);

  auto snapshot_storage = std::make_unique<braft::LocalSnapshotStorage>(RAFT_SNAPSHOT_PATH);
  if (snapshot_storage->init() != 0) {
    LOG(ERROR) << "LocalSnapshotStorage init failed";
  }

  auto region = std::make_shared<dingodb::pb::common::Region>();
  region->set_id(111);
  region->set_name("test-snapshot");
  auto range = region->mutable_range();
  range->set_start_key("bb");
  range->set_end_key("cc");

  auto snapshot_writer = snapshot_storage->create();
  auto gen_snapshot_file_func = std::bind(&dingodb::RaftSnapshot::GenSnapshotFileByScan, raft_snapshot.get(),
                                          std::placeholders::_1, std::placeholders::_2);
  EXPECT_EQ(true, raft_snapshot->SaveSnapshot(snapshot_writer, region, gen_snapshot_file_func));
  braft::SnapshotMeta meta;
  meta.set_last_included_index(1004);
  meta.set_last_included_term(14);
  snapshot_writer->save_meta(meta);
  snapshot_storage->close(snapshot_writer);

  // Count key before load snapshot
  int64_t count = 0;
  reader->KvCount(range->start_key(), range->end_key(), count);
  std::cout << "range key count: " << count << std::endl;

  // Load snapshot
  auto snapshot_reader = snapshot_storage->open();
  EXPECT_EQ(true, raft_snapshot->LoadSnapshot(snapshot_reader, region));
  snapshot_storage->close(snapshot_reader);

  // Count key after load snapshot
  count = 0;
  reader->KvCount(range->start_key(), range->end_key(), count);
  std::cout << "range key count: " << count << std::endl;
}
