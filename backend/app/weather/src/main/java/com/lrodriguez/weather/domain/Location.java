package com.lrodriguez.weather.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Location {

    @Id
    private String id;
    private String code;
    private String city;
    private String country;
    private String region;
    private SimpleForecast[] nextWeek;
    private Date lastUpdate;
}