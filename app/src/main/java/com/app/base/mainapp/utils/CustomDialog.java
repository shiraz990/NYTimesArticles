package com.app.base.mainapp.utils;


import android.content.Context;
import android.content.DialogInterface;


public class CustomDialog {
   public static void showPermissionError(Context context, int message, DialogInterface.OnClickListener positiveEventListener) {
      /*   new AlertDialog.Builder(context)
                .setMessage(message)
                .setPositiveButton(R.string.proceed_label, positiveEventListener)
                .setNegativeButton(R.string.cancel, null)
                .create()
                .show();*/
    }

}

