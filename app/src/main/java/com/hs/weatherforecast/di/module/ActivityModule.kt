package com.hs.weatherforecast.di.module

import com.hs.weatherforecast.di.scope.PerActivity
import com.hs.weatherforecast.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by JAIhsingh on 2020-06-01
 */

@Module
abstract class ActivityModule {

    /**
     * Injects [MainActivity]
     *
     * @return an instance of [MainActivity]
     */

    @PerActivity
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    internal abstract fun mainActivity(): MainActivity
}
