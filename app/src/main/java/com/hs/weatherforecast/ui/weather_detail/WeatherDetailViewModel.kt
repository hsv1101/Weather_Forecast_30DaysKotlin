package com.hs.weatherforecast.ui.weather_detail

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hs.weatherforecast.core.BaseViewModel
import com.hs.weatherforecast.db.entity.ForecastEntity
import com.hs.weatherforecast.domain.datasource.forecast.ForecastLocalDataSource
import com.hs.weatherforecast.domain.model.ListItem
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class WeatherDetailViewModel @Inject constructor(private val forecastLocalDataSource: ForecastLocalDataSource) : BaseViewModel() {

    var weatherItem: ObservableField<ListItem> = ObservableField()
    private var forecastLiveData: LiveData<ForecastEntity> = MutableLiveData()
    var selectedDayDate: String? = null
    var selectedDayForecastLiveData: MutableLiveData<List<ListItem>> = MutableLiveData()

    fun getForecastLiveData() = forecastLiveData

    fun getForecast(): LiveData<ForecastEntity> {
        return forecastLocalDataSource.getForecast()
    }
}
