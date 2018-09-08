package com.lrodriguez.weather.domain;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface LocationRepository extends ReactiveMongoRepository<Location, String> {
    
} 