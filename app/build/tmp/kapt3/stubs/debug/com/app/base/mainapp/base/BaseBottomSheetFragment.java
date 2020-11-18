package com.app.base.mainapp.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/app/base/mainapp/base/BaseBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "baseViewModel", "Lcom/app/base/mainapp/base/BaseViewModel;", "applyTextWatcher", "", "view", "Landroidx/appcompat/widget/AppCompatEditText;", "function", "Lkotlin/Function0;", "getViewModel", "onViewCreated", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseBottomSheetFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.app.base.mainapp.base.BaseViewModel baseViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void applyTextWatcher(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText view, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> function) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.app.base.mainapp.base.BaseViewModel getViewModel();
    
    public BaseBottomSheetFragment() {
        super();
    }
}