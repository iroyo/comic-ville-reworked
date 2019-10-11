package com.iroyo.comicville.network.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit

/**
 * Created by iroyo on 2019-10-11.
 * Mail: iroyoraso@gmail.com
 */
object ComicVineRetrofitProvider :
    NetworkingProvider.RetrofitProvider,
    NetworkingProvider.URLProvider by ComicVineURLProvider,
    NetworkingProvider.OkHttpProvider by ComicVineOkHttpProvider {

    override val retrofit: Retrofit by lazy {
        val contentType = MediaType.get("application/json")

        Retrofit.Builder()
            .addConverterFactory(Json.asConverterFactory(contentType))
            .baseUrl(baseUrl)
            .client(okHttp)
            .build()
    }

}