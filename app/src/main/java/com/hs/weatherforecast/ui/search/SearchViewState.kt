package com.hs.weatherforecast.ui.search

import com.hs.weatherforecast.core.BaseViewState
import com.hs.weatherforecast.db.entity.CitiesForSearchEntity
import com.hs.weatherforecast.utils.domain.Status

/**
 * Created by JAIhsingh on 2020-06-01
 */

class SearchViewState(
    val status: Status,
    val error: String? = null,
    val data: List<CitiesForSearchEntity>? = null
) : BaseViewState(status, error) {
    fun getSearchResult() = data
}
