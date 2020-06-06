package com.hs.weatherforecast.ui.weather_detail;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001e"}, d2 = {"Lcom/hs/weatherforecast/ui/weather_detail/WeatherDetailViewModel;", "Lcom/hs/weatherforecast/core/BaseViewModel;", "forecastLocalDataSource", "Lcom/hs/weatherforecast/domain/datasource/forecast/ForecastLocalDataSource;", "(Lcom/hs/weatherforecast/domain/datasource/forecast/ForecastLocalDataSource;)V", "forecastLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/hs/weatherforecast/db/entity/ForecastEntity;", "selectedDayDate", "", "getSelectedDayDate", "()Ljava/lang/String;", "setSelectedDayDate", "(Ljava/lang/String;)V", "selectedDayForecastLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/hs/weatherforecast/domain/model/ListItem;", "getSelectedDayForecastLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setSelectedDayForecastLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "weatherItem", "Landroidx/databinding/ObservableField;", "getWeatherItem", "()Landroidx/databinding/ObservableField;", "setWeatherItem", "(Landroidx/databinding/ObservableField;)V", "getForecast", "getForecastLiveData", "app_debug"})
public final class WeatherDetailViewModel extends com.hs.weatherforecast.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<com.hs.weatherforecast.domain.model.ListItem> weatherItem;
    private androidx.lifecycle.LiveData<com.hs.weatherforecast.db.entity.ForecastEntity> forecastLiveData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedDayDate;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.hs.weatherforecast.domain.model.ListItem>> selectedDayForecastLiveData;
    private final com.hs.weatherforecast.domain.datasource.forecast.ForecastLocalDataSource forecastLocalDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<com.hs.weatherforecast.domain.model.ListItem> getWeatherItem() {
        return null;
    }
    
    public final void setWeatherItem(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<com.hs.weatherforecast.domain.model.ListItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedDayDate() {
        return null;
    }
    
    public final void setSelectedDayDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hs.weatherforecast.domain.model.ListItem>> getSelectedDayForecastLiveData() {
        return null;
    }
    
    public final void setSelectedDayForecastLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.hs.weatherforecast.domain.model.ListItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hs.weatherforecast.db.entity.ForecastEntity> getForecastLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hs.weatherforecast.db.entity.ForecastEntity> getForecast() {
        return null;
    }
    
    @javax.inject.Inject()
    public WeatherDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.datasource.forecast.ForecastLocalDataSource forecastLocalDataSource) {
        super();
    }
}