package com.hs.weatherforecast.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hs.weatherforecast.di.ViewModelFactory
import com.hs.weatherforecast.di.key.ViewModelKey
import com.hs.weatherforecast.ui.dashboard.DashboardFragmentViewModel
import com.hs.weatherforecast.ui.dashboard.forecast.ForecastItemViewModel
import com.hs.weatherforecast.ui.main.MainActivityViewModel
import com.hs.weatherforecast.ui.search.SearchViewModel
import com.hs.weatherforecast.ui.search.result.SearchResultItemViewModel
import com.hs.weatherforecast.ui.splash.SplashFragmentViewModel
import com.hs.weatherforecast.ui.weather_detail.WeatherDetailViewModel
import com.hs.weatherforecast.ui.weather_detail.weatherHourOfDay.WeatherHourOfDayItemViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by JAIhsingh on 2020-06-01
 */
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @IntoMap
    @Binds
    @ViewModelKey(SplashFragmentViewModel::class)
    abstract fun provideSplashFragmentViewModel(splashFragmentViewModel: SplashFragmentViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun provideMainViewModel(mainActivityViewModel: MainActivityViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(DashboardFragmentViewModel::class)
    abstract fun provideDashboardFragmentViewModel(dashboardFragmentViewModel: DashboardFragmentViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(ForecastItemViewModel::class)
    abstract fun provideForecastItemViewModel(forecastItemViewModel: ForecastItemViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(WeatherDetailViewModel::class)
    abstract fun provideWeatherDetailViewModel(weatherDetailViewModel: WeatherDetailViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(WeatherHourOfDayItemViewModel::class)
    abstract fun provideWeatherHourOfDayItemViewModel(weatherHourOfDayItemViewModel: WeatherHourOfDayItemViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(SearchViewModel::class)
    abstract fun provideSearchViewModel(searchViewModel: SearchViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(SearchResultItemViewModel::class)
    abstract fun provideSearchResultItemViewModel(searchResultItemViewModel: SearchResultItemViewModel): ViewModel
}
