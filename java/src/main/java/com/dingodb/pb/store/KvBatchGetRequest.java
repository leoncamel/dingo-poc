// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package com.dingodb.pb.store;

/**
 * Protobuf type {@code dingodb.pb.store.KvBatchGetRequest}
 */
public final class KvBatchGetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dingodb.pb.store.KvBatchGetRequest)
    KvBatchGetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KvBatchGetRequest.newBuilder() to construct.
  private KvBatchGetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KvBatchGetRequest() {
    keys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KvBatchGetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dingodb.pb.store.StoreProto.internal_static_dingodb_pb_store_KvBatchGetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dingodb.pb.store.StoreProto.internal_static_dingodb_pb_store_KvBatchGetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dingodb.pb.store.KvBatchGetRequest.class, com.dingodb.pb.store.KvBatchGetRequest.Builder.class);
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

  public static final int KEYS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.ByteString> keys_;
  /**
   * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
   * @return A list containing the keys.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getKeysList() {
    return keys_;
  }
  /**
   * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
   * @return The count of keys.
   */
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
   * @param index The index of the element to return.
   * @return The keys at the given index.
   */
  public com.google.protobuf.ByteString getKeys(int index) {
    return keys_.get(index);
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
    for (int i = 0; i < keys_.size(); i++) {
      output.writeBytes(2, keys_.get(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < keys_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(keys_.get(i));
      }
      size += dataSize;
      size += 1 * getKeysList().size();
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
    if (!(obj instanceof com.dingodb.pb.store.KvBatchGetRequest)) {
      return super.equals(obj);
    }
    com.dingodb.pb.store.KvBatchGetRequest other = (com.dingodb.pb.store.KvBatchGetRequest) obj;

    if (getRegionId()
        != other.getRegionId()) return false;
    if (!getKeysList()
        .equals(other.getKeysList())) return false;
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
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dingodb.pb.store.KvBatchGetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.store.KvBatchGetRequest parseFrom(
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
  public static Builder newBuilder(com.dingodb.pb.store.KvBatchGetRequest prototype) {
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
   * Protobuf type {@code dingodb.pb.store.KvBatchGetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dingodb.pb.store.KvBatchGetRequest)
      com.dingodb.pb.store.KvBatchGetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dingodb.pb.store.StoreProto.internal_static_dingodb_pb_store_KvBatchGetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dingodb.pb.store.StoreProto.internal_static_dingodb_pb_store_KvBatchGetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dingodb.pb.store.KvBatchGetRequest.class, com.dingodb.pb.store.KvBatchGetRequest.Builder.class);
    }

    // Construct using com.dingodb.pb.store.KvBatchGetRequest.newBuilder()
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
      keys_ = java.util.Collections.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dingodb.pb.store.StoreProto.internal_static_dingodb_pb_store_KvBatchGetRequest_descriptor;
    }

    @java.lang.Override
    public com.dingodb.pb.store.KvBatchGetRequest getDefaultInstanceForType() {
      return com.dingodb.pb.store.KvBatchGetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.dingodb.pb.store.KvBatchGetRequest build() {
      com.dingodb.pb.store.KvBatchGetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dingodb.pb.store.KvBatchGetRequest buildPartial() {
      com.dingodb.pb.store.KvBatchGetRequest result = new com.dingodb.pb.store.KvBatchGetRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.dingodb.pb.store.KvBatchGetRequest result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        keys_ = java.util.Collections.unmodifiableList(keys_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.keys_ = keys_;
    }

    private void buildPartial0(com.dingodb.pb.store.KvBatchGetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.regionId_ = regionId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dingodb.pb.store.KvBatchGetRequest) {
        return mergeFrom((com.dingodb.pb.store.KvBatchGetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dingodb.pb.store.KvBatchGetRequest other) {
      if (other == com.dingodb.pb.store.KvBatchGetRequest.getDefaultInstance()) return this;
      if (other.getRegionId() != 0L) {
        setRegionId(other.getRegionId());
      }
      if (!other.keys_.isEmpty()) {
        if (keys_.isEmpty()) {
          keys_ = other.keys_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureKeysIsMutable();
          keys_.addAll(other.keys_);
        }
        onChanged();
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
              com.google.protobuf.ByteString v = input.readBytes();
              ensureKeysIsMutable();
              keys_.add(v);
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

    private java.util.List<com.google.protobuf.ByteString> keys_ = java.util.Collections.emptyList();
    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>(keys_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
     * @return A list containing the keys.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getKeysList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(keys_) : keys_;
    }
    /**
     * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
     * @return The count of keys.
     */
    public int getKeysCount() {
      return keys_.size();
    }
    /**
     * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
     * @param index The index of the element to return.
     * @return The keys at the given index.
     */
    public com.google.protobuf.ByteString getKeys(int index) {
      return keys_.get(index);
    }
    /**
     * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
     * @param index The index to set the value at.
     * @param value The keys to set.
     * @return This builder for chaining.
     */
    public Builder setKeys(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureKeysIsMutable();
      keys_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
     * @param value The keys to add.
     * @return This builder for chaining.
     */
    public Builder addKeys(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureKeysIsMutable();
      keys_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
     * @param values The keys to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureKeysIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keys_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes keys = 2 [json_name = "keys"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKeys() {
      keys_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:dingodb.pb.store.KvBatchGetRequest)
  }

  // @@protoc_insertion_point(class_scope:dingodb.pb.store.KvBatchGetRequest)
  private static final com.dingodb.pb.store.KvBatchGetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dingodb.pb.store.KvBatchGetRequest();
  }

  public static com.dingodb.pb.store.KvBatchGetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KvBatchGetRequest>
      PARSER = new com.google.protobuf.AbstractParser<KvBatchGetRequest>() {
    @java.lang.Override
    public KvBatchGetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<KvBatchGetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KvBatchGetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dingodb.pb.store.KvBatchGetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

