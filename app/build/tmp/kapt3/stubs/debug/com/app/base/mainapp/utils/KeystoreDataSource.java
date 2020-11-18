package com.app.base.mainapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/app/base/mainapp/utils/KeystoreDataSource;", "", "()V", "alias", "", "getAlias", "()Ljava/lang/String;", "context", "Landroid/content/Context;", "crypto", "Lcom/yakivmospan/scytale/Crypto;", "getCrypto", "()Lcom/yakivmospan/scytale/Crypto;", "setCrypto", "(Lcom/yakivmospan/scytale/Crypto;)V", "keysize", "", "getKeysize", "()I", "password", "", "getPassword", "()[C", "store", "Lcom/yakivmospan/scytale/Store;", "getString", "key", "hasKey", "", "putString", "", "value", "Keys", "app_debug"})
public final class KeystoreDataSource {
    private final android.content.Context context = null;
    private com.yakivmospan.scytale.Store store;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String alias = "alias";
    @org.jetbrains.annotations.NotNull()
    private final char[] password = null;
    private final int keysize = 512;
    @org.jetbrains.annotations.NotNull()
    private com.yakivmospan.scytale.Crypto crypto;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlias() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final char[] getPassword() {
        return null;
    }
    
    public final int getKeysize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yakivmospan.scytale.Crypto getCrypto() {
        return null;
    }
    
    public final void setCrypto(@org.jetbrains.annotations.NotNull()
    com.yakivmospan.scytale.Crypto p0) {
    }
    
    public final boolean hasKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public final void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public KeystoreDataSource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/app/base/mainapp/utils/KeystoreDataSource$Keys;", "", "()V", "APP_LOCALE", "", "DEVICE_TOKEN", "FORMATTED_MSIDN", "FROM_GALLERY", "ISREGISTEREDWITHDOHPROFILE", "MSIDN", "NATIONALITIES", "OPENF_BACK_CAMERA_FROM_DETAIL", "OPENF_FRONT_CAMERA_FROM_DETAIL", "PRFILE_OBJECT", "REGISTRATION_DONE", "REGISTRATION_OBJECT", "REGISTRATION_REQUEST_PREFS", "SELF_ASSESMENT_DONE", "USER_ID", "app_debug"})
    public static final class Keys {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REGISTRATION_DONE = "registration_done";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SELF_ASSESMENT_DONE = "sel_assesment_done";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEVICE_TOKEN = "device_token";
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
        public static final java.lang.String PRFILE_OBJECT = "userProfileObject";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String APP_LOCALE = "app_locale";
        public static final com.app.base.mainapp.utils.KeystoreDataSource.Keys INSTANCE = null;
        
        private Keys() {
            super();
        }
    }
}