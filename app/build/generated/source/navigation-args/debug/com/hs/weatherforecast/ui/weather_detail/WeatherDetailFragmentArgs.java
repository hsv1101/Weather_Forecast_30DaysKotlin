package com.hs.weatherforecast.ui.weather_detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.hs.weatherforecast.domain.model.ListItem;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class WeatherDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private WeatherDetailFragmentArgs() {
  }

  private WeatherDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static WeatherDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    WeatherDetailFragmentArgs __result = new WeatherDetailFragmentArgs();
    bundle.setClassLoader(WeatherDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("weatherItem")) {
      ListItem weatherItem;
      if (Parcelable.class.isAssignableFrom(ListItem.class) || Serializable.class.isAssignableFrom(ListItem.class)) {
        weatherItem = (ListItem) bundle.get("weatherItem");
      } else {
        throw new UnsupportedOperationException(ListItem.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (weatherItem == null) {
        throw new IllegalArgumentException("Argument \"weatherItem\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("weatherItem", weatherItem);
    } else {
      throw new IllegalArgumentException("Required argument \"weatherItem\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public ListItem getWeatherItem() {
    return (ListItem) arguments.get("weatherItem");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("weatherItem")) {
      ListItem weatherItem = (ListItem) arguments.get("weatherItem");
      if (Parcelable.class.isAssignableFrom(ListItem.class) || weatherItem == null) {
        __result.putParcelable("weatherItem", Parcelable.class.cast(weatherItem));
      } else if (Serializable.class.isAssignableFrom(ListItem.class)) {
        __result.putSerializable("weatherItem", Serializable.class.cast(weatherItem));
      } else {
        throw new UnsupportedOperationException(ListItem.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    WeatherDetailFragmentArgs that = (WeatherDetailFragmentArgs) object;
    if (arguments.containsKey("weatherItem") != that.arguments.containsKey("weatherItem")) {
      return false;
    }
    if (getWeatherItem() != null ? !getWeatherItem().equals(that.getWeatherItem()) : that.getWeatherItem() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getWeatherItem() != null ? getWeatherItem().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "WeatherDetailFragmentArgs{"
        + "weatherItem=" + getWeatherItem()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(WeatherDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull ListItem weatherItem) {
      if (weatherItem == null) {
        throw new IllegalArgumentException("Argument \"weatherItem\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("weatherItem", weatherItem);
    }

    @NonNull
    public WeatherDetailFragmentArgs build() {
      WeatherDetailFragmentArgs result = new WeatherDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setWeatherItem(@NonNull ListItem weatherItem) {
      if (weatherItem == null) {
        throw new IllegalArgumentException("Argument \"weatherItem\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("weatherItem", weatherItem);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ListItem getWeatherItem() {
      return (ListItem) arguments.get("weatherItem");
    }
  }
}
