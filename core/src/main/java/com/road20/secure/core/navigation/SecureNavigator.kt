package com.road20.secure.core.navigation

import android.content.Context
import android.content.Intent
import com.road20.secure.core.utils.`typealias`.SecureIntentResolverMap
import javax.inject.Inject

class SecureNavigator constructor(
    private val resolverMap: SecureIntentResolverMap
) {

    fun createIntent(context: Context, intentKey: SecureIntentKey): Intent {
        val resolver = resolverMap[intentKey::class.java]?.get() as SecureIntentKeyResolver<SecureIntentKey>?
        return resolver?.getIntent(context, intentKey) ?: throw IllegalArgumentException("Cannot resolve intent key: $intentKey")
    }
}