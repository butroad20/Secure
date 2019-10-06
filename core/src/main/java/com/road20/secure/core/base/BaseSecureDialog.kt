package com.road20.secure.core.base

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import com.road20.secure.core.R
import dagger.android.support.DaggerDialogFragment

class BaseSecureDialog : DaggerDialogFragment() {

    override fun getTheme(): Int = R.style.SecureBaseDialogTheme

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.window?.let { window ->
            window.apply {
                setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                attributes.windowAnimations = R.style.SecureBaseDialogTheme_WindowAnimation
            }
        }

        return dialog
    }
}