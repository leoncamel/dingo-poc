// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta.proto

package com.dingodb.pb.meta;

/**
 * Protobuf type {@code dingodb.pb.meta.GetTableResponse}
 */
public final class GetTableResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dingodb.pb.meta.GetTableResponse)
    GetTableResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTableResponse.newBuilder() to construct.
  private GetTableResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTableResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTableResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_GetTableResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_GetTableResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dingodb.pb.meta.GetTableResponse.class, com.dingodb.pb.meta.GetTableResponse.Builder.class);
  }

  public static final int ERROR_FIELD_NUMBER = 1;
  private com.dingodb.pb.error.Error error_;
  /**
   * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
   * @return The error.
   */
  @java.lang.Override
  public com.dingodb.pb.error.Error getError() {
    return error_ == null ? com.dingodb.pb.error.Error.getDefaultInstance() : error_;
  }
  /**
   * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.error.ErrorOrBuilder getErrorOrBuilder() {
    return error_ == null ? com.dingodb.pb.error.Error.getDefaultInstance() : error_;
  }

  public static final int TABLE_FIELD_NUMBER = 2;
  private com.dingodb.pb.meta.Table table_;
  /**
   * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
   * @return Whether the table field is set.
   */
  @java.lang.Override
  public boolean hasTable() {
    return table_ != null;
  }
  /**
   * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
   * @return The table.
   */
  @java.lang.Override
  public com.dingodb.pb.meta.Table getTable() {
    return table_ == null ? com.dingodb.pb.meta.Table.getDefaultInstance() : table_;
  }
  /**
   * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
   */
  @java.lang.Override
  public com.dingodb.pb.meta.TableOrBuilder getTableOrBuilder() {
    return table_ == null ? com.dingodb.pb.meta.Table.getDefaultInstance() : table_;
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
    if (error_ != null) {
      output.writeMessage(1, getError());
    }
    if (table_ != null) {
      output.writeMessage(2, getTable());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getError());
    }
    if (table_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTable());
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
    if (!(obj instanceof com.dingodb.pb.meta.GetTableResponse)) {
      return super.equals(obj);
    }
    com.dingodb.pb.meta.GetTableResponse other = (com.dingodb.pb.meta.GetTableResponse) obj;

    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError()
          .equals(other.getError())) return false;
    }
    if (hasTable() != other.hasTable()) return false;
    if (hasTable()) {
      if (!getTable()
          .equals(other.getTable())) return false;
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
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    if (hasTable()) {
      hash = (37 * hash) + TABLE_FIELD_NUMBER;
      hash = (53 * hash) + getTable().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dingodb.pb.meta.GetTableResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dingodb.pb.meta.GetTableResponse parseFrom(
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
  public static Builder newBuilder(com.dingodb.pb.meta.GetTableResponse prototype) {
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
   * Protobuf type {@code dingodb.pb.meta.GetTableResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dingodb.pb.meta.GetTableResponse)
      com.dingodb.pb.meta.GetTableResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_GetTableResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_GetTableResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dingodb.pb.meta.GetTableResponse.class, com.dingodb.pb.meta.GetTableResponse.Builder.class);
    }

    // Construct using com.dingodb.pb.meta.GetTableResponse.newBuilder()
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
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      table_ = null;
      if (tableBuilder_ != null) {
        tableBuilder_.dispose();
        tableBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dingodb.pb.meta.MetaProto.internal_static_dingodb_pb_meta_GetTableResponse_descriptor;
    }

    @java.lang.Override
    public com.dingodb.pb.meta.GetTableResponse getDefaultInstanceForType() {
      return com.dingodb.pb.meta.GetTableResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.dingodb.pb.meta.GetTableResponse build() {
      com.dingodb.pb.meta.GetTableResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dingodb.pb.meta.GetTableResponse buildPartial() {
      com.dingodb.pb.meta.GetTableResponse result = new com.dingodb.pb.meta.GetTableResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.dingodb.pb.meta.GetTableResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.error_ = errorBuilder_ == null
            ? error_
            : errorBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.table_ = tableBuilder_ == null
            ? table_
            : tableBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dingodb.pb.meta.GetTableResponse) {
        return mergeFrom((com.dingodb.pb.meta.GetTableResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dingodb.pb.meta.GetTableResponse other) {
      if (other == com.dingodb.pb.meta.GetTableResponse.getDefaultInstance()) return this;
      if (other.hasError()) {
        mergeError(other.getError());
      }
      if (other.hasTable()) {
        mergeTable(other.getTable());
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
                  getErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTableFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private com.dingodb.pb.error.Error error_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.error.Error, com.dingodb.pb.error.Error.Builder, com.dingodb.pb.error.ErrorOrBuilder> errorBuilder_;
    /**
     * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
     * @return The error.
     */
    public com.dingodb.pb.error.Error getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.dingodb.pb.error.Error.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
     */
    public Builder setError(com.dingodb.pb.error.Error value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
     */
    public Builder setError(
        com.dingodb.pb.error.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
     */
    public Builder mergeError(com.dingodb.pb.error.Error value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          error_ != null &&
          error_ != com.dingodb.pb.error.Error.getDefaultInstance()) {
          getErrorBuilder().mergeFrom(value);
        } else {
          error_ = value;
        }
      } else {
        errorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000001);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
     */
    public com.dingodb.pb.error.Error.Builder getErrorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
     */
    public com.dingodb.pb.error.ErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            com.dingodb.pb.error.Error.getDefaultInstance() : error_;
      }
    }
    /**
     * <code>.dingodb.pb.error.Error error = 1 [json_name = "error"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.error.Error, com.dingodb.pb.error.Error.Builder, com.dingodb.pb.error.ErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.dingodb.pb.error.Error, com.dingodb.pb.error.Error.Builder, com.dingodb.pb.error.ErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    private com.dingodb.pb.meta.Table table_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.meta.Table, com.dingodb.pb.meta.Table.Builder, com.dingodb.pb.meta.TableOrBuilder> tableBuilder_;
    /**
     * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
     * @return Whether the table field is set.
     */
    public boolean hasTable() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
     * @return The table.
     */
    public com.dingodb.pb.meta.Table getTable() {
      if (tableBuilder_ == null) {
        return table_ == null ? com.dingodb.pb.meta.Table.getDefaultInstance() : table_;
      } else {
        return tableBuilder_.getMessage();
      }
    }
    /**
     * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
     */
    public Builder setTable(com.dingodb.pb.meta.Table value) {
      if (tableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        table_ = value;
      } else {
        tableBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
     */
    public Builder setTable(
        com.dingodb.pb.meta.Table.Builder builderForValue) {
      if (tableBuilder_ == null) {
        table_ = builderForValue.build();
      } else {
        tableBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
     */
    public Builder mergeTable(com.dingodb.pb.meta.Table value) {
      if (tableBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          table_ != null &&
          table_ != com.dingodb.pb.meta.Table.getDefaultInstance()) {
          getTableBuilder().mergeFrom(value);
        } else {
          table_ = value;
        }
      } else {
        tableBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
     */
    public Builder clearTable() {
      bitField0_ = (bitField0_ & ~0x00000002);
      table_ = null;
      if (tableBuilder_ != null) {
        tableBuilder_.dispose();
        tableBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
     */
    public com.dingodb.pb.meta.Table.Builder getTableBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTableFieldBuilder().getBuilder();
    }
    /**
     * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
     */
    public com.dingodb.pb.meta.TableOrBuilder getTableOrBuilder() {
      if (tableBuilder_ != null) {
        return tableBuilder_.getMessageOrBuilder();
      } else {
        return table_ == null ?
            com.dingodb.pb.meta.Table.getDefaultInstance() : table_;
      }
    }
    /**
     * <code>.dingodb.pb.meta.Table table = 2 [json_name = "table"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.dingodb.pb.meta.Table, com.dingodb.pb.meta.Table.Builder, com.dingodb.pb.meta.TableOrBuilder> 
        getTableFieldBuilder() {
      if (tableBuilder_ == null) {
        tableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.dingodb.pb.meta.Table, com.dingodb.pb.meta.Table.Builder, com.dingodb.pb.meta.TableOrBuilder>(
                getTable(),
                getParentForChildren(),
                isClean());
        table_ = null;
      }
      return tableBuilder_;
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


    // @@protoc_insertion_point(builder_scope:dingodb.pb.meta.GetTableResponse)
  }

  // @@protoc_insertion_point(class_scope:dingodb.pb.meta.GetTableResponse)
  private static final com.dingodb.pb.meta.GetTableResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dingodb.pb.meta.GetTableResponse();
  }

  public static com.dingodb.pb.meta.GetTableResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTableResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTableResponse>() {
    @java.lang.Override
    public GetTableResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTableResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTableResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dingodb.pb.meta.GetTableResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

