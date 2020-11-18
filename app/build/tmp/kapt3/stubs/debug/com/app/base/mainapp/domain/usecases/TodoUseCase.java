package com.app.base.mainapp.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/TodoUseCase;", "Lcom/app/base/mainapp/domain/usecases/base/BaseUseCase;", "", "Lcom/app/base/mainapp/data/source/remote/model/response/TodoItem;", "Lcom/app/base/mainapp/data/source/remote/model/request/TodoRequest;", "todoRepository", "Lcom/app/base/mainapp/domain/repository/TodoRepository;", "apiErrorHandle", "Lcom/app/base/mainapp/data/source/remote/ApiErrorHandle;", "(Lcom/app/base/mainapp/domain/repository/TodoRepository;Lcom/app/base/mainapp/data/source/remote/ApiErrorHandle;)V", "run", "params", "(Lcom/app/base/mainapp/data/source/remote/model/request/TodoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TodoUseCase extends com.app.base.mainapp.domain.usecases.base.BaseUseCase<java.util.List<? extends com.app.base.mainapp.data.source.remote.model.response.TodoItem>, com.app.base.mainapp.data.source.remote.model.request.TodoRequest> {
    private com.app.base.mainapp.domain.repository.TodoRepository todoRepository;
    private final com.app.base.mainapp.data.source.remote.ApiErrorHandle apiErrorHandle = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object run(@org.jetbrains.annotations.Nullable()
    com.app.base.mainapp.data.source.remote.model.request.TodoRequest params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.app.base.mainapp.data.source.remote.model.response.TodoItem>> p1) {
        return null;
    }
    
    public TodoUseCase(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.domain.repository.TodoRepository todoRepository, @org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.data.source.remote.ApiErrorHandle apiErrorHandle) {
        super(null);
    }
}