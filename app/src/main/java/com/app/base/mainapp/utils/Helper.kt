package com.app.base.mainapp.utils

import android.app.DatePickerDialog
import android.content.Context
import com.app.base.mainapp.R
import com.app.base.mainapp.utils.custom_views.CustomTextView
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


object Helper {

    fun selectDate(activity: Context, textField: CustomTextView, format: String, applyMinValue: Boolean = false) {
        val calender = Calendar.getInstance()
        val year = calender.get(Calendar.YEAR)
        val month = calender.get(Calendar.MONTH)
        val day = calender.get(Calendar.DAY_OF_MONTH)

        var strDate: CharSequence? = null

        val datePickerDialog =
                DatePickerDialog(activity, R.style.datepicker, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    calender.set(year, month, dayOfMonth)
                    val month = if (monthOfYear < 10) "0${monthOfYear + 1}" else monthOfYear
                    val day = if (dayOfMonth < 10) "0${dayOfMonth}" else dayOfMonth
                    textField.text = "$day/$month/$year"

/*

                    val dtStart =

                    val chosenDate = Time()
                    chosenDate.set(dayOfMonth, monthOfYear, year)
                    val dtDob = chosenDate.toMillis(true)
*/

//                    textField.setText(getCurrentDateFromCalendar("dd/MM/yyyy", calender))
//
//                    strDate = DateFormat.format(format, dtDob)

                }, year, month, day)
        if (applyMinValue) {
            val dtStart = "2020-01-01"
            val format = SimpleDateFormat("yyyy-MM-dd")
            try {
                val date = format.parse(dtStart)
                date?.time?.let {
                    datePickerDialog.datePicker.minDate = date?.time
                }
            } catch (e: ParseException) {
//                e.printStackTrace()
            }
        } else {
            datePickerDialog.datePicker.maxDate = Date().time
        }
        datePickerDialog.setOnDismissListener {
         /*   (activity as BaseActivity).setLocale(Locale("en", "US"))
            if (SELECTED_LANGUAGE == Constants.LANGUAGE_AR) {
                (activity as BaseActivity).setLocale(Locale("ar", "AE"))
            }*/
        }
//        (activity as BaseActivity).setLocale(Locale("en", "US"))
        // datePickerDialog.getDatePicker().setMinDate(calender.getTimeInMillis())
        datePickerDialog.show()
    }

    fun selectDate(activity: Context, textField: CustomTextView, format: String, applyMinValue: Boolean = false, datePickerOnDateListener: DatePickerDialog.OnDateSetListener) {
        val calender = Calendar.getInstance()
        val year = calender.get(Calendar.YEAR)
        val month = calender.get(Calendar.MONTH)
        val day = calender.get(Calendar.DAY_OF_MONTH)

        var strDate: CharSequence? = null

        val datePickerDialog =
            DatePickerDialog(activity, R.style.datepicker, datePickerOnDateListener, year, month, day)
        if (applyMinValue) {
            val dtStart = "2020-01-01"
            val format = SimpleDateFormat("yyyy-MM-dd")
            try {
                val date = format.parse(dtStart)
                date?.time?.let {
                    datePickerDialog.datePicker.minDate = date?.time
                }
            } catch (e: ParseException) {
                e.printStackTrace()
            }
        } else {
            datePickerDialog.datePicker.maxDate = Date().time
        }
        datePickerDialog.setOnDismissListener {
         /*   (activity as BaseActivity).setLocale(Locale("en", "US"))
            if (SELECTED_LANGUAGE == Constants.LANGUAGE_AR) {
                (activity as BaseActivity).setLocale(Locale("ar", "AE"))
            }*/
        }
//        (activity as BaseActivity).setLocale(Locale("en", "US"))
        // datePickerDialog.getDatePicker().setMinDate(calender.getTimeInMillis())
        datePickerDialog.show()
    }


    fun getCurrentDate(format: String?): String? {
        val c = Calendar.getInstance().time
        val df = SimpleDateFormat(format)
        return df.format(c)
    }

    fun getCurrentDateFromCalendar(format: String?, calendar: Calendar): String? {
        val df = SimpleDateFormat(format, Locale.US)
        return df.format(calendar.time)
    }

    fun formatDate(sourceDate: String, sourceFormat: String, destFormat: String): String {
        var format = SimpleDateFormat(sourceFormat, Locale.US)
        var newDate: Date? = null
        try {
            newDate = format.parse(sourceDate)
        } catch (e: ParseException) {
//            e.printStackTrace()
        }

        format = SimpleDateFormat(destFormat, Locale.US)
        return format.format(newDate)
    }

}
