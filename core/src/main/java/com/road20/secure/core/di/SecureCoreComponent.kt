package com.road20.secure.core.di

import com.road20.secure.local.di.SecureLocalComponent
import com.road20.secure.remote.di.SecureRemoteComponent
import dagger.Component

@Component(
    modules = [],
    dependencies = [
        SecureLocalComponent::class, SecureRemoteComponent::class
    ]
)
interface SecureCoreComponent {
}