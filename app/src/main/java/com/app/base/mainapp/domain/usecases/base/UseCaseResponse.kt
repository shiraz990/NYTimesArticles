package com.app.base.mainapp.domain.usecases.base

import com.app.base.mainapp.data.source.remote.model.ErrorModel

interface UseCaseResponse<Type> {
    fun onSuccess(result: Type)

    fun onError(errorModel: ErrorModel?)
}