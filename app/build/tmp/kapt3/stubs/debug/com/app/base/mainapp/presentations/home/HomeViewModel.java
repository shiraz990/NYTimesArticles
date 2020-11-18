package com.app.base.mainapp.presentations.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/app/base/mainapp/presentations/home/HomeViewModel;", "Lcom/app/base/mainapp/base/BaseViewModel;", "todoUseCase", "Lcom/app/base/mainapp/domain/usecases/TodoUseCase;", "(Lcom/app/base/mainapp/domain/usecases/TodoUseCase;)V", "todoLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/app/base/mainapp/data/source/remote/model/response/TodoItem;", "todo", "", "app_debug"})
public final class HomeViewModel extends com.app.base.mainapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.app.base.mainapp.data.source.remote.model.response.TodoItem>> todoLiveData = null;
    private com.app.base.mainapp.domain.usecases.TodoUseCase todoUseCase;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.app.base.mainapp.data.source.remote.model.response.TodoItem>> todoLiveData() {
        return null;
    }
    
    public final void todo() {
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.domain.usecases.TodoUseCase todoUseCase) {
        super();
    }
}