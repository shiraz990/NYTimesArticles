package com.app.base.mainapp.utils

import android.content.Context
import android.graphics.Paint
import android.net.ConnectivityManager
import android.text.Selection
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.app.base.mainapp.utils.AppUtils.context

fun View.gone() {
    if (visibility != View.GONE) {
        visibility = View.GONE
    }
}

fun View.visible() {
    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
}

fun View.invisible() {
    if (visibility != View.INVISIBLE) {
        visibility = View.INVISIBLE
    }
}

fun Toast.toast(message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun isNetworkAvailable(context: Context?): Boolean {
    val connectivityManager =
        context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val networkInfo = connectivityManager.activeNetworkInfo
    return networkInfo != null && networkInfo.isConnected
}

fun TextView.underline() {
    paintFlags = paintFlags or Paint.UNDERLINE_TEXT_FLAG
}

fun TextView.setValidateText(text: String?) {
    if (text.isNullOrEmpty()) {
        return
    }
    setText(text)
}

fun TextView.makeLinks(vararg links: Pair<String, View.OnClickListener>) {
    val spannableString = SpannableString(this.text)
    for (link in links) {
        val clickableSpan = object : ClickableSpan() {
            override fun onClick(view: View) {
                Selection.setSelection((view as TextView).text as Spannable, 0)
                view.invalidate()
                link.second.onClick(view)
            }
        }
        val startIndexOfLink = this.text.toString().indexOf(link.first)
        if (startIndexOfLink > 0) {
            spannableString.setSpan(clickableSpan, startIndexOfLink, startIndexOfLink + link.first.length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
    }
    this.movementMethod = LinkMovementMethod.getInstance() // without LinkMovementMethod, link can not click
    this.setText(spannableString, TextView.BufferType.SPANNABLE)
}

