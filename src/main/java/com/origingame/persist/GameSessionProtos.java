// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: persist/game_session.proto

package com.origingame.persist;

public final class GameSessionProtos {
  private GameSessionProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GameSessionModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.origingame.persist.GameSessionModel)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>optional int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>optional bytes password_key = 2;</code>
     */
    boolean hasPasswordKey();
    /**
     * <code>optional bytes password_key = 2;</code>
     */
    com.google.protobuf.ByteString getPasswordKey();

    /**
     * <code>optional bytes public_key = 3;</code>
     */
    boolean hasPublicKey();
    /**
     * <code>optional bytes public_key = 3;</code>
     */
    com.google.protobuf.ByteString getPublicKey();

    /**
     * <code>optional int32 player_id = 4;</code>
     */
    boolean hasPlayerId();
    /**
     * <code>optional int32 player_id = 4;</code>
     */
    int getPlayerId();

    /**
     * <code>optional int64 last_time = 5;</code>
     */
    boolean hasLastTime();
    /**
     * <code>optional int64 last_time = 5;</code>
     */
    long getLastTime();

    /**
     * <code>optional int32 last_id = 6;</code>
     */
    boolean hasLastId();
    /**
     * <code>optional int32 last_id = 6;</code>
     */
    int getLastId();

    /**
     * <code>optional string device_id = 7;</code>
     */
    boolean hasDeviceId();
    /**
     * <code>optional string device_id = 7;</code>
     */
    java.lang.String getDeviceId();
    /**
     * <code>optional string device_id = 7;</code>
     */
    com.google.protobuf.ByteString
        getDeviceIdBytes();
  }
  /**
   * Protobuf type {@code com.origingame.persist.GameSessionModel}
   */
  public static final class GameSessionModel extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.origingame.persist.GameSessionModel)
      GameSessionModelOrBuilder {
    // Use GameSessionModel.newBuilder() to construct.
    private GameSessionModel(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GameSessionModel(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GameSessionModel defaultInstance;
    public static GameSessionModel getDefaultInstance() {
      return defaultInstance;
    }

    public GameSessionModel getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GameSessionModel(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              passwordKey_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              publicKey_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              playerId_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              lastTime_ = input.readInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              lastId_ = input.readInt32();
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              deviceId_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.origingame.persist.GameSessionProtos.internal_static_com_origingame_persist_GameSessionModel_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.origingame.persist.GameSessionProtos.internal_static_com_origingame_persist_GameSessionModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.origingame.persist.GameSessionProtos.GameSessionModel.class, com.origingame.persist.GameSessionProtos.GameSessionModel.Builder.class);
    }

    public static com.google.protobuf.Parser<GameSessionModel> PARSER =
        new com.google.protobuf.AbstractParser<GameSessionModel>() {
      public GameSessionModel parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GameSessionModel(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GameSessionModel> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int PASSWORD_KEY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString passwordKey_;
    /**
     * <code>optional bytes password_key = 2;</code>
     */
    public boolean hasPasswordKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes password_key = 2;</code>
     */
    public com.google.protobuf.ByteString getPasswordKey() {
      return passwordKey_;
    }

    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString publicKey_;
    /**
     * <code>optional bytes public_key = 3;</code>
     */
    public boolean hasPublicKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes public_key = 3;</code>
     */
    public com.google.protobuf.ByteString getPublicKey() {
      return publicKey_;
    }

    public static final int PLAYER_ID_FIELD_NUMBER = 4;
    private int playerId_;
    /**
     * <code>optional int32 player_id = 4;</code>
     */
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 player_id = 4;</code>
     */
    public int getPlayerId() {
      return playerId_;
    }

    public static final int LAST_TIME_FIELD_NUMBER = 5;
    private long lastTime_;
    /**
     * <code>optional int64 last_time = 5;</code>
     */
    public boolean hasLastTime() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int64 last_time = 5;</code>
     */
    public long getLastTime() {
      return lastTime_;
    }

    public static final int LAST_ID_FIELD_NUMBER = 6;
    private int lastId_;
    /**
     * <code>optional int32 last_id = 6;</code>
     */
    public boolean hasLastId() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 last_id = 6;</code>
     */
    public int getLastId() {
      return lastId_;
    }

    public static final int DEVICE_ID_FIELD_NUMBER = 7;
    private java.lang.Object deviceId_;
    /**
     * <code>optional string device_id = 7;</code>
     */
    public boolean hasDeviceId() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string device_id = 7;</code>
     */
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deviceId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string device_id = 7;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      id_ = 0;
      passwordKey_ = com.google.protobuf.ByteString.EMPTY;
      publicKey_ = com.google.protobuf.ByteString.EMPTY;
      playerId_ = 0;
      lastTime_ = 0L;
      lastId_ = 0;
      deviceId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, passwordKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, publicKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, playerId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, lastTime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, lastId_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, getDeviceIdBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, passwordKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, publicKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, playerId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, lastTime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, lastId_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getDeviceIdBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.origingame.persist.GameSessionProtos.GameSessionModel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.origingame.persist.GameSessionProtos.GameSessionModel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.origingame.persist.GameSessionProtos.GameSessionModel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.origingame.persist.GameSessionProtos.GameSessionModel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.origingame.persist.GameSessionProtos.GameSessionModel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.origingame.persist.GameSessionProtos.GameSessionModel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.origingame.persist.GameSessionProtos.GameSessionModel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.origingame.persist.GameSessionProtos.GameSessionModel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.origingame.persist.GameSessionProtos.GameSessionModel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.origingame.persist.GameSessionProtos.GameSessionModel parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.origingame.persist.GameSessionProtos.GameSessionModel prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.origingame.persist.GameSessionModel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.origingame.persist.GameSessionModel)
        com.origingame.persist.GameSessionProtos.GameSessionModelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.origingame.persist.GameSessionProtos.internal_static_com_origingame_persist_GameSessionModel_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.origingame.persist.GameSessionProtos.internal_static_com_origingame_persist_GameSessionModel_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.origingame.persist.GameSessionProtos.GameSessionModel.class, com.origingame.persist.GameSessionProtos.GameSessionModel.Builder.class);
      }

      // Construct using com.origingame.persist.GameSessionProtos.GameSessionModel.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        passwordKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        publicKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        lastTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        lastId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        deviceId_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.origingame.persist.GameSessionProtos.internal_static_com_origingame_persist_GameSessionModel_descriptor;
      }

      public com.origingame.persist.GameSessionProtos.GameSessionModel getDefaultInstanceForType() {
        return com.origingame.persist.GameSessionProtos.GameSessionModel.getDefaultInstance();
      }

      public com.origingame.persist.GameSessionProtos.GameSessionModel build() {
        com.origingame.persist.GameSessionProtos.GameSessionModel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.origingame.persist.GameSessionProtos.GameSessionModel buildPartial() {
        com.origingame.persist.GameSessionProtos.GameSessionModel result = new com.origingame.persist.GameSessionProtos.GameSessionModel(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.passwordKey_ = passwordKey_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.publicKey_ = publicKey_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.lastTime_ = lastTime_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.lastId_ = lastId_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.deviceId_ = deviceId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.origingame.persist.GameSessionProtos.GameSessionModel) {
          return mergeFrom((com.origingame.persist.GameSessionProtos.GameSessionModel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.origingame.persist.GameSessionProtos.GameSessionModel other) {
        if (other == com.origingame.persist.GameSessionProtos.GameSessionModel.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasPasswordKey()) {
          setPasswordKey(other.getPasswordKey());
        }
        if (other.hasPublicKey()) {
          setPublicKey(other.getPublicKey());
        }
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasLastTime()) {
          setLastTime(other.getLastTime());
        }
        if (other.hasLastId()) {
          setLastId(other.getLastId());
        }
        if (other.hasDeviceId()) {
          bitField0_ |= 0x00000040;
          deviceId_ = other.deviceId_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.origingame.persist.GameSessionProtos.GameSessionModel parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.origingame.persist.GameSessionProtos.GameSessionModel) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>optional int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString passwordKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes password_key = 2;</code>
       */
      public boolean hasPasswordKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes password_key = 2;</code>
       */
      public com.google.protobuf.ByteString getPasswordKey() {
        return passwordKey_;
      }
      /**
       * <code>optional bytes password_key = 2;</code>
       */
      public Builder setPasswordKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        passwordKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes password_key = 2;</code>
       */
      public Builder clearPasswordKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        passwordKey_ = getDefaultInstance().getPasswordKey();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes public_key = 3;</code>
       */
      public boolean hasPublicKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bytes public_key = 3;</code>
       */
      public com.google.protobuf.ByteString getPublicKey() {
        return publicKey_;
      }
      /**
       * <code>optional bytes public_key = 3;</code>
       */
      public Builder setPublicKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        publicKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes public_key = 3;</code>
       */
      public Builder clearPublicKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        publicKey_ = getDefaultInstance().getPublicKey();
        onChanged();
        return this;
      }

      private int playerId_ ;
      /**
       * <code>optional int32 player_id = 4;</code>
       */
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 player_id = 4;</code>
       */
      public int getPlayerId() {
        return playerId_;
      }
      /**
       * <code>optional int32 player_id = 4;</code>
       */
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000008;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 player_id = 4;</code>
       */
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        playerId_ = 0;
        onChanged();
        return this;
      }

      private long lastTime_ ;
      /**
       * <code>optional int64 last_time = 5;</code>
       */
      public boolean hasLastTime() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int64 last_time = 5;</code>
       */
      public long getLastTime() {
        return lastTime_;
      }
      /**
       * <code>optional int64 last_time = 5;</code>
       */
      public Builder setLastTime(long value) {
        bitField0_ |= 0x00000010;
        lastTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 last_time = 5;</code>
       */
      public Builder clearLastTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        lastTime_ = 0L;
        onChanged();
        return this;
      }

      private int lastId_ ;
      /**
       * <code>optional int32 last_id = 6;</code>
       */
      public boolean hasLastId() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int32 last_id = 6;</code>
       */
      public int getLastId() {
        return lastId_;
      }
      /**
       * <code>optional int32 last_id = 6;</code>
       */
      public Builder setLastId(int value) {
        bitField0_ |= 0x00000020;
        lastId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 last_id = 6;</code>
       */
      public Builder clearLastId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        lastId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object deviceId_ = "";
      /**
       * <code>optional string device_id = 7;</code>
       */
      public boolean hasDeviceId() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string device_id = 7;</code>
       */
      public java.lang.String getDeviceId() {
        java.lang.Object ref = deviceId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            deviceId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string device_id = 7;</code>
       */
      public com.google.protobuf.ByteString
          getDeviceIdBytes() {
        java.lang.Object ref = deviceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string device_id = 7;</code>
       */
      public Builder setDeviceId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        deviceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string device_id = 7;</code>
       */
      public Builder clearDeviceId() {
        bitField0_ = (bitField0_ & ~0x00000040);
        deviceId_ = getDefaultInstance().getDeviceId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string device_id = 7;</code>
       */
      public Builder setDeviceIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        deviceId_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.origingame.persist.GameSessionModel)
    }

    static {
      defaultInstance = new GameSessionModel(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.origingame.persist.GameSessionModel)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_origingame_persist_GameSessionModel_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_origingame_persist_GameSessionModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032persist/game_session.proto\022\026com.origin" +
      "game.persist\"\222\001\n\020GameSessionModel\022\n\n\002id\030" +
      "\001 \001(\005\022\024\n\014password_key\030\002 \001(\014\022\022\n\npublic_ke" +
      "y\030\003 \001(\014\022\021\n\tplayer_id\030\004 \001(\005\022\021\n\tlast_time\030" +
      "\005 \001(\003\022\017\n\007last_id\030\006 \001(\005\022\021\n\tdevice_id\030\007 \001(" +
      "\tB\023B\021GameSessionProtos"
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
    internal_static_com_origingame_persist_GameSessionModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_origingame_persist_GameSessionModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_origingame_persist_GameSessionModel_descriptor,
        new java.lang.String[] { "Id", "PasswordKey", "PublicKey", "PlayerId", "LastTime", "LastId", "DeviceId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}