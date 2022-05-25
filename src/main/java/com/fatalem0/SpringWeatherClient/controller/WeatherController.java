package com.fatalem0.SpringWeatherClient.controller;

import com.fatalem0.SpringWeatherClient.model.Weather;
import com.fatalem0.SpringWeatherClient.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/weather")
    public Weather getWeather() {
        return weatherService.getWeather();
    }
}
