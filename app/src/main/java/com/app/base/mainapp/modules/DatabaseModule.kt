package com.app.base.mainapp.modules

import com.app.base.mainapp.data.source.local.DatabaseManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val DatabaseModule = module {
    single { DatabaseManager.getInstance(androidContext()) }
}
