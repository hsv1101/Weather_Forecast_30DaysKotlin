package com.hs.weatherforecast.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/hs/weatherforecast/di/module/DatabaseModule;", "", "()V", "getDatabase", "Lcom/hs/weatherforecast/db/WeatherDatabase;", "context", "Landroid/content/Context;", "provideCitiesForSearchDao", "Lcom/hs/weatherforecast/db/dao/CitiesForSearchDao;", "db", "provideCurrentWeatherDao", "Lcom/hs/weatherforecast/db/dao/CurrentWeatherDao;", "provideForecastDao", "Lcom/hs/weatherforecast/db/dao/ForecastDao;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.hs.weatherforecast.db.WeatherDatabase getDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.hs.weatherforecast.db.dao.ForecastDao provideForecastDao(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.WeatherDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.hs.weatherforecast.db.dao.CurrentWeatherDao provideCurrentWeatherDao(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.WeatherDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.hs.weatherforecast.db.dao.CitiesForSearchDao provideCitiesForSearchDao(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.WeatherDatabase db) {
        return null;
    }
    
    public DatabaseModule() {
        super();
    }
}