package com.iroyo.comicville.network

import okhttp3.logging.HttpLoggingInterceptor.Level.NONE
import okhttp3.logging.HttpLoggingInterceptor.Level.BODY
import com.iroyo.comicville.network.webservice.CharacterWebService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

/**
 * Created by iroyo on 2019-10-01.
 * Mail: iroyoraso@gmail.com
 */
class WebServiceModule(
    URL: String,
    TIMEOUT_CONNECT: Long = 60L,
    TIMEOUT_READ: Long = 60L
) : WebServiceProvider {

    private val contentType = MediaType.get("application/json")

    private val level = if (BuildConfig.DEBUG) BODY else NONE

    private val okHttp: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(level))
        .connectTimeout(TIMEOUT_CONNECT, TimeUnit.SECONDS)
        .readTimeout(TIMEOUT_READ, TimeUnit.SECONDS)
        .build()

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(URL)
        .addConverterFactory(Json.asConverterFactory(contentType))
        .client(okHttp)
        .build()

    override val characterWebService: CharacterWebService by lazy {
        retrofit.create(CharacterWebService::class.java)
    }

}