package com.hs.weatherforecast.di.module;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/hs/weatherforecast/di/module/FragmentBuildersModule;", "", "()V", "contributeDashboardFragment", "Lcom/hs/weatherforecast/ui/dashboard/DashboardFragment;", "contributeSearchFragment", "Lcom/hs/weatherforecast/ui/search/SearchFragment;", "contributeSplashFragment", "Lcom/hs/weatherforecast/ui/splash/SplashFragment;", "contributeWeatherDetailFragment", "Lcom/hs/weatherforecast/ui/weather_detail/WeatherDetailFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.hs.weatherforecast.ui.splash.SplashFragment contributeSplashFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.hs.weatherforecast.ui.dashboard.DashboardFragment contributeDashboardFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.hs.weatherforecast.ui.weather_detail.WeatherDetailFragment contributeWeatherDetailFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.hs.weatherforecast.ui.search.SearchFragment contributeSearchFragment();
    
    public FragmentBuildersModule() {
        super();
    }
}