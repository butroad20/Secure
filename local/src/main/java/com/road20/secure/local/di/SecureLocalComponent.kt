package com.road20.secure.local.di

import android.content.Context
import com.road20.secure.local.di.modules.SecureDatabaseModule
import dagger.Component

@Component(
    modules = [SecureDatabaseModule::class]
)
interface SecureLocalComponent {

    fun provideContext(): Context
}