package com.hs.weatherforecast.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.hs.weatherforecast.utils.typeconverters.DataConverter.class})
@androidx.room.Database(entities = {com.hs.weatherforecast.db.entity.ForecastEntity.class, com.hs.weatherforecast.db.entity.CurrentWeatherEntity.class, com.hs.weatherforecast.db.entity.CitiesForSearchEntity.class}, version = 2)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/hs/weatherforecast/db/WeatherDatabase;", "Landroidx/room/RoomDatabase;", "()V", "citiesForSearchDao", "Lcom/hs/weatherforecast/db/dao/CitiesForSearchDao;", "currentWeatherDao", "Lcom/hs/weatherforecast/db/dao/CurrentWeatherDao;", "forecastDao", "Lcom/hs/weatherforecast/db/dao/ForecastDao;", "app_debug"})
public abstract class WeatherDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.hs.weatherforecast.db.dao.ForecastDao forecastDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.hs.weatherforecast.db.dao.CurrentWeatherDao currentWeatherDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.hs.weatherforecast.db.dao.CitiesForSearchDao citiesForSearchDao();
    
    public WeatherDatabase() {
        super();
    }
}