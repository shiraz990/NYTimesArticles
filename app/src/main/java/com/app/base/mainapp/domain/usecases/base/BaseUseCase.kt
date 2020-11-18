package com.app.base.mainapp.domain.usecases.base

import androidx.lifecycle.MutableLiveData
import com.app.base.mainapp.data.source.remote.ApiErrorHandle
import com.app.base.mainapp.data.source.remote.BaseResponse
import com.app.base.mainapp.utils.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

abstract class BaseUseCase<Response, in Params>(private val apiErrorHandle: ApiErrorHandle? = null) where Response : Any {

    abstract suspend fun run(params: Params? = null): Response

    open fun invoke(
        showLoader: Boolean = true,
        showApiError: Boolean = true,
        scope: CoroutineScope,
        params: Params
    ): MutableLiveData<Outcome<Response>> {
        val resultLiveData = MutableLiveData<Outcome<Response>>()
//        resultLiveData.value = Outcome.Start(showLoader)
        val backgroundJob = scope.async {
            run(params)
        }
        scope.launch {
            try {
                backgroundJob.await().let {
                    if (showApiError && it is BaseResponse<*>) {
                        if ((it as BaseResponse<*>).responseCode == Constants.SUCCESS_CODE) {
                            resultLiveData.value = Outcome.Success(it)
                        } else {
                            resultLiveData.value =
                                Outcome.Error(
                                    showErrorDialog = showApiError,
                                    message = (it as BaseResponse<*>).responseMessage
                                )
                        }
                    } else {
                        resultLiveData.value = Outcome.Success(it)
                    }
                }
            } catch (ex: Exception) {
                if (ex is HttpException || ex is UnknownHostException || ex is SocketTimeoutException) {
                    resultLiveData.value = Outcome.NetworkError(ex)
                } else {
                    resultLiveData.value = Outcome.Error(e = ex, showErrorDialog = showApiError)
                }
            } finally {
                resultLiveData.value = Outcome.End()
            }
        }
        return resultLiveData
    }

    open fun invoke(
        scope: CoroutineScope,
        params: Params?,
        onResult: (UseCaseResponse<Response>)
    ) {
        val backgroundJob = scope.async {
            run(params)
        }
        scope.launch {
            try {
                backgroundJob.await().let {
                    onResult.onSuccess(it)
                }
            } catch (ex: Exception) {
                onResult.onError(apiErrorHandle?.traceErrorException(ex))
            }
        }
    }
}