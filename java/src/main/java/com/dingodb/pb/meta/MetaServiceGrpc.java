package com.dingodb.pb.meta;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: meta.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MetaServiceGrpc {

  private MetaServiceGrpc() {}

  public static final String SERVICE_NAME = "dingodb.pb.meta.MetaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.meta.GetSchemasRequest,
      com.dingodb.pb.meta.GetSchemasResponse> getGetSchemasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSchemas",
      requestType = com.dingodb.pb.meta.GetSchemasRequest.class,
      responseType = com.dingodb.pb.meta.GetSchemasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.meta.GetSchemasRequest,
      com.dingodb.pb.meta.GetSchemasResponse> getGetSchemasMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.meta.GetSchemasRequest, com.dingodb.pb.meta.GetSchemasResponse> getGetSchemasMethod;
    if ((getGetSchemasMethod = MetaServiceGrpc.getGetSchemasMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getGetSchemasMethod = MetaServiceGrpc.getGetSchemasMethod) == null) {
          MetaServiceGrpc.getGetSchemasMethod = getGetSchemasMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.meta.GetSchemasRequest, com.dingodb.pb.meta.GetSchemasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSchemas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.GetSchemasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.GetSchemasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("GetSchemas"))
              .build();
        }
      }
    }
    return getGetSchemasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.meta.GetTablesRequest,
      com.dingodb.pb.meta.GetTablesResponse> getGetTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTables",
      requestType = com.dingodb.pb.meta.GetTablesRequest.class,
      responseType = com.dingodb.pb.meta.GetTablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.meta.GetTablesRequest,
      com.dingodb.pb.meta.GetTablesResponse> getGetTablesMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.meta.GetTablesRequest, com.dingodb.pb.meta.GetTablesResponse> getGetTablesMethod;
    if ((getGetTablesMethod = MetaServiceGrpc.getGetTablesMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getGetTablesMethod = MetaServiceGrpc.getGetTablesMethod) == null) {
          MetaServiceGrpc.getGetTablesMethod = getGetTablesMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.meta.GetTablesRequest, com.dingodb.pb.meta.GetTablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.GetTablesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.GetTablesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("GetTables"))
              .build();
        }
      }
    }
    return getGetTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.meta.GetTableRequest,
      com.dingodb.pb.meta.GetTableResponse> getGetTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTable",
      requestType = com.dingodb.pb.meta.GetTableRequest.class,
      responseType = com.dingodb.pb.meta.GetTableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.meta.GetTableRequest,
      com.dingodb.pb.meta.GetTableResponse> getGetTableMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.meta.GetTableRequest, com.dingodb.pb.meta.GetTableResponse> getGetTableMethod;
    if ((getGetTableMethod = MetaServiceGrpc.getGetTableMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getGetTableMethod = MetaServiceGrpc.getGetTableMethod) == null) {
          MetaServiceGrpc.getGetTableMethod = getGetTableMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.meta.GetTableRequest, com.dingodb.pb.meta.GetTableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.GetTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.GetTableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("GetTable"))
              .build();
        }
      }
    }
    return getGetTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.meta.CreateTableRequest,
      com.dingodb.pb.meta.CreateTableResponse> getCreateTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTable",
      requestType = com.dingodb.pb.meta.CreateTableRequest.class,
      responseType = com.dingodb.pb.meta.CreateTableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.meta.CreateTableRequest,
      com.dingodb.pb.meta.CreateTableResponse> getCreateTableMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.meta.CreateTableRequest, com.dingodb.pb.meta.CreateTableResponse> getCreateTableMethod;
    if ((getCreateTableMethod = MetaServiceGrpc.getCreateTableMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getCreateTableMethod = MetaServiceGrpc.getCreateTableMethod) == null) {
          MetaServiceGrpc.getCreateTableMethod = getCreateTableMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.meta.CreateTableRequest, com.dingodb.pb.meta.CreateTableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.CreateTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.CreateTableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("CreateTable"))
              .build();
        }
      }
    }
    return getCreateTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.meta.DropTableRequest,
      com.dingodb.pb.meta.DropTableResponse> getDropTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DropTable",
      requestType = com.dingodb.pb.meta.DropTableRequest.class,
      responseType = com.dingodb.pb.meta.DropTableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.meta.DropTableRequest,
      com.dingodb.pb.meta.DropTableResponse> getDropTableMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.meta.DropTableRequest, com.dingodb.pb.meta.DropTableResponse> getDropTableMethod;
    if ((getDropTableMethod = MetaServiceGrpc.getDropTableMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getDropTableMethod = MetaServiceGrpc.getDropTableMethod) == null) {
          MetaServiceGrpc.getDropTableMethod = getDropTableMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.meta.DropTableRequest, com.dingodb.pb.meta.DropTableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DropTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.DropTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.DropTableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("DropTable"))
              .build();
        }
      }
    }
    return getDropTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.meta.CreateSchemaRequest,
      com.dingodb.pb.meta.CreateSchemaResponse> getCreateSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSchema",
      requestType = com.dingodb.pb.meta.CreateSchemaRequest.class,
      responseType = com.dingodb.pb.meta.CreateSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.meta.CreateSchemaRequest,
      com.dingodb.pb.meta.CreateSchemaResponse> getCreateSchemaMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.meta.CreateSchemaRequest, com.dingodb.pb.meta.CreateSchemaResponse> getCreateSchemaMethod;
    if ((getCreateSchemaMethod = MetaServiceGrpc.getCreateSchemaMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getCreateSchemaMethod = MetaServiceGrpc.getCreateSchemaMethod) == null) {
          MetaServiceGrpc.getCreateSchemaMethod = getCreateSchemaMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.meta.CreateSchemaRequest, com.dingodb.pb.meta.CreateSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.CreateSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.meta.CreateSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("CreateSchema"))
              .build();
        }
      }
    }
    return getCreateSchemaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaServiceStub>() {
        @java.lang.Override
        public MetaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaServiceStub(channel, callOptions);
        }
      };
    return MetaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaServiceBlockingStub>() {
        @java.lang.Override
        public MetaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaServiceBlockingStub(channel, callOptions);
        }
      };
    return MetaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaServiceFutureStub>() {
        @java.lang.Override
        public MetaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaServiceFutureStub(channel, callOptions);
        }
      };
    return MetaServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MetaServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetSchema
     * in: schema_id
     * out: List&lt;Schema&gt;
     * </pre>
     */
    public void getSchemas(com.dingodb.pb.meta.GetSchemasRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.GetSchemasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSchemasMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTables
     * in: schema_id
     * out: List&lt;TableDefinitionWithId&gt;
     * </pre>
     */
    public void getTables(com.dingodb.pb.meta.GetTablesRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.GetTablesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTable
     * in: table_id
     * out: Table
     * </pre>
     */
    public void getTable(com.dingodb.pb.meta.GetTableRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.GetTableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTableMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateTable
     * in: schema_id TableDefinition
     * out: table_id
     * </pre>
     */
    public void createTable(com.dingodb.pb.meta.CreateTableRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.CreateTableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTableMethod(), responseObserver);
    }

    /**
     * <pre>
     * DropTable
     * in: schema_id table_id
     * out: {}
     * </pre>
     */
    public void dropTable(com.dingodb.pb.meta.DropTableRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.DropTableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropTableMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSchema
     * in: parent_schema_id schema_name
     * out: Schema
     * </pre>
     */
    public void createSchema(com.dingodb.pb.meta.CreateSchemaRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.CreateSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSchemaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSchemasMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.meta.GetSchemasRequest,
                com.dingodb.pb.meta.GetSchemasResponse>(
                  this, METHODID_GET_SCHEMAS)))
          .addMethod(
            getGetTablesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.meta.GetTablesRequest,
                com.dingodb.pb.meta.GetTablesResponse>(
                  this, METHODID_GET_TABLES)))
          .addMethod(
            getGetTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.meta.GetTableRequest,
                com.dingodb.pb.meta.GetTableResponse>(
                  this, METHODID_GET_TABLE)))
          .addMethod(
            getCreateTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.meta.CreateTableRequest,
                com.dingodb.pb.meta.CreateTableResponse>(
                  this, METHODID_CREATE_TABLE)))
          .addMethod(
            getDropTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.meta.DropTableRequest,
                com.dingodb.pb.meta.DropTableResponse>(
                  this, METHODID_DROP_TABLE)))
          .addMethod(
            getCreateSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.meta.CreateSchemaRequest,
                com.dingodb.pb.meta.CreateSchemaResponse>(
                  this, METHODID_CREATE_SCHEMA)))
          .build();
    }
  }

  /**
   */
  public static final class MetaServiceStub extends io.grpc.stub.AbstractAsyncStub<MetaServiceStub> {
    private MetaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSchema
     * in: schema_id
     * out: List&lt;Schema&gt;
     * </pre>
     */
    public void getSchemas(com.dingodb.pb.meta.GetSchemasRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.GetSchemasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSchemasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTables
     * in: schema_id
     * out: List&lt;TableDefinitionWithId&gt;
     * </pre>
     */
    public void getTables(com.dingodb.pb.meta.GetTablesRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.GetTablesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTable
     * in: table_id
     * out: Table
     * </pre>
     */
    public void getTable(com.dingodb.pb.meta.GetTableRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.GetTableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateTable
     * in: schema_id TableDefinition
     * out: table_id
     * </pre>
     */
    public void createTable(com.dingodb.pb.meta.CreateTableRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.CreateTableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DropTable
     * in: schema_id table_id
     * out: {}
     * </pre>
     */
    public void dropTable(com.dingodb.pb.meta.DropTableRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.DropTableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDropTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSchema
     * in: parent_schema_id schema_name
     * out: Schema
     * </pre>
     */
    public void createSchema(com.dingodb.pb.meta.CreateSchemaRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.meta.CreateSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSchemaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MetaServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MetaServiceBlockingStub> {
    private MetaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSchema
     * in: schema_id
     * out: List&lt;Schema&gt;
     * </pre>
     */
    public com.dingodb.pb.meta.GetSchemasResponse getSchemas(com.dingodb.pb.meta.GetSchemasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSchemasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTables
     * in: schema_id
     * out: List&lt;TableDefinitionWithId&gt;
     * </pre>
     */
    public com.dingodb.pb.meta.GetTablesResponse getTables(com.dingodb.pb.meta.GetTablesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTable
     * in: table_id
     * out: Table
     * </pre>
     */
    public com.dingodb.pb.meta.GetTableResponse getTable(com.dingodb.pb.meta.GetTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateTable
     * in: schema_id TableDefinition
     * out: table_id
     * </pre>
     */
    public com.dingodb.pb.meta.CreateTableResponse createTable(com.dingodb.pb.meta.CreateTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DropTable
     * in: schema_id table_id
     * out: {}
     * </pre>
     */
    public com.dingodb.pb.meta.DropTableResponse dropTable(com.dingodb.pb.meta.DropTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDropTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSchema
     * in: parent_schema_id schema_name
     * out: Schema
     * </pre>
     */
    public com.dingodb.pb.meta.CreateSchemaResponse createSchema(com.dingodb.pb.meta.CreateSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSchemaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MetaServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MetaServiceFutureStub> {
    private MetaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSchema
     * in: schema_id
     * out: List&lt;Schema&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.meta.GetSchemasResponse> getSchemas(
        com.dingodb.pb.meta.GetSchemasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSchemasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTables
     * in: schema_id
     * out: List&lt;TableDefinitionWithId&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.meta.GetTablesResponse> getTables(
        com.dingodb.pb.meta.GetTablesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTable
     * in: table_id
     * out: Table
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.meta.GetTableResponse> getTable(
        com.dingodb.pb.meta.GetTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateTable
     * in: schema_id TableDefinition
     * out: table_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.meta.CreateTableResponse> createTable(
        com.dingodb.pb.meta.CreateTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DropTable
     * in: schema_id table_id
     * out: {}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.meta.DropTableResponse> dropTable(
        com.dingodb.pb.meta.DropTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDropTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSchema
     * in: parent_schema_id schema_name
     * out: Schema
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.meta.CreateSchemaResponse> createSchema(
        com.dingodb.pb.meta.CreateSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSchemaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SCHEMAS = 0;
  private static final int METHODID_GET_TABLES = 1;
  private static final int METHODID_GET_TABLE = 2;
  private static final int METHODID_CREATE_TABLE = 3;
  private static final int METHODID_DROP_TABLE = 4;
  private static final int METHODID_CREATE_SCHEMA = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SCHEMAS:
          serviceImpl.getSchemas((com.dingodb.pb.meta.GetSchemasRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.meta.GetSchemasResponse>) responseObserver);
          break;
        case METHODID_GET_TABLES:
          serviceImpl.getTables((com.dingodb.pb.meta.GetTablesRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.meta.GetTablesResponse>) responseObserver);
          break;
        case METHODID_GET_TABLE:
          serviceImpl.getTable((com.dingodb.pb.meta.GetTableRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.meta.GetTableResponse>) responseObserver);
          break;
        case METHODID_CREATE_TABLE:
          serviceImpl.createTable((com.dingodb.pb.meta.CreateTableRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.meta.CreateTableResponse>) responseObserver);
          break;
        case METHODID_DROP_TABLE:
          serviceImpl.dropTable((com.dingodb.pb.meta.DropTableRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.meta.DropTableResponse>) responseObserver);
          break;
        case METHODID_CREATE_SCHEMA:
          serviceImpl.createSchema((com.dingodb.pb.meta.CreateSchemaRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.meta.CreateSchemaResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MetaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dingodb.pb.meta.MetaProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetaService");
    }
  }

  private static final class MetaServiceFileDescriptorSupplier
      extends MetaServiceBaseDescriptorSupplier {
    MetaServiceFileDescriptorSupplier() {}
  }

  private static final class MetaServiceMethodDescriptorSupplier
      extends MetaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetaServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MetaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetaServiceFileDescriptorSupplier())
              .addMethod(getGetSchemasMethod())
              .addMethod(getGetTablesMethod())
              .addMethod(getGetTableMethod())
              .addMethod(getCreateTableMethod())
              .addMethod(getDropTableMethod())
              .addMethod(getCreateSchemaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
