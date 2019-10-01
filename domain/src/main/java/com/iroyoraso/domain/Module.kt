package com.iroyoraso.domain

import com.iroyoraso.comicville.connector.CharacterRepository

/**
 * Created by iroyo on 2019-09-27.
 * Mail: iroyoraso@gmail.com
 */
class Module(
    networkProvider: CharacterConnectorProvider.NetworkProvider,
    databaseProvider: CharacterConnectorProvider.DatabaseProvider
) : Injector {

    override val characterRepository: CharacterRepository = CharacterAdapter(
        networkProvider.networkConnector,
        databaseProvider.databaseConnector
    )
}