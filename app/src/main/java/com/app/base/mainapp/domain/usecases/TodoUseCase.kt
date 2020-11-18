package com.app.base.mainapp.domain.usecases

import com.app.base.mainapp.data.source.remote.ApiErrorHandle
import com.app.base.mainapp.data.source.remote.model.request.TodoRequest
import com.app.base.mainapp.data.source.remote.model.response.TodoItem
import com.app.base.mainapp.data.source.remote.model.response.TodoResponse
import com.app.base.mainapp.domain.repository.TodoRepository
import com.app.base.mainapp.domain.usecases.base.BaseUseCase

class TodoUseCase (
    private var todoRepository: TodoRepository,
    private val apiErrorHandle: ApiErrorHandle
) : BaseUseCase<List<TodoItem>, TodoRequest>(apiErrorHandle){


    override suspend fun run(params: TodoRequest?): List<TodoItem> {
        return todoRepository.getTodo()
    }
}