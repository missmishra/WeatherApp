package com.priyanka.goldmansachs.weatherapp.data.provider

import com.priyanka.goldmansachs.weatherapp.data.db.entity.WeatherLocation


interface LocationProvider {
    suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean
    suspend fun getPreferredLocationString(): String
}