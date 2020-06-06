package com.hs.weatherforecast.di.module

import com.hs.weatherforecast.ui.search.SearchFragment
import com.hs.weatherforecast.ui.dashboard.DashboardFragment
import com.hs.weatherforecast.ui.splash.SplashFragment
import com.hs.weatherforecast.ui.weather_detail.WeatherDetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by JAIhsingh on 2020-06-01
 */
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeSplashFragment(): SplashFragment

    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): DashboardFragment

    @ContributesAndroidInjector
    abstract fun contributeWeatherDetailFragment(): WeatherDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeSearchFragment(): SearchFragment
}
