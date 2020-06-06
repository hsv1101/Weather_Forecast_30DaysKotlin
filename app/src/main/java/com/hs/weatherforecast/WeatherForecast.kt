package com.hs.weatherforecast

import android.app.Application
import android.os.Build
import com.facebook.stetho.Stetho
import com.hs.weatherforecast.di.AppInjector
import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject
import timber.log.Timber

class WeatherForecast : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG && !isRoboUnitTest()) {
            Timber.plant(Timber.DebugTree())
            Stetho.initializeWithDefaults(this)
        }

        AppInjector.init(this)
        AndroidThreeTen.init(this)
    }

    private fun isRoboUnitTest(): Boolean {
        return "robolectric" == Build.FINGERPRINT
    }
}
