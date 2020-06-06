package com.hs.weatherforecast.di.module

import android.content.Context
import androidx.room.Room
import com.hs.weatherforecast.db.WeatherDatabase
import com.hs.weatherforecast.db.dao.CitiesForSearchDao
import com.hs.weatherforecast.db.dao.CurrentWeatherDao
import com.hs.weatherforecast.db.dao.ForecastDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun getDatabase(context: Context): WeatherDatabase {
        return Room.databaseBuilder(
            context,
            WeatherDatabase::class.java, "WeatherApp-DB"
        ).build()
    }

    @Singleton
    @Provides
    fun provideForecastDao(db: WeatherDatabase): ForecastDao {
        return db.forecastDao()
    }

    @Singleton
    @Provides
    fun provideCurrentWeatherDao(db: WeatherDatabase): CurrentWeatherDao {
        return db.currentWeatherDao()
    }

    @Singleton
    @Provides
    fun provideCitiesForSearchDao(db: WeatherDatabase): CitiesForSearchDao {
        return db.citiesForSearchDao()
    }
}
