package com.app.base.mainapp.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u000eJ\u0006\u0010\u001c\u001a\u00020\u000eJ\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u0018\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/app/base/mainapp/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/app/base/mainapp/databinding/ActivityBaseBinding;", "preferencesDataSource", "Lcom/app/base/mainapp/utils/preferences/PreferencesDataSource;", "getPreferencesDataSource", "()Lcom/app/base/mainapp/utils/preferences/PreferencesDataSource;", "preferencesDataSource$delegate", "Lkotlin/Lazy;", "progress", "Lcom/kaopiz/kprogresshud/KProgressHUD;", "applyOverrideConfiguration", "", "overrideConfiguration", "Landroid/content/res/Configuration;", "attachBaseContext", "newBase", "Landroid/content/Context;", "hideProgress", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setLocale", "locale", "Ljava/util/Locale;", "showProgress", "showProgressWithTransparentBackground", "updateBaseContextLocale", "context", "updateResourcesLocale", "updateResourcesLocaleLegacy", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy preferencesDataSource$delegate = null;
    private com.app.base.mainapp.databinding.ActivityBaseBinding binding;
    private com.kaopiz.kprogresshud.KProgressHUD progress;
    private java.util.HashMap _$_findViewCache;
    
    private final com.app.base.mainapp.utils.preferences.PreferencesDataSource getPreferencesDataSource() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
    }
    
    private final android.content.Context updateBaseContextLocale(android.content.Context context) {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    private final android.content.Context updateResourcesLocale(android.content.Context context, java.util.Locale locale) {
        return null;
    }
    
    private final android.content.Context updateResourcesLocaleLegacy(android.content.Context context, java.util.Locale locale) {
        return null;
    }
    
    @java.lang.Override()
    public void applyOverrideConfiguration(@org.jetbrains.annotations.Nullable()
    android.content.res.Configuration overrideConfiguration) {
    }
    
    public final void setLocale(@org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
    }
    
    public final void showProgress() {
    }
    
    public final void hideProgress() {
    }
    
    public final void showProgressWithTransparentBackground() {
    }
    
    public BaseActivity() {
        super();
    }
}