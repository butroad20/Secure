package com.road20.secure.local.di

import com.road20.secure.local.di.modules.SecureDatabaseModule
import dagger.Component

@Component(
    modules = [SecureDatabaseModule::class]
)
interface SecureLocalComponent