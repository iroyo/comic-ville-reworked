package com.iroyoraso.comicville.connector

import com.iroyoraso.comicville.connector.model.ResultList

/**
 * Created by iroyo on 2019-10-01.
 * Mail: iroyoraso@gmail.com
 */
typealias ListOutput<T> = Output<ResultList<T>>

sealed class Output<T> {

    data class WantedOutput<T>(val value: T): Output<T>()
    data class UnwantedOutput<T>(val error: Throwable) : Output<T>()

}