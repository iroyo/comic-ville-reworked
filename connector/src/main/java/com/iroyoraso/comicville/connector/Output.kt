package com.iroyoraso.comicville.connector

import com.iroyoraso.comicville.connector.model.ResultList

/**
 * Created by iroyo on 2019-10-01.
 * Mail: iroyoraso@gmail.com
 */
typealias ListOutput<T> = Output<ResultList<T>>

sealed class Output<out T> {

    data class Success<T>(val value: T): Output<T>()
    data class Failure<T>(val error: Throwable) : Output<T>()

}