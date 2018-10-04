package com.lrodriguez.weather.thirdparty.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class YahooWeatherForecastItemDTO {
    String title;
    Float lat;
    @JsonProperty("long")
    Float longg;
    String link;
    String pubDate;
    YahooWeatherForecastConditionDTO condition;
    List<YahooWeatherForecastForecastDTO> forecast;
    String description;
    YahooWeatherForecastGuidDTO guid;
}