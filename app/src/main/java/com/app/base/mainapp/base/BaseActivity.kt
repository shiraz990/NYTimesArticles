package com.app.base.mainapp.base

import android.annotation.TargetApi
import android.content.Context
import android.content.res.Configuration
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kaopiz.kprogresshud.KProgressHUD
import com.app.base.mainapp.MainApp
import com.app.base.mainapp.R
import com.app.base.mainapp.databinding.ActivityBaseBinding
import com.app.base.mainapp.utils.Constants
import com.app.base.mainapp.utils.Constants.LANGUAGE_AR
import com.app.base.mainapp.utils.Constants.LANGUAGE_ENGLISH
import com.app.base.mainapp.utils.Constants.SELECTED_LANGUAGE
import com.app.base.mainapp.utils.preferences.PreferencesDataSource
import com.app.base.mainapp.utils.preferences.PreferencesDataSource.Keys.APP_LOCALE
import com.app.base.mainapp.utils.preferences.PreferencesDataSource.Keys.DEVICE_TOKEN
import org.koin.android.ext.android.inject
import java.util.*


abstract class BaseActivity : AppCompatActivity() {

    private val preferencesDataSource: PreferencesDataSource by inject()

    private lateinit var binding: ActivityBaseBinding
    private var progress: KProgressHUD? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_base)

        if (preferencesDataSource.getString(APP_LOCALE) == null) {
            preferencesDataSource.putString(APP_LOCALE, Constants.LANGUAGE_ENGLISH)
        }

        (MainApp.applicationContext() as MainApp).deviceToken = preferencesDataSource.getString(DEVICE_TOKEN)

//        attachBaseContext(this)
    }


    override fun attachBaseContext(newBase: Context?) {
        newBase?.let {
            super.attachBaseContext(updateBaseContextLocale(it))
        }
    }

    private fun updateBaseContextLocale(context: Context): Context {
        var locale = Locale("en", "US")
        SELECTED_LANGUAGE = LANGUAGE_ENGLISH
        if (preferencesDataSource.getString(APP_LOCALE) == Constants.LANGUAGE_AR) {
            locale = Locale("ar", "AE")
            SELECTED_LANGUAGE = LANGUAGE_AR
        }
        Locale.setDefault(locale)

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            updateResourcesLocale(context, locale)
        } else updateResourcesLocaleLegacy(context, locale)
    }

    @TargetApi(Build.VERSION_CODES.N)
    private fun updateResourcesLocale(context: Context, locale: Locale): Context {
        val configuration = context.resources.configuration
        configuration.setLocale(locale)
        configuration.setLayoutDirection(locale)
        return context.createConfigurationContext(configuration)
    }

    private fun updateResourcesLocaleLegacy(context: Context, locale: Locale): Context {
        val resources = context.resources
        val configuration = resources.configuration
        configuration.setLocale(locale)
        resources.updateConfiguration(configuration, resources.displayMetrics)
        return context
    }

    override fun applyOverrideConfiguration(overrideConfiguration: Configuration?) {
        overrideConfiguration?.let {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && Build.VERSION.SDK_INT <= Build.VERSION_CODES.N_MR1) {
                setLocale(it.locale) // you will need to implement this
            }
        }
        super.applyOverrideConfiguration(overrideConfiguration)
    }



    fun setLocale(locale: Locale) {

        val resources = resources
        val configuration = resources.configuration
        val displayMetrics = resources.displayMetrics
        configuration.setLocale(locale)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            MainApp.applicationContext().createConfigurationContext(configuration)
        } else {
            resources.updateConfiguration(
                configuration,
                MainApp.applicationContext().resources.displayMetrics
            )
        }

        Constants.current_locale = getResources().configuration.locale
    }


    fun showProgress() {
        progress = KProgressHUD.create(this)
            .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
            .setCancellable(true)
            .setAnimationSpeed(2)
            .setDimAmount(0.1f)
            .setSize(75,75)
            .show()
            .setSize(75, 75)
            .show()
    }

    fun hideProgress() {
        progress?.dismiss()
    }

    fun showProgressWithTransparentBackground() {
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.progress_view, null)

        progress = KProgressHUD.create(this)
            .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
            .setBackgroundColor(Color.TRANSPARENT)
            .setCancellable(true)
            .setAnimationSpeed(2)
            .setDimAmount(0.1f)
            .setSize(75,75)
            .show()
            .setSize(75, 75)
            .show()
    }

}