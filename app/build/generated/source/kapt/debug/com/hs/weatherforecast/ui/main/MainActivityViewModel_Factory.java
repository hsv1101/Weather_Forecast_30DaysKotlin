// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.ui.main;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityViewModel_Factory implements Factory<MainActivityViewModel> {
  @Override
  public MainActivityViewModel get() {
    return newInstance();
  }

  public static MainActivityViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MainActivityViewModel newInstance() {
    return new MainActivityViewModel();
  }

  private static final class InstanceHolder {
    private static final MainActivityViewModel_Factory INSTANCE = new MainActivityViewModel_Factory();
  }
}