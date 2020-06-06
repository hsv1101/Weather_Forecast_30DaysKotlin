// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.di.module;

import com.hs.weatherforecast.db.WeatherDatabase;
import com.hs.weatherforecast.db.dao.CurrentWeatherDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideCurrentWeatherDaoFactory implements Factory<CurrentWeatherDao> {
  private final DatabaseModule module;

  private final Provider<WeatherDatabase> dbProvider;

  public DatabaseModule_ProvideCurrentWeatherDaoFactory(DatabaseModule module,
      Provider<WeatherDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public CurrentWeatherDao get() {
    return provideCurrentWeatherDao(module, dbProvider.get());
  }

  public static DatabaseModule_ProvideCurrentWeatherDaoFactory create(DatabaseModule module,
      Provider<WeatherDatabase> dbProvider) {
    return new DatabaseModule_ProvideCurrentWeatherDaoFactory(module, dbProvider);
  }

  public static CurrentWeatherDao provideCurrentWeatherDao(DatabaseModule instance,
      WeatherDatabase db) {
    return Preconditions.checkNotNull(instance.provideCurrentWeatherDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
