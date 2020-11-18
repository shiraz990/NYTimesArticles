package com.app.base.mainapp.utils.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\fJ\u0016\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0001J\u001c\u0010\u001e\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001fJ\u0016\u0010 \u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/app/base/mainapp/utils/preferences/PreferencesDataSource;", "", "()V", "context", "Landroid/content/Context;", "crypto", "Lcom/yakivmospan/scytale/Crypto;", "mPref", "Landroid/content/SharedPreferences;", "store", "Lcom/yakivmospan/scytale/Store;", "checkObject", "", "key", "", "getBoolean", "field", "getDouble", "", "(Ljava/lang/String;)Ljava/lang/Double;", "getObject", "model", "Lkotlin/reflect/KClass;", "getString", "putBoolean", "", "data", "putInt", "", "putObject", "putObjectsList", "", "putString", "Keys", "app_debug"})
public final class PreferencesDataSource {
    private final android.content.Context context = null;
    private final android.content.SharedPreferences mPref = null;
    private final com.yakivmospan.scytale.Store store = null;
    private com.yakivmospan.scytale.Crypto crypto;
    
    public final void putInt(@org.jetbrains.annotations.NotNull()
    java.lang.String field, int data) {
    }
    
    public final void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String field, @org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDouble(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return null;
    }
    
    public final void putObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Object data) {
    }
    
    public final void putObjectsList(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<?> model) {
        return null;
    }
    
    public final boolean checkObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public final void putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String field, boolean data) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return false;
    }
    
    public PreferencesDataSource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/app/base/mainapp/utils/preferences/PreferencesDataSource$Keys;", "", "()V", "APP_LOCALE", "", "DEVICE_TOKEN", "EDIT_PROFILE_DONE", "FORMATTED_MSIDN", "FORMATTED_MSIDN_OTHER_PEOPLE", "FROM_GALLERY", "FROM_PASSPORT", "ISREGISTEREDWITHDOHPROFILE", "MSIDN", "MSIDN_OTHER_PEOPLE", "NATIONALITIES", "OPENF_BACK_CAMERA_FROM_DETAIL", "OPENF_FRONT_CAMERA_FROM_DETAIL", "OTP", "OTP_OTHER_PEOPLE", "PRFILE_OBJECT", "REGISTRATION_DONE", "REGISTRATION_OBJECT", "REGISTRATION_REQUEST_PREFS", "SELF_ASSESMENT_DONE", "USER_ID", "USER_TOKEN", "app_debug"})
    public static final class Keys {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REGISTRATION_DONE = "registration_done";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SELF_ASSESMENT_DONE = "sel_assesment_done";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EDIT_PROFILE_DONE = "sel_assesment_done";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEVICE_TOKEN = "device_token";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_TOKEN = "user_token";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String OPENF_FRONT_CAMERA_FROM_DETAIL = "opencamfrontfromdetail";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String OPENF_BACK_CAMERA_FROM_DETAIL = "opencambackfromdetail";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NATIONALITIES = "app_countries";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REGISTRATION_OBJECT = "registrationObj";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FROM_GALLERY = "from_gallery";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FROM_PASSPORT = "from_passport";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REGISTRATION_REQUEST_PREFS = "registrationRequest";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MSIDN = "msidn";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FORMATTED_MSIDN = "formatted_msidn";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ISREGISTEREDWITHDOHPROFILE = "isRegisteredWithDohProfile";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_ID = "userId";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String OTP = "OTP";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PRFILE_OBJECT = "userProfileObject";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String APP_LOCALE = "app_locale";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MSIDN_OTHER_PEOPLE = "msidn_other_people";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FORMATTED_MSIDN_OTHER_PEOPLE = "formatted_msidn_other_people";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String OTP_OTHER_PEOPLE = "OTP_other_people";
        public static final com.app.base.mainapp.utils.preferences.PreferencesDataSource.Keys INSTANCE = null;
        
        private Keys() {
            super();
        }
    }
}