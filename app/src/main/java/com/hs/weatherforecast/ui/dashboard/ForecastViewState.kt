package com.hs.weatherforecast.ui.dashboard

import com.hs.weatherforecast.core.BaseViewState
import com.hs.weatherforecast.db.entity.ForecastEntity
import com.hs.weatherforecast.utils.domain.Status


class ForecastViewState(
    val status: Status,
    val error: String? = null,
    val data: ForecastEntity? = null
) : BaseViewState(status, error) {
    fun getForecast() = data
}
