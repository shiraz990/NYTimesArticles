package com.app.base.mainapp.data.source.remote.model.request

import com.google.gson.annotations.SerializedName

open class BaseRequest(
    baseRequest: BaseRequest?
) {
    @SerializedName("userId")
    var userId: String? = null

    @SerializedName("userToken")
    var userToken: String? = null

    @SerializedName("lang")
    var lang: String? = null

    @SerializedName("buildNumber")
    var buildNumber: String? = null

    @SerializedName("osVersion")
    var osVersion: String? = null

    @SerializedName("osType")
    var osType: String? = null

    @SerializedName("deviceId")
    var deviceId: String? = null

    @SerializedName("msisdn")
    var msisdn: String? = null

    @SerializedName("transactionId")
    var transactionId: String? = null

    @SerializedName("fcmToken")
    var fcmToken: String? = null

    init {
        setBaseRequest(baseRequest)
    }

    fun setBaseRequest(baseRequest: BaseRequest?) {
        if (baseRequest != null) {
            if (!baseRequest.userToken.isNullOrEmpty())
                userToken = baseRequest.userToken
            lang = baseRequest.lang
            buildNumber = baseRequest.buildNumber
            osVersion = baseRequest.osVersion
            osType = baseRequest.osType
            if (!baseRequest.msisdn.isNullOrEmpty()) {
                msisdn = baseRequest.msisdn
            }
            deviceId = baseRequest.deviceId
            fcmToken = baseRequest.fcmToken
            userId = baseRequest.userId
        }
    }

}