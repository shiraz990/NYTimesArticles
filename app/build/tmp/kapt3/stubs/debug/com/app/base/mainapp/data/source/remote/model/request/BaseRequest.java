package com.app.base.mainapp.data.source.remote.model.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010%\u001a\u00020&2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR \u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR \u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\t\u00a8\u0006\'"}, d2 = {"Lcom/app/base/mainapp/data/source/remote/model/request/BaseRequest;", "", "baseRequest", "(Lcom/app/base/mainapp/data/source/remote/model/request/BaseRequest;)V", "buildNumber", "", "getBuildNumber", "()Ljava/lang/String;", "setBuildNumber", "(Ljava/lang/String;)V", "deviceId", "getDeviceId", "setDeviceId", "fcmToken", "getFcmToken", "setFcmToken", "lang", "getLang", "setLang", "msisdn", "getMsisdn", "setMsisdn", "osType", "getOsType", "setOsType", "osVersion", "getOsVersion", "setOsVersion", "transactionId", "getTransactionId", "setTransactionId", "userId", "getUserId", "setUserId", "userToken", "getUserToken", "setUserToken", "setBaseRequest", "", "app_debug"})
public class BaseRequest {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "userId")
    private java.lang.String userId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "userToken")
    private java.lang.String userToken;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "lang")
    private java.lang.String lang;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "buildNumber")
    private java.lang.String buildNumber;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "osVersion")
    private java.lang.String osVersion;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "osType")
    private java.lang.String osType;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "deviceId")
    private java.lang.String deviceId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "msisdn")
    private java.lang.String msisdn;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "transactionId")
    private java.lang.String transactionId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "fcmToken")
    private java.lang.String fcmToken;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserToken() {
        return null;
    }
    
    public final void setUserToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBuildNumber() {
        return null;
    }
    
    public final void setBuildNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOsVersion() {
        return null;
    }
    
    public final void setOsVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOsType() {
        return null;
    }
    
    public final void setOsType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceId() {
        return null;
    }
    
    public final void setDeviceId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMsisdn() {
        return null;
    }
    
    public final void setMsisdn(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTransactionId() {
        return null;
    }
    
    public final void setTransactionId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFcmToken() {
        return null;
    }
    
    public final void setFcmToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void setBaseRequest(@org.jetbrains.annotations.Nullable()
    com.app.base.mainapp.data.source.remote.model.request.BaseRequest baseRequest) {
    }
    
    public BaseRequest(@org.jetbrains.annotations.Nullable()
    com.app.base.mainapp.data.source.remote.model.request.BaseRequest baseRequest) {
        super();
    }
}