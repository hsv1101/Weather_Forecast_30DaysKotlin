package com.hs.weatherforecast.domain.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.hs.weatherforecast.db.entity.CitiesForSearchEntity
import com.hs.weatherforecast.repo.SearchCitiesRepository
import com.hs.weatherforecast.ui.search.SearchViewState
import com.hs.weatherforecast.utils.UseCaseLiveData
import com.hs.weatherforecast.utils.domain.Resource
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class SearchCitiesUseCase @Inject internal constructor(private val repository: SearchCitiesRepository) : UseCaseLiveData<SearchViewState, SearchCitiesUseCase.SearchCitiesParams, SearchCitiesRepository>() {

    override fun getRepository(): SearchCitiesRepository = repository

    override fun buildUseCaseObservable(params: SearchCitiesParams?): LiveData<SearchViewState> {
        return repository.loadCitiesByCityName(
            cityName = params?.city ?: ""
        ).map {
            onSearchResultReady(it)
        }
    }

    private fun onSearchResultReady(resource: Resource<List<CitiesForSearchEntity>>): SearchViewState {
        return SearchViewState(
            status = resource.status,
            error = resource.message,
            data = resource.data
        )
    }

    class SearchCitiesParams(
        val city: String = ""
    ) : Params()
}
