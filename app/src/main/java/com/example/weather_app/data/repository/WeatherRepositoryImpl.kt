package com.example.weather_app.data.repository

import com.example.weather_app.data.mappers.toWeatherInfo
import com.example.weather_app.data.remote.WeatherAPI
import com.example.weather_app.domain.model.WeatherInfo
import com.example.weather_app.domain.repository.WeatherRepository
import com.example.weather_app.domain.util.Resource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherAPI
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occured.")
        }
    }
}