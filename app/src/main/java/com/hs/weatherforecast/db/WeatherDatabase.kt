package com.hs.weatherforecast.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.hs.weatherforecast.db.dao.CitiesForSearchDao
import com.hs.weatherforecast.db.dao.CurrentWeatherDao
import com.hs.weatherforecast.db.dao.ForecastDao
import com.hs.weatherforecast.db.entity.CitiesForSearchEntity
import com.hs.weatherforecast.db.entity.CurrentWeatherEntity
import com.hs.weatherforecast.db.entity.ForecastEntity
import com.hs.weatherforecast.utils.typeconverters.DataConverter

@Database(
    entities = [
        ForecastEntity::class,
        CurrentWeatherEntity::class,
        CitiesForSearchEntity::class
    ],
    version = 2
)
@TypeConverters(DataConverter::class)
abstract class WeatherDatabase : RoomDatabase() {

    abstract fun forecastDao(): ForecastDao

    abstract fun currentWeatherDao(): CurrentWeatherDao

    abstract fun citiesForSearchDao(): CitiesForSearchDao
}
