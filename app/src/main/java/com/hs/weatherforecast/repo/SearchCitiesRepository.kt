package com.hs.weatherforecast.repo

import NetworkBoundResource
import androidx.lifecycle.LiveData
import com.hs.weatherforecast.core.Constants.NetworkService.RATE_LIMITER_TYPE
import com.hs.weatherforecast.db.entity.CitiesForSearchEntity
import com.hs.weatherforecast.domain.datasource.searchCities.SearchCitiesLocalDataSource
import com.hs.weatherforecast.domain.datasource.searchCities.SearchCitiesRemoteDataSource
import com.hs.weatherforecast.domain.model.SearchResponse
import com.hs.weatherforecast.utils.domain.RateLimiter
import com.hs.weatherforecast.utils.domain.Resource
import io.reactivex.Single
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class SearchCitiesRepository @Inject constructor(
    private val searchCitiesLocalDataSource: SearchCitiesLocalDataSource,
    private val searchCitiesRemoteDataSource: SearchCitiesRemoteDataSource
) {

    private val rateLimiter = RateLimiter<String>(1, TimeUnit.SECONDS)

    fun loadCitiesByCityName(cityName: String?): LiveData<Resource<List<CitiesForSearchEntity>>> {
        return object : NetworkBoundResource<List<CitiesForSearchEntity>, SearchResponse>() {
            override fun saveCallResult(item: SearchResponse) = searchCitiesLocalDataSource.insertCities(item)

            override fun shouldFetch(data: List<CitiesForSearchEntity>?): Boolean {
                return data == null || data.isEmpty()
            }

            override fun loadFromDb(): LiveData<List<CitiesForSearchEntity>> = searchCitiesLocalDataSource.getCityByName(cityName)

            override fun createCall(): Single<SearchResponse> = searchCitiesRemoteDataSource.getCityWithQuery(
                cityName
                    ?: ""
            )

            override fun onFetchFailed() = rateLimiter.reset(RATE_LIMITER_TYPE)
        }.asLiveData
    }
}
