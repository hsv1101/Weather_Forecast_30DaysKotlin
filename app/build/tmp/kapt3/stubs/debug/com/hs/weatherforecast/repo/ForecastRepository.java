package com.hs.weatherforecast.repo;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/hs/weatherforecast/repo/ForecastRepository;", "", "forecastRemoteDataSource", "Lcom/hs/weatherforecast/domain/datasource/forecast/ForecastRemoteDataSource;", "forecastLocalDataSource", "Lcom/hs/weatherforecast/domain/datasource/forecast/ForecastLocalDataSource;", "(Lcom/hs/weatherforecast/domain/datasource/forecast/ForecastRemoteDataSource;Lcom/hs/weatherforecast/domain/datasource/forecast/ForecastLocalDataSource;)V", "forecastListRateLimit", "Lcom/hs/weatherforecast/utils/domain/RateLimiter;", "", "loadForecastByCoord", "Landroidx/lifecycle/LiveData;", "Lcom/hs/weatherforecast/utils/domain/Resource;", "Lcom/hs/weatherforecast/db/entity/ForecastEntity;", "lat", "", "lon", "fetchRequired", "", "units", "app_debug"})
public final class ForecastRepository {
    private final com.hs.weatherforecast.utils.domain.RateLimiter<java.lang.String> forecastListRateLimit = null;
    private final com.hs.weatherforecast.domain.datasource.forecast.ForecastRemoteDataSource forecastRemoteDataSource = null;
    private final com.hs.weatherforecast.domain.datasource.forecast.ForecastLocalDataSource forecastLocalDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hs.weatherforecast.utils.domain.Resource<com.hs.weatherforecast.db.entity.ForecastEntity>> loadForecastByCoord(double lat, double lon, boolean fetchRequired, @org.jetbrains.annotations.NotNull()
    java.lang.String units) {
        return null;
    }
    
    @javax.inject.Inject()
    public ForecastRepository(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.datasource.forecast.ForecastRemoteDataSource forecastRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.datasource.forecast.ForecastLocalDataSource forecastLocalDataSource) {
        super();
    }
}