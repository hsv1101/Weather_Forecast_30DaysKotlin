package com.hs.weatherforecast.di.module;

import com.hs.weatherforecast.di.scope.PerActivity;
import com.hs.weatherforecast.ui.main.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_MainActivity$app_debug.MainActivitySubcomponent.class)
public abstract class ActivityModule_MainActivity$app_debug {
  private ActivityModule_MainActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(modules = FragmentBuildersModule.class)
  @PerActivity
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
