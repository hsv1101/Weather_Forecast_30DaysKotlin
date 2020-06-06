package com.hs.weatherforecast.ui.search.result

import androidx.databinding.ObservableField
import com.hs.weatherforecast.core.BaseViewModel
import com.hs.weatherforecast.db.entity.CitiesForSearchEntity
import javax.inject.Inject

/**
 * Created by JAIhsingh on 2020-06-01
 */

class SearchResultItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<CitiesForSearchEntity>()
}
