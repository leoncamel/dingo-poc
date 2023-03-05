// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta.proto

package com.dingodb.pb.meta;

/**
 * Protobuf type {@code dingodb.pb.meta.GetTableRequest}
 */
public final class GetTableRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dingodb.pb.meta.GetTableRequest)
    GetTableRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTableRequest.newBuilder() to construct.
  private GetTableRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTableRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTableRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_GetTableRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_GetTableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dingodb.pb.meta.GetTableRequest.class, com.dingodb.pb.meta.GetTableRequest.Builder.class);
  }

  public static final int TABLE_ID_FIELD_NUMBER = 1;
  private com.dingodb.pb.meta.DingoCommonId tableId_;
  /**
   * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
   * @return Whether the tableId field is set.
   */
  @java.lang.Override
  public boolean hasTableId() {
    return tableId_ != null;
  }
  /**
   * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
   * @return The tableId.
   */
  @java.lang.Override
  public com.dingodb.pb.meta.DingoCommonId getTableId() {
    return tableId_ == null ? com.dingodb.pb.meta.DingoCommonId.getDefaultInstance() : tableId_;
  }
  /**
   * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.meta.DingoCommonIdOrBuilder getTableIdOrBuilder() {
    return tableId_ == null ? com.dingodb.pb.meta.DingoCommonId.getDefaultInstance() : tableId_;
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
    if (tableId_ != null) {
      output.writeMessage(1, getTableId());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tableId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTableId());
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
    if (!(obj instanceof com.dingodb.pb.meta.GetTableRequest)) {
      return super.equals(obj);
    }
    com.dingodb.pb.meta.GetTableRequest other = (com.dingodb.pb.meta.GetTableRequest) obj;

    if (hasTableId() != other.hasTableId()) return false;
    if (hasTableId()) {
      if (!getTableId()
          .equals(other.getTableId())) return false;
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
    if (hasTableId()) {
      hash = (37 * hash) + TABLE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTableId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dingodb.pb.meta.GetTableRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.meta.GetTableRequest parseFrom(
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
  public static Builder newBuilder(com.dingodb.pb.meta.GetTableRequest prototype) {
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
   * Protobuf type {@code dingodb.pb.meta.GetTableRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dingodb.pb.meta.GetTableRequest)
      com.dingodb.pb.meta.GetTableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_GetTableRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_GetTableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dingodb.pb.meta.GetTableRequest.class, com.dingodb.pb.meta.GetTableRequest.Builder.class);
    }

    // Construct using com.dingodb.pb.meta.GetTableRequest.newBuilder()
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
      tableId_ = null;
      if (tableIdBuilder_ != null) {
        tableIdBuilder_.dispose();
        tableIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_GetTableRequest_descriptor;
    }

    @java.lang.Override
    public com.dingodb.pb.meta.GetTableRequest getDefaultInstanceForType() {
      return com.dingodb.pb.meta.GetTableRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.dingodb.pb.meta.GetTableRequest build() {
      com.dingodb.pb.meta.GetTableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dingodb.pb.meta.GetTableRequest buildPartial() {
      com.dingodb.pb.meta.GetTableRequest result = new com.dingodb.pb.meta.GetTableRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.dingodb.pb.meta.GetTableRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tableId_ = tableIdBuilder_ == null
            ? tableId_
            : tableIdBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dingodb.pb.meta.GetTableRequest) {
        return mergeFrom((com.dingodb.pb.meta.GetTableRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dingodb.pb.meta.GetTableRequest other) {
      if (other == com.dingodb.pb.meta.GetTableRequest.getDefaultInstance()) return this;
      if (other.hasTableId()) {
        mergeTableId(other.getTableId());
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
              input.readMessage(
                  getTableIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.dingodb.pb.meta.DingoCommonId tableId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.meta.DingoCommonId, com.dingodb.pb.meta.DingoCommonId.Builder, com.dingodb.pb.meta.DingoCommonIdOrBuilder> tableIdBuilder_;
    /**
     * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
     * @return Whether the tableId field is set.
     */
    public boolean hasTableId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
     * @return The tableId.
     */
    public com.dingodb.pb.meta.DingoCommonId getTableId() {
      if (tableIdBuilder_ == null) {
        return tableId_ == null ? com.dingodb.pb.meta.DingoCommonId.getDefaultInstance() : tableId_;
      } else {
        return tableIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
     */
    public Builder setTableId(com.dingodb.pb.meta.DingoCommonId value) {
      if (tableIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tableId_ = value;
      } else {
        tableIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
     */
    public Builder setTableId(
        com.dingodb.pb.meta.DingoCommonId.Builder builderForValue) {
      if (tableIdBuilder_ == null) {
        tableId_ = builderForValue.build();
      } else {
        tableIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
     */
    public Builder mergeTableId(com.dingodb.pb.meta.DingoCommonId value) {
      if (tableIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tableId_ != null &&
          tableId_ != com.dingodb.pb.meta.DingoCommonId.getDefaultInstance()) {
          getTableIdBuilder().mergeFrom(value);
        } else {
          tableId_ = value;
        }
      } else {
        tableIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
     */
    public Builder clearTableId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tableId_ = null;
      if (tableIdBuilder_ != null) {
        tableIdBuilder_.dispose();
        tableIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
     */
    public com.dingodb.pb.meta.DingoCommonId.Builder getTableIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTableIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
     */
    public com.dingodb.pb.meta.DingoCommonIdOrBuilder getTableIdOrBuilder() {
      if (tableIdBuilder_ != null) {
        return tableIdBuilder_.getMessageOrBuilder();
      } else {
        return tableId_ == null ?
            com.dingodb.pb.meta.DingoCommonId.getDefaultInstance() : tableId_;
      }
    }
    /**
     * <code>.dingodb.pb.meta.DingoCommonId table_id = 1 [json_name = "tableId"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.meta.DingoCommonId, com.dingodb.pb.meta.DingoCommonId.Builder, com.dingodb.pb.meta.DingoCommonIdOrBuilder> 
        getTableIdFieldBuilder() {
      if (tableIdBuilder_ == null) {
        tableIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.dingodb.pb.meta.DingoCommonId, com.dingodb.pb.meta.DingoCommonId.Builder, com.dingodb.pb.meta.DingoCommonIdOrBuilder>(
                getTableId(),
                getParentForChildren(),
                isClean());
        tableId_ = null;
      }
      return tableIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:dingodb.pb.meta.GetTableRequest)
  }

  // @@protoc_insertion_point(class_scope:dingodb.pb.meta.GetTableRequest)
  private static final com.dingodb.pb.meta.GetTableRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dingodb.pb.meta.GetTableRequest();
  }

  public static com.dingodb.pb.meta.GetTableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTableRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetTableRequest>() {
    @java.lang.Override
    public GetTableRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTableRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dingodb.pb.meta.GetTableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

