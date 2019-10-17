package com.iroyoraso.domain

import com.iroyoraso.comicville.connector.CharacterRepository
import com.iroyoraso.comicville.connector.Injector

/**
 * Created by iroyo on 2019-09-27.
 * Mail: iroyoraso@gmail.com
 */
class Module(
    networkProvider: CharacterConnectorProvider.NetworkProvider
) : Injector {

    override val characterRepository: CharacterRepository = CharacterAdapter(
        networkProvider.networkConnector
    )
}