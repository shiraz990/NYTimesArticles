package com.app.base.mainapp.utils

import android.content.Context
import com.app.base.mainapp.MainApp
import com.yakivmospan.scytale.Store
import com.yakivmospan.scytale.Crypto
import com.yakivmospan.scytale.Options


class KeystoreDataSource {

    private val context: Context = MainApp.applicationContext()
    // Create store with specific name and password

    private var store = Store(context)

    object Keys {
        const val REGISTRATION_DONE = "registration_done"
        const val SELF_ASSESMENT_DONE = "sel_assesment_done"
        const val DEVICE_TOKEN = "device_token"
        const val OPENF_FRONT_CAMERA_FROM_DETAIL = "opencamfrontfromdetail"
        const val OPENF_BACK_CAMERA_FROM_DETAIL = "opencambackfromdetail"
        const val NATIONALITIES = "app_countries"
        const val REGISTRATION_OBJECT = "registrationObj"
        const val FROM_GALLERY = "from_gallery"
        const val REGISTRATION_REQUEST_PREFS = "registrationRequest"
        const val MSIDN = "msidn"
        const val FORMATTED_MSIDN = "formatted_msidn"
        const val ISREGISTEREDWITHDOHPROFILE = "isRegisteredWithDohProfile"
        const val USER_ID = "userId"
        const val PRFILE_OBJECT = "userProfileObject"
        const val APP_LOCALE = "app_locale"
    }

    val alias = "alias"
    val password = "password".toCharArray()
    val keysize = 512

    var crypto = Crypto(Options.TRANSFORMATION_SYMMETRIC);

/*    val Calendar start = Calen
    final Calendar end = Calendar.getInstance();
    end.add(Calendar.YEAR, 1);*/

   /* // Create a key store params, some of them are specific per platform
    // Check KeyProps doc for more info
    var keyProps = KeyProps.Builder()
        .setAlias(alias)
        .setPassword(password)
        .setKeySize(keysize)
        .setKeyType("RSA")
        .setSerialNumber(BigInteger.ONE)
        .setSubject(X500Principal("CN=$alias CA Certificate"))
        //.setStartDate(start.getTime())
        //.setEndDate(end.getTime())
        .setBlockModes("ECB")
        .setEncryptionPaddings("PKCS1Padding")
        .setSignatureAlgorithm("SHA256WithRSAEncryption")
        .build()

    // Generate KeyPair depending on KeyProps
    var keyPair = store.generateAsymmetricKey(keyProps)

    // Encrypt/Dencrypt data using buffer with or without Initialisation Vectors
    // This additional level of safety is required on 23 API level for
    // some algorithms. Specify encryption/decryption block size to use buffer for
    // large data when using block based algorithms (such as RSA)

    val encryptionBlockSize = keysize / 8 - 11 // as specified for RSA/ECB/PKCS1Padding keys
    val decryptionBlockSize = keysize / 8 // as specified for RSA/ECB/PKCS1Padding keys

    var crypto = Crypto("RSA/ECB/PKCS1Padding", encryptionBlockSize, decryptionBlockSize)*/

    fun hasKey(key:String) : Boolean{
        return store.hasKey(key)
    }
    fun putString(key: String, value:String){
        val key = store.generateSymmetricKey(key, null)
        crypto.encrypt(value, key)
    }

    fun getString(key: String) : String{
        // Get key
        val secretKey = store.getSymmetricKey(key, null)
        var value = crypto.decrypt(key,secretKey)
        return value
    }
}