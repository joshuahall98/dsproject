// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dsproject.proto

package grpc.dsproject;

public final class ProjectServiceImpl {
  private ProjectServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dsproject_CalculateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dsproject_CalculateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dsproject_CalculateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dsproject_CalculateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017dsproject.proto\022\tdsproject\"\226\001\n\020Calcula" +
      "teRequest\022\017\n\007number1\030\001 \001(\001\0228\n\toperation\030" +
      "\002 \001(\0162%.dsproject.CalculateRequest.Opera" +
      "tion\"7\n\tOperation\022\013\n\007walking\020\000\022\020\n\014briskw" +
      "alking\020\001\022\013\n\007jogging\020\002\">\n\021CalculateRespon" +
      "se\022\020\n\010calories\030\001 \001(\001\022\027\n\017caloriesmessage\030" +
      "\002 \001(\t2Z\n\016ProjectService\022H\n\tcalculate\022\033.d" +
      "sproject.CalculateRequest\032\034.dsproject.Ca" +
      "lculateResponse\"\000B&\n\016grpc.dsprojectB\022Pro" +
      "jectServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_dsproject_CalculateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dsproject_CalculateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dsproject_CalculateRequest_descriptor,
        new java.lang.String[] { "Number1", "Operation", });
    internal_static_dsproject_CalculateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dsproject_CalculateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dsproject_CalculateResponse_descriptor,
        new java.lang.String[] { "Calories", "Caloriesmessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}