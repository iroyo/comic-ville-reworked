package com.iroyo.comicville.network.schemes

import com.iroyo.comicville.network.serializers.DateSerializer
import com.iroyoraso.comicville.connector.model.Character
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*

/**
 * DOONAMIS
 * Created by iroyo on 2019-09-09.
 */
@Serializable
data class CharacterResponse(
    @SerialName("id") override val id: Int,
    @SerialName("name") val heroName: String?,
    @SerialName("real_name") val realName: String?,
    @SerialName("deck") override val summary: String?,
    @SerialName("count_of_issue_appearances") override val appearances: Int,
    @Serializable(DateSerializer::class) override val birth: Date?
) : Character {

    override fun name() = object : Character.Name {
        override val hero: String? = heroName
        override val real: String? = realName
    }

}