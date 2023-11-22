package com.example.weather_app.data.remote

import com.squareup.moshi.Json

data class WeatherDTO(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDTO
)
