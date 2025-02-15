// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UgcType.proto

package emu.grasscutter.net.proto;

public final class UgcTypeOuterClass {
  private UgcTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Name: OKDOOEMGDLK
   * </pre>
   *
   * Protobuf enum {@code UgcType}
   */
  public enum UgcType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UGC_TYPE_NONE = 0;</code>
     */
    UGC_TYPE_NONE(0),
    /**
     * <code>UGC_TYPE_MUSIC_GAME = 1;</code>
     */
    UGC_TYPE_MUSIC_GAME(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UGC_TYPE_NONE = 0;</code>
     */
    public static final int UGC_TYPE_NONE_VALUE = 0;
    /**
     * <code>UGC_TYPE_MUSIC_GAME = 1;</code>
     */
    public static final int UGC_TYPE_MUSIC_GAME_VALUE = 1;


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
    public static UgcType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static UgcType forNumber(int value) {
      switch (value) {
        case 0: return UGC_TYPE_NONE;
        case 1: return UGC_TYPE_MUSIC_GAME;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<UgcType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        UgcType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UgcType>() {
            public UgcType findValueByNumber(int number) {
              return UgcType.forNumber(number);
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
      return emu.grasscutter.net.proto.UgcTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final UgcType[] VALUES = values();

    public static UgcType valueOf(
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

    private UgcType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:UgcType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rUgcType.proto*5\n\007UgcType\022\021\n\rUGC_TYPE_N" +
      "ONE\020\000\022\027\n\023UGC_TYPE_MUSIC_GAME\020\001B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
