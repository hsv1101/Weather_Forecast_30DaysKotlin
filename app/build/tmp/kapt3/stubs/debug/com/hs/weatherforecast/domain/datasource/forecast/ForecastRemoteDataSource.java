package com.hs.weatherforecast.domain.datasource.forecast;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/hs/weatherforecast/domain/datasource/forecast/ForecastRemoteDataSource;", "", "api", "Lcom/hs/weatherforecast/domain/WeatherAppAPI;", "(Lcom/hs/weatherforecast/domain/WeatherAppAPI;)V", "getForecastByGeoCords", "Lio/reactivex/Single;", "Lcom/hs/weatherforecast/domain/model/ForecastResponse;", "lat", "", "lon", "units", "", "app_debug"})
public final class ForecastRemoteDataSource {
    private final com.hs.weatherforecast.domain.WeatherAppAPI api = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.hs.weatherforecast.domain.model.ForecastResponse> getForecastByGeoCords(double lat, double lon, @org.jetbrains.annotations.NotNull()
    java.lang.String units) {
        return null;
    }
    
    @javax.inject.Inject()
    public ForecastRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.WeatherAppAPI api) {
        super();
    }
}