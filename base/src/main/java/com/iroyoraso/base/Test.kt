package com.iroyoraso.base

import com.iroyoraso.comicville.connector.Output

/**
 * Created by iroyo on 2019-10-11.
 * Mail: iroyoraso@gmail.com
 */
class Test {

    private val repository = Dependencies.characterRepository

    suspend fun test() {
        val result = repository.fetchCharacters(0, 10)
        when (result) {
            is Output.Success -> TODO()
            is Output.Failure -> TODO()
        }
    }
}