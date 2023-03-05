// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta.proto

package com.dingodb.pb.meta;

/**
 * Protobuf type {@code dingodb.pb.meta.PartitionRule}
 */
public final class PartitionRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dingodb.pb.meta.PartitionRule)
    PartitionRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartitionRule.newBuilder() to construct.
  private PartitionRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartitionRule() {
    columns_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    strategy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PartitionRule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_PartitionRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_PartitionRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dingodb.pb.meta.PartitionRule.class, com.dingodb.pb.meta.PartitionRule.Builder.class);
  }

  public static final int COLUMNS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList columns_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string columns = 1 [json_name = "columns"];</code>
   * @return A list containing the columns.
   */
  public com.google.protobuf.ProtocolStringList
      getColumnsList() {
    return columns_;
  }
  /**
   * <code>repeated string columns = 1 [json_name = "columns"];</code>
   * @return The count of columns.
   */
  public int getColumnsCount() {
    return columns_.size();
  }
  /**
   * <code>repeated string columns = 1 [json_name = "columns"];</code>
   * @param index The index of the element to return.
   * @return The columns at the given index.
   */
  public java.lang.String getColumns(int index) {
    return columns_.get(index);
  }
  /**
   * <code>repeated string columns = 1 [json_name = "columns"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the columns at the given index.
   */
  public com.google.protobuf.ByteString
      getColumnsBytes(int index) {
    return columns_.getByteString(index);
  }

  public static final int STRATEGY_FIELD_NUMBER = 2;
  private int strategy_ = 0;
  /**
   * <code>.dingodb.pb.meta.PartitionStrategy strategy = 2 [json_name = "strategy"];</code>
   * @return The enum numeric value on the wire for strategy.
   */
  @java.lang.Override public int getStrategyValue() {
    return strategy_;
  }
  /**
   * <code>.dingodb.pb.meta.PartitionStrategy strategy = 2 [json_name = "strategy"];</code>
   * @return The strategy.
   */
  @java.lang.Override public com.dingodb.pb.meta.PartitionStrategy getStrategy() {
    com.dingodb.pb.meta.PartitionStrategy result = com.dingodb.pb.meta.PartitionStrategy.forNumber(strategy_);
    return result == null ? com.dingodb.pb.meta.PartitionStrategy.UNRECOGNIZED : result;
  }

  public static final int RANGE_PARTITION_FIELD_NUMBER = 3;
  private com.dingodb.pb.meta.RangePartition rangePartition_;
  /**
   * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
   * @return Whether the rangePartition field is set.
   */
  @java.lang.Override
  public boolean hasRangePartition() {
    return rangePartition_ != null;
  }
  /**
   * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
   * @return The rangePartition.
   */
  @java.lang.Override
  public com.dingodb.pb.meta.RangePartition getRangePartition() {
    return rangePartition_ == null ? com.dingodb.pb.meta.RangePartition.getDefaultInstance() : rangePartition_;
  }
  /**
   * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.meta.RangePartitionOrBuilder getRangePartitionOrBuilder() {
    return rangePartition_ == null ? com.dingodb.pb.meta.RangePartition.getDefaultInstance() : rangePartition_;
  }

  public static final int HASH_PARTITION_FIELD_NUMBER = 4;
  private com.dingodb.pb.meta.HashPartition hashPartition_;
  /**
   * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
   * @return Whether the hashPartition field is set.
   */
  @java.lang.Override
  public boolean hasHashPartition() {
    return hashPartition_ != null;
  }
  /**
   * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
   * @return The hashPartition.
   */
  @java.lang.Override
  public com.dingodb.pb.meta.HashPartition getHashPartition() {
    return hashPartition_ == null ? com.dingodb.pb.meta.HashPartition.getDefaultInstance() : hashPartition_;
  }
  /**
   * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.meta.HashPartitionOrBuilder getHashPartitionOrBuilder() {
    return hashPartition_ == null ? com.dingodb.pb.meta.HashPartition.getDefaultInstance() : hashPartition_;
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
    for (int i = 0; i < columns_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, columns_.getRaw(i));
    }
    if (strategy_ != com.dingodb.pb.meta.PartitionStrategy.PT_STRATEGY_RANGE.getNumber()) {
      output.writeEnum(2, strategy_);
    }
    if (rangePartition_ != null) {
      output.writeMessage(3, getRangePartition());
    }
    if (hashPartition_ != null) {
      output.writeMessage(4, getHashPartition());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < columns_.size(); i++) {
        dataSize += computeStringSizeNoTag(columns_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getColumnsList().size();
    }
    if (strategy_ != com.dingodb.pb.meta.PartitionStrategy.PT_STRATEGY_RANGE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, strategy_);
    }
    if (rangePartition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRangePartition());
    }
    if (hashPartition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getHashPartition());
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
    if (!(obj instanceof com.dingodb.pb.meta.PartitionRule)) {
      return super.equals(obj);
    }
    com.dingodb.pb.meta.PartitionRule other = (com.dingodb.pb.meta.PartitionRule) obj;

    if (!getColumnsList()
        .equals(other.getColumnsList())) return false;
    if (strategy_ != other.strategy_) return false;
    if (hasRangePartition() != other.hasRangePartition()) return false;
    if (hasRangePartition()) {
      if (!getRangePartition()
          .equals(other.getRangePartition())) return false;
    }
    if (hasHashPartition() != other.hasHashPartition()) return false;
    if (hasHashPartition()) {
      if (!getHashPartition()
          .equals(other.getHashPartition())) return false;
    }
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
    if (getColumnsCount() > 0) {
      hash = (37 * hash) + COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + getColumnsList().hashCode();
    }
    hash = (37 * hash) + STRATEGY_FIELD_NUMBER;
    hash = (53 * hash) + strategy_;
    if (hasRangePartition()) {
      hash = (37 * hash) + RANGE_PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + getRangePartition().hashCode();
    }
    if (hasHashPartition()) {
      hash = (37 * hash) + HASH_PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + getHashPartition().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dingodb.pb.meta.PartitionRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.meta.PartitionRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.meta.PartitionRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.meta.PartitionRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.meta.PartitionRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.meta.PartitionRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.meta.PartitionRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.meta.PartitionRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.meta.PartitionRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.meta.PartitionRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.meta.PartitionRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.meta.PartitionRule parseFrom(
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
  public static Builder newBuilder(com.dingodb.pb.meta.PartitionRule prototype) {
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
   * Protobuf type {@code dingodb.pb.meta.PartitionRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dingodb.pb.meta.PartitionRule)
      com.dingodb.pb.meta.PartitionRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_PartitionRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_PartitionRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dingodb.pb.meta.PartitionRule.class, com.dingodb.pb.meta.PartitionRule.Builder.class);
    }

    // Construct using com.dingodb.pb.meta.PartitionRule.newBuilder()
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
      columns_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      strategy_ = 0;
      rangePartition_ = null;
      if (rangePartitionBuilder_ != null) {
        rangePartitionBuilder_.dispose();
        rangePartitionBuilder_ = null;
      }
      hashPartition_ = null;
      if (hashPartitionBuilder_ != null) {
        hashPartitionBuilder_.dispose();
        hashPartitionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_PartitionRule_descriptor;
    }

    @java.lang.Override
    public com.dingodb.pb.meta.PartitionRule getDefaultInstanceForType() {
      return com.dingodb.pb.meta.PartitionRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.dingodb.pb.meta.PartitionRule build() {
      com.dingodb.pb.meta.PartitionRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dingodb.pb.meta.PartitionRule buildPartial() {
      com.dingodb.pb.meta.PartitionRule result = new com.dingodb.pb.meta.PartitionRule(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.dingodb.pb.meta.PartitionRule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        columns_.makeImmutable();
        result.columns_ = columns_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.strategy_ = strategy_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rangePartition_ = rangePartitionBuilder_ == null
            ? rangePartition_
            : rangePartitionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.hashPartition_ = hashPartitionBuilder_ == null
            ? hashPartition_
            : hashPartitionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dingodb.pb.meta.PartitionRule) {
        return mergeFrom((com.dingodb.pb.meta.PartitionRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dingodb.pb.meta.PartitionRule other) {
      if (other == com.dingodb.pb.meta.PartitionRule.getDefaultInstance()) return this;
      if (!other.columns_.isEmpty()) {
        if (columns_.isEmpty()) {
          columns_ = other.columns_;
          bitField0_ |= 0x00000001;
        } else {
          ensureColumnsIsMutable();
          columns_.addAll(other.columns_);
        }
        onChanged();
      }
      if (other.strategy_ != 0) {
        setStrategyValue(other.getStrategyValue());
      }
      if (other.hasRangePartition()) {
        mergeRangePartition(other.getRangePartition());
      }
      if (other.hasHashPartition()) {
        mergeHashPartition(other.getHashPartition());
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureColumnsIsMutable();
              columns_.add(s);
              break;
            } // case 10
            case 16: {
              strategy_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getRangePartitionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getHashPartitionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private com.google.protobuf.LazyStringArrayList columns_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureColumnsIsMutable() {
      if (!columns_.isModifiable()) {
        columns_ = new com.google.protobuf.LazyStringArrayList(columns_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string columns = 1 [json_name = "columns"];</code>
     * @return A list containing the columns.
     */
    public com.google.protobuf.ProtocolStringList
        getColumnsList() {
      columns_.makeImmutable();
      return columns_;
    }
    /**
     * <code>repeated string columns = 1 [json_name = "columns"];</code>
     * @return The count of columns.
     */
    public int getColumnsCount() {
      return columns_.size();
    }
    /**
     * <code>repeated string columns = 1 [json_name = "columns"];</code>
     * @param index The index of the element to return.
     * @return The columns at the given index.
     */
    public java.lang.String getColumns(int index) {
      return columns_.get(index);
    }
    /**
     * <code>repeated string columns = 1 [json_name = "columns"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the columns at the given index.
     */
    public com.google.protobuf.ByteString
        getColumnsBytes(int index) {
      return columns_.getByteString(index);
    }
    /**
     * <code>repeated string columns = 1 [json_name = "columns"];</code>
     * @param index The index to set the value at.
     * @param value The columns to set.
     * @return This builder for chaining.
     */
    public Builder setColumns(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureColumnsIsMutable();
      columns_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string columns = 1 [json_name = "columns"];</code>
     * @param value The columns to add.
     * @return This builder for chaining.
     */
    public Builder addColumns(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureColumnsIsMutable();
      columns_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string columns = 1 [json_name = "columns"];</code>
     * @param values The columns to add.
     * @return This builder for chaining.
     */
    public Builder addAllColumns(
        java.lang.Iterable<java.lang.String> values) {
      ensureColumnsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, columns_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string columns = 1 [json_name = "columns"];</code>
     * @return This builder for chaining.
     */
    public Builder clearColumns() {
      columns_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string columns = 1 [json_name = "columns"];</code>
     * @param value The bytes of the columns to add.
     * @return This builder for chaining.
     */
    public Builder addColumnsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureColumnsIsMutable();
      columns_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int strategy_ = 0;
    /**
     * <code>.dingodb.pb.meta.PartitionStrategy strategy = 2 [json_name = "strategy"];</code>
     * @return The enum numeric value on the wire for strategy.
     */
    @java.lang.Override public int getStrategyValue() {
      return strategy_;
    }
    /**
     * <code>.dingodb.pb.meta.PartitionStrategy strategy = 2 [json_name = "strategy"];</code>
     * @param value The enum numeric value on the wire for strategy to set.
     * @return This builder for chaining.
     */
    public Builder setStrategyValue(int value) {
      strategy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.PartitionStrategy strategy = 2 [json_name = "strategy"];</code>
     * @return The strategy.
     */
    @java.lang.Override
    public com.dingodb.pb.meta.PartitionStrategy getStrategy() {
      com.dingodb.pb.meta.PartitionStrategy result = com.dingodb.pb.meta.PartitionStrategy.forNumber(strategy_);
      return result == null ? com.dingodb.pb.meta.PartitionStrategy.UNRECOGNIZED : result;
    }
    /**
     * <code>.dingodb.pb.meta.PartitionStrategy strategy = 2 [json_name = "strategy"];</code>
     * @param value The strategy to set.
     * @return This builder for chaining.
     */
    public Builder setStrategy(com.dingodb.pb.meta.PartitionStrategy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      strategy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.PartitionStrategy strategy = 2 [json_name = "strategy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStrategy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      strategy_ = 0;
      onChanged();
      return this;
    }

    private com.dingodb.pb.meta.RangePartition rangePartition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.meta.RangePartition, com.dingodb.pb.meta.RangePartition.Builder, com.dingodb.pb.meta.RangePartitionOrBuilder> rangePartitionBuilder_;
    /**
     * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
     * @return Whether the rangePartition field is set.
     */
    public boolean hasRangePartition() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
     * @return The rangePartition.
     */
    public com.dingodb.pb.meta.RangePartition getRangePartition() {
      if (rangePartitionBuilder_ == null) {
        return rangePartition_ == null ? com.dingodb.pb.meta.RangePartition.getDefaultInstance() : rangePartition_;
      } else {
        return rangePartitionBuilder_.getMessage();
      }
    }
    /**
     * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
     */
    public Builder setRangePartition(com.dingodb.pb.meta.RangePartition value) {
      if (rangePartitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rangePartition_ = value;
      } else {
        rangePartitionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
     */
    public Builder setRangePartition(
        com.dingodb.pb.meta.RangePartition.Builder builderForValue) {
      if (rangePartitionBuilder_ == null) {
        rangePartition_ = builderForValue.build();
      } else {
        rangePartitionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
     */
    public Builder mergeRangePartition(com.dingodb.pb.meta.RangePartition value) {
      if (rangePartitionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          rangePartition_ != null &&
          rangePartition_ != com.dingodb.pb.meta.RangePartition.getDefaultInstance()) {
          getRangePartitionBuilder().mergeFrom(value);
        } else {
          rangePartition_ = value;
        }
      } else {
        rangePartitionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
     */
    public Builder clearRangePartition() {
      bitField0_ = (bitField0_ & ~0x00000004);
      rangePartition_ = null;
      if (rangePartitionBuilder_ != null) {
        rangePartitionBuilder_.dispose();
        rangePartitionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
     */
    public com.dingodb.pb.meta.RangePartition.Builder getRangePartitionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRangePartitionFieldBuilder().getBuilder();
    }
    /**
     * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
     */
    public com.dingodb.pb.meta.RangePartitionOrBuilder getRangePartitionOrBuilder() {
      if (rangePartitionBuilder_ != null) {
        return rangePartitionBuilder_.getMessageOrBuilder();
      } else {
        return rangePartition_ == null ?
            com.dingodb.pb.meta.RangePartition.getDefaultInstance() : rangePartition_;
      }
    }
    /**
     * <code>.dingodb.pb.meta.RangePartition range_partition = 3 [json_name = "rangePartition"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.meta.RangePartition, com.dingodb.pb.meta.RangePartition.Builder, com.dingodb.pb.meta.RangePartitionOrBuilder> 
        getRangePartitionFieldBuilder() {
      if (rangePartitionBuilder_ == null) {
        rangePartitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.dingodb.pb.meta.RangePartition, com.dingodb.pb.meta.RangePartition.Builder, com.dingodb.pb.meta.RangePartitionOrBuilder>(
                getRangePartition(),
                getParentForChildren(),
                isClean());
        rangePartition_ = null;
      }
      return rangePartitionBuilder_;
    }

    private com.dingodb.pb.meta.HashPartition hashPartition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.meta.HashPartition, com.dingodb.pb.meta.HashPartition.Builder, com.dingodb.pb.meta.HashPartitionOrBuilder> hashPartitionBuilder_;
    /**
     * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
     * @return Whether the hashPartition field is set.
     */
    public boolean hasHashPartition() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
     * @return The hashPartition.
     */
    public com.dingodb.pb.meta.HashPartition getHashPartition() {
      if (hashPartitionBuilder_ == null) {
        return hashPartition_ == null ? com.dingodb.pb.meta.HashPartition.getDefaultInstance() : hashPartition_;
      } else {
        return hashPartitionBuilder_.getMessage();
      }
    }
    /**
     * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
     */
    public Builder setHashPartition(com.dingodb.pb.meta.HashPartition value) {
      if (hashPartitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hashPartition_ = value;
      } else {
        hashPartitionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
     */
    public Builder setHashPartition(
        com.dingodb.pb.meta.HashPartition.Builder builderForValue) {
      if (hashPartitionBuilder_ == null) {
        hashPartition_ = builderForValue.build();
      } else {
        hashPartitionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
     */
    public Builder mergeHashPartition(com.dingodb.pb.meta.HashPartition value) {
      if (hashPartitionBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          hashPartition_ != null &&
          hashPartition_ != com.dingodb.pb.meta.HashPartition.getDefaultInstance()) {
          getHashPartitionBuilder().mergeFrom(value);
        } else {
          hashPartition_ = value;
        }
      } else {
        hashPartitionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
     */
    public Builder clearHashPartition() {
      bitField0_ = (bitField0_ & ~0x00000008);
      hashPartition_ = null;
      if (hashPartitionBuilder_ != null) {
        hashPartitionBuilder_.dispose();
        hashPartitionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
     */
    public com.dingodb.pb.meta.HashPartition.Builder getHashPartitionBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getHashPartitionFieldBuilder().getBuilder();
    }
    /**
     * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
     */
    public com.dingodb.pb.meta.HashPartitionOrBuilder getHashPartitionOrBuilder() {
      if (hashPartitionBuilder_ != null) {
        return hashPartitionBuilder_.getMessageOrBuilder();
      } else {
        return hashPartition_ == null ?
            com.dingodb.pb.meta.HashPartition.getDefaultInstance() : hashPartition_;
      }
    }
    /**
     * <code>.dingodb.pb.meta.HashPartition hash_partition = 4 [json_name = "hashPartition"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.meta.HashPartition, com.dingodb.pb.meta.HashPartition.Builder, com.dingodb.pb.meta.HashPartitionOrBuilder> 
        getHashPartitionFieldBuilder() {
      if (hashPartitionBuilder_ == null) {
        hashPartitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.dingodb.pb.meta.HashPartition, com.dingodb.pb.meta.HashPartition.Builder, com.dingodb.pb.meta.HashPartitionOrBuilder>(
                getHashPartition(),
                getParentForChildren(),
                isClean());
        hashPartition_ = null;
      }
      return hashPartitionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:dingodb.pb.meta.PartitionRule)
  }

  // @@protoc_insertion_point(class_scope:dingodb.pb.meta.PartitionRule)
  private static final com.dingodb.pb.meta.PartitionRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dingodb.pb.meta.PartitionRule();
  }

  public static com.dingodb.pb.meta.PartitionRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartitionRule>
      PARSER = new com.google.protobuf.AbstractParser<PartitionRule>() {
    @java.lang.Override
    public PartitionRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<PartitionRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartitionRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dingodb.pb.meta.PartitionRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

