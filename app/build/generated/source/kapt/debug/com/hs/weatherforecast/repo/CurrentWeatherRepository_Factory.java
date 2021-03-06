// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.repo;

import com.hs.weatherforecast.domain.datasource.currentWeather.CurrentWeatherLocalDataSource;
import com.hs.weatherforecast.domain.datasource.currentWeather.CurrentWeatherRemoteDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrentWeatherRepository_Factory implements Factory<CurrentWeatherRepository> {
  private final Provider<CurrentWeatherRemoteDataSource> currentWeatherRemoteDataSourceProvider;

  private final Provider<CurrentWeatherLocalDataSource> currentWeatherLocalDataSourceProvider;

  public CurrentWeatherRepository_Factory(
      Provider<CurrentWeatherRemoteDataSource> currentWeatherRemoteDataSourceProvider,
      Provider<CurrentWeatherLocalDataSource> currentWeatherLocalDataSourceProvider) {
    this.currentWeatherRemoteDataSourceProvider = currentWeatherRemoteDataSourceProvider;
    this.currentWeatherLocalDataSourceProvider = currentWeatherLocalDataSourceProvider;
  }

  @Override
  public CurrentWeatherRepository get() {
    return newInstance(currentWeatherRemoteDataSourceProvider.get(), currentWeatherLocalDataSourceProvider.get());
  }

  public static CurrentWeatherRepository_Factory create(
      Provider<CurrentWeatherRemoteDataSource> currentWeatherRemoteDataSourceProvider,
      Provider<CurrentWeatherLocalDataSource> currentWeatherLocalDataSourceProvider) {
    return new CurrentWeatherRepository_Factory(currentWeatherRemoteDataSourceProvider, currentWeatherLocalDataSourceProvider);
  }

  public static CurrentWeatherRepository newInstance(
      CurrentWeatherRemoteDataSource currentWeatherRemoteDataSource,
      CurrentWeatherLocalDataSource currentWeatherLocalDataSource) {
    return new CurrentWeatherRepository(currentWeatherRemoteDataSource, currentWeatherLocalDataSource);
  }
}
