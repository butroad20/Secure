package com.road20.secure.remote.di.modules

import com.road20.secure.remote.BuildConfig
import com.road20.secure.remote.utils.retrofit
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module (
    includes = [
        SecureOkhttpModule::class,
        SecureFactoriesModule::class
    ]
)
class SecureRetrofitModule {

    @Provides
    internal fun provideTokenRetrofit(
        okHttpClient: OkHttpClient,
        callAdapterFactory: RxJava2CallAdapterFactory,
        converterFactory: GsonConverterFactory
    ): Retrofit = retrofit {
        client(okHttpClient)
        addCallAdapterFactory(callAdapterFactory)
        addConverterFactory(converterFactory)
        baseUrl(BuildConfig.BASE_URL)
    }
}