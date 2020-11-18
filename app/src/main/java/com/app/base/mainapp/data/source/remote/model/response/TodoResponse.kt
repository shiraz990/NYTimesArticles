package com.app.base.mainapp.data.source.remote.model.response



data class TodoResponse(

    val results: List<TodoItem>
)

data class TodoItem (

    val userId : Int,
    val id : Int,
    val title : String,
    val completed : Boolean
)


