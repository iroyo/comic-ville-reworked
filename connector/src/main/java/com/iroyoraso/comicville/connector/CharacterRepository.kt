package com.iroyoraso.comicville.connector

import com.iroyoraso.comicville.connector.model.Character
import com.iroyoraso.comicville.connector.model.ResultList

/**
 * Created by iroyo on 2019-09-08.
 * Mail: iroyoraso@gmail.com
 */
interface CharacterRepository {

    suspend fun fetchCharacters(offset: Int, limit: Int): ListOutput<Character>

}