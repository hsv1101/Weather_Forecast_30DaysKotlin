package com.hs.weatherforecast.core

import com.hs.weatherforecast.utils.domain.Status

/**
 * Created by JAIhsingh on 2020-06-02
 */
open class BaseViewState(val baseStatus: Status, val baseError: String?) {
    fun isLoading() = baseStatus == Status.LOADING
    fun getErrorMessage() = baseError
    fun shouldShowErrorMessage() = baseError != null
}
