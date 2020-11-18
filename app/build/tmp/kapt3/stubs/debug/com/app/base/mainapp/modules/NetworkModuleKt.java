package com.app.base.mainapp.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e\u001a\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0012"}, d2 = {"NetworkModule", "Lorg/koin/core/module/Module;", "getNetworkModule", "()Lorg/koin/core/module/Module;", "createApiErrorHandle", "Lcom/app/base/mainapp/data/source/remote/ApiErrorHandle;", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "sharedPrefDataSource", "Lcom/app/base/mainapp/utils/preferences/PreferencesDataSource;", "createRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "url", "", "createService", "Lcom/app/base/mainapp/data/source/remote/ApiInterface;", "retrofit", "app_debug"})
public final class NetworkModuleKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module NetworkModule = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getNetworkModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient createOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.utils.preferences.PreferencesDataSource sharedPrefDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Retrofit createRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.app.base.mainapp.data.source.remote.ApiInterface createService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.app.base.mainapp.data.source.remote.ApiErrorHandle createApiErrorHandle() {
        return null;
    }
}