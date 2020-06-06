package com.hs.weatherforecast.repo;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/hs/weatherforecast/repo/SearchCitiesRepository;", "", "searchCitiesLocalDataSource", "Lcom/hs/weatherforecast/domain/datasource/searchCities/SearchCitiesLocalDataSource;", "searchCitiesRemoteDataSource", "Lcom/hs/weatherforecast/domain/datasource/searchCities/SearchCitiesRemoteDataSource;", "(Lcom/hs/weatherforecast/domain/datasource/searchCities/SearchCitiesLocalDataSource;Lcom/hs/weatherforecast/domain/datasource/searchCities/SearchCitiesRemoteDataSource;)V", "rateLimiter", "Lcom/hs/weatherforecast/utils/domain/RateLimiter;", "", "loadCitiesByCityName", "Landroidx/lifecycle/LiveData;", "Lcom/hs/weatherforecast/utils/domain/Resource;", "", "Lcom/hs/weatherforecast/db/entity/CitiesForSearchEntity;", "cityName", "app_debug"})
public final class SearchCitiesRepository {
    private final com.hs.weatherforecast.utils.domain.RateLimiter<java.lang.String> rateLimiter = null;
    private final com.hs.weatherforecast.domain.datasource.searchCities.SearchCitiesLocalDataSource searchCitiesLocalDataSource = null;
    private final com.hs.weatherforecast.domain.datasource.searchCities.SearchCitiesRemoteDataSource searchCitiesRemoteDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hs.weatherforecast.utils.domain.Resource<java.util.List<com.hs.weatherforecast.db.entity.CitiesForSearchEntity>>> loadCitiesByCityName(@org.jetbrains.annotations.Nullable()
    java.lang.String cityName) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchCitiesRepository(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.datasource.searchCities.SearchCitiesLocalDataSource searchCitiesLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.datasource.searchCities.SearchCitiesRemoteDataSource searchCitiesRemoteDataSource) {
        super();
    }
}