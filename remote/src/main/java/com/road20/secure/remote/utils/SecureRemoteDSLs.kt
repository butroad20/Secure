package com.road20.secure.remote.utils

import okhttp3.OkHttpClient
import retrofit2.Retrofit

internal fun retrofit (block: Retrofit.Builder.() -> Unit): Retrofit {
    return Retrofit.Builder().apply(block).build()
}

internal fun okhttpClient (block: OkHttpClient.Builder.() -> Unit): OkHttpClient {
    return OkHttpClient.Builder().apply(block).build()
}