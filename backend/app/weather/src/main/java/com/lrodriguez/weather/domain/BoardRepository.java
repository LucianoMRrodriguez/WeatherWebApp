package com.lrodriguez.weather.domain;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

@Repository
public interface BoardRepository extends ReactiveMongoRepository<Board,String> {
    
    public Mono<Board> findByOwnerGoogleId(String googleId);
}