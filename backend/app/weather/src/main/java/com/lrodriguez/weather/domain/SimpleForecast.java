package com.lrodriguez.weather.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleForecast {

    private int code;
    private Date when;
    private String dayOfTheWeek;
    private Temperature highest;
    private Temperature lowest;
    private String description;
}