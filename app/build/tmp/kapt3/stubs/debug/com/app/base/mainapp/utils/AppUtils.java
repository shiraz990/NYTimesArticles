package com.app.base.mainapp.utils;

import java.lang.System;

@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0010J\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.J\u001e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u00020.2\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u00020.2\u0006\u00108\u001a\u000209H\u0002J:\u0010:\u001a\u0004\u0018\u00010\u00042\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020.2\u0006\u0010>\u001a\u0002062\u0006\u0010?\u001a\u0002062\u0006\u0010@\u001a\u000206H\u0002J \u0010A\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u0010J\u001e\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0010H\u0007J\u0011\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001c0H\u00a2\u0006\u0002\u0010IJ\u0010\u0010J\u001a\u0002042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\"\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u00102\u0006\u0010P\u001a\u00020QH\u0007J\"\u0010K\u001a\u00020L2\u0006\u0010R\u001a\u00020S2\b\u0010O\u001a\u0004\u0018\u00010\u00102\u0006\u0010P\u001a\u00020QH\u0007J\u0010\u0010T\u001a\u00020L2\b\b\u0001\u0010M\u001a\u00020NJ \u0010U\u001a\u00020L2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u0010J\u0016\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006\\"}, d2 = {"Lcom/app/base/mainapp/utils/AppUtils;", "", "()V", "bitmapBack", "Landroid/graphics/Bitmap;", "getBitmapBack", "()Landroid/graphics/Bitmap;", "setBitmapBack", "(Landroid/graphics/Bitmap;)V", "bitmapFront", "getBitmapFront", "setBitmapFront", "bitmapOriginal", "getBitmapOriginal", "setBitmapOriginal", "blockCharacterSet", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "crypto", "Lcom/yakivmospan/scytale/Crypto;", "getCrypto", "()Lcom/yakivmospan/scytale/Crypto;", "setCrypto", "(Lcom/yakivmospan/scytale/Crypto;)V", "filter", "Landroid/text/InputFilter;", "getFilter", "()Landroid/text/InputFilter;", "generatedKey", "Ljavax/crypto/SecretKey;", "getGeneratedKey", "()Ljavax/crypto/SecretKey;", "setGeneratedKey", "(Ljavax/crypto/SecretKey;)V", "store", "Lcom/yakivmospan/scytale/Store;", "getStore", "()Lcom/yakivmospan/scytale/Store;", "bitmapToFile", "Landroid/net/Uri;", "bitmap", "path", "angle", "", "boldSpecificPart", "Landroid/text/SpannableStringBuilder;", "actualText", "targetStringToFormat", "matchCase", "", "dpToPx", "", "dp", "resources", "Landroid/content/res/Resources;", "generateBitmap", "contentsToEncode", "imageWidth", "imageHeight", "marginSize", "color", "colorBack", "generateQRCode", "userId", "msidn", "getBaseRequest", "Lcom/app/base/mainapp/data/source/remote/model/request/BaseRequest;", "msisdn", "getInputFilter", "", "()[Landroid/text/InputFilter;", "isRooted", "loadImage", "", "activity", "Landroid/app/Activity;", "url", "imageView", "Landroid/widget/ImageView;", "fragment", "Landroidx/fragment/app/Fragment;", "restartApplication", "saveImageBitmap", "file", "fileName", "setTitleToolbar", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "title", "app_debug"})
public final class AppUtils {
    @org.jetbrains.annotations.NotNull()
    private static final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static android.graphics.Bitmap bitmapFront;
    @org.jetbrains.annotations.NotNull()
    public static android.graphics.Bitmap bitmapBack;
    @org.jetbrains.annotations.NotNull()
    public static android.graphics.Bitmap bitmapOriginal;
    @org.jetbrains.annotations.Nullable()
    private static javax.crypto.SecretKey generatedKey;
    @org.jetbrains.annotations.NotNull()
    private static final com.yakivmospan.scytale.Store store = null;
    @org.jetbrains.annotations.NotNull()
    private static com.yakivmospan.scytale.Crypto crypto;
    private static final java.lang.String blockCharacterSet = "~#^|$%&*!@.;:\'(){}";
    @org.jetbrains.annotations.NotNull()
    private static final android.text.InputFilter filter = null;
    public static final com.app.base.mainapp.utils.AppUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmapFront() {
        return null;
    }
    
    public final void setBitmapFront(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmapBack() {
        return null;
    }
    
    public final void setBitmapBack(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmapOriginal() {
        return null;
    }
    
    public final void setBitmapOriginal(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final javax.crypto.SecretKey getGeneratedKey() {
        return null;
    }
    
    public final void setGeneratedKey(@org.jetbrains.annotations.Nullable()
    javax.crypto.SecretKey p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yakivmospan.scytale.Store getStore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yakivmospan.scytale.Crypto getCrypto() {
        return null;
    }
    
    public final void setCrypto(@org.jetbrains.annotations.NotNull()
    com.yakivmospan.scytale.Crypto p0) {
    }
    
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView) {
    }
    
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.app.base.mainapp.data.source.remote.model.request.BaseRequest getBaseRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String msisdn, @org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri bitmapToFile(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri bitmapToFile(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.lang.String path, float angle) {
        return null;
    }
    
    public final void setTitleToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar toolbar, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final int dpToPx(float dp, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    private final int dpToPx(float dp, android.content.res.Resources resources) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap generateQRCode(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String msidn) {
        return null;
    }
    
    public final boolean isRooted(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return false;
    }
    
    public final void restartApplication(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.app.Activity activity) {
    }
    
    private final android.graphics.Bitmap generateBitmap(java.lang.String contentsToEncode, float imageWidth, float imageHeight, int marginSize, int color, int colorBack) {
        return null;
    }
    
    public final void saveImageBitmap(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap file, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.InputFilter[] getInputFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.SpannableStringBuilder boldSpecificPart(@org.jetbrains.annotations.NotNull()
    java.lang.String actualText, @org.jetbrains.annotations.NotNull()
    java.lang.String targetStringToFormat, boolean matchCase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.InputFilter getFilter() {
        return null;
    }
    
    private AppUtils() {
        super();
    }
}