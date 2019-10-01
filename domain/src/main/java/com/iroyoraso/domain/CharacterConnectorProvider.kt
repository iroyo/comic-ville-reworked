package com.iroyoraso.domain

/**
 * Created by iroyo on 2019-09-27.
 * Mail: iroyoraso@gmail.com
 */
interface CharacterConnectorProvider {

    interface NetworkProvider {
       val networkConnector: CharacterNetworkConnector
    }

    interface DatabaseProvider {
        val databaseConnector: CharacterDatabaseConnector
    }
}