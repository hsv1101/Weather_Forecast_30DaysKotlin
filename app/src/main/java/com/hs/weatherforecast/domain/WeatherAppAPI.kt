package com.hs.weatherforecast.domain

import com.hs.weatherforecast.domain.model.CurrentWeatherResponse
import com.hs.weatherforecast.domain.model.ForecastResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by JAIhsingh on 2020-06-02
 */

interface WeatherAppAPI {

    @GET("forecast")
    fun getForecastByGeoCords(
        @Query("lat")
        lat: Double,
        @Query("lon")
        lon: Double,
        @Query("units")
        units: String
    ): Single<ForecastResponse>

    @GET("weather")
    fun getCurrentByGeoCords(
        @Query("lat")
        lat: Double,
        @Query("lon")
        lon: Double,
        @Query("units")
        units: String
    ): Single<CurrentWeatherResponse>
}
