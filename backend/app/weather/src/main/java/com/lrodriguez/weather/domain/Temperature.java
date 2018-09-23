package com.lrodriguez.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Temperature {

    private int value;
    private TemperatureUnit unit;

    public String toString() {
        return this.value + "°" + unit.name().charAt(0);
    }
}