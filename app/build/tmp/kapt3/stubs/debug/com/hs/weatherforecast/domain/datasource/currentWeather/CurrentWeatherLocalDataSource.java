package com.hs.weatherforecast.domain.datasource.currentWeather;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/hs/weatherforecast/domain/datasource/currentWeather/CurrentWeatherLocalDataSource;", "", "currentWeatherDao", "Lcom/hs/weatherforecast/db/dao/CurrentWeatherDao;", "(Lcom/hs/weatherforecast/db/dao/CurrentWeatherDao;)V", "getCurrentWeather", "Landroidx/lifecycle/LiveData;", "Lcom/hs/weatherforecast/db/entity/CurrentWeatherEntity;", "insertCurrentWeather", "", "currentWeather", "Lcom/hs/weatherforecast/domain/model/CurrentWeatherResponse;", "app_debug"})
public final class CurrentWeatherLocalDataSource {
    private final com.hs.weatherforecast.db.dao.CurrentWeatherDao currentWeatherDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hs.weatherforecast.db.entity.CurrentWeatherEntity> getCurrentWeather() {
        return null;
    }
    
    public final void insertCurrentWeather(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.model.CurrentWeatherResponse currentWeather) {
    }
    
    @javax.inject.Inject()
    public CurrentWeatherLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.dao.CurrentWeatherDao currentWeatherDao) {
        super();
    }
}