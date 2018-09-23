package com.lrodriguez.weather.thirdparty;

import java.util.List;

import com.lrodriguez.weather.domain.Location;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import reactor.core.publisher.Mono;

@Service
public class YahooService implements WeatherService {

    // https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22nome%2C%20ak%22)
    //     &format=json

    private static final String API = "https://query.yahooapis.com/v1/public/yql";
    @Override
    public Location findOne(String code) {
        RestTemplate rest = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(API)
            .queryParam("q", "select * from weather.forecast where woeid=1")
            .queryParam("format", "json");

        System.out.println("URL BUILDER: " + builder.toUriString());

        Mono.just(rest.getForObject(builder.toUriString(), Object.class))
            .subscribe(System.out::println, System.out::println, () -> System.out.println("DONE"));
        return null;
    }

    @Override
    public List<Location> findAll(String nameFilter) {
        return null;
    }

}