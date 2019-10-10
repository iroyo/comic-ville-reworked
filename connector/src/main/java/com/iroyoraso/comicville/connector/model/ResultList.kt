package com.iroyoraso.comicville.connector.model

/**
 * Created by iroyo on 2019-09-26.
 * Mail: iroyoraso@gmail.com
 */
interface ResultList<out T> {
    val numberResultsPage: Int
    val numberResultsTotal: Int
    val results: List<T>
}