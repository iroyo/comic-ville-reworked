package com.iroyo.comicville.network

import com.iroyo.comicville.network.schemes.CharacterResponse
import com.iroyo.comicville.network.schemes.CollectionResponse
import com.iroyoraso.comicville.connector.Output
import com.iroyoraso.comicville.connector.model.Character
import com.iroyoraso.comicville.connector.model.ResultList
import java.util.*

/**
 * Created by iroyo on 2019-10-02.
 * Mail: iroyoraso@gmail.com
 */

class Test {

    fun test(): Output<ResultList<Character>> {
        val list = listOf(CharacterResponse(0, "", "", "", 0, Date()))
        return Output.WantedOutput<ResultList<Character>>(CollectionResponse(list, 0, 0))
    }
}