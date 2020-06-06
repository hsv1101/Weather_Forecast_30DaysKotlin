package com.hs.weatherforecast.ui.dashboard.forecast

import androidx.databinding.ObservableField
import com.hs.weatherforecast.core.BaseViewModel
import com.hs.weatherforecast.domain.model.ListItem
import java.util.*
import javax.inject.Inject

class ForecastItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<ListItem>()
}
