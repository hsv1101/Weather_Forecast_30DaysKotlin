package com.hs.weatherforecast.ui.weather_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/hs/weatherforecast/ui/weather_detail/WeatherDetailFragment;", "Lcom/hs/weatherforecast/core/BaseFragment;", "Lcom/hs/weatherforecast/ui/weather_detail/WeatherDetailViewModel;", "Lcom/hs/weatherforecast/databinding/FragmentWeatherDetailBinding;", "Lcom/hs/weatherforecast/di/Injectable;", "()V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "weatherDetailFragmentArgs", "Lcom/hs/weatherforecast/ui/weather_detail/WeatherDetailFragmentArgs;", "getWeatherDetailFragmentArgs", "()Lcom/hs/weatherforecast/ui/weather_detail/WeatherDetailFragmentArgs;", "weatherDetailFragmentArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "init", "", "initWeatherHourOfDayAdapter", "list", "", "Lcom/hs/weatherforecast/domain/model/ListItem;", "onDestroy", "app_debug"})
public final class WeatherDetailFragment extends com.hs.weatherforecast.core.BaseFragment<com.hs.weatherforecast.ui.weather_detail.WeatherDetailViewModel, com.hs.weatherforecast.databinding.FragmentWeatherDetailBinding> implements com.hs.weatherforecast.di.Injectable {
    private final androidx.navigation.NavArgsLazy weatherDetailFragmentArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.disposables.CompositeDisposable disposable;
    private java.util.HashMap _$_findViewCache;
    
    private final com.hs.weatherforecast.ui.weather_detail.WeatherDetailFragmentArgs getWeatherDetailFragmentArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposable() {
        return null;
    }
    
    public final void setDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @java.lang.Override()
    public void init() {
    }
    
    private final void initWeatherHourOfDayAdapter(java.util.List<com.hs.weatherforecast.domain.model.ListItem> list) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public WeatherDetailFragment() {
        super(0, null);
    }
}