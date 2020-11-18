package com.app.base.mainapp.domain.repository

import com.app.base.mainapp.data.source.remote.model.response.TodoItem

interface TodoRepository {
    suspend fun getTodo():  List<TodoItem>
}