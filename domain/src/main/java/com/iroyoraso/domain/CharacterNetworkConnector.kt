package com.iroyoraso.domain

import com.iroyoraso.comicville.connector.ListOutput
import com.iroyoraso.comicville.connector.model.Character


/**
 * Created by iroyo on 2019-09-27.
 * Mail: iroyoraso@gmail.com
 */
interface CharacterNetworkConnector {

    suspend fun loadCharacters(offset: Int, limit: Int): ListOutput<Character>

}