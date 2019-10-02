package com.iroyo.comicville.network

import com.iroyoraso.comicville.connector.Output
import retrofit2.Response

/**
 * Created by iroyo on 2019-09-13.
 * Mail: iroyoraso@gmail.com
 */

fun <T> manageResult(response: Response<T>) : Output<T> {
    return if (response.isSuccessful) {
        val result = response.body()
        result?.let {
            Output.WantedOutput<T>(it)
        }
        Output.UnwantedOutput<T>()
    } else {
        Output.UnwantedOutput<T>()
    }
}
