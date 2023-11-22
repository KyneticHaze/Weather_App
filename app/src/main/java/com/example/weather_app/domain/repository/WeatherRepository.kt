package com.example.weather_app.domain.repository

import com.example.weather_app.domain.model.WeatherInfo
import com.example.weather_app.domain.util.Resource

interface WeatherRepository {

    suspend fun getWeatherData(
        lat: Double, long: Double
    ): Resource<WeatherInfo>
}