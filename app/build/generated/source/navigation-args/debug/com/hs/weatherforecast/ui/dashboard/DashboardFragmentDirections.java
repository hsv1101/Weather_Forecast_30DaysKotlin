package com.hs.weatherforecast.ui.dashboard;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.hs.weatherforecast.R;
import com.hs.weatherforecast.domain.model.ListItem;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DashboardFragmentDirections {
  private DashboardFragmentDirections() {
  }

  @NonNull
  public static ActionDashboardFragmentToWeatherDetailFragment actionDashboardFragmentToWeatherDetailFragment(
      @NonNull ListItem weatherItem) {
    return new ActionDashboardFragmentToWeatherDetailFragment(weatherItem);
  }

  public static class ActionDashboardFragmentToWeatherDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionDashboardFragmentToWeatherDetailFragment(@NonNull ListItem weatherItem) {
      if (weatherItem == null) {
        throw new IllegalArgumentException("Argument \"weatherItem\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("weatherItem", weatherItem);
    }

    @NonNull
    public ActionDashboardFragmentToWeatherDetailFragment setWeatherItem(
        @NonNull ListItem weatherItem) {
      if (weatherItem == null) {
        throw new IllegalArgumentException("Argument \"weatherItem\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("weatherItem", weatherItem);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_dashboardFragment_to_weatherDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ListItem getWeatherItem() {
      return (ListItem) arguments.get("weatherItem");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDashboardFragmentToWeatherDetailFragment that = (ActionDashboardFragmentToWeatherDetailFragment) object;
      if (arguments.containsKey("weatherItem") != that.arguments.containsKey("weatherItem")) {
        return false;
      }
      if (getWeatherItem() != null ? !getWeatherItem().equals(that.getWeatherItem()) : that.getWeatherItem() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getWeatherItem() != null ? getWeatherItem().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDashboardFragmentToWeatherDetailFragment(actionId=" + getActionId() + "){"
          + "weatherItem=" + getWeatherItem()
          + "}";
    }
  }
}
