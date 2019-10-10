package com.iroyo.comicville.network.di

import com.iroyo.comicville.network.webservice.CharacterWebService

/**
 * Created by iroyo on 2019-10-01.
 * Mail: iroyoraso@gmail.com
 */
object CharacterWebServiceModule :
    CharacterWebServiceProvider,
    NetworkingProvider.RetrofitProvider by NetworkingBaseRetrofit {

    override val characterWebService: CharacterWebService by lazy {
        retrofit.create(CharacterWebService::class.java)
    }

}