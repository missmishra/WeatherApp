package com.priyanka.goldmansachs.weatherapp.data.network.response

import com.google.gson.annotations.SerializedName
import com.priyanka.goldmansachs.weatherapp.data.db.entity.CurrentWeatherEntry
import com.priyanka.goldmansachs.weatherapp.data.db.entity.WeatherLocation

data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)