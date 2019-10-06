package com.road20.secure.local.preference

import android.content.Context
import com.road20.secure.local.utils.SecureLocalConstants

class SecureSharedPreference constructor(
    context: Context
) {
    val preference = context.getSharedPreferences(SecureLocalConstants.SECURE_SHARED_PREFERENCE, Context.MODE_PRIVATE)
}