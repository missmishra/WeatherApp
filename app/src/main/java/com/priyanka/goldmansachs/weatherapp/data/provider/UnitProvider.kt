package com.priyanka.goldmansachs.weatherapp.data.provider

import com.priyanka.goldmansachs.weatherapp.internal.UnitSystem


interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}