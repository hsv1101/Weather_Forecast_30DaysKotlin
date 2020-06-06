package com.hs.weatherforecast.di.key

import android.app.Activity
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * Created by JAIhsingh on 2020-06-01
 */

@MapKey
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class ActivityKey(val value: KClass<out Activity>)
