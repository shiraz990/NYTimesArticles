package com.app.base.mainapp.utils.custom_views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 \u00b0\u00012\u00020\u0001:\u0004\u00af\u0001\u00b0\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010R\u001a\u00020SH\u0002J\b\u0010T\u001a\u00020SH\u0002J\u0010\u0010U\u001a\u00020\u00072\u0006\u0010V\u001a\u000208H\u0002J\u0010\u0010W\u001a\u00020S2\u0006\u0010X\u001a\u00020YH\u0002J\u0018\u0010Z\u001a\u00020S2\u0006\u0010X\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020S2\u0006\u0010X\u001a\u00020YH\u0002J\u0018\u0010\\\u001a\u00020S2\u0006\u0010X\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u0007H\u0002J\u0018\u0010]\u001a\u00020S2\u0006\u0010X\u001a\u00020Y2\u0006\u0010^\u001a\u00020\u0017H\u0002J\u0018\u0010_\u001a\u00020S2\u0006\u0010X\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u0007H\u0002J\u0018\u0010`\u001a\u00020S2\u0006\u0010X\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u0007H\u0002J\u0010\u0010a\u001a\u00020S2\u0006\u0010X\u001a\u00020YH\u0002J\u0018\u0010b\u001a\u00020S2\u0006\u0010X\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u0007H\u0002J,\u0010c\u001a\u00020S2\u0006\u0010X\u001a\u00020Y2\b\u0010d\u001a\u0004\u0018\u00010G2\b\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010g\u001a\u00020\u0007H\u0002J\b\u0010h\u001a\u00020SH\u0014J\u0014\u0010i\u001a\u00020\u00072\n\u0010j\u001a\u00020k\"\u00020\u0007H\u0002J\u0012\u0010l\u001a\u0004\u0018\u00010G2\u0006\u0010[\u001a\u00020\u0007H\u0002J\u0010\u0010m\u001a\u00020S2\u0006\u0010n\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010o\u001a\u00020\u0017H\u0016J\b\u0010p\u001a\u00020SH\u0002J\b\u0010q\u001a\u00020SH\u0002J\b\u0010r\u001a\u00020SH\u0014J\b\u0010s\u001a\u00020SH\u0014J\u0010\u0010t\u001a\u00020S2\u0006\u0010X\u001a\u00020YH\u0014J\"\u0010u\u001a\u00020S2\u0006\u0010v\u001a\u00020\u00172\u0006\u0010w\u001a\u00020\u00072\b\u0010x\u001a\u0004\u0018\u00010PH\u0014J\u0018\u0010y\u001a\u00020S2\u0006\u0010z\u001a\u00020\u00072\u0006\u0010{\u001a\u00020\u0007H\u0014J\u0010\u0010|\u001a\u00020S2\u0006\u0010}\u001a\u00020\u0007H\u0016J\u0019\u0010~\u001a\u00020S2\u0006\u0010\u007f\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u0007H\u0014J,\u0010\u0081\u0001\u001a\u00020S2\u0006\u0010e\u001a\u00020f2\u0007\u0010\u0082\u0001\u001a\u00020\u00072\u0007\u0010\u0083\u0001\u001a\u00020\u00072\u0007\u0010\u0084\u0001\u001a\u00020\u0007H\u0014J\t\u0010\u0085\u0001\u001a\u00020SH\u0002J\u0010\u0010\u0086\u0001\u001a\u00020S2\u0007\u0010\u0087\u0001\u001a\u00020\u0017J\u0012\u0010\u0088\u0001\u001a\u00020S2\u0007\u0010\u0089\u0001\u001a\u00020\u0017H\u0016J\u0010\u0010\u008a\u0001\u001a\u00020S2\u0007\u0010\u008b\u0001\u001a\u00020\u0017J\u0012\u0010\u008c\u0001\u001a\u00020S2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010>J\u0011\u0010\u008e\u0001\u001a\u00020S2\b\b\u0001\u0010\r\u001a\u00020\u0007J\u0012\u0010\u008f\u0001\u001a\u00020S2\t\b\u0001\u0010\u0090\u0001\u001a\u00020\u0007J\u0012\u0010\u0091\u0001\u001a\u00020S2\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010*J\u0011\u0010\u0091\u0001\u001a\u00020S2\b\b\u0001\u0010\r\u001a\u00020\u0007J\u0012\u0010\u0093\u0001\u001a\u00020S2\u0007\u0010\u0094\u0001\u001a\u00020\u0007H\u0002J\u0012\u0010\u0095\u0001\u001a\u00020S2\u0007\u0010\u0096\u0001\u001a\u000208H\u0016J\u001b\u0010\u0095\u0001\u001a\u00020S2\u0007\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u000208H\u0016J\u0015\u0010\u0098\u0001\u001a\u00020S2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u009a\u0001H\u0016J\u001e\u0010\u0098\u0001\u001a\u00020S2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u009c\u0001\u001a\u00020SH\u0002J\t\u0010\u009d\u0001\u001a\u00020\u0017H\u0002J\t\u0010\u009e\u0001\u001a\u00020SH\u0002J\t\u0010\u009f\u0001\u001a\u00020SH\u0002J\t\u0010\u00a0\u0001\u001a\u00020SH\u0002J\t\u0010\u00a1\u0001\u001a\u00020SH\u0002J\u0011\u0010\u00a2\u0001\u001a\u00020S2\u0006\u0010[\u001a\u00020\u0007H\u0002J\t\u0010\u00a3\u0001\u001a\u00020SH\u0002J\u0011\u0010\u00a4\u0001\u001a\u00020S2\u0006\u0010[\u001a\u00020\u0007H\u0002J6\u0010\u00a5\u0001\u001a\u00020S2\u0007\u0010\u00a6\u0001\u001a\u00020A2\u0007\u0010\u00a7\u0001\u001a\u0002082\u0007\u0010\u00a8\u0001\u001a\u0002082\u0007\u0010\u00a9\u0001\u001a\u00020\u00172\u0007\u0010\u00aa\u0001\u001a\u00020\u0017H\u0002JH\u0010\u00a5\u0001\u001a\u00020S2\u0007\u0010\u00a6\u0001\u001a\u00020A2\u0007\u0010\u00a7\u0001\u001a\u0002082\u0007\u0010\u00a8\u0001\u001a\u0002082\u0007\u0010\u00ab\u0001\u001a\u00020\u00172\u0007\u0010\u00ac\u0001\u001a\u00020\u00172\u0007\u0010\u00ad\u0001\u001a\u00020\u00172\u0007\u0010\u00ae\u0001\u001a\u00020\u0017H\u0002R \u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078G@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u0011R$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u0011R$\u0010!\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u0011R$\u0010$\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00078G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u0011R$\u0010\'\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u0011R\"\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\t\u001a\u0004\u0018\u00010*@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R$\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u0011R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0018\u000105R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020AX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020PX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00b1\u0001"}, d2 = {"Lcom/app/base/mainapp/utils/custom_views/PinView;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "currentLineColor", "getCurrentLineColor", "()I", "color", "cursorColor", "getCursorColor", "setCursorColor", "(I)V", "width", "cursorWidth", "getCursorWidth", "setCursorWidth", "drawCursor", "", "isAnimationEnable", "isCursorVisible", "count", "itemCount", "getItemCount", "setItemCount", "itemHeight", "getItemHeight", "setItemHeight", "itemRadius", "getItemRadius", "setItemRadius", "itemSpacing", "getItemSpacing", "setItemSpacing", "itemWidth", "getItemWidth", "setItemWidth", "Landroid/content/res/ColorStateList;", "lineColors", "getLineColors", "()Landroid/content/res/ColorStateList;", "borderWidth", "lineWidth", "getLineWidth", "setLineWidth", "mAnimatorTextPaint", "Landroid/text/TextPaint;", "mBlink", "Lcom/app/base/mainapp/utils/custom_views/PinView$Blink;", "mCursorColor", "mCursorHeight", "", "mCursorWidth", "mDefaultAddAnimator", "Landroid/animation/ValueAnimator;", "mHideLineWhenFilled", "mItemBackground", "Landroid/graphics/drawable/Drawable;", "mItemBackgroundResource", "mItemBorderRect", "Landroid/graphics/RectF;", "mItemCenterPoint", "Landroid/graphics/PointF;", "mItemLineRect", "mLineWidth", "mPaint", "Landroid/graphics/Paint;", "mPath", "Landroid/graphics/Path;", "mPinItemCount", "mPinItemHeight", "mPinItemRadius", "mPinItemSpacing", "mPinItemWidth", "mTextRect", "Landroid/graphics/Rect;", "mViewType", "checkItemRadius", "", "disableSelectionMenu", "dpToPx", "dp", "drawAnchorLine", "canvas", "Landroid/graphics/Canvas;", "drawCircle", "i", "drawHint", "drawItemBackground", "highlight", "drawPinBox", "drawPinLine", "drawPinView", "drawText", "drawTextAtBox", "paint", "text", "", "charAt", "drawableStateChanged", "getLineColorForState", "states", "", "getPaintByIndex", "invalidateCursor", "showCursor", "isSuggestionsEnabled", "makeBlink", "moveSelectionToEnd", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "onFocusChanged", "focused", "direction", "previouslyFocusedRect", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onScreenStateChanged", "screenState", "onSelectionChanged", "selStart", "selEnd", "onTextChanged", "start", "lengthBefore", "lengthAfter", "resumeBlink", "setAnimationEnable", "enable", "setCursorVisible", "visible", "setHideLineWhenFilled", "hideLineWhenFilled", "setItemBackground", "background", "setItemBackgroundColor", "setItemBackgroundResources", "resId", "setLineColor", "colors", "setMaxLength", "maxLength", "setTextSize", "size", "unit", "setTypeface", "tf", "Landroid/graphics/Typeface;", "style", "setupAnimator", "shouldBlink", "suspendBlink", "updateCenterPoint", "updateColors", "updateCursorHeight", "updateItemRectF", "updatePaints", "updatePinBoxPath", "updateRoundRectPath", "rectF", "rx", "ry", "l", "r", "tl", "tr", "br", "bl", "Blink", "Companion", "app_debug"})
public final class PinView extends androidx.appcompat.widget.AppCompatEditText {
    private final int mViewType = 0;
    private int mPinItemCount;
    private int mPinItemWidth;
    private int mPinItemHeight;
    private int mPinItemRadius;
    private int mPinItemSpacing;
    private final android.graphics.Paint mPaint = null;
    private final android.text.TextPaint mAnimatorTextPaint = null;
    
    /**
     * Gets the line colors for the different states (normal, selected, focused) of the PinView.
     *
     * @attr ref R.styleable#PinView_lineColor
     * @see .setLineColor
     * @see .setLineColor
     */
    @org.jetbrains.annotations.Nullable()
    private android.content.res.ColorStateList lineColors;
    
    /**
     * Return the current color selected for normal line.
     *
     * @return Returns the current item's line color.
     */
    private int currentLineColor;
    private int mLineWidth;
    private final android.graphics.Rect mTextRect = null;
    private final android.graphics.RectF mItemBorderRect = null;
    private final android.graphics.RectF mItemLineRect = null;
    private final android.graphics.Path mPath = null;
    private final android.graphics.PointF mItemCenterPoint = null;
    private android.animation.ValueAnimator mDefaultAddAnimator;
    private boolean isAnimationEnable;
    private com.app.base.mainapp.utils.custom_views.PinView.Blink mBlink;
    private boolean isCursorVisible;
    private boolean drawCursor;
    private float mCursorHeight;
    private int mCursorWidth;
    private int mCursorColor;
    private int mItemBackgroundResource;
    private android.graphics.drawable.Drawable mItemBackground;
    private boolean mHideLineWhenFilled;
    private static final java.lang.String TAG = "PinView";
    private static final boolean DBG = false;
    private static final int BLINK = 500;
    private static final int DEFAULT_COUNT = 4;
    private static final android.text.InputFilter[] NO_FILTERS = null;
    private static final int[] HIGHLIGHT_STATES = null;
    private static final int VIEW_TYPE_RECTANGLE = 0;
    private static final int VIEW_TYPE_LINE = 1;
    private static final int VIEW_TYPE_NONE = 2;
    public static final com.app.base.mainapp.utils.custom_views.PinView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.res.ColorStateList getLineColors() {
        return null;
    }
    
    @androidx.annotation.ColorInt()
    public final int getCurrentLineColor() {
        return 0;
    }
    
    @java.lang.Override()
    public void setTypeface(@org.jetbrains.annotations.Nullable()
    android.graphics.Typeface tf, int style) {
    }
    
    @java.lang.Override()
    public void setTypeface(@org.jetbrains.annotations.Nullable()
    android.graphics.Typeface tf) {
    }
    
    private final void setMaxLength(int maxLength) {
    }
    
    private final void setupAnimator() {
    }
    
    private final void checkItemRadius() {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int start, int lengthBefore, int lengthAfter) {
    }
    
    @java.lang.Override()
    protected void onFocusChanged(boolean focused, int direction, @org.jetbrains.annotations.Nullable()
    android.graphics.Rect previouslyFocusedRect) {
    }
    
    @java.lang.Override()
    protected void onSelectionChanged(int selStart, int selEnd) {
    }
    
    private final void moveSelectionToEnd() {
    }
    
    @java.lang.Override()
    protected void drawableStateChanged() {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void updatePaints() {
    }
    
    private final void drawPinView(android.graphics.Canvas canvas) {
    }
    
    private final int getLineColorForState(int... states) {
        return 0;
    }
    
    private final void drawItemBackground(android.graphics.Canvas canvas, boolean highlight) {
    }
    
    private final void updatePinBoxPath(int i) {
    }
    
    private final void drawPinBox(android.graphics.Canvas canvas, int i) {
    }
    
    private final void drawPinLine(android.graphics.Canvas canvas, int i) {
    }
    
    private final void drawCursor(android.graphics.Canvas canvas) {
    }
    
    private final void updateRoundRectPath(android.graphics.RectF rectF, float rx, float ry, boolean l, boolean r) {
    }
    
    private final void updateRoundRectPath(android.graphics.RectF rectF, float rx, float ry, boolean tl, boolean tr, boolean br, boolean bl) {
    }
    
    private final void updateItemRectF(int i) {
    }
    
    private final void drawText(android.graphics.Canvas canvas, int i) {
    }
    
    private final void drawHint(android.graphics.Canvas canvas, int i) {
    }
    
    private final void drawTextAtBox(android.graphics.Canvas canvas, android.graphics.Paint paint, java.lang.CharSequence text, int charAt) {
    }
    
    private final void drawCircle(android.graphics.Canvas canvas, int i) {
    }
    
    private final android.graphics.Paint getPaintByIndex(int i) {
        return null;
    }
    
    /**
     * For seeing the font position
     */
    private final void drawAnchorLine(android.graphics.Canvas canvas) {
    }
    
    private final void updateColors() {
    }
    
    private final void updateCenterPoint() {
    }
    
    /**
     * Sets the line color for all the states (normal, selected,
     * focused) to be this color.
     *
     * @param color A color value in the form 0xAARRGGBB.
     * Do not pass a resource ID. To get a color value from a resource ID, call
     * [getColor][androidx.core.content.ContextCompat.getColor].
     * @attr ref R.styleable#PinView_lineColor
     * @see .setLineColor
     * @see .getLineColors
     */
    public final void setLineColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    /**
     * Sets the line color.
     *
     * @attr ref R.styleable#PinView_lineColor
     * @see .setLineColor
     * @see .getLineColors
     */
    public final void setLineColor(@org.jetbrains.annotations.Nullable()
    android.content.res.ColorStateList colors) {
    }
    
    public final int getLineWidth() {
        return 0;
    }
    
    public final void setLineWidth(int borderWidth) {
    }
    
    public final int getItemCount() {
        return 0;
    }
    
    public final void setItemCount(int count) {
    }
    
    public final int getItemRadius() {
        return 0;
    }
    
    public final void setItemRadius(int itemRadius) {
    }
    
    @androidx.annotation.Px()
    public final int getItemSpacing() {
        return 0;
    }
    
    public final void setItemSpacing(int itemSpacing) {
    }
    
    public final int getItemHeight() {
        return 0;
    }
    
    public final void setItemHeight(int itemHeight) {
    }
    
    public final int getItemWidth() {
        return 0;
    }
    
    public final void setItemWidth(int itemWidth) {
    }
    
    /**
     * Specifies whether the text animation should be enabled or disabled.
     * By the default, the animation is disabled.
     *
     * @param enable True to start animation when adding text, false to transition immediately
     */
    public final void setAnimationEnable(boolean enable) {
    }
    
    /**
     * Specifies whether the line (border) should be hidden or visible when text entered.
     * By the default, this flag is false and the line is always drawn.
     *
     * @param hideLineWhenFilled true to hide line on a position where text entered,
     * false to always show line
     * @attr ref R.styleable#PinView_hideLineWhenFilled
     */
    public final void setHideLineWhenFilled(boolean hideLineWhenFilled) {
    }
    
    @java.lang.Override()
    public void setTextSize(float size) {
    }
    
    @java.lang.Override()
    public void setTextSize(int unit, float size) {
    }
    
    /**
     * Set the item background to a given resource. The resource should refer to
     * a Drawable object or 0 to remove the item background.
     *
     * @param resId The identifier of the resource.
     * @attr ref R.styleable#PinView_android_itemBackground
     */
    public final void setItemBackgroundResources(@androidx.annotation.DrawableRes()
    int resId) {
    }
    
    /**
     * Sets the item background color for this view.
     *
     * @param color the color of the item background
     */
    public final void setItemBackgroundColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    /**
     * Set the item background to a given Drawable, or remove the background.
     *
     * @param background The Drawable to use as the item background, or null to remove the
     * item background
     */
    public final void setItemBackground(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable background) {
    }
    
    public final int getCursorWidth() {
        return 0;
    }
    
    public final void setCursorWidth(int width) {
    }
    
    public final int getCursorColor() {
        return 0;
    }
    
    public final void setCursorColor(int color) {
    }
    
    @java.lang.Override()
    public void setCursorVisible(boolean visible) {
    }
    
    @java.lang.Override()
    public boolean isCursorVisible() {
        return false;
    }
    
    @java.lang.Override()
    public void onScreenStateChanged(int screenState) {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    private final boolean shouldBlink() {
        return false;
    }
    
    private final void makeBlink() {
    }
    
    private final void suspendBlink() {
    }
    
    private final void resumeBlink() {
    }
    
    private final void invalidateCursor(boolean showCursor) {
    }
    
    private final void updateCursorHeight() {
    }
    
    private final void disableSelectionMenu() {
    }
    
    @java.lang.Override()
    public boolean isSuggestionsEnabled() {
        return false;
    }
    
    private final int dpToPx(float dp) {
        return 0;
    }
    
    public PinView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public PinView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PinView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/app/base/mainapp/utils/custom_views/PinView$Blink;", "Ljava/lang/Runnable;", "(Lcom/app/base/mainapp/utils/custom_views/PinView;)V", "mCancelled", "", "cancel", "", "run", "uncancel", "app_debug"})
    final class Blink implements java.lang.Runnable {
        private boolean mCancelled;
        
        @java.lang.Override()
        public void run() {
        }
        
        public final void cancel() {
        }
        
        public final void uncancel() {
        }
        
        public Blink() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/app/base/mainapp/utils/custom_views/PinView$Companion;", "", "()V", "BLINK", "", "DBG", "", "DEFAULT_COUNT", "HIGHLIGHT_STATES", "", "NO_FILTERS", "", "Landroid/text/InputFilter;", "[Landroid/text/InputFilter;", "TAG", "", "VIEW_TYPE_LINE", "VIEW_TYPE_NONE", "VIEW_TYPE_RECTANGLE", "isPasswordInputType", "inputType", "app_debug"})
    public static final class Companion {
        
        private final boolean isPasswordInputType(int inputType) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}