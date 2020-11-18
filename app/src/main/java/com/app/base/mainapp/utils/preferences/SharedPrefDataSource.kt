package com.app.base.mainapp.utils.preferences

import android.content.Context
import android.content.SharedPreferences
import com.app.base.mainapp.MainApp
import com.app.base.mainapp.utils.Constants.LANGUAGE_ENGLISH
import com.app.base.mainapp.utils.preferences.SharedPrefDataSource.Keys.APP_LANGUAGE
import com.app.base.mainapp.utils.preferences.SharedPrefDataSource.Keys.FCM_DEVICE_TOKEN
import com.app.base.mainapp.utils.preferences.SharedPrefDataSource.Keys.FIRST_RUN
import com.app.base.mainapp.utils.preferences.SharedPrefDataSource.Keys.FRONT_IMAGE
import com.app.base.mainapp.utils.preferences.SharedPrefDataSource.Keys.MSISDN
import com.app.base.mainapp.utils.preferences.SharedPrefDataSource.Keys.USER_APP_TOKEN

class SharedPrefDataSource {

    object Keys {
        const val APP_LANGUAGE = "covid_app_language"
        const val FCM_DEVICE_TOKEN = "covid_fcm_device_token"
        const val USER_APP_TOKEN = "covid_user_app_token"
        const val FIRST_RUN = "covid_first_run"
        const val USER_EMIRATES_INFORMATION = "covid_user_emirates_information"
        const val MSISDN = "covid_msisdn"
        const val FRONT_IMAGE = "covid_frontimage"
    }


    private val NAME = "COVID-MOH"
    private val MODE = Context.MODE_PRIVATE
    val context: Context = MainApp.applicationContext()


    fun getToken(): String? {
        return  getCacheValue(context, USER_APP_TOKEN)
    }

    fun saveToken(data: String?) {
        if (data != null) {
            println(data)
            saveCacheValue(context, USER_APP_TOKEN, data)
        }
    }


    fun getDeviceFcmToken(): String? {
        return  getCacheValue(context, FCM_DEVICE_TOKEN)
    }

    fun saveDeviceFcmToken(data: String?) {
        if (data != null) {
            println(data)
            saveCacheValue(context, FCM_DEVICE_TOKEN, data)
        }
    }

    fun getAppLanguage(): String {
        var cacheValue = getCacheValue(context, APP_LANGUAGE)
        if (cacheValue == null) {
            cacheValue = LANGUAGE_ENGLISH
        }
        return cacheValue
    }

    fun saveAppLanguage(data: String) {
        if (data != null) {
            saveCacheValue(context, APP_LANGUAGE, data)
        }
    }


    fun isFirstRun(): Boolean {
        var cacheValue = getCacheValue(context, FIRST_RUN)
        if (cacheValue == null) {
            cacheValue = "true"
        }
        return cacheValue.toBoolean()
    }

    fun setFirstRun(data: Boolean) {
        if (data != null) {
            saveCacheValue(context, FIRST_RUN, data.toString())
        }
    }

    fun getMsisdn(): String {
        var cacheValue = getCacheValue(context, MSISDN)
        if (cacheValue == null) {
            cacheValue = ""
        }
        return cacheValue
    }

    fun saveMsisdn(data: String) {
        if (data != null) {
            saveCacheValue(context, MSISDN, data)
        }
    }

    fun getFrontImageSaved(): String {
        var cacheValue = getCacheValue(context, FRONT_IMAGE)
        if (cacheValue == null) {
            cacheValue = ""
        }
        return cacheValue
    }

    fun saveFrontImage(data: String) {
        if (data != null) {
            saveCacheValue(context, FRONT_IMAGE, data)
        }
    }



    /**
     * SharedPreferences extension function, so we won't need to call edit() and apply()
     * ourselves on every SharedPreferences operation.
     */
    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }


    /**
     * @param mContext      Application Base Context.
     * @param CacheKeyTitle Title of key.
     * @param cacheValue
     * In this function save shared preferences Value.
     */

    fun saveCacheValue(
        mContext: Context, CacheKeyTitle: String,
        cacheValue: String
    ) {

        try {
            val settings = mContext.getSharedPreferences(
                NAME, MODE
            )
            val editor = settings.edit()

            editor.putString(CacheKeyTitle, cacheValue)
            editor.commit()
        } catch (e: Exception) {
//            e.printStackTrace()
        }

    }


    /**
     * @param mContext      Application Base Context.
     * @param CacheKeyTitle
     * In this function get shared preferences Value.
     */

    fun getCacheValue(mContext: Context, CacheKeyTitle: String): String? {
        var value: String? = null
        val settings = mContext.getSharedPreferences(
            NAME, MODE
        )
        try {
            value = settings.getString(CacheKeyTitle, null)
        } catch (e: Exception) {
//            e.printStackTrace()
        }
        return value
    }


    /**
     * @param mContext      Application Base Context
     * @param CacheKeyTitle
     * In this function remove shared preferences Value.
     */

    fun removeCacheValue(mContext: Context, CacheKeyTitle: String) {
        try {
            val settings = mContext.getSharedPreferences(
                NAME, MODE
            )
            val editor = settings.edit()
            editor.remove(CacheKeyTitle)
            editor.commit()
        } catch (e: Exception) {
            //e.printStackTrace();
        }

    }


}