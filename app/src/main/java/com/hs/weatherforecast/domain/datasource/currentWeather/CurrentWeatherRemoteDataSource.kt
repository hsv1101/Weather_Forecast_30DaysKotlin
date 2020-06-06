package com.hs.weatherforecast.domain.datasource.currentWeather

import com.hs.weatherforecast.domain.WeatherAppAPI
import com.hs.weatherforecast.domain.model.CurrentWeatherResponse
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class CurrentWeatherRemoteDataSource @Inject constructor(private val api: WeatherAppAPI) {

    fun getCurrentWeatherByGeoCords(lat: Double, lon: Double, units: String): Single<CurrentWeatherResponse> = api.getCurrentByGeoCords(lat, lon, units)
}
