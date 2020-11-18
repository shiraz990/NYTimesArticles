package com.app.base.mainapp.presentations.home

import android.app.Activity
import android.content.*
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseActivity


class HomeActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val toolbar: Toolbar = findViewById(R.id.tool_bar)
        setSupportActionBar(toolbar)
        setTitleToolbar(toolbar, getString(R.string.todo_label))



    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let {
            if (resultCode == Activity.RESULT_OK) {

            }
        }
    }


    private fun setTitleToolbar(toolbar: Toolbar, title: String) {
        toolbar.findViewById<TextView>(R.id.tv_title).text = title
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}


