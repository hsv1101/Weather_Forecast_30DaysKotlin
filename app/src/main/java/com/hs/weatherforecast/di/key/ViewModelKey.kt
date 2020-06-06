package com.hs.weatherforecast.di.key

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * Created by JAIhsingh on 2020-06-01
 */

@MapKey
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)
