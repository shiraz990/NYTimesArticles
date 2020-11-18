package com.app.base.mainapp.utils.custom_views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/app/base/mainapp/utils/custom_views/CustomViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "swipeEnabled", "", "getSwipeEnabled", "()Z", "setSwipeEnabled", "(Z)V", "executeKeyEvent", "event", "Landroid/view/KeyEvent;", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "app_debug"})
public final class CustomViewPager extends androidx.viewpager.widget.ViewPager {
    private boolean swipeEnabled;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getSwipeEnabled() {
        return false;
    }
    
    public final void setSwipeEnabled(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    @java.lang.Override()
    public boolean executeKeyEvent(@org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    public CustomViewPager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
}