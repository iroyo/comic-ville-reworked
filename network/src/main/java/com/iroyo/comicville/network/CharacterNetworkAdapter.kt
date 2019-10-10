package com.iroyo.comicville.network

import com.iroyo.comicville.network.webservice.CharacterWebService
import com.iroyoraso.domain.CharacterNetworkConnector

/**
 * Created by iroyo on 2019-09-27.
 * Mail: iroyoraso@gmail.com
 */
internal class CharacterNetworkAdapter(
    private val webService: CharacterWebService
) : CharacterNetworkConnector {

    override suspend fun loadCharacters(offset: Int, limit: Int) = webService
            .getCharacters(offset, limit)
            .output()

}
