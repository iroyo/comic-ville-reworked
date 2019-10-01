package com.iroyoraso.domain

import com.iroyoraso.comicville.connector.Output
import com.iroyoraso.comicville.connector.model.Character
import com.iroyoraso.comicville.connector.model.ResultList


/**
 * Created by iroyo on 2019-09-27.
 * Mail: iroyoraso@gmail.com
 */
interface CharacterNetworkConnector {

    suspend fun loadCharacters(offset: Int, limit: Int): Output<ResultList<Character>>
}