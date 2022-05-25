package com.fatalem0.SpringWeatherClient.model.dto;

import lombok.Getter;

@Getter
public class OpenWeatherDto {
    private OpenWeatherMainDto main;
    private OpenWeatherWindDto wind;
}
