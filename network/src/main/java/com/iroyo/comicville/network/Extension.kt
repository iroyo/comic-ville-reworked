package com.iroyo.comicville.network

import com.iroyoraso.comicville.connector.Output
import retrofit2.Response
import java.lang.Exception

/**
 * Created by iroyo on 2019-09-13.
 * Mail: iroyoraso@gmail.com
 */

fun <T> Response<T>.output() : Output<T> {
    return if (isSuccessful) {
        val result = body()
        if (result != null) {
            Output.Success(result)
        } else {
            Output.Failure(Exception())
        }
    } else {
        Output.Failure(Exception())
    }
}