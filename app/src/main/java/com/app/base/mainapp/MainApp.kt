package com.app.base.mainapp

import android.app.Application
import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.app.base.mainapp.modules.*
import com.yakivmospan.scytale.Store
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import java.util.*
import javax.crypto.SecretKey


class MainApp : Application() {

    val appLanguage: MutableLiveData<String> = MutableLiveData()
    var deviceToken: String? = null

    val profileUpdated: MutableLiveData<Boolean> = MutableLiveData()
    val refreshFamilyMember: MutableLiveData<Boolean> = MutableLiveData()
    override fun onCreate() {
        super.onCreate()
        appLanguage.value = "en"
        startKoin {
            androidLogger()
            androidContext(this@MainApp)
            modules(NetworkModule + RepositoryModule +  DatabaseModule +UseCaseModules + NavigatorModule + PreferenceModule + KeyStoreModule)
        }

//        refreshFamilyMember.value = true

        // Create and save key
        val store =
            Store(applicationContext)
        if (!store.hasKey("test")) {
            val key: SecretKey = store.generateSymmetricKey("test", null)
        }
    }



/*
    fun setLocale(locale: Locale) {
        val resources = resources
        val configuration = resources.configuration
        val displayMetrics = resources.displayMetrics
        configuration.setLocale(locale)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            applicationContext().createConfigurationContext(configuration)
        } else {
            resources.updateConfiguration(
                configuration,
                applicationContext().resources.displayMetrics
            )
        }
    }
*/

    init {
        instance = this
    }

    companion object {
        private var instance: MainApp? = null
        fun applicationContext(): Context {
            return instance!!.applicationContext
        }

        fun setLocale(locale: Locale) {
//            instance?.setLocale(locale)
        }
    }
}