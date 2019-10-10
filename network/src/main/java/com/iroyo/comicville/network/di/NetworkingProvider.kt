package com.iroyo.comicville.network.di

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * Created by iroyo on 2019-10-11.
 * Mail: iroyoraso@gmail.com
 */
interface NetworkingProvider {

    interface InterceptorProvider {
        val interceptor: Interceptor
    }

    interface OkHttpProvider {
        val okHttp: OkHttpClient
    }

    interface RetrofitProvider {
        val retrofit: Retrofit
    }

    interface URLProvider {
        val baseUrl: String
    }
}