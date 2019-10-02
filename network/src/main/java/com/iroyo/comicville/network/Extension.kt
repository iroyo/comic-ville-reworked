package com.iroyo.comicville.network

import com.iroyoraso.comicville.connector.Output
import retrofit2.Response
import java.lang.Exception

/**
 * Created by iroyo on 2019-09-13.
 * Mail: iroyoraso@gmail.com
 */

fun <T> manageResult(response: Response<T>) : Output<T> {
    return if (response.isSuccessful) {
        val result = response.body()
        result?.let {
            Output.WantedOutput(it)
        }
        Output.UnwantedOutput(Exception())
    } else {
        Output.UnwantedOutput(Exception())
    }
}
