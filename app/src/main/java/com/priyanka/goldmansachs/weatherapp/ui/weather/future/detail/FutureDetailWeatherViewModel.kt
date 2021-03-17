package com.priyanka.goldmansachs.weatherapp.ui.weather.future.detail

import com.priyanka.goldmansachs.weatherapp.data.provider.UnitProvider
import com.priyanka.goldmansachs.weatherapp.data.repository.ForecastRepository
import com.priyanka.goldmansachs.weatherapp.internal.lazyDeferred
import com.priyanka.goldmansachs.weatherapp.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel(
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}
