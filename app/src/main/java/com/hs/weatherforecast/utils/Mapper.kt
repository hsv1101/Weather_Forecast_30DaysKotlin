package com.hs.weatherforecast.utils


interface Mapper<R, D> {
    fun mapFrom(type: R): D
}
