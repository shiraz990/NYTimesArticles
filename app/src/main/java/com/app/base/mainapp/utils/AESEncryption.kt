//package com.moh.covid.ae.utils
//
//import android.os.Build
//import androidx.annotation.RequiresApi
//import com.moh.covid.ae.utils.AppUtils.toBase64
//import java.io.UnsupportedEncodingException
//import java.security.MessageDigest
//import java.security.NoSuchAlgorithmException
//import java.util.*
//import javax.crypto.Cipher
//import javax.crypto.spec.SecretKeySpec
//import java.util.Base64.getDecoder
//import java.util.Base64.getEncoder
//
//
//
//
//class AESEncryption {
//
//    private var secretKey: SecretKeySpec? = null
//    private var key: ByteArray? = null
//
//    fun setKey(myKey: String) {
//        var sha: MessageDigest? = null
//        try {
//            key = myKey.toByteArray(charset("UTF-8"))
//            sha = MessageDigest.getInstance("SHA-1")
//            key = sha!!.digest(key)
//            key = Arrays.copyOf(key, 16)
//            secretKey = SecretKeySpec(key!!, "AES")
//        } catch (e: NoSuchAlgorithmException) {
//            e.printStackTrace()
//        } catch (e: UnsupportedEncodingException) {
//            e.printStackTrace()
//        }
//
//    }
//
//    fun encrypt(strToEncrypt: String, secret: String): String? {
//        try {
//            setKey(secret)
//            val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
//            cipher.init(Cipher.ENCRYPT_MODE, secretKey)
//            return  android.util.Base64.encodeToString(cipher.doFinal(strToEncrypt.toByteArray(charset("UTF-8"))), android.util.Base64.DEFAULT)
//        } catch (e: Exception) {
//            println("Error while encrypting: $e")
//        }
//
//        return null
//    }
//
//    fun decrypt(strToDecrypt: String, secret: String): String? {
//        try {
//            setKey(secret)
//            val cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING")
//            cipher.init(Cipher.DECRYPT_MODE, secretKey)
//
//            return String(cipher.doFinal(android.util.Base64.decode(strToDecrypt, android.util.Base64.DEFAULT)))
//        } catch (e: Exception) {
//            println("Error while decrypting: $e")
//        }
//
//        return null
//    }
//}