package com.iroyo.comicville.network.di

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor: Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val httpUrl = request.url()

        val url = httpUrl.newBuilder()
            .addQueryParameter("api_key", "TEST")
            .addQueryParameter("format", "json")
            .build()

        val builder = request.newBuilder().url(url)
        return chain.proceed(builder.build())
    }

}