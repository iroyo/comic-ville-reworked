package com.iroyoraso.comicville

import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList

/**
 * Created by iroyo on 2019-09-26.
 * Mail: iroyoraso@gmail.com
 */
class MainViewModel: ViewModel() {

    private val pageListConfig = PagedList.Config.Builder()
        .setEnablePlaceholders(true)
        .setInitialLoadSizeHint(20)
        .setPrefetchDistance(5)
        .setPageSize(10)
        .build()

    private val dataSourceFactory = CharactersDataSourceFactory()

    val list = LivePagedListBuilder(dataSourceFactory, pageListConfig).build()

}