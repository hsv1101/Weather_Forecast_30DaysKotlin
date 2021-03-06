// Generated by data binding compiler. Do not edit!
package com.hs.weatherforecast.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.hs.weatherforecast.R;
import com.hs.weatherforecast.ui.search.result.SearchResultItemViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSearchResultBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout rootView;

  @NonNull
  public final TextView textViewCityName;

  @Bindable
  protected SearchResultItemViewModel mViewModel;

  protected ItemSearchResultBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout rootView, TextView textViewCityName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rootView = rootView;
    this.textViewCityName = textViewCityName;
  }

  public abstract void setViewModel(@Nullable SearchResultItemViewModel viewModel);

  @Nullable
  public SearchResultItemViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_search_result, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSearchResultBinding>inflateInternal(inflater, R.layout.item_search_result, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_search_result, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSearchResultBinding>inflateInternal(inflater, R.layout.item_search_result, null, false, component);
  }

  public static ItemSearchResultBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemSearchResultBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemSearchResultBinding)bind(component, view, R.layout.item_search_result);
  }
}
