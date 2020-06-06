package com.hs.weatherforecast.repo

import NetworkBoundResource
import androidx.lifecycle.LiveData
import com.hs.weatherforecast.core.Constants.NetworkService.RATE_LIMITER_TYPE
import com.hs.weatherforecast.db.entity.ForecastEntity
import com.hs.weatherforecast.domain.datasource.forecast.ForecastLocalDataSource
import com.hs.weatherforecast.domain.datasource.forecast.ForecastRemoteDataSource
import com.hs.weatherforecast.domain.model.ForecastResponse
import com.hs.weatherforecast.utils.domain.RateLimiter
import com.hs.weatherforecast.utils.domain.Resource
import io.reactivex.Single
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class ForecastRepository @Inject constructor(
    private val forecastRemoteDataSource: ForecastRemoteDataSource,
    private val forecastLocalDataSource: ForecastLocalDataSource
) {

    private val forecastListRateLimit = RateLimiter<String>(30, TimeUnit.SECONDS)

    fun loadForecastByCoord(lat: Double, lon: Double, fetchRequired: Boolean, units: String): LiveData<Resource<ForecastEntity>> {
        return object : NetworkBoundResource<ForecastEntity, ForecastResponse>() {
            override fun saveCallResult(item: ForecastResponse) = forecastLocalDataSource.insertForecast(item)

            override fun shouldFetch(data: ForecastEntity?): Boolean = fetchRequired

            override fun loadFromDb(): LiveData<ForecastEntity> = forecastLocalDataSource.getForecast()

            override fun createCall(): Single<ForecastResponse> = forecastRemoteDataSource.getForecastByGeoCords(lat, lon, units)

            override fun onFetchFailed() = forecastListRateLimit.reset(RATE_LIMITER_TYPE)
        }.asLiveData
    }
}
