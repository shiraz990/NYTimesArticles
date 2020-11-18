package com.app.base.mainapp.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/app/base/mainapp/base/FragmentBindingAdapters;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "bindImage", "", "imageView", "Landroid/widget/ImageView;", "url", "", "defaultImage", "Landroid/graphics/drawable/Drawable;", "bindImageResource", "resourceId", "", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "app_debug"})
public final class FragmentBindingAdapters {
    private final androidx.fragment.app.Fragment fragment = null;
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"imageUrl", "defaultImage"})
    public final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable defaultImage) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageResource"})
    public final void bindImageResource(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resourceId) {
    }
    
    public FragmentBindingAdapters(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        super();
    }
}