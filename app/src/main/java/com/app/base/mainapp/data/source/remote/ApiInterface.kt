package com.app.base.mainapp.data.source.remote

import com.app.base.mainapp.data.source.remote.model.response.TodoItem
import com.app.base.mainapp.data.source.remote.model.response.TodoResponse
import com.app.base.mainapp.utils.Constants.TODO
import retrofit2.http.*


interface ApiInterface {
    @GET(TODO)
    suspend fun getTodo(): List<TodoItem>
}