// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.ui.search.result;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchResultItemViewModel_Factory implements Factory<SearchResultItemViewModel> {
  @Override
  public SearchResultItemViewModel get() {
    return newInstance();
  }

  public static SearchResultItemViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SearchResultItemViewModel newInstance() {
    return new SearchResultItemViewModel();
  }

  private static final class InstanceHolder {
    private static final SearchResultItemViewModel_Factory INSTANCE = new SearchResultItemViewModel_Factory();
  }
}
