package com.app.base.mainapp.utils.firebase

import android.app.ActivityManager
import android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND
import android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_VISIBLE
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.app.base.mainapp.MainApp
import com.app.base.mainapp.R
import com.app.base.mainapp.presentations.home.HomeActivity
import com.app.base.mainapp.utils.Constants
import com.app.base.mainapp.utils.preferences.PreferencesDataSource
import com.app.base.mainapp.utils.preferences.PreferencesDataSource.Keys.DEVICE_TOKEN
import org.koin.android.ext.android.inject

class FireBaseMessagingService : FirebaseMessagingService() {

    private val sharedPrefDataSource: PreferencesDataSource by inject()

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Check if message contains a notification payload.

//        Log.v("Firebase", "Received")
        /*remoteMessage.data.let {
            sharedPrefDataSource.putBoolean(Constants.VIA_NOTIFICATION, true)
        }*/
        sharedPrefDataSource.putBoolean(Constants.VIA_NOTIFICATION, true)
        try {
            remoteMessage.notification?.let {
                sendNotification(it.title, it.body)
            }
        } catch (e: Exception) {

        }

    }

    private fun sendNotification(title: String?, messageBody: String?) {
        if (title == null || messageBody == null) {
            return
        }
        val myProcess = ActivityManager.RunningAppProcessInfo()
        ActivityManager.getMyMemoryState(myProcess)
        val isInBackground =
            myProcess.importance != ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND

        val intent = Intent(this, HomeActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(
            this, 0, intent, PendingIntent.FLAG_ONE_SHOT
        )
        val channelId = getString(R.string.default_notification_channel_id)
        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val notificationBuilder = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(getNotificationIcon())
            .setContentTitle(title)
            .setColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
            .setContentText(messageBody)
            .setAutoCancel(true)
            .setSound(defaultSoundUri)
            .setContentIntent(pendingIntent)

        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Since android Oreo notification channel is needed.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "Channel human readable title",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(channel)
        }

        notificationManager.notify(
            0, notificationBuilder.build()
        )
    }

    @Override
    fun foregrounded(): Boolean {
        val appProcessInfo = ActivityManager.RunningAppProcessInfo()
        ActivityManager.getMyMemoryState(appProcessInfo)
        return (appProcessInfo.importance == IMPORTANCE_FOREGROUND || appProcessInfo.importance == IMPORTANCE_VISIBLE)
    }

    private fun getNotificationIcon(): Int {
        val useWhiteIcon = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
        return if (useWhiteIcon) R.mipmap.ic_icon else R.mipmap.ic_icon
    }

    override fun onNewToken(token: String) {
        sharedPrefDataSource.putString(DEVICE_TOKEN, token)
        (MainApp.applicationContext() as MainApp).deviceToken = token
    }

}
