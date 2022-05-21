package io.appaxion.init.ApiClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ClsLoginParams implements Serializable {

    private String apiKey;
    private String method;
    private Integer sessionTimeout;
    private String password;
    private String oneSignalId;
    private Boolean appLogin;
    private String direction;
    private String userAgent;
    private String userIp;
    private String clientType;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOneSignalId() {
        return oneSignalId;
    }

    public void setOneSignalId(String oneSignalId) {
        this.oneSignalId = oneSignalId;
    }

    public Boolean getAppLogin() {
        return appLogin;
    }

    public void setAppLogin(Boolean appLogin) {
        this.appLogin = appLogin;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    @SerializedName("RESULT")
    @Expose
    private String result;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("userUniqueId")
    @Expose
    private String userUniqueId;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("profilePicture")
    @Expose
    private Object profilePicture;
    @SerializedName("userLevel")
    @Expose
    private String userLevel;
    @SerializedName("accountNumber")
    @Expose
    private String accountNumber;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("advancedAnalytics")
    @Expose
    private Boolean advancedAnalytics;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("defaultFax")
    @Expose
    private Object defaultFax;
    @SerializedName("defaultNumber")
    @Expose
    private Object defaultNumber;
    @SerializedName("defaultMessagingNumber")
    @Expose
    private String defaultMessagingNumber;
    @SerializedName("defaultExtension")
    @Expose
    private Object defaultExtension;
    @SerializedName("defaultExtensionUuid")
    @Expose
    private Object defaultExtensionUuid;
    @SerializedName("defaultWeb")
    @Expose
    private String defaultWeb;
    @SerializedName("defaultDomain")
    @Expose
    private Object defaultDomain;
    @SerializedName("defaultTab")
    @Expose
    private String defaultTab;
    @SerializedName("sbcUser")
    @Expose
    private String sbcUser;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("2FA")
    @Expose
    private Boolean _2fa;
    @SerializedName("2FAMethod")
    @Expose
    private String _2FAMethod;
    @SerializedName("2FANumber")
    @Expose
    private Object _2FANumber;
    @SerializedName("2FAEmail")
    @Expose
    private String _2FAEmail;
    @SerializedName("2FADelivery")
    @Expose
    private String _2FADelivery;
    @SerializedName("2FAAuthenticatorAllowed")
    @Expose
    private String _2FAAuthenticatorAllowed;
    @SerializedName("2FAAllowTrusted")
    @Expose
    private Boolean _2FAAllowTrusted;
    @SerializedName("termsAccepted")
    @Expose
    private Boolean termsAccepted;
    @SerializedName("sessionToken")
    @Expose
    private String sessionToken;
    @SerializedName("wsToken")
    @Expose
    private String wsToken;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserUniqueId() {
        return userUniqueId;
    }

    public void setUserUniqueId(String userUniqueId) {
        this.userUniqueId = userUniqueId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Object getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Object profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Boolean getAdvancedAnalytics() {
        return advancedAnalytics;
    }

    public void setAdvancedAnalytics(Boolean advancedAnalytics) {
        this.advancedAnalytics = advancedAnalytics;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getDefaultFax() {
        return defaultFax;
    }

    public void setDefaultFax(Object defaultFax) {
        this.defaultFax = defaultFax;
    }

    public Object getDefaultNumber() {
        return defaultNumber;
    }

    public void setDefaultNumber(Object defaultNumber) {
        this.defaultNumber = defaultNumber;
    }

    public String getDefaultMessagingNumber() {
        return defaultMessagingNumber;
    }

    public void setDefaultMessagingNumber(String defaultMessagingNumber) {
        this.defaultMessagingNumber = defaultMessagingNumber;
    }

    public Object getDefaultExtension() {
        return defaultExtension;
    }

    public void setDefaultExtension(Object defaultExtension) {
        this.defaultExtension = defaultExtension;
    }

    public Object getDefaultExtensionUuid() {
        return defaultExtensionUuid;
    }

    public void setDefaultExtensionUuid(Object defaultExtensionUuid) {
        this.defaultExtensionUuid = defaultExtensionUuid;
    }

    public String getDefaultWeb() {
        return defaultWeb;
    }

    public void setDefaultWeb(String defaultWeb) {
        this.defaultWeb = defaultWeb;
    }

    public Object getDefaultDomain() {
        return defaultDomain;
    }

    public void setDefaultDomain(Object defaultDomain) {
        this.defaultDomain = defaultDomain;
    }

    public String getDefaultTab() {
        return defaultTab;
    }

    public void setDefaultTab(String defaultTab) {
        this.defaultTab = defaultTab;
    }

    public String getSbcUser() {
        return sbcUser;
    }

    public void setSbcUser(String sbcUser) {
        this.sbcUser = sbcUser;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Boolean get2fa() {
        return _2fa;
    }

    public void set2fa(Boolean _2fa) {
        this._2fa = _2fa;
    }

    public String get2FAMethod() {
        return _2FAMethod;
    }

    public void set2FAMethod(String _2FAMethod) {
        this._2FAMethod = _2FAMethod;
    }

    public Object get2FANumber() {
        return _2FANumber;
    }

    public void set2FANumber(Object _2FANumber) {
        this._2FANumber = _2FANumber;
    }

    public String get2FAEmail() {
        return _2FAEmail;
    }

    public void set2FAEmail(String _2FAEmail) {
        this._2FAEmail = _2FAEmail;
    }

    public String get2FADelivery() {
        return _2FADelivery;
    }

    public void set2FADelivery(String _2FADelivery) {
        this._2FADelivery = _2FADelivery;
    }

    public String get2FAAuthenticatorAllowed() {
        return _2FAAuthenticatorAllowed;
    }

    public void set2FAAuthenticatorAllowed(String _2FAAuthenticatorAllowed) {
        this._2FAAuthenticatorAllowed = _2FAAuthenticatorAllowed;
    }

    public Boolean get2FAAllowTrusted() {
        return _2FAAllowTrusted;
    }

    public void set2FAAllowTrusted(Boolean _2FAAllowTrusted) {
        this._2FAAllowTrusted = _2FAAllowTrusted;
    }

    public Boolean getTermsAccepted() {
        return termsAccepted;
    }

    public void setTermsAccepted(Boolean termsAccepted) {
        this.termsAccepted = termsAccepted;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getWsToken() {
        return wsToken;
    }

    public void setWsToken(String wsToken) {
        this.wsToken = wsToken;
    }


    @SerializedName("ERROR")
    @Expose
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
