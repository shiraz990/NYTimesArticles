package com.app.base.mainapp.utils.preferences

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.app.base.mainapp.MainApp
import com.yakivmospan.scytale.Crypto
import com.yakivmospan.scytale.Options
import com.yakivmospan.scytale.Store
import java.lang.Exception
import javax.crypto.SecretKey
import kotlin.reflect.KClass

class PreferencesDataSource {

    object Keys {
        const val REGISTRATION_DONE = "registration_done"
        const val SELF_ASSESMENT_DONE = "sel_assesment_done"
        const val EDIT_PROFILE_DONE = "sel_assesment_done"
        const val DEVICE_TOKEN = "device_token"
        const val USER_TOKEN = "user_token"
        const val OPENF_FRONT_CAMERA_FROM_DETAIL = "opencamfrontfromdetail"
        const val OPENF_BACK_CAMERA_FROM_DETAIL = "opencambackfromdetail"
        const val NATIONALITIES = "app_countries"
        const val REGISTRATION_OBJECT = "registrationObj"
        const val FROM_GALLERY = "from_gallery"
        const val FROM_PASSPORT = "from_passport"
        const val REGISTRATION_REQUEST_PREFS = "registrationRequest"
        const val MSIDN = "msidn"
        const val FORMATTED_MSIDN = "formatted_msidn"
        const val ISREGISTEREDWITHDOHPROFILE = "isRegisteredWithDohProfile"
        const val USER_ID = "userId"
        const val OTP = "OTP"
        const val PRFILE_OBJECT = "userProfileObject"
        const val APP_LOCALE = "app_locale"
        const val MSIDN_OTHER_PEOPLE = "msidn_other_people"
        const val FORMATTED_MSIDN_OTHER_PEOPLE = "formatted_msidn_other_people"
        const val OTP_OTHER_PEOPLE = "OTP_other_people"
    }


    private val context: Context = MainApp.applicationContext()

    private val mPref: SharedPreferences =
        context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

    private val store: Store= Store(context)

    private var crypto = Crypto(Options.TRANSFORMATION_SYMMETRIC);

    fun putInt(field: String, data: Int) {
        data.let {
            mPref.edit().putInt(field, it).apply()
        }
    }

//    fun putString(field: String, data: String) {
//        data.let {
//            mPref.edit().putString(field, it).apply()
//        }
//    }


/*    fun getInt(field: String): Int? {
        return mPref.getInt(field, 0)
    }*/

    /*    fun getString(field: String): String? {
            return mPref.getString(field, null)
        }*/

    /*    fun getStringNonNull(field: String): String? {
        return mPref.getString(field, "")
    }*/


/*    fun clear() {
        mPref.edit().clear().apply()
    }*/


    /* fun remove(string: String) {
         mPref.edit().remove("")
     }*/

   /* fun checkObject(key: String): Boolean {
        return mPref.contains(key)
    }*/

    fun putString(field: String, data: String) {
        data.let {
            if (!store.hasKey(field)) {
                val key = store.generateSymmetricKey(field, null)
            }
            var key = store?.getSymmetricKey(field, null)
            val encrData = crypto.encrypt(data, key as SecretKey)
            mPref.edit().putString(key.algorithm+field,encrData).apply()
        }
    }

    fun getString(field: String): String? {
        var key = store?.getSymmetricKey(field, null)
        if(key == null){
            return null
        }

        val encr = mPref.getString(key.algorithm+field,"")
        try{
            return encr?.let { crypto.decrypt(it,key) }
        }catch (e:Exception){

        }
        return null
    }

    fun getDouble(field: String): Double? {
        val value = getString(field)
        if(value==null){
            return "0.0".toDouble()
        }
        return value.toDouble()
    }

    fun putObject(key: String, data: Any) {
        data.let {
            val gson = Gson()
            putString(key, gson.toJson(it))
        }
    }

    fun putObjectsList(key: String, data: List<Any>) {
        data.let {
            val gson = Gson()
            putString(key, gson.toJson(it))
        }
    }


    fun getObject(key: String, model: KClass<*>): Any? {
        val gson = Gson()
        var obj: Any? = null
        if (!getString(key).isNullOrEmpty()) {
            obj = gson.fromJson(getString(key), model.java)
        }
        return obj
    }

    fun checkObject(key: String): Boolean {
        return store.hasKey(key)
    }

    fun putBoolean(field: String, data: Boolean) {
        data.let {
            mPref.edit().putBoolean(field, it).apply()
        }
    }

    fun getBoolean(field: String): Boolean {
        return mPref.getBoolean(field, false)
    }
}
