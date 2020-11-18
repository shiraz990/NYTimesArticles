package com.app.base.mainapp.utils.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/app/base/mainapp/utils/firebase/FireBaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "sharedPrefDataSource", "Lcom/app/base/mainapp/utils/preferences/PreferencesDataSource;", "getSharedPrefDataSource", "()Lcom/app/base/mainapp/utils/preferences/PreferencesDataSource;", "sharedPrefDataSource$delegate", "Lkotlin/Lazy;", "foregrounded", "", "getNotificationIcon", "", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "sendNotification", "title", "messageBody", "app_debug"})
public final class FireBaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private final kotlin.Lazy sharedPrefDataSource$delegate = null;
    
    private final com.app.base.mainapp.utils.preferences.PreferencesDataSource getSharedPrefDataSource() {
        return null;
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void sendNotification(java.lang.String title, java.lang.String messageBody) {
    }
    
    @java.lang.Override()
    public final boolean foregrounded() {
        return false;
    }
    
    private final int getNotificationIcon() {
        return 0;
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public FireBaseMessagingService() {
        super();
    }
}