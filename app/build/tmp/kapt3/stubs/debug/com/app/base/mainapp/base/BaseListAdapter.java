package com.app.base.mainapp.base;

import java.lang.System;

/**
 * A generic RecyclerView adapter that uses Data Binding & DiffUtil.
 *
 * @param <T> Type of the items in the list
 * @param <V> The type of the ViewDataBinding
 * </V></T>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000eH$\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH$\u00a2\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/app/base/mainapp/base/BaseListAdapter;", "T", "V", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/app/base/mainapp/base/BaseViewHolder;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "bind", "", "binding", "item", "position", "", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;I)V", "createBinding", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Landroidx/databinding/ViewDataBinding;", "onBindViewHolder", "holder", "onCreateViewHolder", "app_debug"})
public abstract class BaseListAdapter<T extends java.lang.Object, V extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.ListAdapter<T, com.app.base.mainapp.base.BaseViewHolder<? extends V>> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.app.base.mainapp.base.BaseViewHolder<V> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract V createBinding(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType);
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.base.BaseViewHolder<? extends V> holder, int position) {
    }
    
    protected abstract void bind(@org.jetbrains.annotations.NotNull()
    V binding, T item, int position);
    
    public BaseListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback) {
        super(null);
    }
}