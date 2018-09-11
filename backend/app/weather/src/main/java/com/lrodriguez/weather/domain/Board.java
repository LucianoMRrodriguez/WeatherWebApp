package com.lrodriguez.weather.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Data
@Document
public class Board {

    @Id
    private String id;
    private User owner;
    private List<Subscription> subscriptions;

    public Board addSubscription(Mono<Location> where) {
        where.subscribe(e ->
            subscriptions.add(new Subscription(e, e.getCode())));
        return this;
    }
}