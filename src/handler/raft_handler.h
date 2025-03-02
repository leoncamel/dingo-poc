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

#ifndef DINGODB_HANDLER_RAFT_HANDLER_H_
#define DINGODB_HANDLER_RAFT_HANDLER_H_

#include "common/context.h"
#include "engine/raw_engine.h"
#include "handler/handler.h"
#include "proto/raft.pb.h"

namespace dingodb {

// PutRequest
class PutHandler : public BaseHandler {
 public:
  HandlerType GetType() override { return HandlerType::PUT; }
  void Handle(std::shared_ptr<Context> ctx, std::shared_ptr<RawEngine> engine, const pb::raft::Request &req) override;
};

// PutIfAbsentRequest
class PutIfAbsentHandler : public BaseHandler {
 public:
  HandlerType GetType() override { return HandlerType::PUTIFABSENT; }
  void Handle(std::shared_ptr<Context> ctx, std::shared_ptr<RawEngine> engine, const pb::raft::Request &req) override;
};

// DeleteRangeRequest
class DeleteRangeHandler : public BaseHandler {
 public:
  HandlerType GetType() override { return HandlerType::DELETERANGE; }
  void Handle(std::shared_ptr<Context> ctx, std::shared_ptr<RawEngine> engine, const pb::raft::Request &req) override;
};

// DeleteBatchRequest
class DeleteBatchHandler : public BaseHandler {
 public:
  HandlerType GetType() override { return HandlerType::DELETEBATCH; }
  void Handle(std::shared_ptr<Context> ctx, std::shared_ptr<RawEngine> engine, const pb::raft::Request &req) override;
};

class RaftApplyHandlerFactory : public HandlerFactory {
 public:
  std::shared_ptr<HandlerCollection> Build() override;
};

}  // namespace dingodb

#endif  // DINGODB_HANDLER_RAFT_HANDLER_H_