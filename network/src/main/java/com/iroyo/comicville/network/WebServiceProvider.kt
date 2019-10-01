package com.iroyo.comicville.network

import com.iroyo.comicville.network.webservice.CharacterWebService

/**
 * Created by iroyo on 2019-10-01.
 * Mail: iroyoraso@gmail.com
 */
interface WebServiceProvider {

    val characterWebService: CharacterWebService

}