package com.road20.secure.remote.di

import com.road20.secure.remote.di.modules.SecureRetrofitModule
import com.road20.secure.remote.di.modules.SecureServicesModule
import dagger.Component

@Component(
    modules = [
        SecureRetrofitModule::class,
        SecureServicesModule::class
    ]
)
interface SecureRemoteComponent