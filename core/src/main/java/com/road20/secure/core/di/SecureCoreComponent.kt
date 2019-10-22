package com.road20.secure.core.di

import com.road20.secure.local.di.SecureLocalComponent
import com.road20.secure.remote.di.SecureRemoteComponent
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

@Component(
    modules = [],
    dependencies = [
        SecureLocalComponent::class,
        SecureRemoteComponent::class
    ]
)
interface SecureCoreComponent : AndroidInjector<DaggerApplication>