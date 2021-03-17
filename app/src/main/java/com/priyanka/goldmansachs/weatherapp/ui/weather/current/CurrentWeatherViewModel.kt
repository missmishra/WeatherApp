package com.priyanka.goldmansachs.weatherapp.ui.weather.current

import com.priyanka.goldmansachs.weatherapp.data.provider.UnitProvider
import com.priyanka.goldmansachs.weatherapp.data.repository.ForecastRepository
import com.priyanka.goldmansachs.weatherapp.internal.lazyDeferred
import com.priyanka.goldmansachs.weatherapp.ui.base.WeatherViewModel

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}
