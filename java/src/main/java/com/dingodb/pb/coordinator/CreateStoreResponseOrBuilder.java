// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coordinator.proto

package com.dingodb.pb.coordinator;

public interface CreateStoreResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dingodb.pb.coordinator.CreateStoreResponse)
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
   * <code>uint64 store_id = 2 [json_name = "storeId"];</code>
   * @return The storeId.
   */
  long getStoreId();

  /**
   * <code>string password = 3 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 3 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
