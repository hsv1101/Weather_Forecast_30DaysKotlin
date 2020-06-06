package com.hs.weatherforecast.domain.datasource.forecast

import com.hs.weatherforecast.db.dao.ForecastDao
import com.hs.weatherforecast.db.entity.ForecastEntity
import com.hs.weatherforecast.domain.model.ForecastResponse
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class ForecastLocalDataSource @Inject constructor(private val forecastDao: ForecastDao) {

    fun getForecast() = forecastDao.getForecast()

    fun insertForecast(forecast: ForecastResponse) = forecastDao.deleteAndInsert(ForecastEntity(forecast))
}
