// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dsproject2.proto

package grpc.dsproject;

public final class ProjectService2Impl {
  private ProjectService2Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dsproject2_CalculateRequest2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dsproject2_CalculateRequest2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dsproject2_CalculateResponse2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dsproject2_CalculateResponse2_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020dsproject2.proto\022\ndsproject2\"#\n\021Calcul" +
      "ateRequest2\022\016\n\006weight\030\001 \001(\001\"9\n\022Calculate" +
      "Response2\022\r\n\005water\030\001 \001(\001\022\024\n\014watermessage" +
      "\030\002 \001(\t2`\n\017ProjectService2\022M\n\ncalculate2\022" +
      "\035.dsproject2.CalculateRequest2\032\036.dsproje" +
      "ct2.CalculateResponse2\"\000B\'\n\016grpc.dsproje" +
      "ctB\023ProjectService2ImplP\001b\006proto3"
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
    internal_static_dsproject2_CalculateRequest2_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dsproject2_CalculateRequest2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dsproject2_CalculateRequest2_descriptor,
        new java.lang.String[] { "Weight", });
    internal_static_dsproject2_CalculateResponse2_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dsproject2_CalculateResponse2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dsproject2_CalculateResponse2_descriptor,
        new java.lang.String[] { "Water", "Watermessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
