package com.example.minervascoutingsubsystemandroid.communications.tcp.proto;

public final class TcpCommunication {
    private TcpCommunication() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface LogMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required .com.example.min
         * +ervascoutingsubsystemandroid.communications.tcp.proto.LogMessage.LogLevel level = 1;</code>
         */
        boolean hasLevel();
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage.LogLevel level = 1;</code>
         */
        com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel getLevel();

        /**
         * <code>required string message = 2;</code>
         */
        boolean hasMessage();
        /**
         * <code>required string message = 2;</code>
         */
        java.lang.String getMessage();
        /**
         * <code>required string message = 2;</code>
         */
        com.google.protobuf.ByteString
        getMessageBytes();

        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
         */
        boolean hasSender();
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
         */
        com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getSender();
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
         */
        com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getSenderOrBuilder();

        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
         */
        boolean hasRecipient();
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
         */
        com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getRecipient();
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
         */
        com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getRecipientOrBuilder();
    }
    /**
     * Protobuf type {@code com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage}
     */
    public  static final class LogMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage)
            LogMessageOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use LogMessage.newBuilder() to construct.
        private LogMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private LogMessage() {
            level_ = 1;
            message_ = "";
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private LogMessage(
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
                        case 8: {
                            int rawValue = input.readEnum();
                            @SuppressWarnings("deprecation")
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel value = com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(1, rawValue);
                            } else {
                                bitField0_ |= 0x00000001;
                                level_ = rawValue;
                            }
                            break;
                        }
                        case 18: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000002;
                            message_ = bs;
                            break;
                        }
                        case 26: {
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                                subBuilder = sender_.toBuilder();
                            }
                            sender_ = input.readMessage(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(sender_);
                                sender_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000004;
                            break;
                        }
                        case 34: {
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                                subBuilder = recipient_.toBuilder();
                            }
                            recipient_ = input.readMessage(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(recipient_);
                                recipient_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000008;
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
            return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_LogMessage_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_LogMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.class, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.Builder.class);
        }

        /**
         * Protobuf enum {@code com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage.LogLevel}
         */
        public enum LogLevel
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>debug = 1;</code>
             */
            debug(1),
            /**
             * <code>info = 2;</code>
             */
            info(2),
            /**
             * <code>warning = 3;</code>
             */
            warning(3),
            /**
             * <code>error = 4;</code>
             */
            error(4),
            ;

            /**
             * <code>debug = 1;</code>
             */
            public static final int debug_VALUE = 1;
            /**
             * <code>info = 2;</code>
             */
            public static final int info_VALUE = 2;
            /**
             * <code>warning = 3;</code>
             */
            public static final int warning_VALUE = 3;
            /**
             * <code>error = 4;</code>
             */
            public static final int error_VALUE = 4;


            public final int getNumber() {
                return value;
            }

            /**
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static LogLevel valueOf(int value) {
                return forNumber(value);
            }

            public static LogLevel forNumber(int value) {
                switch (value) {
                    case 1: return debug;
                    case 2: return info;
                    case 3: return warning;
                    case 4: return error;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<LogLevel>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    LogLevel> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<LogLevel>() {
                        public LogLevel findValueByNumber(int number) {
                            return LogLevel.forNumber(number);
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
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.getDescriptor().getEnumTypes().get(0);
            }

            private static final LogLevel[] VALUES = values();

            public static LogLevel valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private LogLevel(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage.LogLevel)
        }

        private int bitField0_;
        public static final int LEVEL_FIELD_NUMBER = 1;
        private int level_;
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage.LogLevel level = 1;</code>
         */
        public boolean hasLevel() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage.LogLevel level = 1;</code>
         */
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel getLevel() {
            @SuppressWarnings("deprecation")
            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel result = com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel.valueOf(level_);
            return result == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel.debug : result;
        }

        public static final int MESSAGE_FIELD_NUMBER = 2;
        private volatile java.lang.Object message_;
        /**
         * <code>required string message = 2;</code>
         */
        public boolean hasMessage() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required string message = 2;</code>
         */
        public java.lang.String getMessage() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    message_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string message = 2;</code>
         */
        public com.google.protobuf.ByteString
        getMessageBytes() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                message_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SENDER_FIELD_NUMBER = 3;
        private com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID sender_;
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
         */
        public boolean hasSender() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
         */
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getSender() {
            return sender_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : sender_;
        }
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
         */
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getSenderOrBuilder() {
            return sender_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : sender_;
        }

        public static final int RECIPIENT_FIELD_NUMBER = 4;
        private com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID recipient_;
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
         */
        public boolean hasRecipient() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
         */
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getRecipient() {
            return recipient_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : recipient_;
        }
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
         */
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getRecipientOrBuilder() {
            return recipient_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : recipient_;
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasLevel()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasMessage()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasSender()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasRecipient()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!getSender().isInitialized()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!getRecipient().isInitialized()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeEnum(1, level_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeMessage(3, getSender());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeMessage(4, getRecipient());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, level_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, getSender());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, getRecipient());
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
            if (!(obj instanceof com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage)) {
                return super.equals(obj);
            }
            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage other = (com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage) obj;

            boolean result = true;
            result = result && (hasLevel() == other.hasLevel());
            if (hasLevel()) {
                result = result && level_ == other.level_;
            }
            result = result && (hasMessage() == other.hasMessage());
            if (hasMessage()) {
                result = result && getMessage()
                        .equals(other.getMessage());
            }
            result = result && (hasSender() == other.hasSender());
            if (hasSender()) {
                result = result && getSender()
                        .equals(other.getSender());
            }
            result = result && (hasRecipient() == other.hasRecipient());
            if (hasRecipient()) {
                result = result && getRecipient()
                        .equals(other.getRecipient());
            }
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
            if (hasLevel()) {
                hash = (37 * hash) + LEVEL_FIELD_NUMBER;
                hash = (53 * hash) + level_;
            }
            if (hasMessage()) {
                hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
                hash = (53 * hash) + getMessage().hashCode();
            }
            if (hasSender()) {
                hash = (37 * hash) + SENDER_FIELD_NUMBER;
                hash = (53 * hash) + getSender().hashCode();
            }
            if (hasRecipient()) {
                hash = (37 * hash) + RECIPIENT_FIELD_NUMBER;
                hash = (53 * hash) + getRecipient().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parseFrom(
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
        public static Builder newBuilder(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage prototype) {
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
         * Protobuf type {@code com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage)
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_LogMessage_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_LogMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.class, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.Builder.class);
            }

            // Construct using com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.newBuilder()
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
                    getSenderFieldBuilder();
                    getRecipientFieldBuilder();
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                level_ = 1;
                bitField0_ = (bitField0_ & ~0x00000001);
                message_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                if (senderBuilder_ == null) {
                    sender_ = null;
                } else {
                    senderBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                if (recipientBuilder_ == null) {
                    recipient_ = null;
                } else {
                    recipientBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_LogMessage_descriptor;
            }

            @java.lang.Override
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage getDefaultInstanceForType() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage build() {
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage buildPartial() {
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage result = new com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.level_ = level_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.message_ = message_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                if (senderBuilder_ == null) {
                    result.sender_ = sender_;
                } else {
                    result.sender_ = senderBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                if (recipientBuilder_ == null) {
                    result.recipient_ = recipient_;
                } else {
                    result.recipient_ = recipientBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
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
                if (other instanceof com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage) {
                    return mergeFrom((com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage other) {
                if (other == com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.getDefaultInstance()) return this;
                if (other.hasLevel()) {
                    setLevel(other.getLevel());
                }
                if (other.hasMessage()) {
                    bitField0_ |= 0x00000002;
                    message_ = other.message_;
                    onChanged();
                }
                if (other.hasSender()) {
                    mergeSender(other.getSender());
                }
                if (other.hasRecipient()) {
                    mergeRecipient(other.getRecipient());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                if (!hasLevel()) {
                    return false;
                }
                if (!hasMessage()) {
                    return false;
                }
                if (!hasSender()) {
                    return false;
                }
                if (!hasRecipient()) {
                    return false;
                }
                if (!getSender().isInitialized()) {
                    return false;
                }
                if (!getRecipient().isInitialized()) {
                    return false;
                }
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private int level_ = 1;
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage.LogLevel level = 1;</code>
             */
            public boolean hasLevel() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage.LogLevel level = 1;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel getLevel() {
                @SuppressWarnings("deprecation")
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel result = com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel.valueOf(level_);
                return result == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel.debug : result;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage.LogLevel level = 1;</code>
             */
            public Builder setLevel(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage.LogLevel value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                level_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage.LogLevel level = 1;</code>
             */
            public Builder clearLevel() {
                bitField0_ = (bitField0_ & ~0x00000001);
                level_ = 1;
                onChanged();
                return this;
            }

            private java.lang.Object message_ = "";
            /**
             * <code>required string message = 2;</code>
             */
            public boolean hasMessage() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string message = 2;</code>
             */
            public java.lang.String getMessage() {
                java.lang.Object ref = message_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        message_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string message = 2;</code>
             */
            public com.google.protobuf.ByteString
            getMessageBytes() {
                java.lang.Object ref = message_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    message_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string message = 2;</code>
             */
            public Builder setMessage(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                message_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string message = 2;</code>
             */
            public Builder clearMessage() {
                bitField0_ = (bitField0_ & ~0x00000002);
                message_ = getDefaultInstance().getMessage();
                onChanged();
                return this;
            }
            /**
             * <code>required string message = 2;</code>
             */
            public Builder setMessageBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                message_ = value;
                onChanged();
                return this;
            }

            private com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID sender_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder> senderBuilder_;
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
             */
            public boolean hasSender() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getSender() {
                if (senderBuilder_ == null) {
                    return sender_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : sender_;
                } else {
                    return senderBuilder_.getMessage();
                }
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
             */
            public Builder setSender(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID value) {
                if (senderBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    sender_ = value;
                    onChanged();
                } else {
                    senderBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
             */
            public Builder setSender(
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder builderForValue) {
                if (senderBuilder_ == null) {
                    sender_ = builderForValue.build();
                    onChanged();
                } else {
                    senderBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
             */
            public Builder mergeSender(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID value) {
                if (senderBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) == 0x00000004) &&
                            sender_ != null &&
                            sender_ != com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance()) {
                        sender_ =
                                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.newBuilder(sender_).mergeFrom(value).buildPartial();
                    } else {
                        sender_ = value;
                    }
                    onChanged();
                } else {
                    senderBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
             */
            public Builder clearSender() {
                if (senderBuilder_ == null) {
                    sender_ = null;
                    onChanged();
                } else {
                    senderBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder getSenderBuilder() {
                bitField0_ |= 0x00000004;
                onChanged();
                return getSenderFieldBuilder().getBuilder();
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getSenderOrBuilder() {
                if (senderBuilder_ != null) {
                    return senderBuilder_.getMessageOrBuilder();
                } else {
                    return sender_ == null ?
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : sender_;
                }
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder>
            getSenderFieldBuilder() {
                if (senderBuilder_ == null) {
                    senderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder>(
                            getSender(),
                            getParentForChildren(),
                            isClean());
                    sender_ = null;
                }
                return senderBuilder_;
            }

            private com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID recipient_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder> recipientBuilder_;
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
             */
            public boolean hasRecipient() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getRecipient() {
                if (recipientBuilder_ == null) {
                    return recipient_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : recipient_;
                } else {
                    return recipientBuilder_.getMessage();
                }
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
             */
            public Builder setRecipient(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID value) {
                if (recipientBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    recipient_ = value;
                    onChanged();
                } else {
                    recipientBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000008;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
             */
            public Builder setRecipient(
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder builderForValue) {
                if (recipientBuilder_ == null) {
                    recipient_ = builderForValue.build();
                    onChanged();
                } else {
                    recipientBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000008;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
             */
            public Builder mergeRecipient(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID value) {
                if (recipientBuilder_ == null) {
                    if (((bitField0_ & 0x00000008) == 0x00000008) &&
                            recipient_ != null &&
                            recipient_ != com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance()) {
                        recipient_ =
                                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.newBuilder(recipient_).mergeFrom(value).buildPartial();
                    } else {
                        recipient_ = value;
                    }
                    onChanged();
                } else {
                    recipientBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000008;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
             */
            public Builder clearRecipient() {
                if (recipientBuilder_ == null) {
                    recipient_ = null;
                    onChanged();
                } else {
                    recipientBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder getRecipientBuilder() {
                bitField0_ |= 0x00000008;
                onChanged();
                return getRecipientFieldBuilder().getBuilder();
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getRecipientOrBuilder() {
                if (recipientBuilder_ != null) {
                    return recipientBuilder_.getMessageOrBuilder();
                } else {
                    return recipient_ == null ?
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : recipient_;
                }
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder>
            getRecipientFieldBuilder() {
                if (recipientBuilder_ == null) {
                    recipientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder>(
                            getRecipient(),
                            getParentForChildren(),
                            isClean());
                    recipient_ = null;
                }
                return recipientBuilder_;
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


            // @@protoc_insertion_point(builder_scope:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage)
        }

        // @@protoc_insertion_point(class_scope:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.LogMessage)
        private static final com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage();
        }

        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<LogMessage>
                PARSER = new com.google.protobuf.AbstractParser<LogMessage>() {
            @java.lang.Override
            public LogMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new LogMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<LogMessage> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<LogMessage> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.LogMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface DeviceIDOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string deviceName = 1;</code>
         */
        boolean hasDeviceName();
        /**
         * <code>required string deviceName = 1;</code>
         */
        java.lang.String getDeviceName();
        /**
         * <code>required string deviceName = 1;</code>
         */
        com.google.protobuf.ByteString
        getDeviceNameBytes();

        /**
         * <code>required string deviceUUID = 2;</code>
         */
        boolean hasDeviceUUID();
        /**
         * <code>required string deviceUUID = 2;</code>
         */
        java.lang.String getDeviceUUID();
        /**
         * <code>required string deviceUUID = 2;</code>
         */
        com.google.protobuf.ByteString
        getDeviceUUIDBytes();

        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID.DeviceType deviceType = 3;</code>
         */
        boolean hasDeviceType();
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID.DeviceType deviceType = 3;</code>
         */
        com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType getDeviceType();
    }
    /**
     * Protobuf type {@code com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID}
     */
    public  static final class DeviceID extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID)
            DeviceIDOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use DeviceID.newBuilder() to construct.
        private DeviceID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private DeviceID() {
            deviceName_ = "";
            deviceUUID_ = "";
            deviceType_ = 1;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private DeviceID(
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
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            deviceName_ = bs;
                            break;
                        }
                        case 18: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000002;
                            deviceUUID_ = bs;
                            break;
                        }
                        case 24: {
                            int rawValue = input.readEnum();
                            @SuppressWarnings("deprecation")
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType value = com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(3, rawValue);
                            } else {
                                bitField0_ |= 0x00000004;
                                deviceType_ = rawValue;
                            }
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
            return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_DeviceID_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_DeviceID_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.class, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder.class);
        }

        /**
         * Protobuf enum {@code com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID.DeviceType}
         */
        public enum DeviceType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>TABLET = 1;</code>
             */
            TABLET(1),
            /**
             * <code>PHONE = 2;</code>
             */
            PHONE(2),
            /**
             * <code>BROWSER = 3;</code>
             */
            BROWSER(3),
            /**
             * <code>HUB = 4;</code>
             */
            HUB(4),
            /**
             * <code>OTHER = 5;</code>
             */
            OTHER(5),
            ;

            /**
             * <code>TABLET = 1;</code>
             */
            public static final int TABLET_VALUE = 1;
            /**
             * <code>PHONE = 2;</code>
             */
            public static final int PHONE_VALUE = 2;
            /**
             * <code>BROWSER = 3;</code>
             */
            public static final int BROWSER_VALUE = 3;
            /**
             * <code>HUB = 4;</code>
             */
            public static final int HUB_VALUE = 4;
            /**
             * <code>OTHER = 5;</code>
             */
            public static final int OTHER_VALUE = 5;


            public final int getNumber() {
                return value;
            }

            /**
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static DeviceType valueOf(int value) {
                return forNumber(value);
            }

            public static DeviceType forNumber(int value) {
                switch (value) {
                    case 1: return TABLET;
                    case 2: return PHONE;
                    case 3: return BROWSER;
                    case 4: return HUB;
                    case 5: return OTHER;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<DeviceType>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    DeviceType> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<DeviceType>() {
                        public DeviceType findValueByNumber(int number) {
                            return DeviceType.forNumber(number);
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
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDescriptor().getEnumTypes().get(0);
            }

            private static final DeviceType[] VALUES = values();

            public static DeviceType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private DeviceType(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID.DeviceType)
        }

        private int bitField0_;
        public static final int DEVICENAME_FIELD_NUMBER = 1;
        private volatile java.lang.Object deviceName_;
        /**
         * <code>required string deviceName = 1;</code>
         */
        public boolean hasDeviceName() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string deviceName = 1;</code>
         */
        public java.lang.String getDeviceName() {
            java.lang.Object ref = deviceName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    deviceName_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string deviceName = 1;</code>
         */
        public com.google.protobuf.ByteString
        getDeviceNameBytes() {
            java.lang.Object ref = deviceName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                deviceName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int DEVICEUUID_FIELD_NUMBER = 2;
        private volatile java.lang.Object deviceUUID_;
        /**
         * <code>required string deviceUUID = 2;</code>
         */
        public boolean hasDeviceUUID() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required string deviceUUID = 2;</code>
         */
        public java.lang.String getDeviceUUID() {
            java.lang.Object ref = deviceUUID_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    deviceUUID_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string deviceUUID = 2;</code>
         */
        public com.google.protobuf.ByteString
        getDeviceUUIDBytes() {
            java.lang.Object ref = deviceUUID_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                deviceUUID_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int DEVICETYPE_FIELD_NUMBER = 3;
        private int deviceType_;
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID.DeviceType deviceType = 3;</code>
         */
        public boolean hasDeviceType() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID.DeviceType deviceType = 3;</code>
         */
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType getDeviceType() {
            @SuppressWarnings("deprecation")
            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType result = com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType.valueOf(deviceType_);
            return result == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType.TABLET : result;
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasDeviceName()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDeviceUUID()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDeviceType()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deviceName_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceUUID_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeEnum(3, deviceType_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deviceName_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceUUID_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(3, deviceType_);
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
            if (!(obj instanceof com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID)) {
                return super.equals(obj);
            }
            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID other = (com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID) obj;

            boolean result = true;
            result = result && (hasDeviceName() == other.hasDeviceName());
            if (hasDeviceName()) {
                result = result && getDeviceName()
                        .equals(other.getDeviceName());
            }
            result = result && (hasDeviceUUID() == other.hasDeviceUUID());
            if (hasDeviceUUID()) {
                result = result && getDeviceUUID()
                        .equals(other.getDeviceUUID());
            }
            result = result && (hasDeviceType() == other.hasDeviceType());
            if (hasDeviceType()) {
                result = result && deviceType_ == other.deviceType_;
            }
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
            if (hasDeviceName()) {
                hash = (37 * hash) + DEVICENAME_FIELD_NUMBER;
                hash = (53 * hash) + getDeviceName().hashCode();
            }
            if (hasDeviceUUID()) {
                hash = (37 * hash) + DEVICEUUID_FIELD_NUMBER;
                hash = (53 * hash) + getDeviceUUID().hashCode();
            }
            if (hasDeviceType()) {
                hash = (37 * hash) + DEVICETYPE_FIELD_NUMBER;
                hash = (53 * hash) + deviceType_;
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parseFrom(
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
        public static Builder newBuilder(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID prototype) {
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
         * Protobuf type {@code com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID)
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_DeviceID_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_DeviceID_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.class, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder.class);
            }

            // Construct using com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.newBuilder()
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
                deviceName_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                deviceUUID_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                deviceType_ = 1;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_DeviceID_descriptor;
            }

            @java.lang.Override
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getDefaultInstanceForType() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID build() {
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID buildPartial() {
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID result = new com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.deviceName_ = deviceName_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.deviceUUID_ = deviceUUID_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.deviceType_ = deviceType_;
                result.bitField0_ = to_bitField0_;
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
                if (other instanceof com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID) {
                    return mergeFrom((com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID other) {
                if (other == com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance()) return this;
                if (other.hasDeviceName()) {
                    bitField0_ |= 0x00000001;
                    deviceName_ = other.deviceName_;
                    onChanged();
                }
                if (other.hasDeviceUUID()) {
                    bitField0_ |= 0x00000002;
                    deviceUUID_ = other.deviceUUID_;
                    onChanged();
                }
                if (other.hasDeviceType()) {
                    setDeviceType(other.getDeviceType());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                if (!hasDeviceName()) {
                    return false;
                }
                if (!hasDeviceUUID()) {
                    return false;
                }
                if (!hasDeviceType()) {
                    return false;
                }
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.lang.Object deviceName_ = "";
            /**
             * <code>required string deviceName = 1;</code>
             */
            public boolean hasDeviceName() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string deviceName = 1;</code>
             */
            public java.lang.String getDeviceName() {
                java.lang.Object ref = deviceName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        deviceName_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string deviceName = 1;</code>
             */
            public com.google.protobuf.ByteString
            getDeviceNameBytes() {
                java.lang.Object ref = deviceName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    deviceName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string deviceName = 1;</code>
             */
            public Builder setDeviceName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                deviceName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string deviceName = 1;</code>
             */
            public Builder clearDeviceName() {
                bitField0_ = (bitField0_ & ~0x00000001);
                deviceName_ = getDefaultInstance().getDeviceName();
                onChanged();
                return this;
            }
            /**
             * <code>required string deviceName = 1;</code>
             */
            public Builder setDeviceNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                deviceName_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object deviceUUID_ = "";
            /**
             * <code>required string deviceUUID = 2;</code>
             */
            public boolean hasDeviceUUID() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string deviceUUID = 2;</code>
             */
            public java.lang.String getDeviceUUID() {
                java.lang.Object ref = deviceUUID_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        deviceUUID_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string deviceUUID = 2;</code>
             */
            public com.google.protobuf.ByteString
            getDeviceUUIDBytes() {
                java.lang.Object ref = deviceUUID_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    deviceUUID_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string deviceUUID = 2;</code>
             */
            public Builder setDeviceUUID(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                deviceUUID_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string deviceUUID = 2;</code>
             */
            public Builder clearDeviceUUID() {
                bitField0_ = (bitField0_ & ~0x00000002);
                deviceUUID_ = getDefaultInstance().getDeviceUUID();
                onChanged();
                return this;
            }
            /**
             * <code>required string deviceUUID = 2;</code>
             */
            public Builder setDeviceUUIDBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                deviceUUID_ = value;
                onChanged();
                return this;
            }

            private int deviceType_ = 1;
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID.DeviceType deviceType = 3;</code>
             */
            public boolean hasDeviceType() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID.DeviceType deviceType = 3;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType getDeviceType() {
                @SuppressWarnings("deprecation")
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType result = com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType.valueOf(deviceType_);
                return result == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType.TABLET : result;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID.DeviceType deviceType = 3;</code>
             */
            public Builder setDeviceType(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.DeviceType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                deviceType_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID.DeviceType deviceType = 3;</code>
             */
            public Builder clearDeviceType() {
                bitField0_ = (bitField0_ & ~0x00000004);
                deviceType_ = 1;
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


            // @@protoc_insertion_point(builder_scope:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID)
        }

        // @@protoc_insertion_point(class_scope:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID)
        private static final com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID();
        }

        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<DeviceID>
                PARSER = new com.google.protobuf.AbstractParser<DeviceID>() {
            @java.lang.Override
            public DeviceID parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new DeviceID(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<DeviceID> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DeviceID> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CommandMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.CommandMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string messageDesc = 1;</code>
         */
        boolean hasMessageDesc();
        /**
         * <code>required string messageDesc = 1;</code>
         */
        java.lang.String getMessageDesc();
        /**
         * <code>required string messageDesc = 1;</code>
         */
        com.google.protobuf.ByteString
        getMessageDescBytes();

        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
         */
        boolean hasSender();
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
         */
        com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getSender();
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
         */
        com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getSenderOrBuilder();

        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
         */
        boolean hasRecipient();
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
         */
        com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getRecipient();
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
         */
        com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getRecipientOrBuilder();

        /**
         * <code>required string commandExecutableJSON = 4;</code>
         */
        boolean hasCommandExecutableJSON();
        /**
         * <code>required string commandExecutableJSON = 4;</code>
         */
        java.lang.String getCommandExecutableJSON();
        /**
         * <code>required string commandExecutableJSON = 4;</code>
         */
        com.google.protobuf.ByteString
        getCommandExecutableJSONBytes();
    }
    /**
     * Protobuf type {@code com.example.minervascoutingsubsystemandroid.communications.tcp.proto.CommandMessage}
     */
    public  static final class CommandMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.CommandMessage)
            CommandMessageOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CommandMessage.newBuilder() to construct.
        private CommandMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private CommandMessage() {
            messageDesc_ = "";
            commandExecutableJSON_ = "";
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CommandMessage(
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
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            messageDesc_ = bs;
                            break;
                        }
                        case 18: {
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                                subBuilder = sender_.toBuilder();
                            }
                            sender_ = input.readMessage(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(sender_);
                                sender_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000002;
                            break;
                        }
                        case 26: {
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                                subBuilder = recipient_.toBuilder();
                            }
                            recipient_ = input.readMessage(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(recipient_);
                                recipient_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000004;
                            break;
                        }
                        case 34: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000008;
                            commandExecutableJSON_ = bs;
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
            return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_CommandMessage_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_CommandMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage.class, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage.Builder.class);
        }

        private int bitField0_;
        public static final int MESSAGEDESC_FIELD_NUMBER = 1;
        private volatile java.lang.Object messageDesc_;
        /**
         * <code>required string messageDesc = 1;</code>
         */
        public boolean hasMessageDesc() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string messageDesc = 1;</code>
         */
        public java.lang.String getMessageDesc() {
            java.lang.Object ref = messageDesc_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    messageDesc_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string messageDesc = 1;</code>
         */
        public com.google.protobuf.ByteString
        getMessageDescBytes() {
            java.lang.Object ref = messageDesc_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                messageDesc_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SENDER_FIELD_NUMBER = 2;
        private com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID sender_;
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
         */
        public boolean hasSender() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
         */
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getSender() {
            return sender_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : sender_;
        }
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
         */
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getSenderOrBuilder() {
            return sender_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : sender_;
        }

        public static final int RECIPIENT_FIELD_NUMBER = 3;
        private com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID recipient_;
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
         */
        public boolean hasRecipient() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
         */
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getRecipient() {
            return recipient_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : recipient_;
        }
        /**
         * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
         */
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getRecipientOrBuilder() {
            return recipient_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : recipient_;
        }

        public static final int COMMANDEXECUTABLEJSON_FIELD_NUMBER = 4;
        private volatile java.lang.Object commandExecutableJSON_;
        /**
         * <code>required string commandExecutableJSON = 4;</code>
         */
        public boolean hasCommandExecutableJSON() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>required string commandExecutableJSON = 4;</code>
         */
        public java.lang.String getCommandExecutableJSON() {
            java.lang.Object ref = commandExecutableJSON_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    commandExecutableJSON_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string commandExecutableJSON = 4;</code>
         */
        public com.google.protobuf.ByteString
        getCommandExecutableJSONBytes() {
            java.lang.Object ref = commandExecutableJSON_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                commandExecutableJSON_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasMessageDesc()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasSender()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasRecipient()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasCommandExecutableJSON()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!getSender().isInitialized()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!getRecipient().isInitialized()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messageDesc_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeMessage(2, getSender());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeMessage(3, getRecipient());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, commandExecutableJSON_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, messageDesc_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getSender());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, getRecipient());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, commandExecutableJSON_);
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
            if (!(obj instanceof com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage)) {
                return super.equals(obj);
            }
            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage other = (com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage) obj;

            boolean result = true;
            result = result && (hasMessageDesc() == other.hasMessageDesc());
            if (hasMessageDesc()) {
                result = result && getMessageDesc()
                        .equals(other.getMessageDesc());
            }
            result = result && (hasSender() == other.hasSender());
            if (hasSender()) {
                result = result && getSender()
                        .equals(other.getSender());
            }
            result = result && (hasRecipient() == other.hasRecipient());
            if (hasRecipient()) {
                result = result && getRecipient()
                        .equals(other.getRecipient());
            }
            result = result && (hasCommandExecutableJSON() == other.hasCommandExecutableJSON());
            if (hasCommandExecutableJSON()) {
                result = result && getCommandExecutableJSON()
                        .equals(other.getCommandExecutableJSON());
            }
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
            if (hasMessageDesc()) {
                hash = (37 * hash) + MESSAGEDESC_FIELD_NUMBER;
                hash = (53 * hash) + getMessageDesc().hashCode();
            }
            if (hasSender()) {
                hash = (37 * hash) + SENDER_FIELD_NUMBER;
                hash = (53 * hash) + getSender().hashCode();
            }
            if (hasRecipient()) {
                hash = (37 * hash) + RECIPIENT_FIELD_NUMBER;
                hash = (53 * hash) + getRecipient().hashCode();
            }
            if (hasCommandExecutableJSON()) {
                hash = (37 * hash) + COMMANDEXECUTABLEJSON_FIELD_NUMBER;
                hash = (53 * hash) + getCommandExecutableJSON().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parseFrom(
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
        public static Builder newBuilder(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage prototype) {
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
         * Protobuf type {@code com.example.minervascoutingsubsystemandroid.communications.tcp.proto.CommandMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.CommandMessage)
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_CommandMessage_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_CommandMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage.class, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage.Builder.class);
            }

            // Construct using com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage.newBuilder()
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
                    getSenderFieldBuilder();
                    getRecipientFieldBuilder();
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                messageDesc_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                if (senderBuilder_ == null) {
                    sender_ = null;
                } else {
                    senderBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                if (recipientBuilder_ == null) {
                    recipient_ = null;
                } else {
                    recipientBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                commandExecutableJSON_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_CommandMessage_descriptor;
            }

            @java.lang.Override
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage getDefaultInstanceForType() {
                return com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage build() {
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage buildPartial() {
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage result = new com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.messageDesc_ = messageDesc_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                if (senderBuilder_ == null) {
                    result.sender_ = sender_;
                } else {
                    result.sender_ = senderBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                if (recipientBuilder_ == null) {
                    result.recipient_ = recipient_;
                } else {
                    result.recipient_ = recipientBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.commandExecutableJSON_ = commandExecutableJSON_;
                result.bitField0_ = to_bitField0_;
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
                if (other instanceof com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage) {
                    return mergeFrom((com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage other) {
                if (other == com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage.getDefaultInstance()) return this;
                if (other.hasMessageDesc()) {
                    bitField0_ |= 0x00000001;
                    messageDesc_ = other.messageDesc_;
                    onChanged();
                }
                if (other.hasSender()) {
                    mergeSender(other.getSender());
                }
                if (other.hasRecipient()) {
                    mergeRecipient(other.getRecipient());
                }
                if (other.hasCommandExecutableJSON()) {
                    bitField0_ |= 0x00000008;
                    commandExecutableJSON_ = other.commandExecutableJSON_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                if (!hasMessageDesc()) {
                    return false;
                }
                if (!hasSender()) {
                    return false;
                }
                if (!hasRecipient()) {
                    return false;
                }
                if (!hasCommandExecutableJSON()) {
                    return false;
                }
                if (!getSender().isInitialized()) {
                    return false;
                }
                if (!getRecipient().isInitialized()) {
                    return false;
                }
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.lang.Object messageDesc_ = "";
            /**
             * <code>required string messageDesc = 1;</code>
             */
            public boolean hasMessageDesc() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string messageDesc = 1;</code>
             */
            public java.lang.String getMessageDesc() {
                java.lang.Object ref = messageDesc_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        messageDesc_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string messageDesc = 1;</code>
             */
            public com.google.protobuf.ByteString
            getMessageDescBytes() {
                java.lang.Object ref = messageDesc_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    messageDesc_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string messageDesc = 1;</code>
             */
            public Builder setMessageDesc(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                messageDesc_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string messageDesc = 1;</code>
             */
            public Builder clearMessageDesc() {
                bitField0_ = (bitField0_ & ~0x00000001);
                messageDesc_ = getDefaultInstance().getMessageDesc();
                onChanged();
                return this;
            }
            /**
             * <code>required string messageDesc = 1;</code>
             */
            public Builder setMessageDescBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                messageDesc_ = value;
                onChanged();
                return this;
            }

            private com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID sender_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder> senderBuilder_;
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
             */
            public boolean hasSender() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getSender() {
                if (senderBuilder_ == null) {
                    return sender_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : sender_;
                } else {
                    return senderBuilder_.getMessage();
                }
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
             */
            public Builder setSender(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID value) {
                if (senderBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    sender_ = value;
                    onChanged();
                } else {
                    senderBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
             */
            public Builder setSender(
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder builderForValue) {
                if (senderBuilder_ == null) {
                    sender_ = builderForValue.build();
                    onChanged();
                } else {
                    senderBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
             */
            public Builder mergeSender(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID value) {
                if (senderBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002) &&
                            sender_ != null &&
                            sender_ != com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance()) {
                        sender_ =
                                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.newBuilder(sender_).mergeFrom(value).buildPartial();
                    } else {
                        sender_ = value;
                    }
                    onChanged();
                } else {
                    senderBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
             */
            public Builder clearSender() {
                if (senderBuilder_ == null) {
                    sender_ = null;
                    onChanged();
                } else {
                    senderBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder getSenderBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getSenderFieldBuilder().getBuilder();
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getSenderOrBuilder() {
                if (senderBuilder_ != null) {
                    return senderBuilder_.getMessageOrBuilder();
                } else {
                    return sender_ == null ?
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : sender_;
                }
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID sender = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder>
            getSenderFieldBuilder() {
                if (senderBuilder_ == null) {
                    senderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder>(
                            getSender(),
                            getParentForChildren(),
                            isClean());
                    sender_ = null;
                }
                return senderBuilder_;
            }

            private com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID recipient_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder> recipientBuilder_;
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
             */
            public boolean hasRecipient() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID getRecipient() {
                if (recipientBuilder_ == null) {
                    return recipient_ == null ? com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : recipient_;
                } else {
                    return recipientBuilder_.getMessage();
                }
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
             */
            public Builder setRecipient(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID value) {
                if (recipientBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    recipient_ = value;
                    onChanged();
                } else {
                    recipientBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
             */
            public Builder setRecipient(
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder builderForValue) {
                if (recipientBuilder_ == null) {
                    recipient_ = builderForValue.build();
                    onChanged();
                } else {
                    recipientBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
             */
            public Builder mergeRecipient(com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID value) {
                if (recipientBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) == 0x00000004) &&
                            recipient_ != null &&
                            recipient_ != com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance()) {
                        recipient_ =
                                com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.newBuilder(recipient_).mergeFrom(value).buildPartial();
                    } else {
                        recipient_ = value;
                    }
                    onChanged();
                } else {
                    recipientBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
             */
            public Builder clearRecipient() {
                if (recipientBuilder_ == null) {
                    recipient_ = null;
                    onChanged();
                } else {
                    recipientBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder getRecipientBuilder() {
                bitField0_ |= 0x00000004;
                onChanged();
                return getRecipientFieldBuilder().getBuilder();
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
             */
            public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder getRecipientOrBuilder() {
                if (recipientBuilder_ != null) {
                    return recipientBuilder_.getMessageOrBuilder();
                } else {
                    return recipient_ == null ?
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.getDefaultInstance() : recipient_;
                }
            }
            /**
             * <code>required .com.example.minervascoutingsubsystemandroid.communications.tcp.proto.DeviceID recipient = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder>
            getRecipientFieldBuilder() {
                if (recipientBuilder_ == null) {
                    recipientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceID.Builder, com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.DeviceIDOrBuilder>(
                            getRecipient(),
                            getParentForChildren(),
                            isClean());
                    recipient_ = null;
                }
                return recipientBuilder_;
            }

            private java.lang.Object commandExecutableJSON_ = "";
            /**
             * <code>required string commandExecutableJSON = 4;</code>
             */
            public boolean hasCommandExecutableJSON() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>required string commandExecutableJSON = 4;</code>
             */
            public java.lang.String getCommandExecutableJSON() {
                java.lang.Object ref = commandExecutableJSON_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        commandExecutableJSON_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string commandExecutableJSON = 4;</code>
             */
            public com.google.protobuf.ByteString
            getCommandExecutableJSONBytes() {
                java.lang.Object ref = commandExecutableJSON_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    commandExecutableJSON_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string commandExecutableJSON = 4;</code>
             */
            public Builder setCommandExecutableJSON(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                commandExecutableJSON_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string commandExecutableJSON = 4;</code>
             */
            public Builder clearCommandExecutableJSON() {
                bitField0_ = (bitField0_ & ~0x00000008);
                commandExecutableJSON_ = getDefaultInstance().getCommandExecutableJSON();
                onChanged();
                return this;
            }
            /**
             * <code>required string commandExecutableJSON = 4;</code>
             */
            public Builder setCommandExecutableJSONBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                commandExecutableJSON_ = value;
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


            // @@protoc_insertion_point(builder_scope:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.CommandMessage)
        }

        // @@protoc_insertion_point(class_scope:com.example.minervascoutingsubsystemandroid.communications.tcp.proto.CommandMessage)
        private static final com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage();
        }

        public static com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<CommandMessage>
                PARSER = new com.google.protobuf.AbstractParser<CommandMessage>() {
            @java.lang.Override
            public CommandMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CommandMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CommandMessage> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CommandMessage> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication.CommandMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_LogMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_LogMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_DeviceID_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_DeviceID_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_CommandMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_CommandMessage_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\010my.proto\022Dcom.example.minervascoutings" +
                        "ubsystemandroid.communications.tcp.proto" +
                        "\"\203\003\n\nLogMessage\022h\n\005level\030\001 \002(\0162Y.com.exa" +
                        "mple.minervascoutingsubsystemandroid.com" +
                        "munications.tcp.proto.LogMessage.LogLeve" +
                        "l\022\017\n\007message\030\002 \002(\t\022^\n\006sender\030\003 \002(\0132N.com" +
                        ".example.minervascoutingsubsystemandroid" +
                        ".communications.tcp.proto.DeviceID\022a\n\tre" +
                        "cipient\030\004 \002(\0132N.com.example.minervascout" +
                        "ingsubsystemandroid.communications.tcp.p" +
                        "roto.DeviceID\"7\n\010LogLevel\022\t\n\005debug\020\001\022\010\n\004" +
                        "info\020\002\022\013\n\007warning\020\003\022\t\n\005error\020\004\"\347\001\n\010Devic" +
                        "eID\022\022\n\ndeviceName\030\001 \002(\t\022\022\n\ndeviceUUID\030\002 " +
                        "\002(\t\022m\n\ndeviceType\030\003 \002(\0162Y.com.example.mi" +
                        "nervascoutingsubsystemandroid.communicat" +
                        "ions.tcp.proto.DeviceID.DeviceType\"D\n\nDe" +
                        "viceType\022\n\n\006TABLET\020\001\022\t\n\005PHONE\020\002\022\013\n\007BROWS" +
                        "ER\020\003\022\007\n\003HUB\020\004\022\t\n\005OTHER\020\005\"\207\002\n\016CommandMess" +
                        "age\022\023\n\013messageDesc\030\001 \002(\t\022^\n\006sender\030\002 \002(\013" +
                        "2N.com.example.minervascoutingsubsystema" +
                        "ndroid.communications.tcp.proto.DeviceID" +
                        "\022a\n\trecipient\030\003 \002(\0132N.com.example.minerv" +
                        "ascoutingsubsystemandroid.communications" +
                        ".tcp.proto.DeviceID\022\035\n\025commandExecutable" +
                        "JSON\030\004 \002(\tB\022B\020TcpCommunication"
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
        internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_LogMessage_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_LogMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_LogMessage_descriptor,
                new java.lang.String[] { "Level", "Message", "Sender", "Recipient", });
        internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_DeviceID_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_DeviceID_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_DeviceID_descriptor,
                new java.lang.String[] { "DeviceName", "DeviceUUID", "DeviceType", });
        internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_CommandMessage_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_CommandMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_example_minervascoutingsubsystemandroid_communications_tcp_proto_CommandMessage_descriptor,
                new java.lang.String[] { "MessageDesc", "Sender", "Recipient", "CommandExecutableJSON", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
