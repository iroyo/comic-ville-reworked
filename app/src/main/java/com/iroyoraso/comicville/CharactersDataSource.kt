package com.iroyoraso.comicville

import androidx.paging.PositionalDataSource
import com.iroyoraso.comicville.connector.model.Character

/**
 * Created by iroyo on 2019-09-20.
 * Mail: iroyoraso@gmail.com
 */
class CharactersDataSource : PositionalDataSource<Character>() {

    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<Character>) {

    }

    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<Character>) {

    }
}