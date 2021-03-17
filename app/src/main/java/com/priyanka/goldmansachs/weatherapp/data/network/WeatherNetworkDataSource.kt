package com.priyanka.goldmansachs.weatherapp.data.network

import androidx.lifecycle.LiveData
import com.priyanka.goldmansachs.weatherapp.data.network.response.CurrentWeatherResponse
import com.priyanka.goldmansachs.weatherapp.data.network.response.FutureWeatherResponse


interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
    val downloadedFutureWeather: LiveData<FutureWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )

    suspend fun fetchFutureWeather(
        location: String,
        languageCode: String
    )
}