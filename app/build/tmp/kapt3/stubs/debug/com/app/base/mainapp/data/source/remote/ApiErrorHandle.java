package com.app.base.mainapp.data.source.remote;

import java.lang.System;

/**
 * This class trace exceptions(api call or parse data or connection errors) &
 * depending on what exception returns a [ErrorModel]
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a8\u0006\n"}, d2 = {"Lcom/app/base/mainapp/data/source/remote/ApiErrorHandle;", "", "()V", "getHttpError", "Lcom/app/base/mainapp/data/source/remote/model/ErrorModel;", "body", "Lokhttp3/ResponseBody;", "traceErrorException", "throwable", "", "app_debug"})
public final class ApiErrorHandle {
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.base.mainapp.data.source.remote.model.ErrorModel traceErrorException(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
        return null;
    }
    
    /**
     * attempts to parse http response body and get error data from it
     *
     * @param body retrofit response body
     * @return returns an instance of [ErrorModel] with parsed data or NOT_DEFINED status
     */
    private final com.app.base.mainapp.data.source.remote.model.ErrorModel getHttpError(okhttp3.ResponseBody body) {
        return null;
    }
    
    public ApiErrorHandle() {
        super();
    }
}