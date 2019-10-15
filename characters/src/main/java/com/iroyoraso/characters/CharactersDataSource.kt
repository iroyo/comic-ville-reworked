package com.iroyoraso.characters

import androidx.paging.PositionalDataSource
import com.iroyoraso.comicville.connector.CharacterRepository
import com.iroyoraso.comicville.connector.Output
import com.iroyoraso.comicville.connector.model.Character
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Created by iroyo on 2019-09-20.
 * Mail: iroyoraso@gmail.com
 */
internal class CharactersDataSource(
    private val coroutineScope: CoroutineScope,
    private val characterRepository: CharacterRepository
) : PositionalDataSource<Character>() {

    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<Character>) {

    }

    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<Character>) {
        coroutineScope.launch {
            val result = characterRepository.fetchCharacters(
                params.requestedStartPosition,
                params.requestedLoadSize
            )
            if (result is Output.Success) {
                val value = result.value
                callback.onResult(value.results, 0, value.numberResultsTotal)
            }
        }
    }
}