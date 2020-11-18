package com.app.base.mainapp.presentations.home

import androidx.lifecycle.MutableLiveData
import com.app.base.mainapp.base.BaseViewModel
import com.app.base.mainapp.data.source.remote.model.ErrorModel
import com.app.base.mainapp.data.source.remote.model.request.*
import com.app.base.mainapp.data.source.remote.model.response.TodoItem
import com.app.base.mainapp.domain.usecases.*
import com.app.base.mainapp.domain.usecases.base.Outcome
import com.app.base.mainapp.domain.usecases.base.UseCaseResponse

class HomeViewModel (
    private var todoUseCase: TodoUseCase
): BaseViewModel(){

    private val todoLiveData = MutableLiveData<List<TodoItem>>()

    fun todoLiveData() = todoLiveData

    fun todo() {
        var request= TodoRequest()
        outcomeLiveData.value = Outcome.Start<Any>()
        todoUseCase.invoke(
            scope,
            request,
            object : UseCaseResponse<List<TodoItem>> {
                override fun onSuccess(result: List<TodoItem>) {
                    outcomeLiveData.value = Outcome.End<Any>()
                    result.let {
                        todoLiveData.value = result
                    }
                }

                override fun onError(errorModel: ErrorModel?) {
                    outcomeLiveData.value = Outcome.Failure<Any>(errorModel)
                }
            })
    }
}