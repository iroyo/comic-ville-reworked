package com.iroyoraso.domain

import com.iroyoraso.comicville.connector.CharacterRepository

/**
 * Created by iroyo on 2019-09-27.
 * Mail: iroyoraso@gmail.com
 */
interface Injector {
    val characterRepository: CharacterRepository
}