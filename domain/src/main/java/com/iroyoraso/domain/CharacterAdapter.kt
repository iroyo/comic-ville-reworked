package com.iroyoraso.domain

import com.iroyoraso.comicville.connector.CharacterRepository
import com.iroyoraso.comicville.connector.ListOutput
import com.iroyoraso.comicville.connector.model.Character
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Created by iroyo on 2019-09-27.
 * Mail: iroyoraso@gmail.com
 */
internal class CharacterAdapter(
    private val networkConnector: CharacterNetworkConnector
) : CharacterRepository {

    override suspend fun fetchCharacters(offset: Int, limit: Int) = withContext(Dispatchers.IO) {
        networkConnector.loadCharacters(offset, limit)
    }

}