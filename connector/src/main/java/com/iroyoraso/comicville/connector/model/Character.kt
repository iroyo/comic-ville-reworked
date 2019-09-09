package com.iroyoraso.comicville.connector.model

/**
 * Created by iroyo on 2019-09-08.
 * Mail: iroyoraso@gmail.com
 */
interface Character {
    val id: Int
    val heroName: String?
    val realName: String?
    val aliases: String?
    val birth: String?
    val summary: String?
    val appearances: Int
}