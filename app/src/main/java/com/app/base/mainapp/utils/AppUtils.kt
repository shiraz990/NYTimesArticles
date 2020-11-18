package com.app.base.mainapp.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Typeface.BOLD
import android.net.Uri
import android.os.Build
import android.text.*
import android.text.style.StyleSpan
import android.util.Base64
import android.util.TypedValue
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.google.firebase.crashlytics.internal.common.CommonUtils.isEmulator
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.MultiFormatWriter
import com.app.base.mainapp.BuildConfig
import com.app.base.mainapp.MainApp
import com.app.base.mainapp.R
import com.app.base.mainapp.data.source.remote.model.request.BaseRequest
import com.app.base.mainapp.utils.Constants.SELECTED_LANGUAGE
import com.yakivmospan.scytale.Crypto
import com.yakivmospan.scytale.Options
import com.yakivmospan.scytale.Store
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream
import java.util.*
import javax.crypto.SecretKey


@SuppressLint("StaticFieldLeak")
object AppUtils {

    val context: Context = MainApp.applicationContext()
    lateinit var bitmapFront: Bitmap
    lateinit var bitmapBack: Bitmap
    lateinit var bitmapOriginal: Bitmap

    var generatedKey :SecretKey?= null
    val store: Store = Store(context)
    var crypto = Crypto(Options.TRANSFORMATION_SYMMETRIC);

    @JvmStatic
    fun loadImage(fragment: Fragment, url: String?, imageView: ImageView) {
        val requestOptions = RequestOptions()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .priority(Priority.HIGH)
        Glide.with(fragment).setDefaultRequestOptions(requestOptions).load(url)
            .into(imageView)
    }

    @JvmStatic
    fun loadImage(activity: Activity, url: String?, imageView: ImageView) {
        val requestOptions = RequestOptions()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .priority(Priority.HIGH)
        Glide.with(activity).setDefaultRequestOptions(requestOptions).load(url)
            .into(imageView)
    }


    @JvmStatic
    fun getBaseRequest(msisdn: String?, userId: String? = ""): BaseRequest {
        val baseRequest = BaseRequest(null)
        baseRequest.osType = "iOS"
        baseRequest.osVersion = BuildConfig.VERSION_NAME
        baseRequest.buildNumber = BuildConfig.VERSION_NAME
        baseRequest.msisdn = msisdn
        baseRequest.userId = userId
        baseRequest.fcmToken = (context as MainApp).deviceToken
        baseRequest.lang = if (SELECTED_LANGUAGE == Constants.LANGUAGE_AR) {
            Constants.LANGUAGE_AR
        } else {
            Constants.LANGUAGE_ENGLISH
        }
        return baseRequest
    }

    fun bitmapToFile(bitmap: Bitmap, path: String): Uri {
        val wrapper = ContextWrapper(context)
        var dir = wrapper.getDir("Images", Context.MODE_PRIVATE)
        var file = File(dir, path)

        try {
            // Compress the bitmap and save in jpg format
            val stream: OutputStream = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 60, stream)
            stream.flush()
            stream.close()
        } catch (e: IOException) {
//            e.printStackTrace()
        }

        // Return the saved bitmap uri
        return Uri.parse(file.absolutePath)
    }


    fun bitmapToFile(bitmap: Bitmap, path: String, angle: Float): Uri {
        val wrapper = ContextWrapper(context)
        var dir = wrapper.getDir("Images", Context.MODE_PRIVATE)
        var file = File(dir, path)

        try {
            val matrix = Matrix()
            matrix.postRotate(angle)
            val imageBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true)
            val stream: OutputStream = FileOutputStream(file)
            imageBitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream)
            stream.flush()
            stream.close()
        } catch (e: IOException) {
//            e.printStackTrace()
        }

        // Return the saved bitmap uri
        return Uri.parse(file.absolutePath)
    }

/*    fun showAlert(context: Activity, error: String = "", finishActivity: Boolean = false) {
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.dialog_view)
        val label = dialog.findViewById<AppCompatTextView>(R.id.error_message)
        if (error.isNotEmpty()) {
            dialog.findViewById<AppCompatTextView>(R.id.detail_message).visibility = View.GONE
            label.text = error
        }
        dialog.window?.setLayout(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )
        val btn = dialog.findViewById(com.moh.covid.inspectorapp.R.id.btn_submit) as AppCompatButton
        btn.setOnClickListener {
            if (finishActivity) {
                context.setResult(
                    Activity.RESULT_OK,
                    context.intent.putExtra("submissionerror", true)
                )
                context.finish()
            }
            dialog.dismiss()
        }
        dialog.setCancelable(false)
        dialog.show()
    }

    fun showAlert(context: Activity, errorTitle: String = "",  errorMessage:String = "", finishActivity: Boolean = false) {
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.dialog_view)
        dialog.findViewById<AppCompatTextView>(R.id.detail_message).visibility = View.VISIBLE
        dialog.findViewById<AppCompatTextView>(R.id.title).visibility = View.VISIBLE
        val labelTitle = dialog.findViewById<AppCompatTextView>(R.id.error_message)
        val labelMessage = dialog.findViewById<AppCompatTextView>(R.id.detail_message)
        labelTitle.text = errorTitle
        labelMessage.text = errorMessage

        dialog.window?.setLayout(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )
        val btn = dialog.findViewById(com.moh.covid.inspectorapp.R.id.btn_submit) as AppCompatButton
        btn.setOnClickListener {
            if (finishActivity) {
                context.setResult(
                    Activity.RESULT_OK,
                    context.intent.putExtra("submissionerror", true)
                )
                context.finish()
            }
            dialog.dismiss()
        }
        dialog.setCancelable(false)
        dialog.show()
    }

    fun showAlert(context: Activity, error: String = "", finishActivity: Boolean = false, onClickListener: View.OnClickListener) {
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.dialog_view)
        val label = dialog.findViewById<AppCompatTextView>(R.id.error_message)
        if (error.isNotEmpty()) {
            dialog.findViewById<AppCompatTextView>(R.id.detail_message).visibility = View.GONE
            label.text = error
        }
        dialog.window?.setLayout(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )
        val btn = dialog.findViewById(com.moh.covid.inspectorapp.R.id.btn_submit) as AppCompatButton
        btn.setOnClickListener(onClickListener)
        dialog.setCancelable(false)
        dialog.show()
    }

    fun showDefaultAlert(message:String, activity: Activity){
        AlertDialog.Builder(activity)
            .setMessage(message)
            // Specifying a listener allows you to take an action before dismissing the dialog.
            // The dialog is automatically dismissed when a dialog button is clicked.
            .setPositiveButton(
                android.R.string.yes
            ) { dialog, which ->
                // Continue with delete operation
            }
            .show()
    }

    fun showAlertSubmission(context: Activity, error: String = "", finishActivity: Boolean = false) {
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.dialog_view)
        val label = dialog.findViewById<AppCompatTextView>(R.id.error_message)
        if (error.isNotEmpty()) {
            dialog.findViewById<AppCompatTextView>(R.id.detail_message).visibility = View.GONE
            label.text = error
        }
        dialog.window?.setLayout(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )
        val btn = dialog.findViewById(com.moh.covid.inspectorapp.R.id.btn_submit) as AppCompatButton
        btn.setOnClickListener {
            if (finishActivity) {
                context.finish()
            }
            dialog.dismiss()
        }
        dialog.setCancelable(false)
        dialog.show()
    }*/

    fun setTitleToolbar(toolbar: Toolbar, title : String){
        toolbar.findViewById<TextView>(R.id.tv_title).text = title
    }

    fun dpToPx(dp: Float, context: Context): Int {
        return dpToPx(dp, context.resources)
    }

    private fun dpToPx(dp: Float, resources: Resources): Int {
        val px = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dp,
            resources.displayMetrics
        )
        return px.toInt()
    }

    fun generateQRCode(context: Context, userId: String, msidn: String): Bitmap? {

        // encrypt
//        val encryptedData = encrypt(msidn)//encrypt(generateUserKey(), userId.toByteArray())

//        var key = store.generateSymmetricKey("BBCCDD", null)
//        key = store?.getSymmetricKey("BBCCDD", null)
//        val encrData = crypto.encrypt(userId, key as SecretKey)

        //val decrypt = crypto.decrypt(encrData,key)

        //val data = AESCrypt.encrypt("AA-salt-BBCCDD--", userId)
//        val data = AESEncryption().encrypt(userId,"AA-salt-BBCCDD--")!!
        // Sending side
        val data = Base64.encodeToString(userId.toByteArray(), Base64.DEFAULT).trimEnd('\n')

        val width =  context.resources.getDimension(R.dimen._70sdp)
        val height =  context.resources.getDimension(R.dimen._70sdp)
        val colorQR: Int = Color.BLACK
        val colorBackQR: Int = Color.TRANSPARENT
        val marginAutomatic = 1

        return generateBitmap(
            data, width, height, marginAutomatic, colorQR, colorBackQR
        )
    }

    fun isRooted(context: Context?): Boolean {
        val isEmulator: Boolean = isEmulator(context)
        val buildTags = Build.TAGS
        return if (!isEmulator && buildTags != null && buildTags.contains("test-keys")) {
            true
        } else {
            var file = File("/system/app/Superuser.apk")
            if (file.exists()) {
                true
            } else {
                file = File("/system/xbin/su")
                !isEmulator && file.exists()
            }
        }
    }


    fun restartApplication(@NonNull activity: Activity) {
        val pm: PackageManager = activity.packageManager
        val intent: Intent? = pm.getLaunchIntentForPackage(activity.packageName)
        activity.finishAffinity() // Finishes all activities.
        activity.startActivity(intent) // Start the launch activity
        System.exit(0) // System finishes and automatically relaunches us.
    }

    private fun generateBitmap(
        contentsToEncode: String, imageWidth: Float, imageHeight: Float, marginSize: Int, color: Int, colorBack: Int
    ): Bitmap? {
        val MARGIN_AUTOMATIC = -1
        try {
            var hints: MutableMap<EncodeHintType?, Any?>? = null
            if (marginSize != MARGIN_AUTOMATIC) {
                hints = EnumMap(EncodeHintType::class.java)
                hints[EncodeHintType.MARGIN] = marginSize
            }
            val writer = MultiFormatWriter()
            val result = writer.encode(
                contentsToEncode, BarcodeFormat.QR_CODE, imageWidth.toInt(), imageHeight.toInt(), hints
            )
            val width = result.width
            val height = result.height
            val pixels = IntArray(width * height)
            for (y in 0 until height) {
                val offset = y * width
                for (x in 0 until width) {
                    pixels[offset + x] = if (result[x, y]) color else colorBack
                }
            }
            val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
            bitmap.setPixels(pixels, 0, width, 0, 0, width, height)
            return bitmap
        } catch (e: java.lang.Exception) {
        }
        return null
    }



    fun saveImageBitmap(context: Context?, file: Bitmap, fileName: String) {
/*        var bitmap: Bitmap = file
        var wrapper = ContextWrapper(context)

        var file = wrapper.getDir("user_images", Context.MODE_PRIVATE)
        file = File(file, fileName);
        try {
            var stream: OutputStream? = null

            stream = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream)
            stream.flush()
            stream.close()
        } catch (e: IOException) // Catch the exception
        {
            e.printStackTrace()
        }*/
    }

//    fun getInputFilter() : Array<InputFilter> {
//        val filter = object : InputFilter {
//            override fun filter(
//                source: CharSequence, start: Int, end: Int,
//                dest: Spanned, dstart: Int, dend: Int
//            ): CharSequence? {
//
//                var finalValue = ""
//                for (i in start until end) {
//                    /*if(!Character.isLetterOrDigit(source[i]) && !Character.isWhitespace(source[i])){
//                        continue
//                    }
//                    finalValue += source[i]*/
//                    if (!Character.isLetterOrDigit(source[i]) && !Character.isWhitespace(source[i])) {
//                        return source.toString().replace(source[i].toString(),"").trim()
//                    }
//                }
//                return null
//            }
//        }
//        return arrayOf<InputFilter>(filter)
//    }

    fun getInputFilter():Array<InputFilter>{
        val filter = object : InputFilter {
        override fun filter(
            source: CharSequence, start: Int, end: Int,
            dest: Spanned, dstart: Int, dend: Int
        ): CharSequence? {

            if (source is SpannableStringBuilder) {
                for (i in end - 1 downTo start) {
                    val currentChar = source[i]
                    if (!Character.isLetterOrDigit(currentChar) && !Character.isSpaceChar(
                            currentChar
                        )
                    ) {
                        source.delete(i, i + 1)
                    }
                }
                return source
            } else {
                val filteredStringBuilder = StringBuilder()
                for (i in start until end) {
                    val currentChar = source[i]
                    if (Character.isLetterOrDigit(currentChar) || Character.isSpaceChar(currentChar)) {
                        filteredStringBuilder.append(currentChar)
                    }
                }
                return filteredStringBuilder.toString()
            }
        }
    }
    return arrayOf<InputFilter>(filter)
    }


    fun boldSpecificPart(
        actualText: String, targetStringToFormat: String, matchCase: Boolean
    ): SpannableStringBuilder {
        //Null complete string return empty
        if (TextUtils.isEmpty(actualText)) {
            return SpannableStringBuilder("")
        }

        val str = SpannableStringBuilder(actualText)
        var startIndex = 0

        if (matchCase) {
            if (TextUtils.isEmpty(targetStringToFormat) || !actualText.contains(targetStringToFormat)) {
                return str
            }
            startIndex = str.toString().indexOf(targetStringToFormat);
        } else {
            //else find in lower cases
            if (TextUtils.isEmpty(targetStringToFormat) || !actualText.toLowerCase().contains(
                    targetStringToFormat.toLowerCase()
                )
            ) {
                return str
            }

            startIndex = str.toString().toLowerCase().indexOf(targetStringToFormat.toLowerCase())
        }
        val endIndex = startIndex + targetStringToFormat.length
        str.setSpan(StyleSpan(BOLD), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        return str;
    }


    private const val blockCharacterSet = "~#^|$%&*!@.;:'(){}"
    val filter =
        InputFilter { source, start, end, dest, dstart, dend ->
            if (source != null && blockCharacterSet.contains("" + source)) {
                ""
            } else null
        }

}