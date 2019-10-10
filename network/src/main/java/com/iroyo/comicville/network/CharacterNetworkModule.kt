package com.iroyo.comicville.network

import com.iroyo.comicville.network.di.CharacterWebServiceModule
import com.iroyo.comicville.network.di.CharacterWebServiceProvider
import com.iroyoraso.domain.CharacterConnectorProvider.NetworkProvider
import com.iroyoraso.domain.CharacterNetworkConnector

/**
 * Created by iroyo on 2019-09-30.
 * Mail: iroyoraso@gmail.com
 */

object CharacterNetworkModule : NetworkProvider, CharacterWebServiceProvider by CharacterWebServiceModule {

    override val networkConnector: CharacterNetworkConnector by lazy {
        CharacterNetworkAdapter(characterWebService)
    }

}