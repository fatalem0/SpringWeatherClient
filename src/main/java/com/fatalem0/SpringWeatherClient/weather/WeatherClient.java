package com.fatalem0.SpringWeatherClient.weather;

import com.fatalem0.SpringWeatherClient.model.Weather;
import com.fatalem0.SpringWeatherClient.model.dto.OpenWeatherDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {
    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "";
    private final RestTemplate restTemplate = new RestTemplate();

    public Weather getWeatherForCity(String city) {
        OpenWeatherDto openWeatherDto = callGetMethod("weather?q={city}&appid={apiKey}&units=metric&lang=en",
                OpenWeatherDto.class,
                city, API_KEY);

        return Weather.builder()
                .temperature(openWeatherDto.getMain().getTemp())
                .pressure(openWeatherDto.getMain().getPressure())
                .humidity(openWeatherDto.getMain().getHumidity())
                .windSpeed(openWeatherDto.getWind().getSpeed())
                .build();
    }

    private <T>T callGetMethod(String url, Class<T> responseType, Object...objects) {
        return restTemplate.getForObject(WEATHER_URL + url,
                responseType, objects);
    }
}
