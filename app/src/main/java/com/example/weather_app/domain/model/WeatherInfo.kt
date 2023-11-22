package com.example.weather_app.domain.model

import com.example.weather_app.domain.model.WeatherData

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
