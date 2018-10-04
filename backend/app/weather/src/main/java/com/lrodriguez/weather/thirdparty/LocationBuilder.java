package com.lrodriguez.weather.thirdparty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import com.lrodriguez.weather.domain.Location;
import com.lrodriguez.weather.domain.SimpleForecast;
import com.lrodriguez.weather.domain.Temperature;
import com.lrodriguez.weather.thirdparty.dtos.YahooWeatherForecastDTO;
import com.lrodriguez.weather.thirdparty.dtos.YahooWeatherForecastForecastDTO;

import reactor.core.publisher.Flux;

public class LocationBuilder {
    public static Flux<Location> build( YahooWeatherForecastDTO dto ) {
        if(dto == null || dto.getQuery() == null 
            || dto.getQuery().getResults() == null
            || dto.getQuery().getResults().getChannel() == null) {
            return Flux.empty();
        }
        return Flux.fromIterable(dto.getQuery().getResults().getChannel())
                   .filter(q -> q.getItem() != null)
                   .map(q -> new Location(null, 
                            extractLocationYahooId(q.getItem().getLink()),
                            q.getLocation().getCity(), 
                            q.getLocation().getCountry(), 
                            q.getLocation().getRegion(), 
                            buildForecast(q.getItem().getForecast(), 
                                          q.getUnits().getTemperature()),
                                          transformYahooDatetime(q.getItem().getPubDate())))
                    .filter(q -> q.getCode() != null && !"".equals(q.getCode()));
        
    }

    public static List<SimpleForecast> buildForecast(List<YahooWeatherForecastForecastDTO> dtos, String unit) {
        return dtos.stream()
            .map(forecast -> buildSimpleForecast(forecast, unit))
            .collect(Collectors.toList());
    }
    
    public static SimpleForecast buildSimpleForecast(YahooWeatherForecastForecastDTO dto, String unit) {
        return new SimpleForecast(dto.getCode(),
                                  transformYahooDate(dto.getDate()),
                                  dto.getDay(),
                                  new Temperature(dto.getHigh()).withUnit(unit)
                                                                .toCelcius(),
                                  new Temperature(dto.getLow()).withUnit(unit)
                                                               .toCelcius(),
                                  dto.getText());
    }

    public static LocalDateTime transformYahooDatetime( String datetime ) {
        return LocalDateTime.parse(
            datetime,
            DateTimeFormatter.ofPattern("EEE, dd MMM yyyy hh:mm a z")
        );
    }

    public static LocalDate transformYahooDate( String date ) {
        return LocalDate.parse(
            date, DateTimeFormatter.ofPattern("dd MMM yyyy")
        );
    }

    public static String extractLocationYahooId (String str) {
        return str.substring(
            str.lastIndexOf('-') + 1, str.length() - 1
        );
    }
}