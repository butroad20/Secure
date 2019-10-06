package com.road20.secure.remote.di.modules

import android.content.Context
import com.road20.secure.remote.utils.SecureRemoteConstants
import com.road20.secure.remote.utils.okhttpClient
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module (
    includes = [
        SecureInterceptorsModule::class
    ]
)
class SecureOkhttpModule {

    @Provides
    @Singleton
    internal fun provideFile(context: Context): File = File (
        context.cacheDir, SecureRemoteConstants.OKHTTP_CACHE
    )

    @Provides
    @Singleton
    internal fun provideCache(file: File): Cache = Cache (
        file, SecureRemoteConstants.OKHTTP_CACHE_SIZE.toLong()
    )

    @Provides
    @Singleton
    internal fun provideOkhttpClient(
        cache: Cache,
        httpLoggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return okhttpClient {
            addInterceptor(httpLoggingInterceptor)
            cache(cache)
            followRedirects(true)
            followSslRedirects(true)
            connectTimeout(30, TimeUnit.SECONDS)
            readTimeout(30, TimeUnit.SECONDS)
            writeTimeout(30, TimeUnit.SECONDS)
        }
    }
}