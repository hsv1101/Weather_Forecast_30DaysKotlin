package com.hs.weatherforecast.domain.datasource.searchCities

import androidx.lifecycle.LiveData
import com.hs.weatherforecast.db.dao.CitiesForSearchDao
import com.hs.weatherforecast.db.entity.CitiesForSearchEntity
import com.hs.weatherforecast.domain.model.SearchResponse
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class SearchCitiesLocalDataSource @Inject constructor(private val citiesForSearchDao: CitiesForSearchDao) {

    fun getCityByName(cityName: String?): LiveData<List<CitiesForSearchEntity>> = citiesForSearchDao.getCityByName(cityName)

    fun insertCities(response: SearchResponse) {
        response.hits
            ?.map { CitiesForSearchEntity(it) }
            ?.let { citiesForSearchDao.insertCities(it) }
    }
}
