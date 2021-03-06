// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.repo;

import com.hs.weatherforecast.domain.datasource.forecast.ForecastLocalDataSource;
import com.hs.weatherforecast.domain.datasource.forecast.ForecastRemoteDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ForecastRepository_Factory implements Factory<ForecastRepository> {
  private final Provider<ForecastRemoteDataSource> forecastRemoteDataSourceProvider;

  private final Provider<ForecastLocalDataSource> forecastLocalDataSourceProvider;

  public ForecastRepository_Factory(
      Provider<ForecastRemoteDataSource> forecastRemoteDataSourceProvider,
      Provider<ForecastLocalDataSource> forecastLocalDataSourceProvider) {
    this.forecastRemoteDataSourceProvider = forecastRemoteDataSourceProvider;
    this.forecastLocalDataSourceProvider = forecastLocalDataSourceProvider;
  }

  @Override
  public ForecastRepository get() {
    return newInstance(forecastRemoteDataSourceProvider.get(), forecastLocalDataSourceProvider.get());
  }

  public static ForecastRepository_Factory create(
      Provider<ForecastRemoteDataSource> forecastRemoteDataSourceProvider,
      Provider<ForecastLocalDataSource> forecastLocalDataSourceProvider) {
    return new ForecastRepository_Factory(forecastRemoteDataSourceProvider, forecastLocalDataSourceProvider);
  }

  public static ForecastRepository newInstance(ForecastRemoteDataSource forecastRemoteDataSource,
      ForecastLocalDataSource forecastLocalDataSource) {
    return new ForecastRepository(forecastRemoteDataSource, forecastLocalDataSource);
  }
}
