package com.app.base.mainapp.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014R$\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/app/base/mainapp/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "outcomeLiveData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/app/base/mainapp/domain/usecases/base/Outcome;", "getOutcomeLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "setOutcomeLiveData", "(Landroidx/lifecycle/MediatorLiveData;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "onCleared", "", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MediatorLiveData<com.app.base.mainapp.domain.usecases.base.Outcome<?>> outcomeLiveData;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.app.base.mainapp.domain.usecases.base.Outcome<?>> getOutcomeLiveData() {
        return null;
    }
    
    public final void setOutcomeLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MediatorLiveData<com.app.base.mainapp.domain.usecases.base.Outcome<?>> p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}