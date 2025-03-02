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

#ifndef DINGODB_ENGINE_WRITE_DATA_H_
#define DINGODB_ENGINE_WRITE_DATA_H_

#include <vector>

#include "butil/status.h"
#include "proto/raft.pb.h"

namespace dingodb {

using WriteCb_t = std::function<void(butil::Status)>;

enum class DatumType {
  PUT = 0,
  PUTIFABSENT = 1,
  CREATESCHEMA = 2,
  DELETERANGE = 3,
  DELETEBATCH = 4,
};

class DatumAble {
 public:
  virtual ~DatumAble() = default;
  virtual DatumType GetType() = 0;
  virtual pb::raft::Request* TransformToRaft() = 0;
  virtual void TransformFromRaft(pb::raft::Response& resonse) = 0;
};

struct PutDatum : public DatumAble {
  DatumType GetType() override { return DatumType::PUT; }

  pb::raft::Request* TransformToRaft() override {
    auto* request = new pb::raft::Request();

    request->set_cmd_type(pb::raft::CmdType::PUT);
    pb::raft::PutRequest* put_request = request->mutable_put();
    for (auto& kv : kvs) {
      put_request->set_cf_name(cf_name);
      put_request->add_kvs()->CopyFrom(kv);
    }

    return request;
  };

  void TransformFromRaft(pb::raft::Response& resonse) override {}

  std::string cf_name;
  std::vector<pb::common::KeyValue> kvs;
};

struct PutIfAbsentDatum : public DatumAble {
  DatumType GetType() override { return DatumType::PUTIFABSENT; }

  pb::raft::Request* TransformToRaft() override {
    auto* request = new pb::raft::Request();

    request->set_cmd_type(pb::raft::CmdType::PUTIFABSENT);
    pb::raft::PutIfAbsentRequest* put_if_absent_request = request->mutable_put_if_absent();
    put_if_absent_request->set_cf_name(cf_name);
    put_if_absent_request->set_is_atomic(is_atomic);
    for (auto& kv : kvs) {
      put_if_absent_request->add_kvs()->CopyFrom(kv);
    }

    return request;
  }

  void TransformFromRaft(pb::raft::Response& resonse) override {}

  std::string cf_name;
  std::vector<pb::common::KeyValue> kvs;
  bool is_atomic;
};

struct DeleteBatchDatum : public DatumAble {
  ~DeleteBatchDatum() override = default;
  DatumType GetType() override { return DatumType::DELETEBATCH; }

  pb::raft::Request* TransformToRaft() override {
    auto* request = new pb::raft::Request();

    request->set_cmd_type(pb::raft::CmdType::DELETEBATCH);
    pb::raft::DeleteBatchRequest* delete_batch_request = request->mutable_delete_batch();
    delete_batch_request->set_cf_name(cf_name);
    for (const auto& key : keys) {
      delete_batch_request->add_keys()->assign(key.data(), key.size());
    }

    return request;
  }

  void TransformFromRaft(pb::raft::Response& resonse) override {}

  std::string cf_name;
  std::vector<std::string> keys;
};

struct DeleteRangeDatum : public DatumAble {
  ~DeleteRangeDatum() override = default;
  DatumType GetType() override { return DatumType::DELETERANGE; }

  pb::raft::Request* TransformToRaft() override {
    auto* request = new pb::raft::Request();

    request->set_cmd_type(pb::raft::CmdType::DELETERANGE);
    pb::raft::DeleteRangeRequest* delete_range_request = request->mutable_delete_range();
    delete_range_request->set_cf_name(cf_name);

    for (const auto& range : ranges) {
      delete_range_request->add_ranges()->CopyFrom(range);
    }

    return request;
  }

  void TransformFromRaft(pb::raft::Response& resonse) override {}

  std::string cf_name;
  std::vector<pb::common::Range> ranges;
};

struct CreateSchemaDatum : public DatumAble {
  ~CreateSchemaDatum() override = default;
  DatumType GetType() override { return DatumType::CREATESCHEMA; }

  pb::raft::Request* TransformToRaft() override { return nullptr; }
  void TransformFromRaft(pb::raft::Response& resonse) override {}
};

class WriteData {
 public:
  std::vector<std::shared_ptr<DatumAble>> Datums() const { return datums_; }
  void AddDatums(std::shared_ptr<DatumAble> datum) { datums_.push_back(datum); }

 private:
  std::vector<std::shared_ptr<DatumAble>> datums_;
};

}  // namespace dingodb

#endif  // DINGODB_ENGINE_WRITE_DATA_H_