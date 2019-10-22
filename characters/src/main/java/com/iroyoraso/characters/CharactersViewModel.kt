package com.iroyoraso.characters

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.iroyoraso.comicville.connector.CharacterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

/**
 * Created by iroyo on 2019-09-26.
 * Mail: iroyoraso@gmail.com
 */
internal class CharactersViewModel(
    characterRepository: CharacterRepository
) : ViewModel() {

    private val pageListConfig = PagedList.Config.Builder()
        .setEnablePlaceholders(true)
        .setInitialLoadSizeHint(20)
        .setPrefetchDistance(5)
        .setPageSize(10)
        .build()

    private val dataSourceFactory = CharactersDataSourceFactory(viewModelScope, characterRepository)

    val list = LivePagedListBuilder(dataSourceFactory, pageListConfig).build()

}