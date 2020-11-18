package com.app.base.mainapp.data.source.remote

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("status")
    var responseCode: Int,
    @SerializedName("message")
    var responseMessage: String?,
    @SerializedName("data")
    var data: T? = null,
    @SerializedName("errors")
    var errors: ArrayList<Error>? = ArrayList()
)