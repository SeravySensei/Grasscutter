// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CrucibleBattleUidInfo.proto

package emu.grasscutter.net.proto;

public final class CrucibleBattleUidInfoOuterClass {
  private CrucibleBattleUidInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CrucibleBattleUidInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CrucibleBattleUidInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string online_id = 13;</code>
     * @return The onlineId.
     */
    java.lang.String getOnlineId();
    /**
     * <code>string online_id = 13;</code>
     * @return The bytes for onlineId.
     */
    com.google.protobuf.ByteString
        getOnlineIdBytes();

    /**
     * <code>.ProfilePicture profile_picture = 1;</code>
     * @return Whether the profilePicture field is set.
     */
    boolean hasProfilePicture();
    /**
     * <code>.ProfilePicture profile_picture = 1;</code>
     * @return The profilePicture.
     */
    emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture getProfilePicture();
    /**
     * <code>.ProfilePicture profile_picture = 1;</code>
     */
    emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder();

    /**
     * <code>string nickname = 15;</code>
     * @return The nickname.
     */
    java.lang.String getNickname();
    /**
     * <code>string nickname = 15;</code>
     * @return The bytes for nickname.
     */
    com.google.protobuf.ByteString
        getNicknameBytes();

    /**
     * <code>uint32 icon = 4;</code>
     * @return The icon.
     */
    int getIcon();

    /**
     * <code>uint32 uid = 9;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * Name: CPKIODONDBP
   * </pre>
   *
   * Protobuf type {@code CrucibleBattleUidInfo}
   */
  public static final class CrucibleBattleUidInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CrucibleBattleUidInfo)
      CrucibleBattleUidInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CrucibleBattleUidInfo.newBuilder() to construct.
    private CrucibleBattleUidInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CrucibleBattleUidInfo() {
      onlineId_ = "";
      nickname_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CrucibleBattleUidInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CrucibleBattleUidInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder subBuilder = null;
              if (profilePicture_ != null) {
                subBuilder = profilePicture_.toBuilder();
              }
              profilePicture_ = input.readMessage(emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(profilePicture_);
                profilePicture_ = subBuilder.buildPartial();
              }

              break;
            }
            case 32: {

              icon_ = input.readUInt32();
              break;
            }
            case 72: {

              uid_ = input.readUInt32();
              break;
            }
            case 106: {
              java.lang.String s = input.readStringRequireUtf8();

              onlineId_ = s;
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();

              nickname_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.internal_static_CrucibleBattleUidInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.internal_static_CrucibleBattleUidInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo.class, emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo.Builder.class);
    }

    public static final int ONLINE_ID_FIELD_NUMBER = 13;
    private volatile java.lang.Object onlineId_;
    /**
     * <code>string online_id = 13;</code>
     * @return The onlineId.
     */
    @java.lang.Override
    public java.lang.String getOnlineId() {
      java.lang.Object ref = onlineId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        onlineId_ = s;
        return s;
      }
    }
    /**
     * <code>string online_id = 13;</code>
     * @return The bytes for onlineId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOnlineIdBytes() {
      java.lang.Object ref = onlineId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        onlineId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PROFILE_PICTURE_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
    /**
     * <code>.ProfilePicture profile_picture = 1;</code>
     * @return Whether the profilePicture field is set.
     */
    @java.lang.Override
    public boolean hasProfilePicture() {
      return profilePicture_ != null;
    }
    /**
     * <code>.ProfilePicture profile_picture = 1;</code>
     * @return The profilePicture.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
      return profilePicture_ == null ? emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
    }
    /**
     * <code>.ProfilePicture profile_picture = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
      return getProfilePicture();
    }

    public static final int NICKNAME_FIELD_NUMBER = 15;
    private volatile java.lang.Object nickname_;
    /**
     * <code>string nickname = 15;</code>
     * @return The nickname.
     */
    @java.lang.Override
    public java.lang.String getNickname() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <code>string nickname = 15;</code>
     * @return The bytes for nickname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ICON_FIELD_NUMBER = 4;
    private int icon_;
    /**
     * <code>uint32 icon = 4;</code>
     * @return The icon.
     */
    @java.lang.Override
    public int getIcon() {
      return icon_;
    }

    public static final int UID_FIELD_NUMBER = 9;
    private int uid_;
    /**
     * <code>uint32 uid = 9;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (profilePicture_ != null) {
        output.writeMessage(1, getProfilePicture());
      }
      if (icon_ != 0) {
        output.writeUInt32(4, icon_);
      }
      if (uid_ != 0) {
        output.writeUInt32(9, uid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(onlineId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, onlineId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickname_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, nickname_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (profilePicture_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getProfilePicture());
      }
      if (icon_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, icon_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, uid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(onlineId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, onlineId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickname_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, nickname_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo other = (emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo) obj;

      if (!getOnlineId()
          .equals(other.getOnlineId())) return false;
      if (hasProfilePicture() != other.hasProfilePicture()) return false;
      if (hasProfilePicture()) {
        if (!getProfilePicture()
            .equals(other.getProfilePicture())) return false;
      }
      if (!getNickname()
          .equals(other.getNickname())) return false;
      if (getIcon()
          != other.getIcon()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ONLINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOnlineId().hashCode();
      if (hasProfilePicture()) {
        hash = (37 * hash) + PROFILE_PICTURE_FIELD_NUMBER;
        hash = (53 * hash) + getProfilePicture().hashCode();
      }
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickname().hashCode();
      hash = (37 * hash) + ICON_FIELD_NUMBER;
      hash = (53 * hash) + getIcon();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo prototype) {
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
     * <pre>
     * Name: CPKIODONDBP
     * </pre>
     *
     * Protobuf type {@code CrucibleBattleUidInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CrucibleBattleUidInfo)
        emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.internal_static_CrucibleBattleUidInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.internal_static_CrucibleBattleUidInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo.class, emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo.newBuilder()
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
        onlineId_ = "";

        if (profilePictureBuilder_ == null) {
          profilePicture_ = null;
        } else {
          profilePicture_ = null;
          profilePictureBuilder_ = null;
        }
        nickname_ = "";

        icon_ = 0;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.internal_static_CrucibleBattleUidInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo build() {
        emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo buildPartial() {
        emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo result = new emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo(this);
        result.onlineId_ = onlineId_;
        if (profilePictureBuilder_ == null) {
          result.profilePicture_ = profilePicture_;
        } else {
          result.profilePicture_ = profilePictureBuilder_.build();
        }
        result.nickname_ = nickname_;
        result.icon_ = icon_;
        result.uid_ = uid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo other) {
        if (other == emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo.getDefaultInstance()) return this;
        if (!other.getOnlineId().isEmpty()) {
          onlineId_ = other.onlineId_;
          onChanged();
        }
        if (other.hasProfilePicture()) {
          mergeProfilePicture(other.getProfilePicture());
        }
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
          onChanged();
        }
        if (other.getIcon() != 0) {
          setIcon(other.getIcon());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
        emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object onlineId_ = "";
      /**
       * <code>string online_id = 13;</code>
       * @return The onlineId.
       */
      public java.lang.String getOnlineId() {
        java.lang.Object ref = onlineId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          onlineId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string online_id = 13;</code>
       * @return The bytes for onlineId.
       */
      public com.google.protobuf.ByteString
          getOnlineIdBytes() {
        java.lang.Object ref = onlineId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          onlineId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string online_id = 13;</code>
       * @param value The onlineId to set.
       * @return This builder for chaining.
       */
      public Builder setOnlineId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        onlineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string online_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOnlineId() {
        
        onlineId_ = getDefaultInstance().getOnlineId();
        onChanged();
        return this;
      }
      /**
       * <code>string online_id = 13;</code>
       * @param value The bytes for onlineId to set.
       * @return This builder for chaining.
       */
      public Builder setOnlineIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        onlineId_ = value;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder> profilePictureBuilder_;
      /**
       * <code>.ProfilePicture profile_picture = 1;</code>
       * @return Whether the profilePicture field is set.
       */
      public boolean hasProfilePicture() {
        return profilePictureBuilder_ != null || profilePicture_ != null;
      }
      /**
       * <code>.ProfilePicture profile_picture = 1;</code>
       * @return The profilePicture.
       */
      public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
        if (profilePictureBuilder_ == null) {
          return profilePicture_ == null ? emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
        } else {
          return profilePictureBuilder_.getMessage();
        }
      }
      /**
       * <code>.ProfilePicture profile_picture = 1;</code>
       */
      public Builder setProfilePicture(emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          profilePicture_ = value;
          onChanged();
        } else {
          profilePictureBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 1;</code>
       */
      public Builder setProfilePicture(
          emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder builderForValue) {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = builderForValue.build();
          onChanged();
        } else {
          profilePictureBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 1;</code>
       */
      public Builder mergeProfilePicture(emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (profilePicture_ != null) {
            profilePicture_ =
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.newBuilder(profilePicture_).mergeFrom(value).buildPartial();
          } else {
            profilePicture_ = value;
          }
          onChanged();
        } else {
          profilePictureBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 1;</code>
       */
      public Builder clearProfilePicture() {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = null;
          onChanged();
        } else {
          profilePicture_ = null;
          profilePictureBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 1;</code>
       */
      public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder getProfilePictureBuilder() {
        
        onChanged();
        return getProfilePictureFieldBuilder().getBuilder();
      }
      /**
       * <code>.ProfilePicture profile_picture = 1;</code>
       */
      public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
        if (profilePictureBuilder_ != null) {
          return profilePictureBuilder_.getMessageOrBuilder();
        } else {
          return profilePicture_ == null ?
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
        }
      }
      /**
       * <code>.ProfilePicture profile_picture = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder> 
          getProfilePictureFieldBuilder() {
        if (profilePictureBuilder_ == null) {
          profilePictureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder>(
                  getProfilePicture(),
                  getParentForChildren(),
                  isClean());
          profilePicture_ = null;
        }
        return profilePictureBuilder_;
      }

      private java.lang.Object nickname_ = "";
      /**
       * <code>string nickname = 15;</code>
       * @return The nickname.
       */
      public java.lang.String getNickname() {
        java.lang.Object ref = nickname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string nickname = 15;</code>
       * @return The bytes for nickname.
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        java.lang.Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickname = 15;</code>
       * @param value The nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNickname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 15;</code>
       * @param value The bytes for nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
        onChanged();
        return this;
      }

      private int icon_ ;
      /**
       * <code>uint32 icon = 4;</code>
       * @return The icon.
       */
      @java.lang.Override
      public int getIcon() {
        return icon_;
      }
      /**
       * <code>uint32 icon = 4;</code>
       * @param value The icon to set.
       * @return This builder for chaining.
       */
      public Builder setIcon(int value) {
        
        icon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 icon = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIcon() {
        
        icon_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 9;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 9;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CrucibleBattleUidInfo)
    }

    // @@protoc_insertion_point(class_scope:CrucibleBattleUidInfo)
    private static final emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo();
    }

    public static emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CrucibleBattleUidInfo>
        PARSER = new com.google.protobuf.AbstractParser<CrucibleBattleUidInfo>() {
      @java.lang.Override
      public CrucibleBattleUidInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CrucibleBattleUidInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CrucibleBattleUidInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrucibleBattleUidInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CrucibleBattleUidInfoOuterClass.CrucibleBattleUidInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CrucibleBattleUidInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CrucibleBattleUidInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033CrucibleBattleUidInfo.proto\032\024ProfilePi" +
      "cture.proto\"\201\001\n\025CrucibleBattleUidInfo\022\021\n" +
      "\tonline_id\030\r \001(\t\022(\n\017profile_picture\030\001 \001(" +
      "\0132\017.ProfilePicture\022\020\n\010nickname\030\017 \001(\t\022\014\n\004" +
      "icon\030\004 \001(\r\022\013\n\003uid\030\t \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ProfilePictureOuterClass.getDescriptor(),
        });
    internal_static_CrucibleBattleUidInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CrucibleBattleUidInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CrucibleBattleUidInfo_descriptor,
        new java.lang.String[] { "OnlineId", "ProfilePicture", "Nickname", "Icon", "Uid", });
    emu.grasscutter.net.proto.ProfilePictureOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
