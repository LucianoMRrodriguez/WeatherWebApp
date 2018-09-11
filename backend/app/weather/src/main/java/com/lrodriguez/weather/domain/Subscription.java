package com.lrodriguez.weather.domain;

import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Subscription {

    @DBRef
    private Location where;
    private String code;
}