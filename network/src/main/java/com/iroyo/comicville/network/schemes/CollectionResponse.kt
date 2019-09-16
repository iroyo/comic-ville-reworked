package com.iroyo.comicville.network.schemes

import kotlinx.serialization.SerialName

/**
 * DOONAMIS
 * Created by iroyo on 2019-09-10.
 */
data class CollectionResponse<T>(
    @SerialName("results") val results: T,
    @SerialName("number_of_page_results") val numberResultsPage: Int,
    @SerialName("number_of_total_results") val numberResultsTotal: Int
)