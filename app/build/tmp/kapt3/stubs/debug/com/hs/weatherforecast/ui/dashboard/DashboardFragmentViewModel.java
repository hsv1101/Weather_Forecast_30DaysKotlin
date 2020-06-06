package com.hs.weatherforecast.ui.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lcom/hs/weatherforecast/ui/dashboard/DashboardFragmentViewModel;", "Lcom/hs/weatherforecast/core/BaseViewModel;", "forecastUseCase", "Lcom/hs/weatherforecast/domain/usecase/ForecastUseCase;", "currentWeatherUseCase", "Lcom/hs/weatherforecast/domain/usecase/CurrentWeatherUseCase;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcom/hs/weatherforecast/domain/usecase/ForecastUseCase;Lcom/hs/weatherforecast/domain/usecase/CurrentWeatherUseCase;Landroid/content/SharedPreferences;)V", "_currentWeatherParams", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hs/weatherforecast/domain/usecase/CurrentWeatherUseCase$CurrentWeatherParams;", "_forecastParams", "Lcom/hs/weatherforecast/domain/usecase/ForecastUseCase$ForecastParams;", "currentWeatherViewState", "Landroidx/lifecycle/LiveData;", "Lcom/hs/weatherforecast/ui/dashboard/CurrentWeatherViewState;", "forecastViewState", "Lcom/hs/weatherforecast/ui/dashboard/ForecastViewState;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "getCurrentWeatherViewState", "getForecastViewState", "setCurrentWeatherParams", "", "params", "setForecastParams", "app_debug"})
public final class DashboardFragmentViewModel extends com.hs.weatherforecast.core.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.hs.weatherforecast.domain.usecase.ForecastUseCase.ForecastParams> _forecastParams = null;
    private final androidx.lifecycle.MutableLiveData<com.hs.weatherforecast.domain.usecase.CurrentWeatherUseCase.CurrentWeatherParams> _currentWeatherParams = null;
    private final androidx.lifecycle.LiveData<com.hs.weatherforecast.ui.dashboard.ForecastViewState> forecastViewState = null;
    private final androidx.lifecycle.LiveData<com.hs.weatherforecast.ui.dashboard.CurrentWeatherViewState> currentWeatherViewState = null;
    private final com.hs.weatherforecast.domain.usecase.ForecastUseCase forecastUseCase = null;
    private final com.hs.weatherforecast.domain.usecase.CurrentWeatherUseCase currentWeatherUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences sharedPreferences;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hs.weatherforecast.ui.dashboard.ForecastViewState> getForecastViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hs.weatherforecast.ui.dashboard.CurrentWeatherViewState> getCurrentWeatherViewState() {
        return null;
    }
    
    public final void setForecastParams(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.usecase.ForecastUseCase.ForecastParams params) {
    }
    
    public final void setCurrentWeatherParams(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.usecase.CurrentWeatherUseCase.CurrentWeatherParams params) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @javax.inject.Inject()
    public DashboardFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.usecase.ForecastUseCase forecastUseCase, @org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.usecase.CurrentWeatherUseCase currentWeatherUseCase, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
}