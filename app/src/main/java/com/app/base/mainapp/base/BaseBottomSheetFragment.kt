package com.app.base.mainapp.base

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.Observer
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.app.base.mainapp.R
import com.app.base.mainapp.domain.usecases.base.Outcome

abstract class BaseBottomSheetFragment : BottomSheetDialogFragment() {
    private var baseViewModel: BaseViewModel? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        baseViewModel = getViewModel()
        baseViewModel?.outcomeLiveData?.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Outcome.Start -> {
//                    (activity as MainActivity).showProgressLoader(true)
                }
                is Outcome.End -> {
//                    (activity as MainActivity).showProgressLoader(false)
                }
                is Outcome.Failure -> {
                    Toast.makeText(
                        activity,
                        "Some error occurred, Please try later",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                is Outcome.NetworkError -> {
                    Toast.makeText(
                        activity,
                        activity?.getString(R.string.please_check_internet),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

        })
    }

    fun applyTextWatcher(
        view: AppCompatEditText,
        function: () -> Unit
    ) {
        view.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                function()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }
        })
    }

    abstract fun getViewModel(): BaseViewModel?
}