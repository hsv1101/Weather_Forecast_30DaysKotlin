// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherForecast_MembersInjector implements MembersInjector<WeatherForecast> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public WeatherForecast_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<WeatherForecast> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new WeatherForecast_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(WeatherForecast instance) {
    injectAndroidInjector(instance, androidInjectorProvider.get());
  }

  @InjectedFieldSignature("com.hs.weatherforecast.WeatherForecast.androidInjector")
  public static void injectAndroidInjector(WeatherForecast instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }
}