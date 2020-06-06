package com.hs.weatherforecast.domain.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.hs.weatherforecast.core.Constants
import com.hs.weatherforecast.db.entity.CurrentWeatherEntity
import com.hs.weatherforecast.repo.CurrentWeatherRepository
import com.hs.weatherforecast.ui.dashboard.CurrentWeatherViewState
import com.hs.weatherforecast.utils.UseCaseLiveData
import com.hs.weatherforecast.utils.domain.Resource
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class CurrentWeatherUseCase @Inject internal constructor(private val repository: CurrentWeatherRepository) : UseCaseLiveData<CurrentWeatherViewState, CurrentWeatherUseCase.CurrentWeatherParams, CurrentWeatherRepository>() {

    override fun getRepository(): CurrentWeatherRepository {
        return repository
    }

    override fun buildUseCaseObservable(params: CurrentWeatherParams?): LiveData<CurrentWeatherViewState> {
        return repository.loadCurrentWeatherByGeoCords(
            params?.lat?.toDouble() ?: 0.0,
            params?.lon?.toDouble() ?: 0.0,
            params?.fetchRequired
                ?: false,
            units = params?.units ?: Constants.Coords.METRIC
        ).map {
            onCurrentWeatherResultReady(it)
        }
    }

    private fun onCurrentWeatherResultReady(resource: Resource<CurrentWeatherEntity>): CurrentWeatherViewState {
        return CurrentWeatherViewState(
            status = resource.status,
            error = resource.message,
            data = resource.data
        )
    }

    class CurrentWeatherParams(
        val lat: String = "",
        val lon: String = "",
        val fetchRequired: Boolean,
        val units: String
    ) : Params()
}
