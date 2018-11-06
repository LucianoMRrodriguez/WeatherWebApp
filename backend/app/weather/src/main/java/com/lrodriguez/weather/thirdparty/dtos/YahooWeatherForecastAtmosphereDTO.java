package com.lrodriguez.weather.thirdparty.dtos;

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
public class YahooWeatherForecastAtmosphereDTO {
    Integer humidity;
    Float pressure;
    Integer rising;
    Float visibility;
}