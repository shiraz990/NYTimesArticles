package com.app.base.mainapp.modules

import com.app.base.mainapp.data.repository.*
import com.app.base.mainapp.data.source.remote.ApiErrorHandle
import com.app.base.mainapp.data.source.remote.ApiInterface
import com.app.base.mainapp.domain.repository.*
import com.app.base.mainapp.domain.usecases.TodoUseCase
import com.app.base.mainapp.presentations.home.HomeViewModel
import com.app.base.mainapp.utils.KeystoreDataSource
import com.app.base.mainapp.utils.Navigator
import com.app.base.mainapp.utils.preferences.PreferencesDataSource
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

var RepositoryModule = module {

    single { createLoginRepo(get()) }
}

var UseCaseModules = module {
    single { createLoginUseCase(get(),createApiErrorHandle()) }

    viewModel { HomeViewModel(get()) }
 }

var NavigatorModule = module {
    single { createNavigatorModule() }
}

var PreferenceModule = module {
    single { createPreferencesModule() }
}

var KeyStoreModule = module {
    single { createKeyStoreModule() }
}

fun createNavigatorModule(): Navigator {
    return Navigator()
}

fun createPreferencesModule(): PreferencesDataSource {
    return PreferencesDataSource()
}

fun createKeyStoreModule(): KeystoreDataSource {
    return KeystoreDataSource()
}

fun createLoginRepo(apiInterface: ApiInterface): TodoRepository {
    return TodoRepositoryImpl(apiInterface)
}

fun createLoginUseCase(
    repository: TodoRepository,
    apiErrorHandle: ApiErrorHandle
): TodoUseCase {
    return TodoUseCase(repository, apiErrorHandle)
}