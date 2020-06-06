package com.hs.weatherforecast.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\'J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/hs/weatherforecast/db/dao/ForecastDao;", "", "deleteAll", "", "deleteAndInsert", "forecast", "Lcom/hs/weatherforecast/db/entity/ForecastEntity;", "deleteForecast", "getCount", "", "getForecast", "Landroidx/lifecycle/LiveData;", "getForecastByCoord", "lat", "", "lon", "insertForecast", "updateForecast", "app_debug"})
public abstract interface ForecastDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Forecast")
    public abstract androidx.lifecycle.LiveData<com.hs.weatherforecast.db.entity.ForecastEntity> getForecast();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Forecast ORDER BY abs(lat-:lat) AND abs(lon-:lon) LIMIT 1")
    public abstract androidx.lifecycle.LiveData<com.hs.weatherforecast.db.entity.ForecastEntity> getForecastByCoord(double lat, double lon);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertForecast(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.entity.ForecastEntity forecast);
    
    @androidx.room.Transaction()
    public abstract void deleteAndInsert(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.entity.ForecastEntity forecast);
    
    @androidx.room.Update()
    public abstract void updateForecast(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.entity.ForecastEntity forecast);
    
    @androidx.room.Delete()
    public abstract void deleteForecast(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.entity.ForecastEntity forecast);
    
    @androidx.room.Query(value = "DELETE FROM Forecast")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "Select count(*) from Forecast")
    public abstract int getCount();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void deleteAndInsert(com.hs.weatherforecast.db.dao.ForecastDao $this, @org.jetbrains.annotations.NotNull()
        com.hs.weatherforecast.db.entity.ForecastEntity forecast) {
        }
    }
}