package com.iroyo.comicville.network

import com.iroyo.comicville.network.schemes.CharacterResponse
import com.iroyo.comicville.network.schemes.CollectionResponse
import com.iroyo.comicville.network.webservice.CharacterWebService
import com.iroyoraso.comicville.connector.Output
import com.iroyoraso.comicville.connector.model.Character
import com.iroyoraso.comicville.connector.model.ResultList
import com.iroyoraso.domain.CharacterNetworkConnector
import retrofit2.Response
import java.util.*

/**
 * Created by iroyo on 2019-09-27.
 * Mail: iroyoraso@gmail.com
 */
internal class CharacterNetworkAdapter(
    private val webService: CharacterWebService
) : CharacterNetworkConnector {
    
    override suspend fun loadCharacters(offset: Int, limit: Int): Output<ResultList<Character>> {
        //return webService.getCharacters(offset, limit).manageResult<ResultList<Character>>()
        TODO()
    }


}
