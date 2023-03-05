// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: error.proto

package com.dingodb.pb.error;

/**
 * Protobuf enum {@code dingodb.pb.error.Errno}
 */
public enum Errno
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OK = 0;</code>
   */
  OK(0),
  /**
   * <pre>
   * universal [10000, 20000)
   * </pre>
   *
   * <code>EILLEGAL_PARAMTETERS = 10000;</code>
   */
  EILLEGAL_PARAMTETERS(10000),
  /**
   * <code>EKEY_NOTFOUND = 10001;</code>
   */
  EKEY_NOTFOUND(10001),
  /**
   * <code>EKEY_FORMAT = 10002;</code>
   */
  EKEY_FORMAT(10002),
  /**
   * <pre>
   * raft [50000, 60000)
   * </pre>
   *
   * <code>ERAFT_NOTNODE = 50000;</code>
   */
  ERAFT_NOTNODE(50000),
  /**
   * <code>ERAFT_NOTLEADER = 50001;</code>
   */
  ERAFT_NOTLEADER(50001),
  /**
   * <code>ERAFT_COMMITLOG = 50002;</code>
   */
  ERAFT_COMMITLOG(50002),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OK = 0;</code>
   */
  public static final int OK_VALUE = 0;
  /**
   * <pre>
   * universal [10000, 20000)
   * </pre>
   *
   * <code>EILLEGAL_PARAMTETERS = 10000;</code>
   */
  public static final int EILLEGAL_PARAMTETERS_VALUE = 10000;
  /**
   * <code>EKEY_NOTFOUND = 10001;</code>
   */
  public static final int EKEY_NOTFOUND_VALUE = 10001;
  /**
   * <code>EKEY_FORMAT = 10002;</code>
   */
  public static final int EKEY_FORMAT_VALUE = 10002;
  /**
   * <pre>
   * raft [50000, 60000)
   * </pre>
   *
   * <code>ERAFT_NOTNODE = 50000;</code>
   */
  public static final int ERAFT_NOTNODE_VALUE = 50000;
  /**
   * <code>ERAFT_NOTLEADER = 50001;</code>
   */
  public static final int ERAFT_NOTLEADER_VALUE = 50001;
  /**
   * <code>ERAFT_COMMITLOG = 50002;</code>
   */
  public static final int ERAFT_COMMITLOG_VALUE = 50002;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Errno valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Errno forNumber(int value) {
    switch (value) {
      case 0: return OK;
      case 10000: return EILLEGAL_PARAMTETERS;
      case 10001: return EKEY_NOTFOUND;
      case 10002: return EKEY_FORMAT;
      case 50000: return ERAFT_NOTNODE;
      case 50001: return ERAFT_NOTLEADER;
      case 50002: return ERAFT_COMMITLOG;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Errno>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Errno> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Errno>() {
          public Errno findValueByNumber(int number) {
            return Errno.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.dingodb.pb.error.ErrorProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Errno[] VALUES = values();

  public static Errno valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Errno(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:dingodb.pb.error.Errno)
}

