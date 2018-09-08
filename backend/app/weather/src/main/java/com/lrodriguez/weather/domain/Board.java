package com.lrodriguez.weather.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Document
public class Board {

    @Id
    private String id;

    private User owner;

    @DBRef
    private List<Location> subscriptions;
}