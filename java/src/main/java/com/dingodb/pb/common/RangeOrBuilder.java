// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.dingodb.pb.common;

public interface RangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dingodb.pb.common.Range)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes start_key = 1 [json_name = "startKey"];</code>
   * @return The startKey.
   */
  com.google.protobuf.ByteString getStartKey();

  /**
   * <code>bytes end_key = 2 [json_name = "endKey"];</code>
   * @return The endKey.
   */
  com.google.protobuf.ByteString getEndKey();
}
