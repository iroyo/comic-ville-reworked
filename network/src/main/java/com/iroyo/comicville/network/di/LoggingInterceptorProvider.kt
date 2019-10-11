package com.iroyo.comicville.network.di

import com.iroyo.comicville.network.BuildConfig
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BODY
import okhttp3.logging.HttpLoggingInterceptor.Level.NONE

/**
 * Created by iroyo on 2019-10-11.
 * Mail: iroyoraso@gmail.com
 */
object LoggingInterceptorProvider : NetworkingProvider.InterceptorProvider {

    private val level = if (BuildConfig.DEBUG) BODY else NONE

    override val interceptor: Interceptor by lazy {
        HttpLoggingInterceptor().setLevel(level)
    }
}