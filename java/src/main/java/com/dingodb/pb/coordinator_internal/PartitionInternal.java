// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coordinator_internal.proto

package com.dingodb.pb.coordinator_internal;

/**
 * <pre>
 * PartitionInternal is storage structure for coordinator
 * </pre>
 *
 * Protobuf type {@code dingodb.pb.coordinator_internal.PartitionInternal}
 */
public final class PartitionInternal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dingodb.pb.coordinator_internal.PartitionInternal)
    PartitionInternalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartitionInternal.newBuilder() to construct.
  private PartitionInternal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartitionInternal() {
    regionIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PartitionInternal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dingodb.pb.coordinator_internal.CoordinatorInternalProto.internal_static_dingodb_pb_coordinator_internal_PartitionInternal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dingodb.pb.coordinator_internal.CoordinatorInternalProto.internal_static_dingodb_pb_coordinator_internal_PartitionInternal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dingodb.pb.coordinator_internal.PartitionInternal.class, com.dingodb.pb.coordinator_internal.PartitionInternal.Builder.class);
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

  public static final int RANGE_FIELD_NUMBER = 2;
  private com.dingodb.pb.common.Range range_;
  /**
   * <pre>
   * the range of this part
   * </pre>
   *
   * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
   * @return Whether the range field is set.
   */
  @java.lang.Override
  public boolean hasRange() {
    return range_ != null;
  }
  /**
   * <pre>
   * the range of this part
   * </pre>
   *
   * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
   * @return The range.
   */
  @java.lang.Override
  public com.dingodb.pb.common.Range getRange() {
    return range_ == null ? com.dingodb.pb.common.Range.getDefaultInstance() : range_;
  }
  /**
   * <pre>
   * the range of this part
   * </pre>
   *
   * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.common.RangeOrBuilder getRangeOrBuilder() {
    return range_ == null ? com.dingodb.pb.common.Range.getDefaultInstance() : range_;
  }

  public static final int REGION_IDS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList regionIds_;
  /**
   * <pre>
   * Region has range property
   * </pre>
   *
   * <code>repeated uint64 region_ids = 3 [json_name = "regionIds"];</code>
   * @return A list containing the regionIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getRegionIdsList() {
    return regionIds_;
  }
  /**
   * <pre>
   * Region has range property
   * </pre>
   *
   * <code>repeated uint64 region_ids = 3 [json_name = "regionIds"];</code>
   * @return The count of regionIds.
   */
  public int getRegionIdsCount() {
    return regionIds_.size();
  }
  /**
   * <pre>
   * Region has range property
   * </pre>
   *
   * <code>repeated uint64 region_ids = 3 [json_name = "regionIds"];</code>
   * @param index The index of the element to return.
   * @return The regionIds at the given index.
   */
  public long getRegionIds(int index) {
    return regionIds_.getLong(index);
  }
  private int regionIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (id_ != 0L) {
      output.writeUInt64(1, id_);
    }
    if (range_ != null) {
      output.writeMessage(2, getRange());
    }
    if (getRegionIdsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(regionIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < regionIds_.size(); i++) {
      output.writeUInt64NoTag(regionIds_.getLong(i));
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
    if (range_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRange());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < regionIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(regionIds_.getLong(i));
      }
      size += dataSize;
      if (!getRegionIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      regionIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.dingodb.pb.coordinator_internal.PartitionInternal)) {
      return super.equals(obj);
    }
    com.dingodb.pb.coordinator_internal.PartitionInternal other = (com.dingodb.pb.coordinator_internal.PartitionInternal) obj;

    if (getId()
        != other.getId()) return false;
    if (hasRange() != other.hasRange()) return false;
    if (hasRange()) {
      if (!getRange()
          .equals(other.getRange())) return false;
    }
    if (!getRegionIdsList()
        .equals(other.getRegionIdsList())) return false;
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
    if (hasRange()) {
      hash = (37 * hash) + RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getRange().hashCode();
    }
    if (getRegionIdsCount() > 0) {
      hash = (37 * hash) + REGION_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getRegionIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.coordinator_internal.PartitionInternal parseFrom(
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
  public static Builder newBuilder(com.dingodb.pb.coordinator_internal.PartitionInternal prototype) {
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
   * PartitionInternal is storage structure for coordinator
   * </pre>
   *
   * Protobuf type {@code dingodb.pb.coordinator_internal.PartitionInternal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dingodb.pb.coordinator_internal.PartitionInternal)
      com.dingodb.pb.coordinator_internal.PartitionInternalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dingodb.pb.coordinator_internal.CoordinatorInternalProto.internal_static_dingodb_pb_coordinator_internal_PartitionInternal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dingodb.pb.coordinator_internal.CoordinatorInternalProto.internal_static_dingodb_pb_coordinator_internal_PartitionInternal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dingodb.pb.coordinator_internal.PartitionInternal.class, com.dingodb.pb.coordinator_internal.PartitionInternal.Builder.class);
    }

    // Construct using com.dingodb.pb.coordinator_internal.PartitionInternal.newBuilder()
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
      range_ = null;
      if (rangeBuilder_ != null) {
        rangeBuilder_.dispose();
        rangeBuilder_ = null;
      }
      regionIds_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dingodb.pb.coordinator_internal.CoordinatorInternalProto.internal_static_dingodb_pb_coordinator_internal_PartitionInternal_descriptor;
    }

    @java.lang.Override
    public com.dingodb.pb.coordinator_internal.PartitionInternal getDefaultInstanceForType() {
      return com.dingodb.pb.coordinator_internal.PartitionInternal.getDefaultInstance();
    }

    @java.lang.Override
    public com.dingodb.pb.coordinator_internal.PartitionInternal build() {
      com.dingodb.pb.coordinator_internal.PartitionInternal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dingodb.pb.coordinator_internal.PartitionInternal buildPartial() {
      com.dingodb.pb.coordinator_internal.PartitionInternal result = new com.dingodb.pb.coordinator_internal.PartitionInternal(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.dingodb.pb.coordinator_internal.PartitionInternal result) {
      if (((bitField0_ & 0x00000004) != 0)) {
        regionIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.regionIds_ = regionIds_;
    }

    private void buildPartial0(com.dingodb.pb.coordinator_internal.PartitionInternal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.range_ = rangeBuilder_ == null
            ? range_
            : rangeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dingodb.pb.coordinator_internal.PartitionInternal) {
        return mergeFrom((com.dingodb.pb.coordinator_internal.PartitionInternal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dingodb.pb.coordinator_internal.PartitionInternal other) {
      if (other == com.dingodb.pb.coordinator_internal.PartitionInternal.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.hasRange()) {
        mergeRange(other.getRange());
      }
      if (!other.regionIds_.isEmpty()) {
        if (regionIds_.isEmpty()) {
          regionIds_ = other.regionIds_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureRegionIdsIsMutable();
          regionIds_.addAll(other.regionIds_);
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
              id_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getRangeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              long v = input.readUInt64();
              ensureRegionIdsIsMutable();
              regionIds_.addLong(v);
              break;
            } // case 24
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureRegionIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                regionIds_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
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

    private com.dingodb.pb.common.Range range_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.common.Range, com.dingodb.pb.common.Range.Builder, com.dingodb.pb.common.RangeOrBuilder> rangeBuilder_;
    /**
     * <pre>
     * the range of this part
     * </pre>
     *
     * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
     * @return Whether the range field is set.
     */
    public boolean hasRange() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * the range of this part
     * </pre>
     *
     * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
     * @return The range.
     */
    public com.dingodb.pb.common.Range getRange() {
      if (rangeBuilder_ == null) {
        return range_ == null ? com.dingodb.pb.common.Range.getDefaultInstance() : range_;
      } else {
        return rangeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the range of this part
     * </pre>
     *
     * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
     */
    public Builder setRange(com.dingodb.pb.common.Range value) {
      if (rangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        range_ = value;
      } else {
        rangeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the range of this part
     * </pre>
     *
     * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
     */
    public Builder setRange(
        com.dingodb.pb.common.Range.Builder builderForValue) {
      if (rangeBuilder_ == null) {
        range_ = builderForValue.build();
      } else {
        rangeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the range of this part
     * </pre>
     *
     * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
     */
    public Builder mergeRange(com.dingodb.pb.common.Range value) {
      if (rangeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          range_ != null &&
          range_ != com.dingodb.pb.common.Range.getDefaultInstance()) {
          getRangeBuilder().mergeFrom(value);
        } else {
          range_ = value;
        }
      } else {
        rangeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the range of this part
     * </pre>
     *
     * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
     */
    public Builder clearRange() {
      bitField0_ = (bitField0_ & ~0x00000002);
      range_ = null;
      if (rangeBuilder_ != null) {
        rangeBuilder_.dispose();
        rangeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the range of this part
     * </pre>
     *
     * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
     */
    public com.dingodb.pb.common.Range.Builder getRangeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the range of this part
     * </pre>
     *
     * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
     */
    public com.dingodb.pb.common.RangeOrBuilder getRangeOrBuilder() {
      if (rangeBuilder_ != null) {
        return rangeBuilder_.getMessageOrBuilder();
      } else {
        return range_ == null ?
            com.dingodb.pb.common.Range.getDefaultInstance() : range_;
      }
    }
    /**
     * <pre>
     * the range of this part
     * </pre>
     *
     * <code>.dingodb.pb.common.Range range = 2 [json_name = "range"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.common.Range, com.dingodb.pb.common.Range.Builder, com.dingodb.pb.common.RangeOrBuilder> 
        getRangeFieldBuilder() {
      if (rangeBuilder_ == null) {
        rangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.dingodb.pb.common.Range, com.dingodb.pb.common.Range.Builder, com.dingodb.pb.common.RangeOrBuilder>(
                getRange(),
                getParentForChildren(),
                isClean());
        range_ = null;
      }
      return rangeBuilder_;
    }

    private com.google.protobuf.Internal.LongList regionIds_ = emptyLongList();
    private void ensureRegionIdsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        regionIds_ = mutableCopy(regionIds_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     * <pre>
     * Region has range property
     * </pre>
     *
     * <code>repeated uint64 region_ids = 3 [json_name = "regionIds"];</code>
     * @return A list containing the regionIds.
     */
    public java.util.List<java.lang.Long>
        getRegionIdsList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(regionIds_) : regionIds_;
    }
    /**
     * <pre>
     * Region has range property
     * </pre>
     *
     * <code>repeated uint64 region_ids = 3 [json_name = "regionIds"];</code>
     * @return The count of regionIds.
     */
    public int getRegionIdsCount() {
      return regionIds_.size();
    }
    /**
     * <pre>
     * Region has range property
     * </pre>
     *
     * <code>repeated uint64 region_ids = 3 [json_name = "regionIds"];</code>
     * @param index The index of the element to return.
     * @return The regionIds at the given index.
     */
    public long getRegionIds(int index) {
      return regionIds_.getLong(index);
    }
    /**
     * <pre>
     * Region has range property
     * </pre>
     *
     * <code>repeated uint64 region_ids = 3 [json_name = "regionIds"];</code>
     * @param index The index to set the value at.
     * @param value The regionIds to set.
     * @return This builder for chaining.
     */
    public Builder setRegionIds(
        int index, long value) {

      ensureRegionIdsIsMutable();
      regionIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Region has range property
     * </pre>
     *
     * <code>repeated uint64 region_ids = 3 [json_name = "regionIds"];</code>
     * @param value The regionIds to add.
     * @return This builder for chaining.
     */
    public Builder addRegionIds(long value) {

      ensureRegionIdsIsMutable();
      regionIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Region has range property
     * </pre>
     *
     * <code>repeated uint64 region_ids = 3 [json_name = "regionIds"];</code>
     * @param values The regionIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllRegionIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureRegionIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, regionIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Region has range property
     * </pre>
     *
     * <code>repeated uint64 region_ids = 3 [json_name = "regionIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionIds() {
      regionIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:dingodb.pb.coordinator_internal.PartitionInternal)
  }

  // @@protoc_insertion_point(class_scope:dingodb.pb.coordinator_internal.PartitionInternal)
  private static final com.dingodb.pb.coordinator_internal.PartitionInternal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dingodb.pb.coordinator_internal.PartitionInternal();
  }

  public static com.dingodb.pb.coordinator_internal.PartitionInternal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartitionInternal>
      PARSER = new com.google.protobuf.AbstractParser<PartitionInternal>() {
    @java.lang.Override
    public PartitionInternal parsePartialFrom(
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

  public static com.google.protobuf.Parser<PartitionInternal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartitionInternal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dingodb.pb.coordinator_internal.PartitionInternal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

