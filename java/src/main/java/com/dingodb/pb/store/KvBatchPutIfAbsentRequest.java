// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package com.dingodb.pb.store;

/**
 * Protobuf type {@code dingodb.pb.store.KvBatchPutIfAbsentRequest}
 */
public final class KvBatchPutIfAbsentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dingodb.pb.store.KvBatchPutIfAbsentRequest)
    KvBatchPutIfAbsentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KvBatchPutIfAbsentRequest.newBuilder() to construct.
  private KvBatchPutIfAbsentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KvBatchPutIfAbsentRequest() {
    kvs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KvBatchPutIfAbsentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dingodb.pb.store.StoreProto.internal_static_dingodb_pb_store_KvBatchPutIfAbsentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dingodb.pb.store.StoreProto.internal_static_dingodb_pb_store_KvBatchPutIfAbsentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dingodb.pb.store.KvBatchPutIfAbsentRequest.class, com.dingodb.pb.store.KvBatchPutIfAbsentRequest.Builder.class);
  }

  public static final int REGION_ID_FIELD_NUMBER = 1;
  private long regionId_ = 0L;
  /**
   * <code>uint64 region_id = 1 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  @java.lang.Override
  public long getRegionId() {
    return regionId_;
  }

  public static final int KVS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.dingodb.pb.common.KeyValue> kvs_;
  /**
   * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
   */
  @java.lang.Override
  public java.util.List<com.dingodb.pb.common.KeyValue> getKvsList() {
    return kvs_;
  }
  /**
   * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.dingodb.pb.common.KeyValueOrBuilder> 
      getKvsOrBuilderList() {
    return kvs_;
  }
  /**
   * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
   */
  @java.lang.Override
  public int getKvsCount() {
    return kvs_.size();
  }
  /**
   * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.common.KeyValue getKvs(int index) {
    return kvs_.get(index);
  }
  /**
   * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.common.KeyValueOrBuilder getKvsOrBuilder(
      int index) {
    return kvs_.get(index);
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
    if (regionId_ != 0L) {
      output.writeUInt64(1, regionId_);
    }
    for (int i = 0; i < kvs_.size(); i++) {
      output.writeMessage(2, kvs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (regionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, regionId_);
    }
    for (int i = 0; i < kvs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, kvs_.get(i));
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
    if (!(obj instanceof com.dingodb.pb.store.KvBatchPutIfAbsentRequest)) {
      return super.equals(obj);
    }
    com.dingodb.pb.store.KvBatchPutIfAbsentRequest other = (com.dingodb.pb.store.KvBatchPutIfAbsentRequest) obj;

    if (getRegionId()
        != other.getRegionId()) return false;
    if (!getKvsList()
        .equals(other.getKvsList())) return false;
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
    hash = (37 * hash) + REGION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRegionId());
    if (getKvsCount() > 0) {
      hash = (37 * hash) + KVS_FIELD_NUMBER;
      hash = (53 * hash) + getKvsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest parseFrom(
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
  public static Builder newBuilder(com.dingodb.pb.store.KvBatchPutIfAbsentRequest prototype) {
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
   * Protobuf type {@code dingodb.pb.store.KvBatchPutIfAbsentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dingodb.pb.store.KvBatchPutIfAbsentRequest)
      com.dingodb.pb.store.KvBatchPutIfAbsentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dingodb.pb.store.StoreProto.internal_static_dingodb_pb_store_KvBatchPutIfAbsentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dingodb.pb.store.StoreProto.internal_static_dingodb_pb_store_KvBatchPutIfAbsentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dingodb.pb.store.KvBatchPutIfAbsentRequest.class, com.dingodb.pb.store.KvBatchPutIfAbsentRequest.Builder.class);
    }

    // Construct using com.dingodb.pb.store.KvBatchPutIfAbsentRequest.newBuilder()
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
      regionId_ = 0L;
      if (kvsBuilder_ == null) {
        kvs_ = java.util.Collections.emptyList();
      } else {
        kvs_ = null;
        kvsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dingodb.pb.store.StoreProto.internal_static_dingodb_pb_store_KvBatchPutIfAbsentRequest_descriptor;
    }

    @java.lang.Override
    public com.dingodb.pb.store.KvBatchPutIfAbsentRequest getDefaultInstanceForType() {
      return com.dingodb.pb.store.KvBatchPutIfAbsentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.dingodb.pb.store.KvBatchPutIfAbsentRequest build() {
      com.dingodb.pb.store.KvBatchPutIfAbsentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dingodb.pb.store.KvBatchPutIfAbsentRequest buildPartial() {
      com.dingodb.pb.store.KvBatchPutIfAbsentRequest result = new com.dingodb.pb.store.KvBatchPutIfAbsentRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.dingodb.pb.store.KvBatchPutIfAbsentRequest result) {
      if (kvsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          kvs_ = java.util.Collections.unmodifiableList(kvs_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.kvs_ = kvs_;
      } else {
        result.kvs_ = kvsBuilder_.build();
      }
    }

    private void buildPartial0(com.dingodb.pb.store.KvBatchPutIfAbsentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.regionId_ = regionId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dingodb.pb.store.KvBatchPutIfAbsentRequest) {
        return mergeFrom((com.dingodb.pb.store.KvBatchPutIfAbsentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dingodb.pb.store.KvBatchPutIfAbsentRequest other) {
      if (other == com.dingodb.pb.store.KvBatchPutIfAbsentRequest.getDefaultInstance()) return this;
      if (other.getRegionId() != 0L) {
        setRegionId(other.getRegionId());
      }
      if (kvsBuilder_ == null) {
        if (!other.kvs_.isEmpty()) {
          if (kvs_.isEmpty()) {
            kvs_ = other.kvs_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureKvsIsMutable();
            kvs_.addAll(other.kvs_);
          }
          onChanged();
        }
      } else {
        if (!other.kvs_.isEmpty()) {
          if (kvsBuilder_.isEmpty()) {
            kvsBuilder_.dispose();
            kvsBuilder_ = null;
            kvs_ = other.kvs_;
            bitField0_ = (bitField0_ & ~0x00000002);
            kvsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKvsFieldBuilder() : null;
          } else {
            kvsBuilder_.addAllMessages(other.kvs_);
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
              regionId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.dingodb.pb.common.KeyValue m =
                  input.readMessage(
                      com.dingodb.pb.common.KeyValue.parser(),
                      extensionRegistry);
              if (kvsBuilder_ == null) {
                ensureKvsIsMutable();
                kvs_.add(m);
              } else {
                kvsBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private long regionId_ ;
    /**
     * <code>uint64 region_id = 1 [json_name = "regionId"];</code>
     * @return The regionId.
     */
    @java.lang.Override
    public long getRegionId() {
      return regionId_;
    }
    /**
     * <code>uint64 region_id = 1 [json_name = "regionId"];</code>
     * @param value The regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionId(long value) {

      regionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 region_id = 1 [json_name = "regionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      regionId_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.dingodb.pb.common.KeyValue> kvs_ =
      java.util.Collections.emptyList();
    private void ensureKvsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        kvs_ = new java.util.ArrayList<com.dingodb.pb.common.KeyValue>(kvs_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dingodb.pb.common.KeyValue, com.dingodb.pb.common.KeyValue.Builder, com.dingodb.pb.common.KeyValueOrBuilder> kvsBuilder_;

    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public java.util.List<com.dingodb.pb.common.KeyValue> getKvsList() {
      if (kvsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(kvs_);
      } else {
        return kvsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public int getKvsCount() {
      if (kvsBuilder_ == null) {
        return kvs_.size();
      } else {
        return kvsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public com.dingodb.pb.common.KeyValue getKvs(int index) {
      if (kvsBuilder_ == null) {
        return kvs_.get(index);
      } else {
        return kvsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public Builder setKvs(
        int index, com.dingodb.pb.common.KeyValue value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.set(index, value);
        onChanged();
      } else {
        kvsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public Builder setKvs(
        int index, com.dingodb.pb.common.KeyValue.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.set(index, builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public Builder addKvs(com.dingodb.pb.common.KeyValue value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.add(value);
        onChanged();
      } else {
        kvsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public Builder addKvs(
        int index, com.dingodb.pb.common.KeyValue value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.add(index, value);
        onChanged();
      } else {
        kvsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public Builder addKvs(
        com.dingodb.pb.common.KeyValue.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.add(builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public Builder addKvs(
        int index, com.dingodb.pb.common.KeyValue.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.add(index, builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public Builder addAllKvs(
        java.lang.Iterable<? extends com.dingodb.pb.common.KeyValue> values) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, kvs_);
        onChanged();
      } else {
        kvsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public Builder clearKvs() {
      if (kvsBuilder_ == null) {
        kvs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        kvsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public Builder removeKvs(int index) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.remove(index);
        onChanged();
      } else {
        kvsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public com.dingodb.pb.common.KeyValue.Builder getKvsBuilder(
        int index) {
      return getKvsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public com.dingodb.pb.common.KeyValueOrBuilder getKvsOrBuilder(
        int index) {
      if (kvsBuilder_ == null) {
        return kvs_.get(index);  } else {
        return kvsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public java.util.List<? extends com.dingodb.pb.common.KeyValueOrBuilder> 
         getKvsOrBuilderList() {
      if (kvsBuilder_ != null) {
        return kvsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(kvs_);
      }
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public com.dingodb.pb.common.KeyValue.Builder addKvsBuilder() {
      return getKvsFieldBuilder().addBuilder(
          com.dingodb.pb.common.KeyValue.getDefaultInstance());
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public com.dingodb.pb.common.KeyValue.Builder addKvsBuilder(
        int index) {
      return getKvsFieldBuilder().addBuilder(
          index, com.dingodb.pb.common.KeyValue.getDefaultInstance());
    }
    /**
     * <code>repeated .dingodb.pb.common.KeyValue kvs = 2 [json_name = "kvs"];</code>
     */
    public java.util.List<com.dingodb.pb.common.KeyValue.Builder> 
         getKvsBuilderList() {
      return getKvsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dingodb.pb.common.KeyValue, com.dingodb.pb.common.KeyValue.Builder, com.dingodb.pb.common.KeyValueOrBuilder> 
        getKvsFieldBuilder() {
      if (kvsBuilder_ == null) {
        kvsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.dingodb.pb.common.KeyValue, com.dingodb.pb.common.KeyValue.Builder, com.dingodb.pb.common.KeyValueOrBuilder>(
                kvs_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        kvs_ = null;
      }
      return kvsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:dingodb.pb.store.KvBatchPutIfAbsentRequest)
  }

  // @@protoc_insertion_point(class_scope:dingodb.pb.store.KvBatchPutIfAbsentRequest)
  private static final com.dingodb.pb.store.KvBatchPutIfAbsentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dingodb.pb.store.KvBatchPutIfAbsentRequest();
  }

  public static com.dingodb.pb.store.KvBatchPutIfAbsentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KvBatchPutIfAbsentRequest>
      PARSER = new com.google.protobuf.AbstractParser<KvBatchPutIfAbsentRequest>() {
    @java.lang.Override
    public KvBatchPutIfAbsentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<KvBatchPutIfAbsentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KvBatchPutIfAbsentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dingodb.pb.store.KvBatchPutIfAbsentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

