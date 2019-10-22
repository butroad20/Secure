package com.road20.secure.core.utils.`typealias`

import com.road20.secure.core.navigation.SecureIntentKey
import com.road20.secure.core.navigation.SecureIntentKeyResolver
import javax.inject.Provider

typealias SecureIntentResolverMap = @JvmSuppressWildcards Map<Class<out SecureIntentKey>, Provider<SecureIntentKeyResolver<*>>>