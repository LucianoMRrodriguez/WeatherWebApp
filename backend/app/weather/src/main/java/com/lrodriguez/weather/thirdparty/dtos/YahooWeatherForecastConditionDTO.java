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
public class YahooWeatherForecastConditionDTO {
    Integer code;
    String date;
    Integer temp;
    String text;
}