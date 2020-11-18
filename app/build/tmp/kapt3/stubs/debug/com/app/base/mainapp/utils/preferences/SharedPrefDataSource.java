package com.app.base.mainapp.utils.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\u0006J\u0018\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006J\u001e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J\u0010\u0010\u001b\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006J\u0010\u0010\u001e\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0014J!\u0010 \u001a\u00020\u0016*\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#H\u0082\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006&"}, d2 = {"Lcom/app/base/mainapp/utils/preferences/SharedPrefDataSource;", "", "()V", "MODE", "", "NAME", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getAppLanguage", "getCacheValue", "mContext", "CacheKeyTitle", "getDeviceFcmToken", "getFrontImageSaved", "getMsisdn", "getToken", "isFirstRun", "", "removeCacheValue", "", "saveAppLanguage", "data", "saveCacheValue", "cacheValue", "saveDeviceFcmToken", "saveFrontImage", "saveMsisdn", "saveToken", "setFirstRun", "edit", "Landroid/content/SharedPreferences;", "operation", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Keys", "app_debug"})
public final class SharedPrefDataSource {
    private final java.lang.String NAME = "COVID-MOH";
    private final int MODE = android.content.Context.MODE_PRIVATE;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void saveToken(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceFcmToken() {
        return null;
    }
    
    public final void saveDeviceFcmToken(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppLanguage() {
        return null;
    }
    
    public final void saveAppLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    public final boolean isFirstRun() {
        return false;
    }
    
    public final void setFirstRun(boolean data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMsisdn() {
        return null;
    }
    
    public final void saveMsisdn(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrontImageSaved() {
        return null;
    }
    
    public final void saveFrontImage(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    /**
     * SharedPreferences extension function, so we won't need to call edit() and apply()
     * ourselves on every SharedPreferences operation.
     */
    private final void edit(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$edit, kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> operation) {
    }
    
    /**
     * @param mContext      Application Base Context.
     * @param CacheKeyTitle Title of key.
     * @param cacheValue
     * In this function save shared preferences Value.
     */
    public final void saveCacheValue(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String CacheKeyTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String cacheValue) {
    }
    
    /**
     * @param mContext      Application Base Context.
     * @param CacheKeyTitle
     * In this function get shared preferences Value.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCacheValue(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String CacheKeyTitle) {
        return null;
    }
    
    /**
     * @param mContext      Application Base Context
     * @param CacheKeyTitle
     * In this function remove shared preferences Value.
     */
    public final void removeCacheValue(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String CacheKeyTitle) {
    }
    
    public SharedPrefDataSource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/app/base/mainapp/utils/preferences/SharedPrefDataSource$Keys;", "", "()V", "APP_LANGUAGE", "", "FCM_DEVICE_TOKEN", "FIRST_RUN", "FRONT_IMAGE", "MSISDN", "USER_APP_TOKEN", "USER_EMIRATES_INFORMATION", "app_debug"})
    public static final class Keys {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String APP_LANGUAGE = "covid_app_language";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FCM_DEVICE_TOKEN = "covid_fcm_device_token";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_APP_TOKEN = "covid_user_app_token";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FIRST_RUN = "covid_first_run";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_EMIRATES_INFORMATION = "covid_user_emirates_information";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MSISDN = "covid_msisdn";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FRONT_IMAGE = "covid_frontimage";
        public static final com.app.base.mainapp.utils.preferences.SharedPrefDataSource.Keys INSTANCE = null;
        
        private Keys() {
            super();
        }
    }
}