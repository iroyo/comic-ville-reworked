package com.iroyoraso.base

import com.iroyo.comicville.network.CharacterNetworkModule
import com.iroyoraso.comicville.connector.Injector
import com.iroyoraso.domain.Module

/**
 * Created by iroyo on 2019-10-11.
 * Mail: iroyoraso@gmail.com
 */
object Dependencies : Injector by Module(CharacterNetworkModule)
