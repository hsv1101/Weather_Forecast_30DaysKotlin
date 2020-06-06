package com.hs.weatherforecast.ui.dashboard

import com.hs.weatherforecast.core.BaseViewState
import com.hs.weatherforecast.db.entity.CurrentWeatherEntity
import com.hs.weatherforecast.utils.domain.Status



class CurrentWeatherViewState(
    val status: Status,
    val error: String? = null,
    val data: CurrentWeatherEntity? = null
) : BaseViewState(status, error) {
    fun getForecast() = data
}
