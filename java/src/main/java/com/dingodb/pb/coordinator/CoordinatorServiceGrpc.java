package com.dingodb.pb.coordinator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: coordinator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CoordinatorServiceGrpc {

  private CoordinatorServiceGrpc() {}

  public static final String SERVICE_NAME = "dingodb.pb.coordinator.CoordinatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.HelloRequest,
      com.dingodb.pb.coordinator.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hello",
      requestType = com.dingodb.pb.coordinator.HelloRequest.class,
      responseType = com.dingodb.pb.coordinator.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.HelloRequest,
      com.dingodb.pb.coordinator.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.HelloRequest, com.dingodb.pb.coordinator.HelloResponse> getHelloMethod;
    if ((getHelloMethod = CoordinatorServiceGrpc.getHelloMethod) == null) {
      synchronized (CoordinatorServiceGrpc.class) {
        if ((getHelloMethod = CoordinatorServiceGrpc.getHelloMethod) == null) {
          CoordinatorServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.coordinator.HelloRequest, com.dingodb.pb.coordinator.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.coordinator.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.coordinator.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinatorServiceMethodDescriptorSupplier("Hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.StoreHeartbeatRequest,
      com.dingodb.pb.coordinator.StoreHeartbeatResponse> getStoreHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreHeartbeat",
      requestType = com.dingodb.pb.coordinator.StoreHeartbeatRequest.class,
      responseType = com.dingodb.pb.coordinator.StoreHeartbeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.StoreHeartbeatRequest,
      com.dingodb.pb.coordinator.StoreHeartbeatResponse> getStoreHeartbeatMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.StoreHeartbeatRequest, com.dingodb.pb.coordinator.StoreHeartbeatResponse> getStoreHeartbeatMethod;
    if ((getStoreHeartbeatMethod = CoordinatorServiceGrpc.getStoreHeartbeatMethod) == null) {
      synchronized (CoordinatorServiceGrpc.class) {
        if ((getStoreHeartbeatMethod = CoordinatorServiceGrpc.getStoreHeartbeatMethod) == null) {
          CoordinatorServiceGrpc.getStoreHeartbeatMethod = getStoreHeartbeatMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.coordinator.StoreHeartbeatRequest, com.dingodb.pb.coordinator.StoreHeartbeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreHeartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.coordinator.StoreHeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.coordinator.StoreHeartbeatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinatorServiceMethodDescriptorSupplier("StoreHeartbeat"))
              .build();
        }
      }
    }
    return getStoreHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.GetRegionMapRequest,
      com.dingodb.pb.coordinator.GetRegionMapResponse> getGetRegionMapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegionMap",
      requestType = com.dingodb.pb.coordinator.GetRegionMapRequest.class,
      responseType = com.dingodb.pb.coordinator.GetRegionMapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.GetRegionMapRequest,
      com.dingodb.pb.coordinator.GetRegionMapResponse> getGetRegionMapMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.GetRegionMapRequest, com.dingodb.pb.coordinator.GetRegionMapResponse> getGetRegionMapMethod;
    if ((getGetRegionMapMethod = CoordinatorServiceGrpc.getGetRegionMapMethod) == null) {
      synchronized (CoordinatorServiceGrpc.class) {
        if ((getGetRegionMapMethod = CoordinatorServiceGrpc.getGetRegionMapMethod) == null) {
          CoordinatorServiceGrpc.getGetRegionMapMethod = getGetRegionMapMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.coordinator.GetRegionMapRequest, com.dingodb.pb.coordinator.GetRegionMapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegionMap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.coordinator.GetRegionMapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.coordinator.GetRegionMapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinatorServiceMethodDescriptorSupplier("GetRegionMap"))
              .build();
        }
      }
    }
    return getGetRegionMapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.GetStoreMapRequest,
      com.dingodb.pb.coordinator.GetStoreMapResponse> getGetStoreMapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStoreMap",
      requestType = com.dingodb.pb.coordinator.GetStoreMapRequest.class,
      responseType = com.dingodb.pb.coordinator.GetStoreMapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.GetStoreMapRequest,
      com.dingodb.pb.coordinator.GetStoreMapResponse> getGetStoreMapMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.GetStoreMapRequest, com.dingodb.pb.coordinator.GetStoreMapResponse> getGetStoreMapMethod;
    if ((getGetStoreMapMethod = CoordinatorServiceGrpc.getGetStoreMapMethod) == null) {
      synchronized (CoordinatorServiceGrpc.class) {
        if ((getGetStoreMapMethod = CoordinatorServiceGrpc.getGetStoreMapMethod) == null) {
          CoordinatorServiceGrpc.getGetStoreMapMethod = getGetStoreMapMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.coordinator.GetStoreMapRequest, com.dingodb.pb.coordinator.GetStoreMapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStoreMap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.coordinator.GetStoreMapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.coordinator.GetStoreMapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinatorServiceMethodDescriptorSupplier("GetStoreMap"))
              .build();
        }
      }
    }
    return getGetStoreMapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.CreateStoreRequest,
      com.dingodb.pb.coordinator.CreateStoreResponse> getCreateStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStore",
      requestType = com.dingodb.pb.coordinator.CreateStoreRequest.class,
      responseType = com.dingodb.pb.coordinator.CreateStoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.CreateStoreRequest,
      com.dingodb.pb.coordinator.CreateStoreResponse> getCreateStoreMethod() {
    io.grpc.MethodDescriptor<com.dingodb.pb.coordinator.CreateStoreRequest, com.dingodb.pb.coordinator.CreateStoreResponse> getCreateStoreMethod;
    if ((getCreateStoreMethod = CoordinatorServiceGrpc.getCreateStoreMethod) == null) {
      synchronized (CoordinatorServiceGrpc.class) {
        if ((getCreateStoreMethod = CoordinatorServiceGrpc.getCreateStoreMethod) == null) {
          CoordinatorServiceGrpc.getCreateStoreMethod = getCreateStoreMethod =
              io.grpc.MethodDescriptor.<com.dingodb.pb.coordinator.CreateStoreRequest, com.dingodb.pb.coordinator.CreateStoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.coordinator.CreateStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dingodb.pb.coordinator.CreateStoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinatorServiceMethodDescriptorSupplier("CreateStore"))
              .build();
        }
      }
    }
    return getCreateStoreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoordinatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoordinatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoordinatorServiceStub>() {
        @java.lang.Override
        public CoordinatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoordinatorServiceStub(channel, callOptions);
        }
      };
    return CoordinatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoordinatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoordinatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoordinatorServiceBlockingStub>() {
        @java.lang.Override
        public CoordinatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoordinatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CoordinatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoordinatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoordinatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoordinatorServiceFutureStub>() {
        @java.lang.Override
        public CoordinatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoordinatorServiceFutureStub(channel, callOptions);
        }
      };
    return CoordinatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CoordinatorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Hello
     * </pre>
     */
    public void hello(com.dingodb.pb.coordinator.HelloRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * Store
     * </pre>
     */
    public void storeHeartbeat(com.dingodb.pb.coordinator.StoreHeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.StoreHeartbeatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreHeartbeatMethod(), responseObserver);
    }

    /**
     */
    public void getRegionMap(com.dingodb.pb.coordinator.GetRegionMapRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.GetRegionMapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegionMapMethod(), responseObserver);
    }

    /**
     */
    public void getStoreMap(com.dingodb.pb.coordinator.GetStoreMapRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.GetStoreMapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStoreMapMethod(), responseObserver);
    }

    /**
     */
    public void createStore(com.dingodb.pb.coordinator.CreateStoreRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.CreateStoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStoreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.coordinator.HelloRequest,
                com.dingodb.pb.coordinator.HelloResponse>(
                  this, METHODID_HELLO)))
          .addMethod(
            getStoreHeartbeatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.coordinator.StoreHeartbeatRequest,
                com.dingodb.pb.coordinator.StoreHeartbeatResponse>(
                  this, METHODID_STORE_HEARTBEAT)))
          .addMethod(
            getGetRegionMapMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.coordinator.GetRegionMapRequest,
                com.dingodb.pb.coordinator.GetRegionMapResponse>(
                  this, METHODID_GET_REGION_MAP)))
          .addMethod(
            getGetStoreMapMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.coordinator.GetStoreMapRequest,
                com.dingodb.pb.coordinator.GetStoreMapResponse>(
                  this, METHODID_GET_STORE_MAP)))
          .addMethod(
            getCreateStoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dingodb.pb.coordinator.CreateStoreRequest,
                com.dingodb.pb.coordinator.CreateStoreResponse>(
                  this, METHODID_CREATE_STORE)))
          .build();
    }
  }

  /**
   */
  public static final class CoordinatorServiceStub extends io.grpc.stub.AbstractAsyncStub<CoordinatorServiceStub> {
    private CoordinatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoordinatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoordinatorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Hello
     * </pre>
     */
    public void hello(com.dingodb.pb.coordinator.HelloRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Store
     * </pre>
     */
    public void storeHeartbeat(com.dingodb.pb.coordinator.StoreHeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.StoreHeartbeatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRegionMap(com.dingodb.pb.coordinator.GetRegionMapRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.GetRegionMapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegionMapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStoreMap(com.dingodb.pb.coordinator.GetStoreMapRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.GetStoreMapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStoreMapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createStore(com.dingodb.pb.coordinator.CreateStoreRequest request,
        io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.CreateStoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStoreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CoordinatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CoordinatorServiceBlockingStub> {
    private CoordinatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoordinatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoordinatorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Hello
     * </pre>
     */
    public com.dingodb.pb.coordinator.HelloResponse hello(com.dingodb.pb.coordinator.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Store
     * </pre>
     */
    public com.dingodb.pb.coordinator.StoreHeartbeatResponse storeHeartbeat(com.dingodb.pb.coordinator.StoreHeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dingodb.pb.coordinator.GetRegionMapResponse getRegionMap(com.dingodb.pb.coordinator.GetRegionMapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegionMapMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dingodb.pb.coordinator.GetStoreMapResponse getStoreMap(com.dingodb.pb.coordinator.GetStoreMapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStoreMapMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dingodb.pb.coordinator.CreateStoreResponse createStore(com.dingodb.pb.coordinator.CreateStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStoreMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CoordinatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CoordinatorServiceFutureStub> {
    private CoordinatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoordinatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoordinatorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Hello
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.coordinator.HelloResponse> hello(
        com.dingodb.pb.coordinator.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Store
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.coordinator.StoreHeartbeatResponse> storeHeartbeat(
        com.dingodb.pb.coordinator.StoreHeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.coordinator.GetRegionMapResponse> getRegionMap(
        com.dingodb.pb.coordinator.GetRegionMapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegionMapMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.coordinator.GetStoreMapResponse> getStoreMap(
        com.dingodb.pb.coordinator.GetStoreMapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStoreMapMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dingodb.pb.coordinator.CreateStoreResponse> createStore(
        com.dingodb.pb.coordinator.CreateStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStoreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_STORE_HEARTBEAT = 1;
  private static final int METHODID_GET_REGION_MAP = 2;
  private static final int METHODID_GET_STORE_MAP = 3;
  private static final int METHODID_CREATE_STORE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CoordinatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CoordinatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.dingodb.pb.coordinator.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.HelloResponse>) responseObserver);
          break;
        case METHODID_STORE_HEARTBEAT:
          serviceImpl.storeHeartbeat((com.dingodb.pb.coordinator.StoreHeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.StoreHeartbeatResponse>) responseObserver);
          break;
        case METHODID_GET_REGION_MAP:
          serviceImpl.getRegionMap((com.dingodb.pb.coordinator.GetRegionMapRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.GetRegionMapResponse>) responseObserver);
          break;
        case METHODID_GET_STORE_MAP:
          serviceImpl.getStoreMap((com.dingodb.pb.coordinator.GetStoreMapRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.GetStoreMapResponse>) responseObserver);
          break;
        case METHODID_CREATE_STORE:
          serviceImpl.createStore((com.dingodb.pb.coordinator.CreateStoreRequest) request,
              (io.grpc.stub.StreamObserver<com.dingodb.pb.coordinator.CreateStoreResponse>) responseObserver);
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

  private static abstract class CoordinatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CoordinatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dingodb.pb.coordinator.CoordinatorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CoordinatorService");
    }
  }

  private static final class CoordinatorServiceFileDescriptorSupplier
      extends CoordinatorServiceBaseDescriptorSupplier {
    CoordinatorServiceFileDescriptorSupplier() {}
  }

  private static final class CoordinatorServiceMethodDescriptorSupplier
      extends CoordinatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CoordinatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CoordinatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoordinatorServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getStoreHeartbeatMethod())
              .addMethod(getGetRegionMapMethod())
              .addMethod(getGetStoreMapMethod())
              .addMethod(getCreateStoreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
