// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.ui.dashboard.forecast;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ForecastItemViewModel_Factory implements Factory<ForecastItemViewModel> {
  @Override
  public ForecastItemViewModel get() {
    return newInstance();
  }

  public static ForecastItemViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ForecastItemViewModel newInstance() {
    return new ForecastItemViewModel();
  }

  private static final class InstanceHolder {
    private static final ForecastItemViewModel_Factory INSTANCE = new ForecastItemViewModel_Factory();
  }
}