package com.priyanka.goldmansachs.weatherapp.ui.weather.current

import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.priyanka.goldmansachs.weatherapp.data.provider.UnitProvider
import com.priyanka.goldmansachs.weatherapp.data.repository.ForecastRepository


class CurrentWeatherViewModelFactory(
    private val forecastRepository: ForecastRepository,
    private val unitProvider: UnitProvider
) : ViewModelProvider.NewInstanceFactory(), Parcelable {

    constructor(parcel: Parcel) : this(
        TODO("forecastRepository"),
        TODO("unitProvider")
    ) {
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CurrentWeatherViewModel(forecastRepository, unitProvider) as T
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CurrentWeatherViewModelFactory> {
        override fun createFromParcel(parcel: Parcel): CurrentWeatherViewModelFactory {
            return CurrentWeatherViewModelFactory(parcel)
        }

        override fun newArray(size: Int): Array<CurrentWeatherViewModelFactory?> {
            return arrayOfNulls(size)
        }
    }
}