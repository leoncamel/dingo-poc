// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coordinator.proto

package com.dingodb.pb.coordinator;

public interface GetStoreMapResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dingodb.pb.coordinator.GetStoreMapResponse)
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
   * <code>uint64 epoch = 2 [json_name = "epoch"];</code>
   * @return The epoch.
   */
  long getEpoch();

  /**
   * <code>.dingodb.pb.common.StoreMap storemap = 3 [json_name = "storemap"];</code>
   * @return Whether the storemap field is set.
   */
  boolean hasStoremap();
  /**
   * <code>.dingodb.pb.common.StoreMap storemap = 3 [json_name = "storemap"];</code>
   * @return The storemap.
   */
  com.dingodb.pb.common.StoreMap getStoremap();
  /**
   * <code>.dingodb.pb.common.StoreMap storemap = 3 [json_name = "storemap"];</code>
   */
  com.dingodb.pb.common.StoreMapOrBuilder getStoremapOrBuilder();
}
