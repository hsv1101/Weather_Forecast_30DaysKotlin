package com.hs.weatherforecast.ui.main

import androidx.databinding.ObservableField
import com.hs.weatherforecast.core.BaseViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject internal constructor() : BaseViewModel() {
    var toolbarTitle: ObservableField<String> = ObservableField()
}
