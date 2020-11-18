package com.app.base.mainapp.utils.custom_views

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import com.app.base.mainapp.R
import com.app.base.mainapp.utils.Constants
import com.app.base.mainapp.utils.Constants.SELECTED_LANGUAGE
import com.app.base.mainapp.utils.FontLoader

class CustomButton : AppCompatButton {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initializeCustomTypeface(attrs, context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initializeCustomTypeface(attrs, context)
    }

    private fun initializeCustomTypeface(attrs: AttributeSet?, context: Context) {
        if (attrs != null) {

            val attributesArray = context.obtainStyledAttributes(
                attrs,
                R.styleable.CustomTextView
            )
            val fontID = attributesArray.getInt(R.styleable.CustomTextView_typeface_from_list, -1)
            val fontStringArray = context.resources.getStringArray(R.array.customFonts)
            val myTypeface: Typeface?
            //if a typeface is selected for the textview and if the font names are declared in the
            // string array customFonts then load that typeface from cache
            if (fontID != -1 && fontStringArray.isNotEmpty()) {
                try {
                    if (SELECTED_LANGUAGE == Constants.LANGUAGE_AR) {
                        myTypeface = FontLoader.getTypeface(context, fontStringArray[fontID])
                    } else {
                        myTypeface = FontLoader.getTypeface(context, fontStringArray[fontID])
                    }

                    typeface = myTypeface
                } catch (e: Exception) {
//                    e.printStackTrace()
                }

            } else {
//                Log.e(LOG_TAG, "Either of the string array CustomFonts or" +
//                        " attribute typeface_from_list is not present" + fontID)
            }

            attributesArray.recycle()
        }

    }

    companion object {

        private val LOG_TAG = "CustomTextView"
    }

}
