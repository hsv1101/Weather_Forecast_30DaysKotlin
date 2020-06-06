package com.hs.weatherforecast.domain.datasource.searchCities;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/hs/weatherforecast/domain/datasource/searchCities/SearchCitiesLocalDataSource;", "", "citiesForSearchDao", "Lcom/hs/weatherforecast/db/dao/CitiesForSearchDao;", "(Lcom/hs/weatherforecast/db/dao/CitiesForSearchDao;)V", "getCityByName", "Landroidx/lifecycle/LiveData;", "", "Lcom/hs/weatherforecast/db/entity/CitiesForSearchEntity;", "cityName", "", "insertCities", "", "response", "Lcom/hs/weatherforecast/domain/model/SearchResponse;", "app_debug"})
public final class SearchCitiesLocalDataSource {
    private final com.hs.weatherforecast.db.dao.CitiesForSearchDao citiesForSearchDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.hs.weatherforecast.db.entity.CitiesForSearchEntity>> getCityByName(@org.jetbrains.annotations.Nullable()
    java.lang.String cityName) {
        return null;
    }
    
    public final void insertCities(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.model.SearchResponse response) {
    }
    
    @javax.inject.Inject()
    public SearchCitiesLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.dao.CitiesForSearchDao citiesForSearchDao) {
        super();
    }
}