package com.lrodriguez.weather.domain;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Location {

    @Id
    private String id;
    private String code;
    private String city;
    private String country;
    private String region;
    private List<SimpleForecast> nextWeek;
    private LocalDateTime lastUpdate;
}