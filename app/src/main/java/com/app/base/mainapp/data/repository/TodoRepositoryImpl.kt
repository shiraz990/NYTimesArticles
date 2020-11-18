package com.app.base.mainapp.data.repository

import com.app.base.mainapp.data.source.remote.ApiInterface
import com.app.base.mainapp.data.source.remote.model.response.TodoItem
import com.app.base.mainapp.data.source.remote.model.response.TodoResponse
import com.app.base.mainapp.domain.repository.TodoRepository

class TodoRepositoryImpl(private var apiInterface: ApiInterface) :
    TodoRepository {
    override suspend fun getTodo(): List<TodoItem> {
        return apiInterface.getTodo()
    }
}