package com.priyanka.goldmansachs.weatherapp.ui.weather.future.list

import com.priyanka.goldmansachs.weatherapp.data.provider.UnitProvider
import com.priyanka.goldmansachs.weatherapp.data.repository.ForecastRepository
import com.priyanka.goldmansachs.weatherapp.internal.lazyDeferred
import com.priyanka.goldmansachs.weatherapp.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
