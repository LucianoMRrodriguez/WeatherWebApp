package com.lrodriguez.weather.thirdparty;

import com.lrodriguez.weather.domain.Location;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WeatherService {

    public Mono<Location> findOne(String code);

    public Flux<Location> findAll(String nameFilter);
}