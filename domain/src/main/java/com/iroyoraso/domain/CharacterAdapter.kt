package com.iroyoraso.domain

import com.iroyoraso.comicville.connector.CharacterRepository
import com.iroyoraso.comicville.connector.ListOutput
import com.iroyoraso.comicville.connector.model.Character

/**
 * Created by iroyo on 2019-09-27.
 * Mail: iroyoraso@gmail.com
 */
internal class CharacterAdapter(
    private val networkConnector: CharacterNetworkConnector,
    private val databaseConnector: CharacterDatabaseConnector
) : CharacterRepository {

    override suspend fun fetchCharacters(offset: Int, limit: Int): ListOutput<Character> {
        return networkConnector.loadCharacters(offset, limit)
    }

}