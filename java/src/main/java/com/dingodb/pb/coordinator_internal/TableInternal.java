// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coordinator_internal.proto

package com.dingodb.pb.coordinator_internal;

/**
 * <pre>
 * TableInternal is storage structure for coordinator
 * </pre>
 *
 * Protobuf type {@code dingodb.pb.coordinator_internal.TableInternal}
 */
public final class TableInternal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dingodb.pb.coordinator_internal.TableInternal)
    TableInternalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TableInternal.newBuilder() to construct.
  private TableInternal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TableInternal() {
    partitions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TableInternal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dingodb.pb.coordinator_internal.CoordinatorInternalProto.internal_static_dingodb_pb_coordinator_internal_TableInternal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dingodb.pb.coordinator_internal.CoordinatorInternalProto.internal_static_dingodb_pb_coordinator_internal_TableInternal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dingodb.pb.coordinator_internal.TableInternal.class, com.dingodb.pb.coordinator_internal.TableInternal.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>uint64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int DEFINITION_FIELD_NUMBER = 2;
  private com.dingodb.pb.meta.TableDefinition definition_;
  /**
   * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
   * @return Whether the definition field is set.
   */
  @java.lang.Override
  public boolean hasDefinition() {
    return definition_ != null;
  }
  /**
   * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
   * @return The definition.
   */
  @java.lang.Override
  public com.dingodb.pb.meta.TableDefinition getDefinition() {
    return definition_ == null ? com.dingodb.pb.meta.TableDefinition.getDefaultInstance() : definition_;
  }
  /**
   * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.meta.TableDefinitionOrBuilder getDefinitionOrBuilder() {
    return definition_ == null ? com.dingodb.pb.meta.TableDefinition.getDefaultInstance() : definition_;
  }

  public static final int PARTITIONS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.dingodb.pb.coordinator_internal.PartitionInternal> partitions_;
  /**
   * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.dingodb.pb.coordinator_internal.PartitionInternal> getPartitionsList() {
    return partitions_;
  }
  /**
   * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.dingodb.pb.coordinator_internal.PartitionInternalOrBuilder> 
      getPartitionsOrBuilderList() {
    return partitions_;
  }
  /**
   * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
   */
  @java.lang.Override
  public int getPartitionsCount() {
    return partitions_.size();
  }
  /**
   * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.coordinator_internal.PartitionInternal getPartitions(int index) {
    return partitions_.get(index);
  }
  /**
   * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.coordinator_internal.PartitionInternalOrBuilder getPartitionsOrBuilder(
      int index) {
    return partitions_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeUInt64(1, id_);
    }
    if (definition_ != null) {
      output.writeMessage(2, getDefinition());
    }
    for (int i = 0; i < partitions_.size(); i++) {
      output.writeMessage(3, partitions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, id_);
    }
    if (definition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDefinition());
    }
    for (int i = 0; i < partitions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, partitions_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.dingodb.pb.coordinator_internal.TableInternal)) {
      return super.equals(obj);
    }
    com.dingodb.pb.coordinator_internal.TableInternal other = (com.dingodb.pb.coordinator_internal.TableInternal) obj;

    if (getId()
        != other.getId()) return false;
    if (hasDefinition() != other.hasDefinition()) return false;
    if (hasDefinition()) {
      if (!getDefinition()
          .equals(other.getDefinition())) return false;
    }
    if (!getPartitionsList()
        .equals(other.getPartitionsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    if (hasDefinition()) {
      hash = (37 * hash) + DEFINITION_FIELD_NUMBER;
      hash = (53 * hash) + getDefinition().hashCode();
    }
    if (getPartitionsCount() > 0) {
      hash = (37 * hash) + PARTITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPartitionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dingodb.pb.coordinator_internal.TableInternal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.coordinator_internal.TableInternal parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.dingodb.pb.coordinator_internal.TableInternal prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * TableInternal is storage structure for coordinator
   * </pre>
   *
   * Protobuf type {@code dingodb.pb.coordinator_internal.TableInternal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dingodb.pb.coordinator_internal.TableInternal)
      com.dingodb.pb.coordinator_internal.TableInternalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dingodb.pb.coordinator_internal.CoordinatorInternalProto.internal_static_dingodb_pb_coordinator_internal_TableInternal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dingodb.pb.coordinator_internal.CoordinatorInternalProto.internal_static_dingodb_pb_coordinator_internal_TableInternal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dingodb.pb.coordinator_internal.TableInternal.class, com.dingodb.pb.coordinator_internal.TableInternal.Builder.class);
    }

    // Construct using com.dingodb.pb.coordinator_internal.TableInternal.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = 0L;
      definition_ = null;
      if (definitionBuilder_ != null) {
        definitionBuilder_.dispose();
        definitionBuilder_ = null;
      }
      if (partitionsBuilder_ == null) {
        partitions_ = java.util.Collections.emptyList();
      } else {
        partitions_ = null;
        partitionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dingodb.pb.coordinator_internal.CoordinatorInternalProto.internal_static_dingodb_pb_coordinator_internal_TableInternal_descriptor;
    }

    @java.lang.Override
    public com.dingodb.pb.coordinator_internal.TableInternal getDefaultInstanceForType() {
      return com.dingodb.pb.coordinator_internal.TableInternal.getDefaultInstance();
    }

    @java.lang.Override
    public com.dingodb.pb.coordinator_internal.TableInternal build() {
      com.dingodb.pb.coordinator_internal.TableInternal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dingodb.pb.coordinator_internal.TableInternal buildPartial() {
      com.dingodb.pb.coordinator_internal.TableInternal result = new com.dingodb.pb.coordinator_internal.TableInternal(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.dingodb.pb.coordinator_internal.TableInternal result) {
      if (partitionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          partitions_ = java.util.Collections.unmodifiableList(partitions_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.partitions_ = partitions_;
      } else {
        result.partitions_ = partitionsBuilder_.build();
      }
    }

    private void buildPartial0(com.dingodb.pb.coordinator_internal.TableInternal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.definition_ = definitionBuilder_ == null
            ? definition_
            : definitionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dingodb.pb.coordinator_internal.TableInternal) {
        return mergeFrom((com.dingodb.pb.coordinator_internal.TableInternal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dingodb.pb.coordinator_internal.TableInternal other) {
      if (other == com.dingodb.pb.coordinator_internal.TableInternal.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.hasDefinition()) {
        mergeDefinition(other.getDefinition());
      }
      if (partitionsBuilder_ == null) {
        if (!other.partitions_.isEmpty()) {
          if (partitions_.isEmpty()) {
            partitions_ = other.partitions_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensurePartitionsIsMutable();
            partitions_.addAll(other.partitions_);
          }
          onChanged();
        }
      } else {
        if (!other.partitions_.isEmpty()) {
          if (partitionsBuilder_.isEmpty()) {
            partitionsBuilder_.dispose();
            partitionsBuilder_ = null;
            partitions_ = other.partitions_;
            bitField0_ = (bitField0_ & ~0x00000004);
            partitionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPartitionsFieldBuilder() : null;
          } else {
            partitionsBuilder_.addAllMessages(other.partitions_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              id_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getDefinitionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.dingodb.pb.coordinator_internal.PartitionInternal m =
                  input.readMessage(
                      com.dingodb.pb.coordinator_internal.PartitionInternal.parser(),
                      extensionRegistry);
              if (partitionsBuilder_ == null) {
                ensurePartitionsIsMutable();
                partitions_.add(m);
              } else {
                partitionsBuilder_.addMessage(m);
              }
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private com.dingodb.pb.meta.TableDefinition definition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.meta.TableDefinition, com.dingodb.pb.meta.TableDefinition.Builder, com.dingodb.pb.meta.TableDefinitionOrBuilder> definitionBuilder_;
    /**
     * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
     * @return Whether the definition field is set.
     */
    public boolean hasDefinition() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
     * @return The definition.
     */
    public com.dingodb.pb.meta.TableDefinition getDefinition() {
      if (definitionBuilder_ == null) {
        return definition_ == null ? com.dingodb.pb.meta.TableDefinition.getDefaultInstance() : definition_;
      } else {
        return definitionBuilder_.getMessage();
      }
    }
    /**
     * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
     */
    public Builder setDefinition(com.dingodb.pb.meta.TableDefinition value) {
      if (definitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        definition_ = value;
      } else {
        definitionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
     */
    public Builder setDefinition(
        com.dingodb.pb.meta.TableDefinition.Builder builderForValue) {
      if (definitionBuilder_ == null) {
        definition_ = builderForValue.build();
      } else {
        definitionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
     */
    public Builder mergeDefinition(com.dingodb.pb.meta.TableDefinition value) {
      if (definitionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          definition_ != null &&
          definition_ != com.dingodb.pb.meta.TableDefinition.getDefaultInstance()) {
          getDefinitionBuilder().mergeFrom(value);
        } else {
          definition_ = value;
        }
      } else {
        definitionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
     */
    public Builder clearDefinition() {
      bitField0_ = (bitField0_ & ~0x00000002);
      definition_ = null;
      if (definitionBuilder_ != null) {
        definitionBuilder_.dispose();
        definitionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
     */
    public com.dingodb.pb.meta.TableDefinition.Builder getDefinitionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDefinitionFieldBuilder().getBuilder();
    }
    /**
     * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
     */
    public com.dingodb.pb.meta.TableDefinitionOrBuilder getDefinitionOrBuilder() {
      if (definitionBuilder_ != null) {
        return definitionBuilder_.getMessageOrBuilder();
      } else {
        return definition_ == null ?
            com.dingodb.pb.meta.TableDefinition.getDefaultInstance() : definition_;
      }
    }
    /**
     * <code>.dingodb.pb.meta.TableDefinition definition = 2 [json_name = "definition"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.meta.TableDefinition, com.dingodb.pb.meta.TableDefinition.Builder, com.dingodb.pb.meta.TableDefinitionOrBuilder> 
        getDefinitionFieldBuilder() {
      if (definitionBuilder_ == null) {
        definitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.dingodb.pb.meta.TableDefinition, com.dingodb.pb.meta.TableDefinition.Builder, com.dingodb.pb.meta.TableDefinitionOrBuilder>(
                getDefinition(),
                getParentForChildren(),
                isClean());
        definition_ = null;
      }
      return definitionBuilder_;
    }

    private java.util.List<com.dingodb.pb.coordinator_internal.PartitionInternal> partitions_ =
      java.util.Collections.emptyList();
    private void ensurePartitionsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        partitions_ = new java.util.ArrayList<com.dingodb.pb.coordinator_internal.PartitionInternal>(partitions_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dingodb.pb.coordinator_internal.PartitionInternal, com.dingodb.pb.coordinator_internal.PartitionInternal.Builder, com.dingodb.pb.coordinator_internal.PartitionInternalOrBuilder> partitionsBuilder_;

    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public java.util.List<com.dingodb.pb.coordinator_internal.PartitionInternal> getPartitionsList() {
      if (partitionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(partitions_);
      } else {
        return partitionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public int getPartitionsCount() {
      if (partitionsBuilder_ == null) {
        return partitions_.size();
      } else {
        return partitionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public com.dingodb.pb.coordinator_internal.PartitionInternal getPartitions(int index) {
      if (partitionsBuilder_ == null) {
        return partitions_.get(index);
      } else {
        return partitionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public Builder setPartitions(
        int index, com.dingodb.pb.coordinator_internal.PartitionInternal value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.set(index, value);
        onChanged();
      } else {
        partitionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public Builder setPartitions(
        int index, com.dingodb.pb.coordinator_internal.PartitionInternal.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.set(index, builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public Builder addPartitions(com.dingodb.pb.coordinator_internal.PartitionInternal value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.add(value);
        onChanged();
      } else {
        partitionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public Builder addPartitions(
        int index, com.dingodb.pb.coordinator_internal.PartitionInternal value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.add(index, value);
        onChanged();
      } else {
        partitionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public Builder addPartitions(
        com.dingodb.pb.coordinator_internal.PartitionInternal.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.add(builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public Builder addPartitions(
        int index, com.dingodb.pb.coordinator_internal.PartitionInternal.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.add(index, builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public Builder addAllPartitions(
        java.lang.Iterable<? extends com.dingodb.pb.coordinator_internal.PartitionInternal> values) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, partitions_);
        onChanged();
      } else {
        partitionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public Builder clearPartitions() {
      if (partitionsBuilder_ == null) {
        partitions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        partitionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public Builder removePartitions(int index) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.remove(index);
        onChanged();
      } else {
        partitionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public com.dingodb.pb.coordinator_internal.PartitionInternal.Builder getPartitionsBuilder(
        int index) {
      return getPartitionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public com.dingodb.pb.coordinator_internal.PartitionInternalOrBuilder getPartitionsOrBuilder(
        int index) {
      if (partitionsBuilder_ == null) {
        return partitions_.get(index);  } else {
        return partitionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public java.util.List<? extends com.dingodb.pb.coordinator_internal.PartitionInternalOrBuilder> 
         getPartitionsOrBuilderList() {
      if (partitionsBuilder_ != null) {
        return partitionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(partitions_);
      }
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public com.dingodb.pb.coordinator_internal.PartitionInternal.Builder addPartitionsBuilder() {
      return getPartitionsFieldBuilder().addBuilder(
          com.dingodb.pb.coordinator_internal.PartitionInternal.getDefaultInstance());
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public com.dingodb.pb.coordinator_internal.PartitionInternal.Builder addPartitionsBuilder(
        int index) {
      return getPartitionsFieldBuilder().addBuilder(
          index, com.dingodb.pb.coordinator_internal.PartitionInternal.getDefaultInstance());
    }
    /**
     * <code>repeated .dingodb.pb.coordinator_internal.PartitionInternal partitions = 3 [json_name = "partitions"];</code>
     */
    public java.util.List<com.dingodb.pb.coordinator_internal.PartitionInternal.Builder> 
         getPartitionsBuilderList() {
      return getPartitionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dingodb.pb.coordinator_internal.PartitionInternal, com.dingodb.pb.coordinator_internal.PartitionInternal.Builder, com.dingodb.pb.coordinator_internal.PartitionInternalOrBuilder> 
        getPartitionsFieldBuilder() {
      if (partitionsBuilder_ == null) {
        partitionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.dingodb.pb.coordinator_internal.PartitionInternal, com.dingodb.pb.coordinator_internal.PartitionInternal.Builder, com.dingodb.pb.coordinator_internal.PartitionInternalOrBuilder>(
                partitions_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        partitions_ = null;
      }
      return partitionsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:dingodb.pb.coordinator_internal.TableInternal)
  }

  // @@protoc_insertion_point(class_scope:dingodb.pb.coordinator_internal.TableInternal)
  private static final com.dingodb.pb.coordinator_internal.TableInternal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dingodb.pb.coordinator_internal.TableInternal();
  }

  public static com.dingodb.pb.coordinator_internal.TableInternal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableInternal>
      PARSER = new com.google.protobuf.AbstractParser<TableInternal>() {
    @java.lang.Override
    public TableInternal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TableInternal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableInternal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dingodb.pb.coordinator_internal.TableInternal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

