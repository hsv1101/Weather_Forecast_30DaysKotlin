// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final ApplicationModule module;

  private final Provider<Application> applicationProvider;

  public ApplicationModule_ProvideSharedPreferencesFactory(ApplicationModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(module, applicationProvider.get());
  }

  public static ApplicationModule_ProvideSharedPreferencesFactory create(ApplicationModule module,
      Provider<Application> applicationProvider) {
    return new ApplicationModule_ProvideSharedPreferencesFactory(module, applicationProvider);
  }

  public static SharedPreferences provideSharedPreferences(ApplicationModule instance,
      Application application) {
    return Preconditions.checkNotNull(instance.provideSharedPreferences(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}
