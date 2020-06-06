package com.hs.weatherforecast.domain.datasource.currentWeather

import com.hs.weatherforecast.db.dao.CurrentWeatherDao
import com.hs.weatherforecast.db.entity.CurrentWeatherEntity
import com.hs.weatherforecast.domain.model.CurrentWeatherResponse
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */
class CurrentWeatherLocalDataSource @Inject constructor(private val currentWeatherDao: CurrentWeatherDao) {

    fun getCurrentWeather() = currentWeatherDao.getCurrentWeather()

    fun insertCurrentWeather(currentWeather: CurrentWeatherResponse) = currentWeatherDao.deleteAndInsert(
        CurrentWeatherEntity(currentWeather)
    )
}
