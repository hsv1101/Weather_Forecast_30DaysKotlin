package com.hs.weatherforecast.di.module;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/hs/weatherforecast/di/module/ActivityModule;", "", "()V", "mainActivity", "Lcom/hs/weatherforecast/ui/main/MainActivity;", "mainActivity$app_debug", "app_debug"})
@dagger.Module()
public abstract class ActivityModule {
    
    /**
     * Injects [MainActivity]
     *
     * @return an instance of [MainActivity]
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.hs.weatherforecast.di.module.FragmentBuildersModule.class})
    @com.hs.weatherforecast.di.scope.PerActivity()
    public abstract com.hs.weatherforecast.ui.main.MainActivity mainActivity$app_debug();
    
    public ActivityModule() {
        super();
    }
}