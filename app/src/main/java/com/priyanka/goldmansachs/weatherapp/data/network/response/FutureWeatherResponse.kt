package com.priyanka.goldmansachs.weatherapp.data.network.response

import com.google.gson.annotations.SerializedName
import com.priyanka.goldmansachs.weatherapp.data.db.entity.WeatherLocation

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)