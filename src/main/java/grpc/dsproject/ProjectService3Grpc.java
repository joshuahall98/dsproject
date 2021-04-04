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
    comments = "Source: dsproject3.proto")
public final class ProjectService3Grpc {

  private ProjectService3Grpc() {}

  public static final String SERVICE_NAME = "dsproject3.ProjectService3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.dsproject.CalculateRequest3,
      grpc.dsproject.CalculateResponse3> getCalculate3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculate3",
      requestType = grpc.dsproject.CalculateRequest3.class,
      responseType = grpc.dsproject.CalculateResponse3.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.dsproject.CalculateRequest3,
      grpc.dsproject.CalculateResponse3> getCalculate3Method() {
    io.grpc.MethodDescriptor<grpc.dsproject.CalculateRequest3, grpc.dsproject.CalculateResponse3> getCalculate3Method;
    if ((getCalculate3Method = ProjectService3Grpc.getCalculate3Method) == null) {
      synchronized (ProjectService3Grpc.class) {
        if ((getCalculate3Method = ProjectService3Grpc.getCalculate3Method) == null) {
          ProjectService3Grpc.getCalculate3Method = getCalculate3Method = 
              io.grpc.MethodDescriptor.<grpc.dsproject.CalculateRequest3, grpc.dsproject.CalculateResponse3>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dsproject3.ProjectService3", "calculate3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.dsproject.CalculateRequest3.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.dsproject.CalculateResponse3.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectService3MethodDescriptorSupplier("calculate3"))
                  .build();
          }
        }
     }
     return getCalculate3Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectService3Stub newStub(io.grpc.Channel channel) {
    return new ProjectService3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectService3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProjectService3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectService3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProjectService3FutureStub(channel);
  }

  /**
   */
  public static abstract class ProjectService3ImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculate3(grpc.dsproject.CalculateRequest3 request,
        io.grpc.stub.StreamObserver<grpc.dsproject.CalculateResponse3> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculate3Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculate3Method(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.dsproject.CalculateRequest3,
                grpc.dsproject.CalculateResponse3>(
                  this, METHODID_CALCULATE3)))
          .build();
    }
  }

  /**
   */
  public static final class ProjectService3Stub extends io.grpc.stub.AbstractStub<ProjectService3Stub> {
    private ProjectService3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectService3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectService3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectService3Stub(channel, callOptions);
    }

    /**
     */
    public void calculate3(grpc.dsproject.CalculateRequest3 request,
        io.grpc.stub.StreamObserver<grpc.dsproject.CalculateResponse3> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculate3Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProjectService3BlockingStub extends io.grpc.stub.AbstractStub<ProjectService3BlockingStub> {
    private ProjectService3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectService3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectService3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectService3BlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.dsproject.CalculateResponse3 calculate3(grpc.dsproject.CalculateRequest3 request) {
      return blockingUnaryCall(
          getChannel(), getCalculate3Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProjectService3FutureStub extends io.grpc.stub.AbstractStub<ProjectService3FutureStub> {
    private ProjectService3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectService3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectService3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectService3FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.dsproject.CalculateResponse3> calculate3(
        grpc.dsproject.CalculateRequest3 request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculate3Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE3 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectService3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectService3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE3:
          serviceImpl.calculate3((grpc.dsproject.CalculateRequest3) request,
              (io.grpc.stub.StreamObserver<grpc.dsproject.CalculateResponse3>) responseObserver);
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

  private static abstract class ProjectService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectService3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.dsproject.ProjectService3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService3");
    }
  }

  private static final class ProjectService3FileDescriptorSupplier
      extends ProjectService3BaseDescriptorSupplier {
    ProjectService3FileDescriptorSupplier() {}
  }

  private static final class ProjectService3MethodDescriptorSupplier
      extends ProjectService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectService3MethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectService3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectService3FileDescriptorSupplier())
              .addMethod(getCalculate3Method())
              .build();
        }
      }
    }
    return result;
  }
}
