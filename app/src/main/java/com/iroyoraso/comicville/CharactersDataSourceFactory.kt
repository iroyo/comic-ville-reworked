package com.iroyoraso.comicville

import androidx.paging.DataSource
import com.iroyoraso.comicville.connector.model.Character

/**
 * Created by iroyo on 2019-09-26.
 * Mail: iroyoraso@gmail.com
 */
class CharactersDataSourceFactory : DataSource.Factory<Int, Character>() {

    override fun create() = CharactersDataSource()

}