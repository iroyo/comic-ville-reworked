package com.iroyo.comicville.network

import com.iroyoraso.comicville.connector.model.Character
import com.squareup.moshi.Json

/**
 * DOONAMIS
 * Created by iroyo on 2019-09-09.
 */
data class CharacterResponse(
    @field:Json(name = "id")
    override val id: Int,
    override val birth: String?,
    override val summary: String?,
    override val appearances: Int
) : Character {

    override fun name(): Character.Name {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}