package com.app.base.mainapp.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012J\u001c\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012J\u0010\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0004H&J\u0006\u0010\u0019\u001a\u00020\u000eJ\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/app/base/mainapp/base/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "baseViewModel", "Lcom/app/base/mainapp/base/BaseViewModel;", "myHud", "Lcom/kaopiz/kprogresshud/KProgressHUD;", "prefDataSource", "Lcom/app/base/mainapp/utils/preferences/PreferencesDataSource;", "getPrefDataSource", "()Lcom/app/base/mainapp/utils/preferences/PreferencesDataSource;", "prefDataSource$delegate", "Lkotlin/Lazy;", "applyTextViewWatcher", "", "view", "Landroidx/appcompat/widget/AppCompatTextView;", "function", "Lkotlin/Function0;", "applyTextWatcher", "Landroidx/appcompat/widget/AppCompatEditText;", "callBackKeyHandling", "blockExit", "", "getViewModel", "hidePrgress", "onViewCreated", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showProgress", "isCancleable", "app_debug"})
public abstract class BaseDialogFragment extends androidx.fragment.app.DialogFragment {
    private com.app.base.mainapp.base.BaseViewModel baseViewModel;
    private final kotlin.Lazy prefDataSource$delegate = null;
    private com.kaopiz.kprogresshud.KProgressHUD myHud;
    private java.util.HashMap _$_findViewCache;
    
    private final com.app.base.mainapp.utils.preferences.PreferencesDataSource getPrefDataSource() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void applyTextWatcher(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText view, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> function) {
    }
    
    public final void applyTextViewWatcher(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView view, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> function) {
    }
    
    public final void callBackKeyHandling(boolean blockExit) {
    }
    
    public final void showProgress(boolean isCancleable) {
    }
    
    public final void hidePrgress() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.app.base.mainapp.base.BaseViewModel getViewModel();
    
    public BaseDialogFragment() {
        super();
    }
}