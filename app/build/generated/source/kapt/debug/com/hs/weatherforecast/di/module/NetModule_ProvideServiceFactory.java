// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.di.module;

import com.hs.weatherforecast.domain.WeatherAppAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetModule_ProvideServiceFactory implements Factory<WeatherAppAPI> {
  private final NetModule module;

  private final Provider<Retrofit.Builder> retrofitProvider;

  public NetModule_ProvideServiceFactory(NetModule module,
      Provider<Retrofit.Builder> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WeatherAppAPI get() {
    return provideService(module, retrofitProvider.get());
  }

  public static NetModule_ProvideServiceFactory create(NetModule module,
      Provider<Retrofit.Builder> retrofitProvider) {
    return new NetModule_ProvideServiceFactory(module, retrofitProvider);
  }

  public static WeatherAppAPI provideService(NetModule instance, Retrofit.Builder retrofit) {
    return Preconditions.checkNotNull(instance.provideService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
