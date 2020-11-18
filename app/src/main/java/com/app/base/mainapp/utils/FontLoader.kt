package com.app.base.mainapp.utils

import android.content.Context
import android.graphics.Typeface
import java.util.*

object FontLoader {
    private val fontMapCache = HashMap<String, Typeface>()

    fun getTypeface(context: Context, fontname: String): Typeface? {
        var typeface: Typeface? = fontMapCache[fontname]

        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.assets, "fonts/" + fontname)
            } catch (e: Exception) {
                return null
            }

            fontMapCache.put(fontname, typeface)
        }

        return typeface
    }
}
