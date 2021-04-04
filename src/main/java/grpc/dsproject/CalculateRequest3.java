// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dsproject3.proto

package grpc.dsproject;

/**
 * Protobuf type {@code dsproject3.CalculateRequest3}
 */
public  final class CalculateRequest3 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dsproject3.CalculateRequest3)
    CalculateRequest3OrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculateRequest3.newBuilder() to construct.
  private CalculateRequest3(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalculateRequest3() {
    weight2_ = 0D;
    height_ = 0D;
    age_ = 0D;
    operation3_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalculateRequest3(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {

            weight2_ = input.readDouble();
            break;
          }
          case 17: {

            height_ = input.readDouble();
            break;
          }
          case 25: {

            age_ = input.readDouble();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            operation3_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.dsproject.ProjectService3Impl.internal_static_dsproject3_CalculateRequest3_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.dsproject.ProjectService3Impl.internal_static_dsproject3_CalculateRequest3_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.dsproject.CalculateRequest3.class, grpc.dsproject.CalculateRequest3.Builder.class);
  }

  /**
   * Protobuf enum {@code dsproject3.CalculateRequest3.Operation3}
   */
  public enum Operation3
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>male = 0;</code>
     */
    male(0),
    /**
     * <code>female = 1;</code>
     */
    female(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>male = 0;</code>
     */
    public static final int male_VALUE = 0;
    /**
     * <code>female = 1;</code>
     */
    public static final int female_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operation3 valueOf(int value) {
      return forNumber(value);
    }

    public static Operation3 forNumber(int value) {
      switch (value) {
        case 0: return male;
        case 1: return female;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operation3>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operation3> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operation3>() {
            public Operation3 findValueByNumber(int number) {
              return Operation3.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return grpc.dsproject.CalculateRequest3.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operation3[] VALUES = values();

    public static Operation3 valueOf(
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

    private Operation3(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:dsproject3.CalculateRequest3.Operation3)
  }

  public static final int WEIGHT2_FIELD_NUMBER = 1;
  private double weight2_;
  /**
   * <code>double weight2 = 1;</code>
   */
  public double getWeight2() {
    return weight2_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private double height_;
  /**
   * <code>double height = 2;</code>
   */
  public double getHeight() {
    return height_;
  }

  public static final int AGE_FIELD_NUMBER = 3;
  private double age_;
  /**
   * <code>double age = 3;</code>
   */
  public double getAge() {
    return age_;
  }

  public static final int OPERATION3_FIELD_NUMBER = 4;
  private int operation3_;
  /**
   * <code>.dsproject3.CalculateRequest3.Operation3 operation3 = 4;</code>
   */
  public int getOperation3Value() {
    return operation3_;
  }
  /**
   * <code>.dsproject3.CalculateRequest3.Operation3 operation3 = 4;</code>
   */
  public grpc.dsproject.CalculateRequest3.Operation3 getOperation3() {
    @SuppressWarnings("deprecation")
    grpc.dsproject.CalculateRequest3.Operation3 result = grpc.dsproject.CalculateRequest3.Operation3.valueOf(operation3_);
    return result == null ? grpc.dsproject.CalculateRequest3.Operation3.UNRECOGNIZED : result;
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
    if (weight2_ != 0D) {
      output.writeDouble(1, weight2_);
    }
    if (height_ != 0D) {
      output.writeDouble(2, height_);
    }
    if (age_ != 0D) {
      output.writeDouble(3, age_);
    }
    if (operation3_ != grpc.dsproject.CalculateRequest3.Operation3.male.getNumber()) {
      output.writeEnum(4, operation3_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (weight2_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, weight2_);
    }
    if (height_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, height_);
    }
    if (age_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, age_);
    }
    if (operation3_ != grpc.dsproject.CalculateRequest3.Operation3.male.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, operation3_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.dsproject.CalculateRequest3)) {
      return super.equals(obj);
    }
    grpc.dsproject.CalculateRequest3 other = (grpc.dsproject.CalculateRequest3) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getWeight2())
        == java.lang.Double.doubleToLongBits(
            other.getWeight2()));
    result = result && (
        java.lang.Double.doubleToLongBits(getHeight())
        == java.lang.Double.doubleToLongBits(
            other.getHeight()));
    result = result && (
        java.lang.Double.doubleToLongBits(getAge())
        == java.lang.Double.doubleToLongBits(
            other.getAge()));
    result = result && operation3_ == other.operation3_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WEIGHT2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeight2()));
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHeight()));
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAge()));
    hash = (37 * hash) + OPERATION3_FIELD_NUMBER;
    hash = (53 * hash) + operation3_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.dsproject.CalculateRequest3 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.dsproject.CalculateRequest3 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.dsproject.CalculateRequest3 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.dsproject.CalculateRequest3 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.dsproject.CalculateRequest3 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.dsproject.CalculateRequest3 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.dsproject.CalculateRequest3 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.dsproject.CalculateRequest3 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.dsproject.CalculateRequest3 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.dsproject.CalculateRequest3 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.dsproject.CalculateRequest3 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.dsproject.CalculateRequest3 parseFrom(
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
  public static Builder newBuilder(grpc.dsproject.CalculateRequest3 prototype) {
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
   * Protobuf type {@code dsproject3.CalculateRequest3}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dsproject3.CalculateRequest3)
      grpc.dsproject.CalculateRequest3OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.dsproject.ProjectService3Impl.internal_static_dsproject3_CalculateRequest3_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.dsproject.ProjectService3Impl.internal_static_dsproject3_CalculateRequest3_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.dsproject.CalculateRequest3.class, grpc.dsproject.CalculateRequest3.Builder.class);
    }

    // Construct using grpc.dsproject.CalculateRequest3.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      weight2_ = 0D;

      height_ = 0D;

      age_ = 0D;

      operation3_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.dsproject.ProjectService3Impl.internal_static_dsproject3_CalculateRequest3_descriptor;
    }

    @java.lang.Override
    public grpc.dsproject.CalculateRequest3 getDefaultInstanceForType() {
      return grpc.dsproject.CalculateRequest3.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.dsproject.CalculateRequest3 build() {
      grpc.dsproject.CalculateRequest3 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.dsproject.CalculateRequest3 buildPartial() {
      grpc.dsproject.CalculateRequest3 result = new grpc.dsproject.CalculateRequest3(this);
      result.weight2_ = weight2_;
      result.height_ = height_;
      result.age_ = age_;
      result.operation3_ = operation3_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.dsproject.CalculateRequest3) {
        return mergeFrom((grpc.dsproject.CalculateRequest3)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.dsproject.CalculateRequest3 other) {
      if (other == grpc.dsproject.CalculateRequest3.getDefaultInstance()) return this;
      if (other.getWeight2() != 0D) {
        setWeight2(other.getWeight2());
      }
      if (other.getHeight() != 0D) {
        setHeight(other.getHeight());
      }
      if (other.getAge() != 0D) {
        setAge(other.getAge());
      }
      if (other.operation3_ != 0) {
        setOperation3Value(other.getOperation3Value());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      grpc.dsproject.CalculateRequest3 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.dsproject.CalculateRequest3) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double weight2_ ;
    /**
     * <code>double weight2 = 1;</code>
     */
    public double getWeight2() {
      return weight2_;
    }
    /**
     * <code>double weight2 = 1;</code>
     */
    public Builder setWeight2(double value) {
      
      weight2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weight2 = 1;</code>
     */
    public Builder clearWeight2() {
      
      weight2_ = 0D;
      onChanged();
      return this;
    }

    private double height_ ;
    /**
     * <code>double height = 2;</code>
     */
    public double getHeight() {
      return height_;
    }
    /**
     * <code>double height = 2;</code>
     */
    public Builder setHeight(double value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double height = 2;</code>
     */
    public Builder clearHeight() {
      
      height_ = 0D;
      onChanged();
      return this;
    }

    private double age_ ;
    /**
     * <code>double age = 3;</code>
     */
    public double getAge() {
      return age_;
    }
    /**
     * <code>double age = 3;</code>
     */
    public Builder setAge(double value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double age = 3;</code>
     */
    public Builder clearAge() {
      
      age_ = 0D;
      onChanged();
      return this;
    }

    private int operation3_ = 0;
    /**
     * <code>.dsproject3.CalculateRequest3.Operation3 operation3 = 4;</code>
     */
    public int getOperation3Value() {
      return operation3_;
    }
    /**
     * <code>.dsproject3.CalculateRequest3.Operation3 operation3 = 4;</code>
     */
    public Builder setOperation3Value(int value) {
      operation3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.dsproject3.CalculateRequest3.Operation3 operation3 = 4;</code>
     */
    public grpc.dsproject.CalculateRequest3.Operation3 getOperation3() {
      @SuppressWarnings("deprecation")
      grpc.dsproject.CalculateRequest3.Operation3 result = grpc.dsproject.CalculateRequest3.Operation3.valueOf(operation3_);
      return result == null ? grpc.dsproject.CalculateRequest3.Operation3.UNRECOGNIZED : result;
    }
    /**
     * <code>.dsproject3.CalculateRequest3.Operation3 operation3 = 4;</code>
     */
    public Builder setOperation3(grpc.dsproject.CalculateRequest3.Operation3 value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operation3_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.dsproject3.CalculateRequest3.Operation3 operation3 = 4;</code>
     */
    public Builder clearOperation3() {
      
      operation3_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:dsproject3.CalculateRequest3)
  }

  // @@protoc_insertion_point(class_scope:dsproject3.CalculateRequest3)
  private static final grpc.dsproject.CalculateRequest3 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.dsproject.CalculateRequest3();
  }

  public static grpc.dsproject.CalculateRequest3 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculateRequest3>
      PARSER = new com.google.protobuf.AbstractParser<CalculateRequest3>() {
    @java.lang.Override
    public CalculateRequest3 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalculateRequest3(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalculateRequest3> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculateRequest3> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.dsproject.CalculateRequest3 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

