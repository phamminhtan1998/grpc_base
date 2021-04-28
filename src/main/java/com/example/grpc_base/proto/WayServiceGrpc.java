package com.example.grpc_base.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Way.proto")
public final class WayServiceGrpc {

  private WayServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc_base.proto.WayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc_base.proto.Way.WayRequest,
      com.example.grpc_base.proto.Way.WayResponse> getCreateWayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createWay",
      requestType = com.example.grpc_base.proto.Way.WayRequest.class,
      responseType = com.example.grpc_base.proto.Way.WayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc_base.proto.Way.WayRequest,
      com.example.grpc_base.proto.Way.WayResponse> getCreateWayMethod() {
    io.grpc.MethodDescriptor<com.example.grpc_base.proto.Way.WayRequest, com.example.grpc_base.proto.Way.WayResponse> getCreateWayMethod;
    if ((getCreateWayMethod = WayServiceGrpc.getCreateWayMethod) == null) {
      synchronized (WayServiceGrpc.class) {
        if ((getCreateWayMethod = WayServiceGrpc.getCreateWayMethod) == null) {
          WayServiceGrpc.getCreateWayMethod = getCreateWayMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc_base.proto.Way.WayRequest, com.example.grpc_base.proto.Way.WayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc_base.proto.WayService", "createWay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc_base.proto.Way.WayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc_base.proto.Way.WayResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WayServiceMethodDescriptorSupplier("createWay"))
                  .build();
          }
        }
     }
     return getCreateWayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WayServiceStub newStub(io.grpc.Channel channel) {
    return new WayServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WayServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WayServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WayServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc_base.proto.Way.WayRequest> createWay(
        io.grpc.stub.StreamObserver<com.example.grpc_base.proto.Way.WayResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCreateWayMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateWayMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.example.grpc_base.proto.Way.WayRequest,
                com.example.grpc_base.proto.Way.WayResponse>(
                  this, METHODID_CREATE_WAY)))
          .build();
    }
  }

  /**
   */
  public static final class WayServiceStub extends io.grpc.stub.AbstractStub<WayServiceStub> {
    private WayServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WayServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WayServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WayServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc_base.proto.Way.WayRequest> createWay(
        io.grpc.stub.StreamObserver<com.example.grpc_base.proto.Way.WayResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCreateWayMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class WayServiceBlockingStub extends io.grpc.stub.AbstractStub<WayServiceBlockingStub> {
    private WayServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WayServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WayServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WayServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class WayServiceFutureStub extends io.grpc.stub.AbstractStub<WayServiceFutureStub> {
    private WayServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WayServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WayServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WayServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CREATE_WAY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_WAY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createWay(
              (io.grpc.stub.StreamObserver<com.example.grpc_base.proto.Way.WayResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc_base.proto.Way.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WayService");
    }
  }

  private static final class WayServiceFileDescriptorSupplier
      extends WayServiceBaseDescriptorSupplier {
    WayServiceFileDescriptorSupplier() {}
  }

  private static final class WayServiceMethodDescriptorSupplier
      extends WayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WayServiceFileDescriptorSupplier())
              .addMethod(getCreateWayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
