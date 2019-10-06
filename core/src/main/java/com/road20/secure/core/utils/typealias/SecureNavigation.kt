package com.road20.secure.core.utils.`typealias`

import com.road20.secure.core.navigation.SecureIntentKey
import com.road20.secure.core.navigation.SecureIntentkeyResolver
import javax.inject.Provider

typealias SecureIntentResolverMap = @JvmSuppressWildcards Map<Class<out SecureIntentKey>, Provider<SecureIntentkeyResolver<*>>>