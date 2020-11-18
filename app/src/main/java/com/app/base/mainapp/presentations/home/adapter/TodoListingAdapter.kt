package com.app.base.mainapp.presentations.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseListAdapter
import com.app.base.mainapp.data.source.remote.model.response.TodoItem
import com.app.base.mainapp.databinding.ItemTodoBinding

class TodoListingAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val clickListener: (item: TodoItem) -> Unit
) : BaseListAdapter<TodoItem, ItemTodoBinding>(
    diffCallback = diffCallback
) {


    override fun createBinding(parent: ViewGroup, viewType: Int): ItemTodoBinding {
        val binding = DataBindingUtil.inflate<ItemTodoBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_todo,
            parent,
            false,
            dataBindingComponent
        )

        return binding
    }

    override fun bind(binding: ItemTodoBinding, item: TodoItem, position: Int) {
        binding.todo = item

        binding.root.setOnClickListener {
            clickListener(getItem(position))
        }
    }


}

private val diffCallback: DiffUtil.ItemCallback<TodoItem> =
    object : DiffUtil.ItemCallback<TodoItem>() {
        override fun areItemsTheSame(oldItem: TodoItem, newItem: TodoItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: TodoItem, newItem: TodoItem): Boolean {
            return oldItem.title == newItem.title && oldItem.completed == newItem.completed
        }
    }
