package com.road20.secure.di

import com.road20.secure.core.di.SecureCoreComponent
import dagger.Component

@Component(
    modules = [],
    dependencies = [SecureCoreComponent::class]
)
interface SecureApplicationComponent