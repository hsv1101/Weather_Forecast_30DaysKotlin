// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.domain.datasource.currentWeather;

import com.hs.weatherforecast.domain.WeatherAppAPI;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrentWeatherRemoteDataSource_Factory implements Factory<CurrentWeatherRemoteDataSource> {
  private final Provider<WeatherAppAPI> apiProvider;

  public CurrentWeatherRemoteDataSource_Factory(Provider<WeatherAppAPI> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public CurrentWeatherRemoteDataSource get() {
    return newInstance(apiProvider.get());
  }

  public static CurrentWeatherRemoteDataSource_Factory create(Provider<WeatherAppAPI> apiProvider) {
    return new CurrentWeatherRemoteDataSource_Factory(apiProvider);
  }

  public static CurrentWeatherRemoteDataSource newInstance(WeatherAppAPI api) {
    return new CurrentWeatherRemoteDataSource(api);
  }
}
