package com.road20.secure.core.navigation

import android.content.Context
import android.content.Intent

interface SecureIntentKeyResolver <in KEY> {
    fun getIntent(context: Context, key: KEY?): Intent
}