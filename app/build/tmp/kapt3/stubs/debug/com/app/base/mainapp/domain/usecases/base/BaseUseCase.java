package com.app.base.mainapp.domain.usecases.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0006\b\u0001\u0010\u0003 \u00002\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J=\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u0010J-\u0010\u0007\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00018\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u00028\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00018\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/base/BaseUseCase;", "Response", "", "Params", "apiErrorHandle", "Lcom/app/base/mainapp/data/source/remote/ApiErrorHandle;", "(Lcom/app/base/mainapp/data/source/remote/ApiErrorHandle;)V", "invoke", "Landroidx/lifecycle/MutableLiveData;", "Lcom/app/base/mainapp/domain/usecases/base/Outcome;", "showLoader", "", "showApiError", "scope", "Lkotlinx/coroutines/CoroutineScope;", "params", "(ZZLkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "", "onResult", "Lcom/app/base/mainapp/domain/usecases/base/UseCaseResponse;", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;Lcom/app/base/mainapp/domain/usecases/base/UseCaseResponse;)V", "run", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class BaseUseCase<Response extends java.lang.Object, Params extends java.lang.Object> {
    private final com.app.base.mainapp.data.source.remote.ApiErrorHandle apiErrorHandle = null;
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object run(@org.jetbrains.annotations.Nullable()
    Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super Response> p1);
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<com.app.base.mainapp.domain.usecases.base.Outcome<Response>> invoke(boolean showLoader, boolean showApiError, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, Params params) {
        return null;
    }
    
    public void invoke(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.Nullable()
    Params params, @org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.domain.usecases.base.UseCaseResponse<Response> onResult) {
    }
    
    public BaseUseCase(@org.jetbrains.annotations.Nullable()
    com.app.base.mainapp.data.source.remote.ApiErrorHandle apiErrorHandle) {
        super();
    }
    
    public BaseUseCase() {
        super();
    }
}