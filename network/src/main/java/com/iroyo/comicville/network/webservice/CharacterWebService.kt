package com.iroyo.comicville.network.webservice

import com.iroyo.comicville.network.schemes.CollectionResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * DOONAMIS
 * Created by iroyo on 2019-09-10.
 */
interface CharacterWebService {

    @GET("characters")
    suspend fun getCharacters(@Query("limit") limit: Int): Response<CollectionResponse>

}