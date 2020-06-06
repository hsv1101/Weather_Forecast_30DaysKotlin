package com.hs.weatherforecast.domain.datasource.forecast

import com.hs.weatherforecast.domain.WeatherAppAPI
import com.hs.weatherforecast.domain.model.ForecastResponse
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class ForecastRemoteDataSource @Inject constructor(private val api: WeatherAppAPI) {

    fun getForecastByGeoCords(lat: Double, lon: Double, units: String): Single<ForecastResponse> = api.getForecastByGeoCords(lat, lon, units)
}
