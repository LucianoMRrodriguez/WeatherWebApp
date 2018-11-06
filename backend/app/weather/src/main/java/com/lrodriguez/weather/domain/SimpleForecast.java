package com.lrodriguez.weather.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleForecast {

    private int code;
    private LocalDate when;
    private String dayOfTheWeek;
    private Temperature highest;
    private Temperature lowest;
    private String description;
}