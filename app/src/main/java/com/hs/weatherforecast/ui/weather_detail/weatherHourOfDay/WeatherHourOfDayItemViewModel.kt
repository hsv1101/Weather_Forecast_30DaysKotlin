package com.hs.weatherforecast.ui.weather_detail.weatherHourOfDay

import androidx.databinding.ObservableField
import com.hs.weatherforecast.core.BaseViewModel
import com.hs.weatherforecast.domain.model.ListItem
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class WeatherHourOfDayItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<ListItem>()
}
