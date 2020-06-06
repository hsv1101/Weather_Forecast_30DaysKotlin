package com.hs.weatherforecast.ui.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/hs/weatherforecast/ui/splash/SplashFragmentViewModel;", "Lcom/hs/weatherforecast/core/BaseViewModel;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "navigateDashboard", "", "getNavigateDashboard", "()Z", "setNavigateDashboard", "(Z)V", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "app_debug"})
public final class SplashFragmentViewModel extends com.hs.weatherforecast.core.BaseViewModel {
    private boolean navigateDashboard;
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences sharedPreferences;
    
    public final boolean getNavigateDashboard() {
        return false;
    }
    
    public final void setNavigateDashboard(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @javax.inject.Inject()
    public SplashFragmentViewModel(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
}