package com.hs.weatherforecast.ui.search;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.hs.weatherforecast.R;

public class SearchFragmentDirections {
  private SearchFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSearchFragmentToDashboardFragment() {
    return new ActionOnlyNavDirections(R.id.action_searchFragment_to_dashboardFragment);
  }
}
