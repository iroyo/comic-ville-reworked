package com.iroyo.comicville.network.schemes

import com.iroyoraso.comicville.connector.model.ResultList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DOONAMIS
 * Created by iroyo on 2019-09-10.
 */
@Serializable
data class CollectionResponse<T>(
    @SerialName("results") override val results: List<T>,
    @SerialName("number_of_page_results") override val numberResultsPage: Int,
    @SerialName("number_of_total_results") override val numberResultsTotal: Int
): ResultList<T>