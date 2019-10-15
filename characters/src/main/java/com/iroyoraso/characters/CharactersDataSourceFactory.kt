package com.iroyoraso.characters

import androidx.paging.DataSource
import com.iroyoraso.comicville.connector.CharacterRepository
import com.iroyoraso.comicville.connector.model.Character
import kotlinx.coroutines.CoroutineScope

/**
 * Created by iroyo on 2019-09-26.
 * Mail: iroyoraso@gmail.com
 */
internal class CharactersDataSourceFactory(
    private val coroutineScope: CoroutineScope,
    private val characterRepository: CharacterRepository
) : DataSource.Factory<Int, Character>() {

    override fun create() = CharactersDataSource(coroutineScope, characterRepository)

}