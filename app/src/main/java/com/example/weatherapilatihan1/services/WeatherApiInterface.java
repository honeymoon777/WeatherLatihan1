package com.example.weatherapilatihan1.services;

import com.example.weatherapilatihan1.model.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApiInterface {

    @GET("/weather")
    Call<Weather> getWeatherByTown(@Query("q") String q, @Query("appid") String apiKey);
}
