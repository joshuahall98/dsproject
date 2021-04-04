package grpc.dsproject;

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
    comments = "Source: dsproject2.proto")
public final class ProjectService2Grpc {

  private ProjectService2Grpc() {}

  public static final String SERVICE_NAME = "dsproject2.ProjectService2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.dsproject.CalculateRequest2,
      grpc.dsproject.CalculateResponse2> getCalculate2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculate2",
      requestType = grpc.dsproject.CalculateRequest2.class,
      responseType = grpc.dsproject.CalculateResponse2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.dsproject.CalculateRequest2,
      grpc.dsproject.CalculateResponse2> getCalculate2Method() {
    io.grpc.MethodDescriptor<grpc.dsproject.CalculateRequest2, grpc.dsproject.CalculateResponse2> getCalculate2Method;
    if ((getCalculate2Method = ProjectService2Grpc.getCalculate2Method) == null) {
      synchronized (ProjectService2Grpc.class) {
        if ((getCalculate2Method = ProjectService2Grpc.getCalculate2Method) == null) {
          ProjectService2Grpc.getCalculate2Method = getCalculate2Method = 
              io.grpc.MethodDescriptor.<grpc.dsproject.CalculateRequest2, grpc.dsproject.CalculateResponse2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dsproject2.ProjectService2", "calculate2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.dsproject.CalculateRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.dsproject.CalculateResponse2.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectService2MethodDescriptorSupplier("calculate2"))
                  .build();
          }
        }
     }
     return getCalculate2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectService2Stub newStub(io.grpc.Channel channel) {
    return new ProjectService2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectService2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProjectService2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectService2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProjectService2FutureStub(channel);
  }

  /**
   */
  public static abstract class ProjectService2ImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculate2(grpc.dsproject.CalculateRequest2 request,
        io.grpc.stub.StreamObserver<grpc.dsproject.CalculateResponse2> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculate2Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculate2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.dsproject.CalculateRequest2,
                grpc.dsproject.CalculateResponse2>(
                  this, METHODID_CALCULATE2)))
          .build();
    }
  }

  /**
   */
  public static final class ProjectService2Stub extends io.grpc.stub.AbstractStub<ProjectService2Stub> {
    private ProjectService2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectService2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectService2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectService2Stub(channel, callOptions);
    }

    /**
     */
    public void calculate2(grpc.dsproject.CalculateRequest2 request,
        io.grpc.stub.StreamObserver<grpc.dsproject.CalculateResponse2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculate2Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProjectService2BlockingStub extends io.grpc.stub.AbstractStub<ProjectService2BlockingStub> {
    private ProjectService2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectService2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectService2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectService2BlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.dsproject.CalculateResponse2 calculate2(grpc.dsproject.CalculateRequest2 request) {
      return blockingUnaryCall(
          getChannel(), getCalculate2Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProjectService2FutureStub extends io.grpc.stub.AbstractStub<ProjectService2FutureStub> {
    private ProjectService2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectService2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectService2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectService2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.dsproject.CalculateResponse2> calculate2(
        grpc.dsproject.CalculateRequest2 request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculate2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE2 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectService2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectService2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE2:
          serviceImpl.calculate2((grpc.dsproject.CalculateRequest2) request,
              (io.grpc.stub.StreamObserver<grpc.dsproject.CalculateResponse2>) responseObserver);
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

  private static abstract class ProjectService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectService2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.dsproject.ProjectService2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService2");
    }
  }

  private static final class ProjectService2FileDescriptorSupplier
      extends ProjectService2BaseDescriptorSupplier {
    ProjectService2FileDescriptorSupplier() {}
  }

  private static final class ProjectService2MethodDescriptorSupplier
      extends ProjectService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectService2MethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectService2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectService2FileDescriptorSupplier())
              .addMethod(getCalculate2Method())
              .build();
        }
      }
    }
    return result;
  }
}
