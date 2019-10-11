package com.iroyo.comicville.network.di

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * Created by iroyo on 2019-10-11.
 * Mail: iroyoraso@gmail.com
 */
object BaseOkHttpProvider :
    NetworkingProvider.OkHttpProvider,
    NetworkingProvider.InterceptorProvider by LoggingInterceptorProvider {

    private const val TIMEOUT_CONNECT: Long = 60L
    private const val TIMEOUT_READ: Long = 60L

    override val okHttp: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .connectTimeout(TIMEOUT_CONNECT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_READ, TimeUnit.SECONDS)
            .build()
    }

}