package com.lrodriguez.weather.thirdparty.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class YahooWeatherForecastChannelDTO {
    
    YahooWeatherForecastUnitsDTO units;
    String title;
    String link;
    String description;
    String language;
    String lastBuildDate;
    Integer ttl;
    YahooWeatherForecastLocationDTO location;
    YahooWeatherForecastWindDTO wind;
    YahooWeatherForecastAtmosphereDTO atmosphere;
    YahooWeatherForecastAstronomyDTO astronomy;
    YahooWeatherForecastImageDTO image;
    YahooWeatherForecastItemDTO item;
}