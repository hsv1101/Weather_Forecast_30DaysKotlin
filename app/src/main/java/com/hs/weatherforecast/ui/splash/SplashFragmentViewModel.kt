package com.hs.weatherforecast.ui.splash

import android.content.SharedPreferences
import com.hs.weatherforecast.core.BaseViewModel
import javax.inject.Inject


class SplashFragmentViewModel @Inject constructor(var sharedPreferences: SharedPreferences) : BaseViewModel() {
    var navigateDashboard = false
}
