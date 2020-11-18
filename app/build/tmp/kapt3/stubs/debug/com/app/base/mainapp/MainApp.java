package com.app.base.mainapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/app/base/mainapp/MainApp;", "Landroid/app/Application;", "()V", "appLanguage", "Landroidx/lifecycle/MutableLiveData;", "", "getAppLanguage", "()Landroidx/lifecycle/MutableLiveData;", "deviceToken", "getDeviceToken", "()Ljava/lang/String;", "setDeviceToken", "(Ljava/lang/String;)V", "profileUpdated", "", "getProfileUpdated", "refreshFamilyMember", "getRefreshFamilyMember", "onCreate", "", "Companion", "app_debug"})
public final class MainApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> appLanguage = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String deviceToken;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> profileUpdated = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> refreshFamilyMember = null;
    private static com.app.base.mainapp.MainApp instance;
    public static final com.app.base.mainapp.MainApp.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAppLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceToken() {
        return null;
    }
    
    public final void setDeviceToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProfileUpdated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRefreshFamilyMember() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public MainApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/app/base/mainapp/MainApp$Companion;", "", "()V", "instance", "Lcom/app/base/mainapp/MainApp;", "applicationContext", "Landroid/content/Context;", "setLocale", "", "locale", "Ljava/util/Locale;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context applicationContext() {
            return null;
        }
        
        public final void setLocale(@org.jetbrains.annotations.NotNull()
        java.util.Locale locale) {
        }
        
        private Companion() {
            super();
        }
    }
}