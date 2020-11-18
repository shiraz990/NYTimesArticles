package com.app.base.mainapp.presentations.home.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseViewModel
import com.app.base.mainapp.databinding.FragmentHomeBinding
import com.app.base.mainapp.base.BaseFragment
import com.app.base.mainapp.base.MyDataBindingComponent
import com.app.base.mainapp.data.source.local.DatabaseManager
import com.app.base.mainapp.data.source.local.Todo
import com.app.base.mainapp.data.source.remote.model.response.TodoItem
import com.app.base.mainapp.presentations.home.HomeViewModel
import com.app.base.mainapp.presentations.home.adapter.TodoListingAdapter
import com.app.base.mainapp.utils.AppUtils
import kotlinx.android.synthetic.main.app_toolbar.*
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : BaseFragment() {

    private var dataBindingComponent = MyDataBindingComponent(this)

    private lateinit var todoListingAdapter: TodoListingAdapter
    private val viewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding
    private lateinit var todoListDb :List<Todo>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        AppUtils.setTitleToolbar(
            requireActivity().tool_bar,
            requireContext().resources.getString(R.string.todo_label)
        )

        if (!this::binding.isInitialized) {
            binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false)
            initializeViewsAndListener()

        }

        return binding.root
    }

    private fun initializeViewsAndListener() {
        todoListingAdapter = TodoListingAdapter(dataBindingComponent) {

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //Observer to observe list response from API
        viewModel.todoLiveData().observe(this, Observer {
            it.let {

                todoListingAdapter.submitList(it)
                binding.todoList.adapter = todoListingAdapter


                var listItems = ArrayList<Todo>()

                for (item in it){
                    var todo =Todo()
                    todo.id = item.userId.toLong()
                    todo.userId =item.id.toString()
                    todo.title =item.title
                    todo.isCompleted =item.completed
                    listItems.add(todo)
                }
                DatabaseManager.getInstance(activity).saveTodos(listItems)
            }

        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Check if database have list existing
        if(!DatabaseManager.getInstance(activity).isTodoListExisiOnDB){
            // fetch list from API
        viewModel.todo()
        }
        else{
            // Populate list from database
            var listItems = ArrayList<TodoItem>()
            todoListDb= DatabaseManager.getInstance(activity).allTodos
            for (item in todoListDb){
                listItems.add(TodoItem(item.userId.toInt(),item.id.toInt(),item.title,item.isCompleted))
            }
            todoListingAdapter.submitList(listItems)
            binding.todoList.adapter = todoListingAdapter
        }

    }

    override fun getViewModel(): BaseViewModel? {
        return viewModel
    }
}
