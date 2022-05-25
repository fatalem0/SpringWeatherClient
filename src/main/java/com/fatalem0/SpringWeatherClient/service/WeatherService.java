package com.fatalem0.SpringWeatherClient.service;

import com.fatalem0.SpringWeatherClient.model.Weather;
import com.fatalem0.SpringWeatherClient.weather.WeatherClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherClient weatherClient;

    public Weather getWeather() {
        return weatherClient.getWeatherForCity("Moscow");
    }
}
