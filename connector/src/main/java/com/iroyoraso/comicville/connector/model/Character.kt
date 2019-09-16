package com.iroyoraso.comicville.connector.model

import java.util.*

/**
 * Created by iroyo on 2019-09-08.
 * Mail: iroyoraso@gmail.com
 */
interface Character {
    val id: Int
    val birth: Date?
    val summary: String?
    val appearances: Int

    fun name(): CharacterName
}