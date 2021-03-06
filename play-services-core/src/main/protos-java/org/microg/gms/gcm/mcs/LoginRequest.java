// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/mcs.proto
package org.microg.gms.gcm.mcs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;
import static com.squareup.wire.Message.Label.REQUIRED;

/**
 * TAG: 2
 */
public final class LoginRequest extends Message {

  public static final String DEFAULT_ID = "";
  public static final String DEFAULT_DOMAIN = "";
  public static final String DEFAULT_USER = "";
  public static final String DEFAULT_RESOURCE = "";
  public static final String DEFAULT_AUTH_TOKEN = "";
  public static final String DEFAULT_DEVICE_ID = "";
  public static final Long DEFAULT_LAST_RMQ_ID = 0L;
  public static final List<Setting> DEFAULT_SETTING = Collections.emptyList();
  public static final List<String> DEFAULT_RECEIVED_PERSISTENT_ID = Collections.emptyList();
  public static final Boolean DEFAULT_ADAPTIVE_HEARTBEAT = false;
  public static final Boolean DEFAULT_USE_RMQ2 = false;
  public static final Long DEFAULT_ACCOUNT_ID = 0L;
  public static final AuthService DEFAULT_AUTH_SERVICE = AuthService.ANDROID_ID;
  public static final Integer DEFAULT_NETWORK_TYPE = 0;
  public static final Long DEFAULT_STATUS = 0L;

  @ProtoField(tag = 1, type = STRING, label = REQUIRED)
  public final String id;

  /**
   * Must be present ( proto required ), may be empty
   * string.
   * mcs.android.com.
   */
  @ProtoField(tag = 2, type = STRING, label = REQUIRED)
  public final String domain;

  /**
   * Decimal android ID
   */
  @ProtoField(tag = 3, type = STRING, label = REQUIRED)
  public final String user;

  @ProtoField(tag = 4, type = STRING, label = REQUIRED)
  public final String resource;

  /**
   * Secret
   */
  @ProtoField(tag = 5, type = STRING, label = REQUIRED)
  public final String auth_token;

  /**
   * Format is: android-HEX_DEVICE_ID
   * The user is the decimal value.
   */
  @ProtoField(tag = 6, type = STRING)
  public final String device_id;

  /**
   * RMQ1 - no longer used
   */
  @ProtoField(tag = 7, type = INT64)
  public final Long last_rmq_id;

  @ProtoField(tag = 8, label = REPEATED, messageType = Setting.class)
  public final List<Setting> setting;

  /**
   * optional int32 compress = 9;
   */
  @ProtoField(tag = 10, type = STRING, label = REPEATED)
  public final List<String> received_persistent_id;

  /**
   * Replaced by "rmq2v" setting
   * optional bool include_stream_ids = 11;
   */
  @ProtoField(tag = 12, type = BOOL)
  public final Boolean adaptive_heartbeat;

  @ProtoField(tag = 13)
  public final HeartbeatStat heartbeat_stat;

  /**
   * Must be true.
   */
  @ProtoField(tag = 14, type = BOOL)
  public final Boolean use_rmq2;

  @ProtoField(tag = 15, type = INT64)
  public final Long account_id;

  /**
   * ANDROID_ID = 2
   */
  @ProtoField(tag = 16, type = ENUM)
  public final AuthService auth_service;

  @ProtoField(tag = 17, type = INT32)
  public final Integer network_type;

  @ProtoField(tag = 18, type = INT64)
  public final Long status;

  public LoginRequest(String id, String domain, String user, String resource, String auth_token, String device_id, Long last_rmq_id, List<Setting> setting, List<String> received_persistent_id, Boolean adaptive_heartbeat, HeartbeatStat heartbeat_stat, Boolean use_rmq2, Long account_id, AuthService auth_service, Integer network_type, Long status) {
    this.id = id;
    this.domain = domain;
    this.user = user;
    this.resource = resource;
    this.auth_token = auth_token;
    this.device_id = device_id;
    this.last_rmq_id = last_rmq_id;
    this.setting = immutableCopyOf(setting);
    this.received_persistent_id = immutableCopyOf(received_persistent_id);
    this.adaptive_heartbeat = adaptive_heartbeat;
    this.heartbeat_stat = heartbeat_stat;
    this.use_rmq2 = use_rmq2;
    this.account_id = account_id;
    this.auth_service = auth_service;
    this.network_type = network_type;
    this.status = status;
  }

  private LoginRequest(Builder builder) {
    this(builder.id, builder.domain, builder.user, builder.resource, builder.auth_token, builder.device_id, builder.last_rmq_id, builder.setting, builder.received_persistent_id, builder.adaptive_heartbeat, builder.heartbeat_stat, builder.use_rmq2, builder.account_id, builder.auth_service, builder.network_type, builder.status);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LoginRequest)) return false;
    LoginRequest o = (LoginRequest) other;
    return equals(id, o.id)
        && equals(domain, o.domain)
        && equals(user, o.user)
        && equals(resource, o.resource)
        && equals(auth_token, o.auth_token)
        && equals(device_id, o.device_id)
        && equals(last_rmq_id, o.last_rmq_id)
        && equals(setting, o.setting)
        && equals(received_persistent_id, o.received_persistent_id)
        && equals(adaptive_heartbeat, o.adaptive_heartbeat)
        && equals(heartbeat_stat, o.heartbeat_stat)
        && equals(use_rmq2, o.use_rmq2)
        && equals(account_id, o.account_id)
        && equals(auth_service, o.auth_service)
        && equals(network_type, o.network_type)
        && equals(status, o.status);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = id != null ? id.hashCode() : 0;
      result = result * 37 + (domain != null ? domain.hashCode() : 0);
      result = result * 37 + (user != null ? user.hashCode() : 0);
      result = result * 37 + (resource != null ? resource.hashCode() : 0);
      result = result * 37 + (auth_token != null ? auth_token.hashCode() : 0);
      result = result * 37 + (device_id != null ? device_id.hashCode() : 0);
      result = result * 37 + (last_rmq_id != null ? last_rmq_id.hashCode() : 0);
      result = result * 37 + (setting != null ? setting.hashCode() : 1);
      result = result * 37 + (received_persistent_id != null ? received_persistent_id.hashCode() : 1);
      result = result * 37 + (adaptive_heartbeat != null ? adaptive_heartbeat.hashCode() : 0);
      result = result * 37 + (heartbeat_stat != null ? heartbeat_stat.hashCode() : 0);
      result = result * 37 + (use_rmq2 != null ? use_rmq2.hashCode() : 0);
      result = result * 37 + (account_id != null ? account_id.hashCode() : 0);
      result = result * 37 + (auth_service != null ? auth_service.hashCode() : 0);
      result = result * 37 + (network_type != null ? network_type.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<LoginRequest> {

    public String id;
    public String domain;
    public String user;
    public String resource;
    public String auth_token;
    public String device_id;
    public Long last_rmq_id;
    public List<Setting> setting;
    public List<String> received_persistent_id;
    public Boolean adaptive_heartbeat;
    public HeartbeatStat heartbeat_stat;
    public Boolean use_rmq2;
    public Long account_id;
    public AuthService auth_service;
    public Integer network_type;
    public Long status;

    public Builder() {
    }

    public Builder(LoginRequest message) {
      super(message);
      if (message == null) return;
      this.id = message.id;
      this.domain = message.domain;
      this.user = message.user;
      this.resource = message.resource;
      this.auth_token = message.auth_token;
      this.device_id = message.device_id;
      this.last_rmq_id = message.last_rmq_id;
      this.setting = copyOf(message.setting);
      this.received_persistent_id = copyOf(message.received_persistent_id);
      this.adaptive_heartbeat = message.adaptive_heartbeat;
      this.heartbeat_stat = message.heartbeat_stat;
      this.use_rmq2 = message.use_rmq2;
      this.account_id = message.account_id;
      this.auth_service = message.auth_service;
      this.network_type = message.network_type;
      this.status = message.status;
    }

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Must be present ( proto required ), may be empty
     * string.
     * mcs.android.com.
     */
    public Builder domain(String domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Decimal android ID
     */
    public Builder user(String user) {
      this.user = user;
      return this;
    }

    public Builder resource(String resource) {
      this.resource = resource;
      return this;
    }

    /**
     * Secret
     */
    public Builder auth_token(String auth_token) {
      this.auth_token = auth_token;
      return this;
    }

    /**
     * Format is: android-HEX_DEVICE_ID
     * The user is the decimal value.
     */
    public Builder device_id(String device_id) {
      this.device_id = device_id;
      return this;
    }

    /**
     * RMQ1 - no longer used
     */
    public Builder last_rmq_id(Long last_rmq_id) {
      this.last_rmq_id = last_rmq_id;
      return this;
    }

    public Builder setting(List<Setting> setting) {
      this.setting = checkForNulls(setting);
      return this;
    }

    /**
     * optional int32 compress = 9;
     */
    public Builder received_persistent_id(List<String> received_persistent_id) {
      this.received_persistent_id = checkForNulls(received_persistent_id);
      return this;
    }

    /**
     * Replaced by "rmq2v" setting
     * optional bool include_stream_ids = 11;
     */
    public Builder adaptive_heartbeat(Boolean adaptive_heartbeat) {
      this.adaptive_heartbeat = adaptive_heartbeat;
      return this;
    }

    public Builder heartbeat_stat(HeartbeatStat heartbeat_stat) {
      this.heartbeat_stat = heartbeat_stat;
      return this;
    }

    /**
     * Must be true.
     */
    public Builder use_rmq2(Boolean use_rmq2) {
      this.use_rmq2 = use_rmq2;
      return this;
    }

    public Builder account_id(Long account_id) {
      this.account_id = account_id;
      return this;
    }

    /**
     * ANDROID_ID = 2
     */
    public Builder auth_service(AuthService auth_service) {
      this.auth_service = auth_service;
      return this;
    }

    public Builder network_type(Integer network_type) {
      this.network_type = network_type;
      return this;
    }

    public Builder status(Long status) {
      this.status = status;
      return this;
    }

    @Override
    public LoginRequest build() {
      checkRequiredFields();
      return new LoginRequest(this);
    }
  }

  public enum AuthService
      implements ProtoEnum {
    ANDROID_ID(2);

    private final int value;

    private AuthService(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
