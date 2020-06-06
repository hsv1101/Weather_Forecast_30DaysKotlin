package com.hs.weatherforecast;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.hs.weatherforecast.databinding.ActivityMainBindingImpl;
import com.hs.weatherforecast.databinding.FragmentDashboardBindingImpl;
import com.hs.weatherforecast.databinding.FragmentSearchBindingImpl;
import com.hs.weatherforecast.databinding.FragmentSplashBindingImpl;
import com.hs.weatherforecast.databinding.FragmentWeatherDetailBindingImpl;
import com.hs.weatherforecast.databinding.ItemForecastBindingImpl;
import com.hs.weatherforecast.databinding.ItemSearchResultBindingImpl;
import com.hs.weatherforecast.databinding.ItemWeatherHourOfDayBindingImpl;
import com.hs.weatherforecast.databinding.LayoutDashboardForecastBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTDASHBOARD = 2;

  private static final int LAYOUT_FRAGMENTSEARCH = 3;

  private static final int LAYOUT_FRAGMENTSPLASH = 4;

  private static final int LAYOUT_FRAGMENTWEATHERDETAIL = 5;

  private static final int LAYOUT_ITEMFORECAST = 6;

  private static final int LAYOUT_ITEMSEARCHRESULT = 7;

  private static final int LAYOUT_ITEMWEATHERHOUROFDAY = 8;

  private static final int LAYOUT_LAYOUTDASHBOARDFORECAST = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hs.weatherforecast.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hs.weatherforecast.R.layout.fragment_dashboard, LAYOUT_FRAGMENTDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hs.weatherforecast.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hs.weatherforecast.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hs.weatherforecast.R.layout.fragment_weather_detail, LAYOUT_FRAGMENTWEATHERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hs.weatherforecast.R.layout.item_forecast, LAYOUT_ITEMFORECAST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hs.weatherforecast.R.layout.item_search_result, LAYOUT_ITEMSEARCHRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hs.weatherforecast.R.layout.item_weather_hour_of_day, LAYOUT_ITEMWEATHERHOUROFDAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hs.weatherforecast.R.layout.layout_dashboard_forecast, LAYOUT_LAYOUTDASHBOARDFORECAST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDASHBOARD: {
          if ("layout/fragment_dashboard_0".equals(tag)) {
            return new FragmentDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWEATHERDETAIL: {
          if ("layout/fragment_weather_detail_0".equals(tag)) {
            return new FragmentWeatherDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_weather_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFORECAST: {
          if ("layout/item_forecast_0".equals(tag)) {
            return new ItemForecastBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_forecast is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCHRESULT: {
          if ("layout/item_search_result_0".equals(tag)) {
            return new ItemSearchResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_search_result is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMWEATHERHOUROFDAY: {
          if ("layout/item_weather_hour_of_day_0".equals(tag)) {
            return new ItemWeatherHourOfDayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_weather_hour_of_day is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTDASHBOARDFORECAST: {
          if ("layout/layout_dashboard_forecast_0".equals(tag)) {
            return new LayoutDashboardForecastBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_dashboard_forecast is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
      sKeys.put(2, "viewState");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_main_0", com.hs.weatherforecast.R.layout.activity_main);
      sKeys.put("layout/fragment_dashboard_0", com.hs.weatherforecast.R.layout.fragment_dashboard);
      sKeys.put("layout/fragment_search_0", com.hs.weatherforecast.R.layout.fragment_search);
      sKeys.put("layout/fragment_splash_0", com.hs.weatherforecast.R.layout.fragment_splash);
      sKeys.put("layout/fragment_weather_detail_0", com.hs.weatherforecast.R.layout.fragment_weather_detail);
      sKeys.put("layout/item_forecast_0", com.hs.weatherforecast.R.layout.item_forecast);
      sKeys.put("layout/item_search_result_0", com.hs.weatherforecast.R.layout.item_search_result);
      sKeys.put("layout/item_weather_hour_of_day_0", com.hs.weatherforecast.R.layout.item_weather_hour_of_day);
      sKeys.put("layout/layout_dashboard_forecast_0", com.hs.weatherforecast.R.layout.layout_dashboard_forecast);
    }
  }
}
