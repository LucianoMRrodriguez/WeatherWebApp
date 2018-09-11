package com.lrodriguez.weather.domain;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Mono;

public interface LocationRepository extends ReactiveMongoRepository<Location, String> {
    
    public Mono<Location> findByCode(String code);

	public Mono<Boolean> existsByCode(String locationId);
} 