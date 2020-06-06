package com.hs.weatherforecast.di.module;

import com.hs.weatherforecast.ui.weather_detail.WeatherDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeWeatherDetailFragment.WeatherDetailFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeWeatherDetailFragment {
  private FragmentBuildersModule_ContributeWeatherDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(WeatherDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WeatherDetailFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface WeatherDetailFragmentSubcomponent
      extends AndroidInjector<WeatherDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WeatherDetailFragment> {}
  }
}
