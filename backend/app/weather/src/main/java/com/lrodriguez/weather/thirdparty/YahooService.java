package com.lrodriguez.weather.thirdparty;

import com.lrodriguez.weather.domain.Location;
import com.lrodriguez.weather.thirdparty.dtos.YahooWeatherForecastDTO;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class YahooService implements WeatherService {

    // https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22nome%2C%20ak%22)
    //     &format=json

    private static final String API = "https://query.yahooapis.com/v1/public/yql";
    @Override
    public Flux<Location> findAll(String nameFilter) {
        RestTemplate rest = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(API)
            .queryParam("q", "select * from weather.forecast where woeid in (select woeid from geo.places(10) where text=\""+ nameFilter +"\")")
            .queryParam("format", "json");

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<YahooWeatherForecastDTO> response = rest.exchange(
            builder.build().encode().toUri(),
            HttpMethod.GET,
            entity,
            YahooWeatherForecastDTO.class);
        return LocationBuilder.build(response.getBody());
    }

    @Override
    public Mono<Location> findOne(String code) {
        RestTemplate rest = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(API)
            .queryParam("q", "select * from weather.forecast where woeid = " + code)
            .queryParam("format", "json");

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<YahooWeatherForecastDTO> response = rest.exchange(
            builder.build().encode().toUri(),
            HttpMethod.GET,
            entity,
            YahooWeatherForecastDTO.class);
        return LocationBuilder.build(response.getBody())
                              .singleOrEmpty();
    }

}