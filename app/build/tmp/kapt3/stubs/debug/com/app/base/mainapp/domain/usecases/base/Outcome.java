package com.app.base.mainapp.domain.usecases.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/base/Outcome;", "T", "", "()V", "End", "Error", "Failure", "HIDE", "NetworkError", "Start", "Success", "Lcom/app/base/mainapp/domain/usecases/base/Outcome$Start;", "Lcom/app/base/mainapp/domain/usecases/base/Outcome$End;", "Lcom/app/base/mainapp/domain/usecases/base/Outcome$Success;", "Lcom/app/base/mainapp/domain/usecases/base/Outcome$HIDE;", "Lcom/app/base/mainapp/domain/usecases/base/Outcome$Failure;", "Lcom/app/base/mainapp/domain/usecases/base/Outcome$NetworkError;", "Lcom/app/base/mainapp/domain/usecases/base/Outcome$Error;", "app_debug"})
public abstract class Outcome<T extends java.lang.Object> {
    
    private Outcome() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/base/Outcome$Start;", "T", "Lcom/app/base/mainapp/domain/usecases/base/Outcome;", "()V", "app_debug"})
    public static final class Start<T extends java.lang.Object> extends com.app.base.mainapp.domain.usecases.base.Outcome<T> {
        
        public Start() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/base/Outcome$End;", "T", "Lcom/app/base/mainapp/domain/usecases/base/Outcome;", "()V", "app_debug"})
    public static final class End<T extends java.lang.Object> extends com.app.base.mainapp.domain.usecases.base.Outcome<T> {
        
        public End() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0003\u001a\u00028\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\t"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/base/Outcome$Success;", "T", "Lcom/app/base/mainapp/domain/usecases/base/Outcome;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "setData", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.app.base.mainapp.domain.usecases.base.Outcome<T> {
        private T data;
        
        public final T getData() {
            return null;
        }
        
        public final void setData(T p0) {
        }
        
        public Success(T data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0003\u001a\u00028\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\t"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/base/Outcome$HIDE;", "T", "Lcom/app/base/mainapp/domain/usecases/base/Outcome;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "setData", "Ljava/lang/Object;", "app_debug"})
    public static final class HIDE<T extends java.lang.Object> extends com.app.base.mainapp.domain.usecases.base.Outcome<T> {
        private T data;
        
        public final T getData() {
            return null;
        }
        
        public final void setData(T p0) {
        }
        
        public HIDE(T data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/base/Outcome$Failure;", "T", "Lcom/app/base/mainapp/domain/usecases/base/Outcome;", "e", "Lcom/app/base/mainapp/data/source/remote/model/ErrorModel;", "(Lcom/app/base/mainapp/data/source/remote/model/ErrorModel;)V", "getE", "()Lcom/app/base/mainapp/data/source/remote/model/ErrorModel;", "app_debug"})
    public static final class Failure<T extends java.lang.Object> extends com.app.base.mainapp.domain.usecases.base.Outcome<T> {
        @org.jetbrains.annotations.Nullable()
        private final com.app.base.mainapp.data.source.remote.model.ErrorModel e = null;
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.base.mainapp.data.source.remote.model.ErrorModel getE() {
            return null;
        }
        
        public Failure(@org.jetbrains.annotations.Nullable()
        com.app.base.mainapp.data.source.remote.model.ErrorModel e) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/base/Outcome$NetworkError;", "T", "Lcom/app/base/mainapp/domain/usecases/base/Outcome;", "e", "", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class NetworkError<T extends java.lang.Object> extends com.app.base.mainapp.domain.usecases.base.Outcome<T> {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Throwable e = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable getE() {
            return null;
        }
        
        public NetworkError(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable e) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B+\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0019\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/base/Outcome$Error;", "T", "Lcom/app/base/mainapp/domain/usecases/base/Outcome;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "showErrorDialog", "", "message", "", "(Ljava/lang/Exception;ZLjava/lang/String;)V", "getE", "()Ljava/lang/Exception;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getShowErrorDialog", "()Z", "setShowErrorDialog", "(Z)V", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends com.app.base.mainapp.domain.usecases.base.Outcome<T> {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Exception e = null;
        private boolean showErrorDialog;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String message;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Exception getE() {
            return null;
        }
        
        public final boolean getShowErrorDialog() {
            return false;
        }
        
        public final void setShowErrorDialog(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMessage() {
            return null;
        }
        
        public final void setMessage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.Exception e, boolean showErrorDialog, @org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
    }
}