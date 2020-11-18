package com.app.base.mainapp.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0006\u0010\u001d\u001a\u00020\u001e\u001a\u0006\u0010\u001f\u001a\u00020 \"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0004\b\b\u0010\u0005\"\u001a\u0010\t\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0003\"\u0004\b\u000b\u0010\u0005\"\u001a\u0010\f\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0004\b\u000e\u0010\u0005\"\u001a\u0010\u000f\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0003\"\u0004\b\u0011\u0010\u0005\u00a8\u0006!"}, d2 = {"KeyStoreModule", "Lorg/koin/core/module/Module;", "getKeyStoreModule", "()Lorg/koin/core/module/Module;", "setKeyStoreModule", "(Lorg/koin/core/module/Module;)V", "NavigatorModule", "getNavigatorModule", "setNavigatorModule", "PreferenceModule", "getPreferenceModule", "setPreferenceModule", "RepositoryModule", "getRepositoryModule", "setRepositoryModule", "UseCaseModules", "getUseCaseModules", "setUseCaseModules", "createKeyStoreModule", "Lcom/app/base/mainapp/utils/KeystoreDataSource;", "createLoginRepo", "Lcom/app/base/mainapp/domain/repository/TodoRepository;", "apiInterface", "Lcom/app/base/mainapp/data/source/remote/ApiInterface;", "createLoginUseCase", "Lcom/app/base/mainapp/domain/usecases/TodoUseCase;", "repository", "apiErrorHandle", "Lcom/app/base/mainapp/data/source/remote/ApiErrorHandle;", "createNavigatorModule", "Lcom/app/base/mainapp/utils/Navigator;", "createPreferencesModule", "Lcom/app/base/mainapp/utils/preferences/PreferencesDataSource;", "app_debug"})
public final class AppModuleKt {
    @org.jetbrains.annotations.NotNull()
    private static org.koin.core.module.Module RepositoryModule;
    @org.jetbrains.annotations.NotNull()
    private static org.koin.core.module.Module UseCaseModules;
    @org.jetbrains.annotations.NotNull()
    private static org.koin.core.module.Module NavigatorModule;
    @org.jetbrains.annotations.NotNull()
    private static org.koin.core.module.Module PreferenceModule;
    @org.jetbrains.annotations.NotNull()
    private static org.koin.core.module.Module KeyStoreModule;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getRepositoryModule() {
        return null;
    }
    
    public static final void setRepositoryModule(@org.jetbrains.annotations.NotNull()
    org.koin.core.module.Module p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getUseCaseModules() {
        return null;
    }
    
    public static final void setUseCaseModules(@org.jetbrains.annotations.NotNull()
    org.koin.core.module.Module p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getNavigatorModule() {
        return null;
    }
    
    public static final void setNavigatorModule(@org.jetbrains.annotations.NotNull()
    org.koin.core.module.Module p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getPreferenceModule() {
        return null;
    }
    
    public static final void setPreferenceModule(@org.jetbrains.annotations.NotNull()
    org.koin.core.module.Module p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getKeyStoreModule() {
        return null;
    }
    
    public static final void setKeyStoreModule(@org.jetbrains.annotations.NotNull()
    org.koin.core.module.Module p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.app.base.mainapp.utils.Navigator createNavigatorModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.app.base.mainapp.utils.preferences.PreferencesDataSource createPreferencesModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.app.base.mainapp.utils.KeystoreDataSource createKeyStoreModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.app.base.mainapp.domain.repository.TodoRepository createLoginRepo(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.data.source.remote.ApiInterface apiInterface) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.app.base.mainapp.domain.usecases.TodoUseCase createLoginUseCase(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.domain.repository.TodoRepository repository, @org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.data.source.remote.ApiErrorHandle apiErrorHandle) {
        return null;
    }
}