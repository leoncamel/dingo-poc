// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package com.dingodb.pb.store;

public interface KvBatchGetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dingodb.pb.store.KvBatchGetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 region_id = 1 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  long getRegionId();

  /**
   * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
   * @return A list containing the keys.
   */
  java.util.List<com.google.protobuf.ByteString> getKeysList();
  /**
   * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
   * @return The count of keys.
   */
  int getKeysCount();
  /**
   * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
   * @param index The index of the element to return.
   * @return The keys at the given index.
   */
  com.google.protobuf.ByteString getKeys(int index);
}
