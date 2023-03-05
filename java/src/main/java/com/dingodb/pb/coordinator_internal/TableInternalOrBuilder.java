// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coordinator_internal.proto

package com.dingodb.pb.coordinator_internal;

public interface TableInternalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dingodb.pb.coordinator_internal.TableInternal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
   * @return Whether the definition field is set.
   */
  boolean hasDefinition();
  /**
   * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
   * @return The definition.
   */
  com.dingodb.pb.meta.TableDefinition getDefinition();
  /**
   * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
   */
  com.dingodb.pb.meta.TableDefinitionOrBuilder getDefinitionOrBuilder();

  /**
   * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
   */
  java.util.List<com.dingodb.pb.coordinator_internal.PartitionInternal> 
      getPartitionsList();
  /**
   * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
   */
  com.dingodb.pb.coordinator_internal.PartitionInternal getPartitions(int index);
  /**
   * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
   */
  int getPartitionsCount();
  /**
   * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
   */
  java.util.List<? extends com.dingodb.pb.coordinator_internal.PartitionInternalOrBuilder> 
      getPartitionsOrBuilderList();
  /**
   * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
   */
  com.dingodb.pb.coordinator_internal.PartitionInternalOrBuilder getPartitionsOrBuilder(
      int index);
}
