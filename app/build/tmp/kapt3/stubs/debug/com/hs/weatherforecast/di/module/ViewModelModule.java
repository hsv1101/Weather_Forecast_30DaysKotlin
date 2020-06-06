package com.hs.weatherforecast.di.module;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\'J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\'J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\'J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001fH\'\u00a8\u0006 "}, d2 = {"Lcom/hs/weatherforecast/di/module/ViewModelModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Lcom/hs/weatherforecast/di/ViewModelFactory;", "provideDashboardFragmentViewModel", "Landroidx/lifecycle/ViewModel;", "dashboardFragmentViewModel", "Lcom/hs/weatherforecast/ui/dashboard/DashboardFragmentViewModel;", "provideForecastItemViewModel", "forecastItemViewModel", "Lcom/hs/weatherforecast/ui/dashboard/forecast/ForecastItemViewModel;", "provideMainViewModel", "mainActivityViewModel", "Lcom/hs/weatherforecast/ui/main/MainActivityViewModel;", "provideSearchResultItemViewModel", "searchResultItemViewModel", "Lcom/hs/weatherforecast/ui/search/result/SearchResultItemViewModel;", "provideSearchViewModel", "searchViewModel", "Lcom/hs/weatherforecast/ui/search/SearchViewModel;", "provideSplashFragmentViewModel", "splashFragmentViewModel", "Lcom/hs/weatherforecast/ui/splash/SplashFragmentViewModel;", "provideWeatherDetailViewModel", "weatherDetailViewModel", "Lcom/hs/weatherforecast/ui/weather_detail/WeatherDetailViewModel;", "provideWeatherHourOfDayItemViewModel", "weatherHourOfDayItemViewModel", "Lcom/hs/weatherforecast/ui/weather_detail/weatherHourOfDay/WeatherHourOfDayItemViewModel;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.di.ViewModelFactory viewModelFactory);
    
    @org.jetbrains.annotations.NotNull()
    @com.hs.weatherforecast.di.key.ViewModelKey(value = com.hs.weatherforecast.ui.splash.SplashFragmentViewModel.class)
    @dagger.Binds()
    @dagger.multibindings.IntoMap()
    public abstract androidx.lifecycle.ViewModel provideSplashFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.ui.splash.SplashFragmentViewModel splashFragmentViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.hs.weatherforecast.di.key.ViewModelKey(value = com.hs.weatherforecast.ui.main.MainActivityViewModel.class)
    @dagger.Binds()
    @dagger.multibindings.IntoMap()
    public abstract androidx.lifecycle.ViewModel provideMainViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.ui.main.MainActivityViewModel mainActivityViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.hs.weatherforecast.di.key.ViewModelKey(value = com.hs.weatherforecast.ui.dashboard.DashboardFragmentViewModel.class)
    @dagger.Binds()
    @dagger.multibindings.IntoMap()
    public abstract androidx.lifecycle.ViewModel provideDashboardFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.ui.dashboard.DashboardFragmentViewModel dashboardFragmentViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.hs.weatherforecast.di.key.ViewModelKey(value = com.hs.weatherforecast.ui.dashboard.forecast.ForecastItemViewModel.class)
    @dagger.Binds()
    @dagger.multibindings.IntoMap()
    public abstract androidx.lifecycle.ViewModel provideForecastItemViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.ui.dashboard.forecast.ForecastItemViewModel forecastItemViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.hs.weatherforecast.di.key.ViewModelKey(value = com.hs.weatherforecast.ui.weather_detail.WeatherDetailViewModel.class)
    @dagger.Binds()
    @dagger.multibindings.IntoMap()
    public abstract androidx.lifecycle.ViewModel provideWeatherDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.ui.weather_detail.WeatherDetailViewModel weatherDetailViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.hs.weatherforecast.di.key.ViewModelKey(value = com.hs.weatherforecast.ui.weather_detail.weatherHourOfDay.WeatherHourOfDayItemViewModel.class)
    @dagger.Binds()
    @dagger.multibindings.IntoMap()
    public abstract androidx.lifecycle.ViewModel provideWeatherHourOfDayItemViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.ui.weather_detail.weatherHourOfDay.WeatherHourOfDayItemViewModel weatherHourOfDayItemViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.hs.weatherforecast.di.key.ViewModelKey(value = com.hs.weatherforecast.ui.search.SearchViewModel.class)
    @dagger.Binds()
    @dagger.multibindings.IntoMap()
    public abstract androidx.lifecycle.ViewModel provideSearchViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.ui.search.SearchViewModel searchViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.hs.weatherforecast.di.key.ViewModelKey(value = com.hs.weatherforecast.ui.search.result.SearchResultItemViewModel.class)
    @dagger.Binds()
    @dagger.multibindings.IntoMap()
    public abstract androidx.lifecycle.ViewModel provideSearchResultItemViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.ui.search.result.SearchResultItemViewModel searchResultItemViewModel);
    
    public ViewModelModule() {
        super();
    }
}