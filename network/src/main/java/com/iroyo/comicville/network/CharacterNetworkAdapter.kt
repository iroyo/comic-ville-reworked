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
    private val characterWebService: CharacterWebService
) : CharacterNetworkConnector {
    
    override suspend fun loadCharacters(offset: Int, limit: Int): Output<ResultList<Character>> {
        val response = characterWebService.getCharacters(offset, limit)

        if (response.isSuccessful ) {
                val element = CharacterResponse(
                    0, "", "", "", 10, Date()
                )
                return Output.WantedOutput(test(0, 0, listOf<Character>(element)))
        }
        return Output.UnwantedOutput()
    }



    class test<T>(
        override val numberResultsPage: Int,
        override val numberResultsTotal: Int,
        override val results: List<T>
    ) : ResultList<T>



}
