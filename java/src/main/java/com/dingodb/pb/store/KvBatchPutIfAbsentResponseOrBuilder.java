// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package com.dingodb.pb.store;

public interface KvBatchPutIfAbsentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dingodb.pb.store.KvBatchPutIfAbsentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
   * @return The error.
   */
  com.dingodb.pb.error.Error getError();
  /**
   * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
   */
  com.dingodb.pb.error.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>repeated bytes put_keys = 2 [json_name = "putKeys"];</code>
   * @return A list containing the putKeys.
   */
  java.util.List<com.google.protobuf.ByteString> getPutKeysList();
  /**
   * <code>repeated bytes put_keys = 2 [json_name = "putKeys"];</code>
   * @return The count of putKeys.
   */
  int getPutKeysCount();
  /**
   * <code>repeated bytes put_keys = 2 [json_name = "putKeys"];</code>
   * @param index The index of the element to return.
   * @return The putKeys at the given index.
   */
  com.google.protobuf.ByteString getPutKeys(int index);
}
