package com.lrodriguez.weather.domain;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends ReactiveMongoRepository<Board,String> {
    
}