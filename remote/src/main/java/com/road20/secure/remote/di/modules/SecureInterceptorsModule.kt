package com.road20.secure.remote.di.modules

import com.road20.secure.remote.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import javax.inject.Singleton

@Module
class SecureInterceptorsModule {

    @Provides
    @Singleton
    internal fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor (
        HttpLoggingInterceptor.Logger { log ->
            Timber.e(log)
        }
    ).apply {
        level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
        else HttpLoggingInterceptor.Level.NONE
    }
}