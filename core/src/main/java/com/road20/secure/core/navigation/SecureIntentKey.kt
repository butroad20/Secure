package com.road20.secure.core.navigation

sealed class SecureIntentKey {
    object AuthenticationKey : SecureIntentKey()
}