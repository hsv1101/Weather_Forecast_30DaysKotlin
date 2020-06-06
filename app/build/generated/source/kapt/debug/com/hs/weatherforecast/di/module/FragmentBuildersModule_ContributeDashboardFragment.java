package com.hs.weatherforecast.di.module;

import com.hs.weatherforecast.ui.dashboard.DashboardFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeDashboardFragment.DashboardFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeDashboardFragment {
  private FragmentBuildersModule_ContributeDashboardFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DashboardFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DashboardFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface DashboardFragmentSubcomponent extends AndroidInjector<DashboardFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DashboardFragment> {}
  }
}
