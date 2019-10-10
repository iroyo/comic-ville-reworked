package com.iroyo.comicville.network.di

import com.iroyo.comicville.network.webservice.CharacterWebService

/**
 * Created by iroyo on 2019-10-01.
 * Mail: iroyoraso@gmail.com
 */
interface CharacterWebServiceProvider {

    val characterWebService: CharacterWebService

}