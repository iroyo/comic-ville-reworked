package com.iroyo.comicville.network

import com.iroyoraso.comicville.connector.Output
import retrofit2.Response

/**
 * Created by iroyo on 2019-09-13.
 * Mail: iroyoraso@gmail.com
 */

fun <T> Response<T>.manageResult() : Output<T> {
    return if (isSuccessful) {
        val result = body()
        result?.let {
            Output.WantedOutput(it)
        }
        Output.UnwantedOutput()
    } else {
        Output.UnwantedOutput()
    }
}
