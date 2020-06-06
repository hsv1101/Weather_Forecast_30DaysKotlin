package com.hs.weatherforecast.db.dao;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-02
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\b\u0010\u0006\u001a\u00020\u0003H\'J\b\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lcom/hs/weatherforecast/db/dao/CurrentWeatherDao;", "", "deleteAndInsert", "", "currentWeatherEntity", "Lcom/hs/weatherforecast/db/entity/CurrentWeatherEntity;", "deleteCurrentWeather", "getCount", "", "getCurrentWeather", "Landroidx/lifecycle/LiveData;", "insertCurrentWeather", "app_debug"})
public abstract interface CurrentWeatherDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CurrentWeather")
    public abstract androidx.lifecycle.LiveData<com.hs.weatherforecast.db.entity.CurrentWeatherEntity> getCurrentWeather();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertCurrentWeather(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.entity.CurrentWeatherEntity currentWeatherEntity);
    
    @androidx.room.Transaction()
    public abstract void deleteAndInsert(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.entity.CurrentWeatherEntity currentWeatherEntity);
    
    @androidx.room.Query(value = "DELETE FROM CurrentWeather")
    public abstract void deleteCurrentWeather();
    
    @androidx.room.Query(value = "Select count(*) from CurrentWeather")
    public abstract int getCount();
    
    /**
     * Created by JAIhsingh on 2020-06-02
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void deleteAndInsert(com.hs.weatherforecast.db.dao.CurrentWeatherDao $this, @org.jetbrains.annotations.NotNull()
        com.hs.weatherforecast.db.entity.CurrentWeatherEntity currentWeatherEntity) {
        }
    }
}