package com.app.base.mainapp.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012$\b\u0002\u0010\b\u001a\u001e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u00010\tj\u000e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u0001`\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ%\u0010\"\u001a\u001e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u00010\tj\u000e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u0001`\fH\u00c6\u0003J\\\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u00002$\b\u0002\u0010\b\u001a\u001e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u00010\tj\u000e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u0001`\fH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010(\u001a\u00020\u0004H\u00d6\u0001J\t\u0010)\u001a\u00020\u0006H\u00d6\u0001R\"\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R:\u0010\b\u001a\u001e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u00010\tj\u000e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006*"}, d2 = {"Lcom/app/base/mainapp/data/source/remote/BaseResponse;", "T", "", "responseCode", "", "responseMessage", "", "data", "errors", "Ljava/util/ArrayList;", "Ljava/lang/Error;", "Lkotlin/Error;", "Lkotlin/collections/ArrayList;", "(ILjava/lang/String;Ljava/lang/Object;Ljava/util/ArrayList;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getErrors", "()Ljava/util/ArrayList;", "setErrors", "(Ljava/util/ArrayList;)V", "getResponseCode", "()I", "setResponseCode", "(I)V", "getResponseMessage", "()Ljava/lang/String;", "setResponseMessage", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Object;Ljava/util/ArrayList;)Lcom/app/base/mainapp/data/source/remote/BaseResponse;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class BaseResponse<T extends java.lang.Object> {
    @com.google.gson.annotations.SerializedName(value = "status")
    private int responseCode;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String responseMessage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "data")
    private T data;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "errors")
    private java.util.ArrayList<java.lang.Error> errors;
    
    public final int getResponseCode() {
        return 0;
    }
    
    public final void setResponseCode(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResponseMessage() {
        return null;
    }
    
    public final void setResponseMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Error> getErrors() {
        return null;
    }
    
    public final void setErrors(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Error> p0) {
    }
    
    public BaseResponse(int responseCode, @org.jetbrains.annotations.Nullable()
    java.lang.String responseMessage, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Error> errors) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Error> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.base.mainapp.data.source.remote.BaseResponse<T> copy(int responseCode, @org.jetbrains.annotations.Nullable()
    java.lang.String responseMessage, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Error> errors) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}