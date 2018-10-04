package com.lrodriguez.weather.thirdparty.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class YahooWeatherForecastQueryDTO {
    Integer count;
    LocalDateTime created;
    String lang;
    YahooWeatherForecastResultsDTO results;
}