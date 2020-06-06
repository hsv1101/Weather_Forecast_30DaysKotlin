package com.hs.weatherforecast.ui.splash;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.hs.weatherforecast.R;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSplashFragmentToDashboardFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_dashboardFragment);
  }

  @NonNull
  public static NavDirections actionSplashFragmentToSearchFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_searchFragment);
  }
}
