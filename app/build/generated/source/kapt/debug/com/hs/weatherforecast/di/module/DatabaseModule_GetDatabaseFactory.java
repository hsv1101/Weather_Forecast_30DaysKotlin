// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.di.module;

import android.content.Context;
import com.hs.weatherforecast.db.WeatherDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_GetDatabaseFactory implements Factory<WeatherDatabase> {
  private final DatabaseModule module;

  private final Provider<Context> contextProvider;

  public DatabaseModule_GetDatabaseFactory(DatabaseModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public WeatherDatabase get() {
    return getDatabase(module, contextProvider.get());
  }

  public static DatabaseModule_GetDatabaseFactory create(DatabaseModule module,
      Provider<Context> contextProvider) {
    return new DatabaseModule_GetDatabaseFactory(module, contextProvider);
  }

  public static WeatherDatabase getDatabase(DatabaseModule instance, Context context) {
    return Preconditions.checkNotNull(instance.getDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
