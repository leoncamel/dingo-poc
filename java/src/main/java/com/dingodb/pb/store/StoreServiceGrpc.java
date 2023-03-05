package com.dingodb.pb.store;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: store.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StoreServiceGrpc {

  private StoreServiceGrpc() {}

  public static final String SERVICE_NAME = "dingodb.pb.store.StoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.store.AddRegionRequest,
      com.dingodb.pb.store.AddRegionResponse> getAddRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRegion",
      requestType = com.dingodb.pb.store.AddRegionRequest.class,
      responseType = com.dingodb.pb.store.AddRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.store.AddRegionRequest,
      com.dingodb.pb.store.AddRegionResponse> getAddRegionMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.store.AddRegionRequest, com.dingodb.pb.store.AddRegionResponse> getAddRegionMethod;
    if ((getAddRegionMethod = StoreServiceGrpc.getAddRegionMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getAddRegionMethod = StoreServiceGrpc.getAddRegionMethod) == null) {
          StoreServiceGrpc.getAddRegionMethod = getAddRegionMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.store.AddRegionRequest, com.dingodb.pb.store.AddRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.AddRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.AddRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("AddRegion"))
              .build();
        }
      }
    }
    return getAddRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.store.DestroyRegionRequest,
      com.dingodb.pb.store.DestroyRegionResponse> getDestroyRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyRegion",
      requestType = com.dingodb.pb.store.DestroyRegionRequest.class,
      responseType = com.dingodb.pb.store.DestroyRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.store.DestroyRegionRequest,
      com.dingodb.pb.store.DestroyRegionResponse> getDestroyRegionMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.store.DestroyRegionRequest, com.dingodb.pb.store.DestroyRegionResponse> getDestroyRegionMethod;
    if ((getDestroyRegionMethod = StoreServiceGrpc.getDestroyRegionMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getDestroyRegionMethod = StoreServiceGrpc.getDestroyRegionMethod) == null) {
          StoreServiceGrpc.getDestroyRegionMethod = getDestroyRegionMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.store.DestroyRegionRequest, com.dingodb.pb.store.DestroyRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.DestroyRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.DestroyRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("DestroyRegion"))
              .build();
        }
      }
    }
    return getDestroyRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.store.KvGetRequest,
      com.dingodb.pb.store.KvGetResponse> getKvGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvGet",
      requestType = com.dingodb.pb.store.KvGetRequest.class,
      responseType = com.dingodb.pb.store.KvGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.store.KvGetRequest,
      com.dingodb.pb.store.KvGetResponse> getKvGetMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.store.KvGetRequest, com.dingodb.pb.store.KvGetResponse> getKvGetMethod;
    if ((getKvGetMethod = StoreServiceGrpc.getKvGetMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getKvGetMethod = StoreServiceGrpc.getKvGetMethod) == null) {
          StoreServiceGrpc.getKvGetMethod = getKvGetMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.store.KvGetRequest, com.dingodb.pb.store.KvGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("KvGet"))
              .build();
        }
      }
    }
    return getKvGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.store.KvBatchGetRequest,
      com.dingodb.pb.store.KvBatchGetResponse> getKvBatchGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvBatchGet",
      requestType = com.dingodb.pb.store.KvBatchGetRequest.class,
      responseType = com.dingodb.pb.store.KvBatchGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.store.KvBatchGetRequest,
      com.dingodb.pb.store.KvBatchGetResponse> getKvBatchGetMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.store.KvBatchGetRequest, com.dingodb.pb.store.KvBatchGetResponse> getKvBatchGetMethod;
    if ((getKvBatchGetMethod = StoreServiceGrpc.getKvBatchGetMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getKvBatchGetMethod = StoreServiceGrpc.getKvBatchGetMethod) == null) {
          StoreServiceGrpc.getKvBatchGetMethod = getKvBatchGetMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.store.KvBatchGetRequest, com.dingodb.pb.store.KvBatchGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvBatchGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvBatchGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvBatchGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("KvBatchGet"))
              .build();
        }
      }
    }
    return getKvBatchGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.store.KvPutRequest,
      com.dingodb.pb.store.KvPutResponse> getKvPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvPut",
      requestType = com.dingodb.pb.store.KvPutRequest.class,
      responseType = com.dingodb.pb.store.KvPutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.store.KvPutRequest,
      com.dingodb.pb.store.KvPutResponse> getKvPutMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.store.KvPutRequest, com.dingodb.pb.store.KvPutResponse> getKvPutMethod;
    if ((getKvPutMethod = StoreServiceGrpc.getKvPutMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getKvPutMethod = StoreServiceGrpc.getKvPutMethod) == null) {
          StoreServiceGrpc.getKvPutMethod = getKvPutMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.store.KvPutRequest, com.dingodb.pb.store.KvPutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvPut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvPutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvPutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("KvPut"))
              .build();
        }
      }
    }
    return getKvPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.store.KvBatchPutRequest,
      com.dingodb.pb.store.KvBatchPutResponse> getKvBatchPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvBatchPut",
      requestType = com.dingodb.pb.store.KvBatchPutRequest.class,
      responseType = com.dingodb.pb.store.KvBatchPutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.store.KvBatchPutRequest,
      com.dingodb.pb.store.KvBatchPutResponse> getKvBatchPutMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.store.KvBatchPutRequest, com.dingodb.pb.store.KvBatchPutResponse> getKvBatchPutMethod;
    if ((getKvBatchPutMethod = StoreServiceGrpc.getKvBatchPutMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getKvBatchPutMethod = StoreServiceGrpc.getKvBatchPutMethod) == null) {
          StoreServiceGrpc.getKvBatchPutMethod = getKvBatchPutMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.store.KvBatchPutRequest, com.dingodb.pb.store.KvBatchPutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvBatchPut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvBatchPutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvBatchPutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("KvBatchPut"))
              .build();
        }
      }
    }
    return getKvBatchPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.store.KvPutIfAbsentRequest,
      com.dingodb.pb.store.KvPutIfAbsentResponse> getKvPutIfAbsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvPutIfAbsent",
      requestType = com.dingodb.pb.store.KvPutIfAbsentRequest.class,
      responseType = com.dingodb.pb.store.KvPutIfAbsentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.store.KvPutIfAbsentRequest,
      com.dingodb.pb.store.KvPutIfAbsentResponse> getKvPutIfAbsentMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.store.KvPutIfAbsentRequest, com.dingodb.pb.store.KvPutIfAbsentResponse> getKvPutIfAbsentMethod;
    if ((getKvPutIfAbsentMethod = StoreServiceGrpc.getKvPutIfAbsentMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getKvPutIfAbsentMethod = StoreServiceGrpc.getKvPutIfAbsentMethod) == null) {
          StoreServiceGrpc.getKvPutIfAbsentMethod = getKvPutIfAbsentMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.store.KvPutIfAbsentRequest, com.dingodb.pb.store.KvPutIfAbsentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvPutIfAbsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvPutIfAbsentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvPutIfAbsentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("KvPutIfAbsent"))
              .build();
        }
      }
    }
    return getKvPutIfAbsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.store.KvBatchPutIfAbsentRequest,
      com.dingodb.pb.store.KvBatchPutIfAbsentResponse> getKvBatchPutIfAbsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvBatchPutIfAbsent",
      requestType = com.dingodb.pb.store.KvBatchPutIfAbsentRequest.class,
      responseType = com.dingodb.pb.store.KvBatchPutIfAbsentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.store.KvBatchPutIfAbsentRequest,
      com.dingodb.pb.store.KvBatchPutIfAbsentResponse> getKvBatchPutIfAbsentMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.store.KvBatchPutIfAbsentRequest, com.dingodb.pb.store.KvBatchPutIfAbsentResponse> getKvBatchPutIfAbsentMethod;
    if ((getKvBatchPutIfAbsentMethod = StoreServiceGrpc.getKvBatchPutIfAbsentMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getKvBatchPutIfAbsentMethod = StoreServiceGrpc.getKvBatchPutIfAbsentMethod) == null) {
          StoreServiceGrpc.getKvBatchPutIfAbsentMethod = getKvBatchPutIfAbsentMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.store.KvBatchPutIfAbsentRequest, com.dingodb.pb.store.KvBatchPutIfAbsentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvBatchPutIfAbsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvBatchPutIfAbsentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.store.KvBatchPutIfAbsentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("KvBatchPutIfAbsent"))
              .build();
        }
      }
    }
    return getKvBatchPutIfAbsentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceStub>() {
        @java.lang.Override
        public StoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceStub(channel, callOptions);
        }
      };
    return StoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceBlockingStub>() {
        @java.lang.Override
        public StoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceBlockingStub(channel, callOptions);
        }
      };
    return StoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceFutureStub>() {
        @java.lang.Override
        public StoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceFutureStub(channel, callOptions);
        }
      };
    return StoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StoreServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * region
     * </pre>
     */
    public void addRegion(com.dingodb.pb.store.AddRegionRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.AddRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRegionMethod(), responseObserver);
    }

    /**
     */
    public void destroyRegion(com.dingodb.pb.store.DestroyRegionRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.DestroyRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDestroyRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * kv
     * </pre>
     */
    public void kvGet(com.dingodb.pb.store.KvGetRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvGetMethod(), responseObserver);
    }

    /**
     */
    public void kvBatchGet(com.dingodb.pb.store.KvBatchGetRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvBatchGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvBatchGetMethod(), responseObserver);
    }

    /**
     */
    public void kvPut(com.dingodb.pb.store.KvPutRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvPutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvPutMethod(), responseObserver);
    }

    /**
     */
    public void kvBatchPut(com.dingodb.pb.store.KvBatchPutRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvBatchPutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvBatchPutMethod(), responseObserver);
    }

    /**
     */
    public void kvPutIfAbsent(com.dingodb.pb.store.KvPutIfAbsentRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvPutIfAbsentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvPutIfAbsentMethod(), responseObserver);
    }

    /**
     */
    public void kvBatchPutIfAbsent(com.dingodb.pb.store.KvBatchPutIfAbsentRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvBatchPutIfAbsentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvBatchPutIfAbsentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddRegionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.store.AddRegionRequest,
                com.dingodb.pb.store.AddRegionResponse>(
                  this, METHODID_ADD_REGION)))
          .addMethod(
            getDestroyRegionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.store.DestroyRegionRequest,
                com.dingodb.pb.store.DestroyRegionResponse>(
                  this, METHODID_DESTROY_REGION)))
          .addMethod(
            getKvGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.store.KvGetRequest,
                com.dingodb.pb.store.KvGetResponse>(
                  this, METHODID_KV_GET)))
          .addMethod(
            getKvBatchGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.store.KvBatchGetRequest,
                com.dingodb.pb.store.KvBatchGetResponse>(
                  this, METHODID_KV_BATCH_GET)))
          .addMethod(
            getKvPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.store.KvPutRequest,
                com.dingodb.pb.store.KvPutResponse>(
                  this, METHODID_KV_PUT)))
          .addMethod(
            getKvBatchPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.store.KvBatchPutRequest,
                com.dingodb.pb.store.KvBatchPutResponse>(
                  this, METHODID_KV_BATCH_PUT)))
          .addMethod(
            getKvPutIfAbsentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.store.KvPutIfAbsentRequest,
                com.dingodb.pb.store.KvPutIfAbsentResponse>(
                  this, METHODID_KV_PUT_IF_ABSENT)))
          .addMethod(
            getKvBatchPutIfAbsentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.store.KvBatchPutIfAbsentRequest,
                com.dingodb.pb.store.KvBatchPutIfAbsentResponse>(
                  this, METHODID_KV_BATCH_PUT_IF_ABSENT)))
          .build();
    }
  }

  /**
   */
  public static final class StoreServiceStub extends io.grpc.stub.AbstractAsyncStub<StoreServiceStub> {
    private StoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * region
     * </pre>
     */
    public void addRegion(com.dingodb.pb.store.AddRegionRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.AddRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroyRegion(com.dingodb.pb.store.DestroyRegionRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.DestroyRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDestroyRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * kv
     * </pre>
     */
    public void kvGet(com.dingodb.pb.store.KvGetRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvBatchGet(com.dingodb.pb.store.KvBatchGetRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvBatchGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvBatchGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvPut(com.dingodb.pb.store.KvPutRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvPutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvBatchPut(com.dingodb.pb.store.KvBatchPutRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvBatchPutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvBatchPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvPutIfAbsent(com.dingodb.pb.store.KvPutIfAbsentRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvPutIfAbsentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvPutIfAbsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvBatchPutIfAbsent(com.dingodb.pb.store.KvBatchPutIfAbsentRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvBatchPutIfAbsentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvBatchPutIfAbsentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StoreServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StoreServiceBlockingStub> {
    private StoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * region
     * </pre>
     */
    public com.dingodb.pb.store.AddRegionResponse addRegion(com.dingodb.pb.store.AddRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dingodb.pb.store.DestroyRegionResponse destroyRegion(com.dingodb.pb.store.DestroyRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDestroyRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * kv
     * </pre>
     */
    public com.dingodb.pb.store.KvGetResponse kvGet(com.dingodb.pb.store.KvGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dingodb.pb.store.KvBatchGetResponse kvBatchGet(com.dingodb.pb.store.KvBatchGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvBatchGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dingodb.pb.store.KvPutResponse kvPut(com.dingodb.pb.store.KvPutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dingodb.pb.store.KvBatchPutResponse kvBatchPut(com.dingodb.pb.store.KvBatchPutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvBatchPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dingodb.pb.store.KvPutIfAbsentResponse kvPutIfAbsent(com.dingodb.pb.store.KvPutIfAbsentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvPutIfAbsentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dingodb.pb.store.KvBatchPutIfAbsentResponse kvBatchPutIfAbsent(com.dingodb.pb.store.KvBatchPutIfAbsentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvBatchPutIfAbsentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StoreServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StoreServiceFutureStub> {
    private StoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * region
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.store.AddRegionResponse> addRegion(
        com.dingodb.pb.store.AddRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.store.DestroyRegionResponse> destroyRegion(
        com.dingodb.pb.store.DestroyRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDestroyRegionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * kv
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.store.KvGetResponse> kvGet(
        com.dingodb.pb.store.KvGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.store.KvBatchGetResponse> kvBatchGet(
        com.dingodb.pb.store.KvBatchGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvBatchGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.store.KvPutResponse> kvPut(
        com.dingodb.pb.store.KvPutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.store.KvBatchPutResponse> kvBatchPut(
        com.dingodb.pb.store.KvBatchPutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvBatchPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.store.KvPutIfAbsentResponse> kvPutIfAbsent(
        com.dingodb.pb.store.KvPutIfAbsentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvPutIfAbsentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.store.KvBatchPutIfAbsentResponse> kvBatchPutIfAbsent(
        com.dingodb.pb.store.KvBatchPutIfAbsentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvBatchPutIfAbsentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_REGION = 0;
  private static final int METHODID_DESTROY_REGION = 1;
  private static final int METHODID_KV_GET = 2;
  private static final int METHODID_KV_BATCH_GET = 3;
  private static final int METHODID_KV_PUT = 4;
  private static final int METHODID_KV_BATCH_PUT = 5;
  private static final int METHODID_KV_PUT_IF_ABSENT = 6;
  private static final int METHODID_KV_BATCH_PUT_IF_ABSENT = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_REGION:
          serviceImpl.addRegion((com.dingodb.pb.store.AddRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.store.AddRegionResponse>) responseObserver);
          break;
        case METHODID_DESTROY_REGION:
          serviceImpl.destroyRegion((com.dingodb.pb.store.DestroyRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.store.DestroyRegionResponse>) responseObserver);
          break;
        case METHODID_KV_GET:
          serviceImpl.kvGet((com.dingodb.pb.store.KvGetRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvGetResponse>) responseObserver);
          break;
        case METHODID_KV_BATCH_GET:
          serviceImpl.kvBatchGet((com.dingodb.pb.store.KvBatchGetRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvBatchGetResponse>) responseObserver);
          break;
        case METHODID_KV_PUT:
          serviceImpl.kvPut((com.dingodb.pb.store.KvPutRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvPutResponse>) responseObserver);
          break;
        case METHODID_KV_BATCH_PUT:
          serviceImpl.kvBatchPut((com.dingodb.pb.store.KvBatchPutRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvBatchPutResponse>) responseObserver);
          break;
        case METHODID_KV_PUT_IF_ABSENT:
          serviceImpl.kvPutIfAbsent((com.dingodb.pb.store.KvPutIfAbsentRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvPutIfAbsentResponse>) responseObserver);
          break;
        case METHODID_KV_BATCH_PUT_IF_ABSENT:
          serviceImpl.kvBatchPutIfAbsent((com.dingodb.pb.store.KvBatchPutIfAbsentRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.store.KvBatchPutIfAbsentResponse>) responseObserver);
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

  private static abstract class StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dingodb.pb.store.StoreProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StoreService");
    }
  }

  private static final class StoreServiceFileDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier {
    StoreServiceFileDescriptorSupplier() {}
  }

  private static final class StoreServiceMethodDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StoreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreServiceFileDescriptorSupplier())
              .addMethod(getAddRegionMethod())
              .addMethod(getDestroyRegionMethod())
              .addMethod(getKvGetMethod())
              .addMethod(getKvBatchGetMethod())
              .addMethod(getKvPutMethod())
              .addMethod(getKvBatchPutMethod())
              .addMethod(getKvPutIfAbsentMethod())
              .addMethod(getKvBatchPutIfAbsentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
