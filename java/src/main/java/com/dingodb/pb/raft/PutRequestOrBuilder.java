// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package com.dingodb.pb.raft;

public interface PutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dingodb.pb.raft.PutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .dingodb.pb.common.KeyValue kvs = 1 [json_name = "kvs"];</code>
   */
  java.util.List<com.dingodb.pb.common.KeyValue> 
      getKvsList();
  /**
   * <code>repeated .dingodb.pb.common.KeyValue kvs = 1 [json_name = "kvs"];</code>
   */
  com.dingodb.pb.common.KeyValue getKvs(int index);
  /**
   * <code>repeated .dingodb.pb.common.KeyValue kvs = 1 [json_name = "kvs"];</code>
   */
  int getKvsCount();
  /**
   * <code>repeated .dingodb.pb.common.KeyValue kvs = 1 [json_name = "kvs"];</code>
   */
  java.util.List<? extends com.dingodb.pb.common.KeyValueOrBuilder> 
      getKvsOrBuilderList();
  /**
   * <code>repeated .dingodb.pb.common.KeyValue kvs = 1 [json_name = "kvs"];</code>
   */
  com.dingodb.pb.common.KeyValueOrBuilder getKvsOrBuilder(
      int index);
}
