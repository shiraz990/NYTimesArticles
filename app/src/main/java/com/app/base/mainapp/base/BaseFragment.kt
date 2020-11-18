package com.app.base.mainapp.base

import android.app.Activity
import android.content.DialogInterface
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.kaopiz.kprogresshud.KProgressHUD
import com.app.base.mainapp.R
import com.app.base.mainapp.domain.usecases.base.Outcome
import com.app.base.mainapp.utils.preferences.PreferencesDataSource
import org.koin.android.ext.android.inject

abstract class BaseFragment : Fragment() {

    private var baseViewModel: BaseViewModel? = null
    private val prefDataSource: PreferencesDataSource by inject()
    private var myHud: KProgressHUD? = null

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

    fun applyTextViewWatcher(
        view: AppCompatTextView,
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


    fun callBackKeyHandling(blockExit: Boolean = false) {
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true /* enabled by default */) {
                override fun handleOnBackPressed() {
                    if (blockExit) {
                        return
                    }
                    (activity as Activity).finish()
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)

    }

    fun showProgress(isCancleable: Boolean) {
        myHud = KProgressHUD.create(context)
            .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
            .setCancellable(isCancleable)
            .setAnimationSpeed(2)
            .setDimAmount(0.5f)
        if(!myHud!!.isShowing) {
            myHud!!.show()
        }
    }

    fun hidePrgress() {
        if(myHud!!.isShowing) {
            myHud!!.dismiss()
        }
    }

    fun showAlert(title:String, message:String){
        AlertDialog.Builder(requireContext())
            .setMessage(title)
            .setPositiveButton(R.string.ok, DialogInterface.OnClickListener { dialog, which ->

            })
            .setNegativeButton(R.string.cancel, DialogInterface.OnClickListener { dialog, which ->

            })
            .create()
            .show();
    }

    abstract fun getViewModel(): BaseViewModel?
}