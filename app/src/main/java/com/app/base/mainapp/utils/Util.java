package com.app.base.mainapp.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.app.base.mainapp.BuildConfig;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/**
 * Created by El-Tohamy on 16/11/2016.
 */

public class Util {

    public static FirebaseAnalytics mFireBaseAnalytics;
    private static Sensor mAccelerometer = null;
    private static SensorManager mSensorManager;

    public static Typeface getTypeFaceFromAsset(Context context, int stringRes) {
        final Typeface tf = Typeface.createFromAsset(context.getAssets(), context.getResources().getString(stringRes));
        return tf;
    }

    public static float dpFromPx(final Context context, final float px) {
        return px / context.getResources().getDisplayMetrics().density;
    }

    public static float pxFromDp(final Context context, final float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }

    public static void hideKeyboard(Activity context, View focusedView) {
        if (focusedView != null) {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(focusedView.getWindowToken(), 0);
        }
    }

    public static void hideKeyboard(Activity context) {
        context.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }

    public static void openKeyboar(Activity context, EditText view) {
        InputMethodManager imgr = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imgr.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
        imgr.showSoftInput(view, 0);
        view.requestFocus();
    }

    public static String getApplicationVersion(Context mContext) {
        String version = "";
        try {
            PackageManager manager = mContext.getPackageManager();
            PackageInfo info = manager.getPackageInfo(
                    mContext.getPackageName(), 0);
            version = info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }

    public static String getDataDir(final Context context) {
        return Environment.getExternalStorageDirectory() + "/" + context.getPackageName();
//        try {
//         return context.getPackageManager().getPackageInfo(context.getTitle(), 0).applicationInfo.dataDir;
//        }
//        catch (PackageManager.NameNotFoundException e){
//            e.printStackTrace();
//            return "";
//        }
    }

    public static void sendSmsWithoutPendingIntent(Activity activity, String smsNumber, String body, int code) {

        try {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            sendIntent.setData(Uri.parse("sms:"));
            sendIntent.setData(Uri.parse("smsto:" + smsNumber));
            sendIntent.putExtra("sms_body", body);
            activity.startActivityForResult(sendIntent, code);

        } catch (Exception ex) {
        }
    }


    public static void moveOutOfFullScreen(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR// show the status bar programatically
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }


    public static void launchSmsApp(Activity activity, String smsNumber, String smsBody, int resquestCode) {
//        Uri sms_uri = Uri.parse("smsto:" + smsNumber);
//        Intent sms_intent = new Intent(Intent.ACTION_SENDTO, sms_uri);
//        sms_intent.putExtra("sms_body", smsBody);
//       // sms_intent.putExtra("exit_on_sent", true);
//        sms_intent.setPackage("com.google.android.apps.messaging");
//        sms_intent.addCategory(Intent.CATEGORY_DEFAULT);
//        activity.startActivityForResult(sms_intent, resquestCode);

        try {
            Uri smsUri = Uri.parse("smsto:" + smsNumber);
            Intent smsIntent = new Intent(Intent.ACTION_SENDTO, smsUri);
            smsIntent.putExtra("sms_body", smsBody);
            smsIntent.putExtra("exit_on_sent", true);
            PackageManager pm = activity.getPackageManager();
            List<ResolveInfo> resInfo = pm.queryIntentActivities(smsIntent, 0);
            for (int i = 0; i < resInfo.size(); i++) {
                ResolveInfo ri = resInfo.get(i);
                String packageName = ri.activityInfo.packageName;

                if (packageName.contains("sms") || packageName.contains("messaging")) {
                    //Log.d("TAG", packageName + " : " + ri.activityInfo.name);
                    smsIntent.setComponent(new ComponentName(packageName, ri.activityInfo.name));
                    break;
                }
            }
            activity.startActivityForResult(smsIntent, resquestCode);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void launchSmsApp(Fragment fragment, String smsNumber, String smsBody, int resquestCode) {
//        Uri sms_uri = Uri.parse("smsto:" + smsNumber);
//        Intent sms_intent = new Intent(Intent.ACTION_SENDTO, sms_uri);
//        sms_intent.putExtra("sms_body", smsBody);
//        sms_intent.putExtra("exit_on_sent", true);
//        fragment.startActivityForResult(sms_intent, resquestCode);


        try {
            Uri smsUri = Uri.parse("smsto:" + smsNumber);
            Intent smsIntent = new Intent(Intent.ACTION_SENDTO, smsUri);
            smsIntent.putExtra("sms_body", smsBody);
            smsIntent.putExtra("exit_on_sent", true);
            PackageManager pm = fragment.getActivity().getPackageManager();
            List<ResolveInfo> resInfo = pm.queryIntentActivities(smsIntent, 0);
            for (int i = 0; i < resInfo.size(); i++) {
                ResolveInfo ri = resInfo.get(i);
                String packageName = ri.activityInfo.packageName;

                if (packageName.contains("sms") || packageName.contains("messaging")) {
                    //Log.d("TAG", packageName + " : " + ri.activityInfo.name);
                    smsIntent.setComponent(new ComponentName(packageName, ri.activityInfo.name));
                    break;
                }
            }
            fragment.startActivityForResult(smsIntent, resquestCode);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static float dp2px(Resources resources, float dp) {
        final float scale = resources.getDisplayMetrics().density;
        return dp * scale + 0.5f;
    }

    public static float sp2px(Resources resources, float sp) {
        final float scale = resources.getDisplayMetrics().scaledDensity;
        return sp * scale;
    }

    public static void setEditTextWithNull(EditText viewToSet, String textToSet) {
        InputMethodManager imm = (InputMethodManager) viewToSet.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (viewToSet == null) {
            return;
        } else {
            if (textToSet != null && textToSet.length() > 0) {
                viewToSet.setText(textToSet);
                viewToSet.clearFocus();
                imm.hideSoftInputFromWindow(viewToSet.getWindowToken(), 0);  // hide the soft keyboard
                viewToSet.setCursorVisible(true);
            } else {
                viewToSet.setText("");
                viewToSet.clearFocus();
            }
        }
    }

    public static void setTextViewWithNull(TextView viewToSet, String textToSet) {
        if (viewToSet == null) {
            return;
        } else {
            if(textToSet==null){
                return;
            }
            if (textToSet != null && textToSet.length() > 0) {
                viewToSet.setText(textToSet);
                viewToSet.clearFocus();
            } else {
                viewToSet.setText("");
                viewToSet.clearFocus();
            }
        }
    }

    public static boolean isNumberValid(String text) {
        return text != null && text.length() > 0;
    }

    public static boolean isEmailValid(String text) {
        return text != null && text.length() > 0 && text.contains("@");
    }

    public static boolean isAmountValid(int lowerLimit, int upperLimit, String amount) {

        try {
            return amount.length() > 0 && Integer.parseInt(amount) >= lowerLimit && Integer.parseInt(amount) <= upperLimit;
        } catch (NumberFormatException ex) {
            return false;

        }
    }

    public static String getFormattedNumber(String number) {
        if (TextUtils.isEmpty(number)) return "";
        number = number.replaceAll("-", "");
        number = number.replaceAll(" ", "");
        number = number.replaceFirst("00971", "0");
        number = number.replaceFirst("\\+971", "0");
        number = number.replaceAll("\\(", "");
        number = number.replaceAll("\\)", "");
        return number;
    }


    public static String removeSpaces(String text) {
        if (TextUtils.isEmpty(text)) return "";
        return text.replaceAll(" ", "").trim();
    }

    public static void logException(Exception ex) {
        if (ex instanceof IllegalStateException) {
            return;
        } else if (ex != null) {
            if (BuildConfig.DEBUG) {
                ex.printStackTrace();
                return;
            }
        }
    }

    public static String getShortName(String name) {
        if (name != null) {
            String firstName = name, lastName = "";
            int index = name.indexOf(" ");
            if (index > 0)
                firstName = name.substring(0, index);
            index = name.lastIndexOf(" ");
            if (index > 0)
                lastName = name.substring(index + 1);
            return firstName + " " + lastName;
        } else {
            return "";
        }
    }

    public static String getFirstName(String name) {
        if (TextUtils.isEmpty(name)) return "";
        String firstName = name;
        int index = name.indexOf(" ");
        if (index > 0)
            firstName = name.substring(0, index);

        return firstName;
    }

    public static String toTitleCase(String str) {
        if (str == null) {
            return null;
        }
        String NewText = str.trim();
        if (NewText == null) {
            return null;
        }

        boolean space = true;
        StringBuilder builder = new StringBuilder(NewText);
        final int len = builder.length();

        for (int i = 0; i < len; ++i) {
            char c = builder.charAt(i);
            if (space) {
                if (!Character.isWhitespace(c)) {
                    // Convert to title case and switch out of whitespace mode.
                    builder.setCharAt(i, Character.toTitleCase(c));
                    space = false;
                }
            } else if (Character.isWhitespace(c)) {
                space = true;
            } else {
                builder.setCharAt(i, Character.toLowerCase(c));
            }
        }

        return builder.toString();
    }

    public static void setStatusBarTransparent(Activity activity) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            activity.getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else {
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        ViewGroup rootView = (ViewGroup) ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0);
        rootView.setFitsSystemWindows(true);
        rootView.setClipToPadding(true);

        ViewGroup contentView = activity.findViewById(android.R.id.content);
        if (contentView.getChildCount() > 1) {
            contentView.removeViewAt(1);
        }

        int res = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int height = 0;
        if (res != 0)
            height = activity.getResources().getDimensionPixelSize(res);

        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) contentView.getLayoutParams();
        lp.setMargins(lp.getMarginStart(), -height, lp.getMarginEnd(), 0);
    }

    public static void resetStatusBar(Activity activity) {
        /*if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            activity.getWindow().setStatusBarColor(ContextCompat.getColor(activity, R.color.color_Primary));
        } else {
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        ViewGroup rootView = (ViewGroup) ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0);
        rootView.setFitsSystemWindows(true);
        rootView.setClipToPadding(true);

        ViewGroup contentView = (ViewGroup) activity.findViewById(android.R.id.content);
        if (contentView.getChildCount() > 1) {
            contentView.removeViewAt(1);
        }
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) contentView.getLayoutParams();
        lp.setMargins(lp.getMarginStart(), 0, lp.getMarginEnd(), 0);
        View view = contentView.findViewById(R.id.side_menu_main);
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }*/
    }

}
