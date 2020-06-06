package com.hs.weatherforecast.db.dao;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-02
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/hs/weatherforecast/db/dao/CitiesForSearchDao;", "", "deleteCities", "", "getCities", "Landroidx/lifecycle/LiveData;", "", "Lcom/hs/weatherforecast/db/entity/CitiesForSearchEntity;", "getCityByName", "city", "", "getCount", "", "insertCities", "cities", "insertCity", "citiesForSearchEntity", "app_debug"})
public abstract interface CitiesForSearchDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CitiesForSearch")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.hs.weatherforecast.db.entity.CitiesForSearchEntity>> getCities();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CitiesForSearch WHERE fullName like \'%\' || :city || \'%\'|| \'%\' ORDER BY fullName DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.hs.weatherforecast.db.entity.CitiesForSearchEntity>> getCityByName(@org.jetbrains.annotations.Nullable()
    java.lang.String city);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertCity(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.entity.CitiesForSearchEntity citiesForSearchEntity);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertCities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hs.weatherforecast.db.entity.CitiesForSearchEntity> cities);
    
    @androidx.room.Query(value = "DELETE FROM CitiesForSearch")
    public abstract void deleteCities();
    
    @androidx.room.Query(value = "Select count(*) from CitiesForSearch")
    public abstract int getCount();
    
    /**
     * Created by JAIhsingh on 2020-06-02
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}