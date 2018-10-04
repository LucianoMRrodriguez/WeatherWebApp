package com.lrodriguez.weather.domain;

import org.springframework.util.Assert;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Temperature {

    private int value;
    private TemperatureUnit unit;

    public Temperature(int value) {
        this.value = value;
    }

    public Temperature withUnit(String unit) {
        Assert.hasText(unit, "Unit of a temperature must be specified");
        
        switch(unit.charAt(0)) {
            case 'C':
                this.unit = TemperatureUnit.CELSIUS;
                break;
            case 'F':
                this.unit = TemperatureUnit.FAHRENHEIT;
                break;
            case 'K':
                this.unit = TemperatureUnit.KELVIN;
                break;
            default:
                throw new IllegalArgumentException( unit + " is not a valid temperature unit.");
        }
        return this;
    }

    public Temperature toCelcius() {
        Assert.notNull(this.unit, "Unit of a temperature must be specified");
        switch(this.unit) {
            case CELSIUS:
                break;
            case FAHRENHEIT:
                this.value -= 32;
                this.unit = TemperatureUnit.CELSIUS;
                break;
            case KELVIN:
                this.value -= 273;
                this.unit = TemperatureUnit.CELSIUS;
                break;
        }
        return this;
    }
    public String toString() {
        return this.value + "°" + unit.name().charAt(0);
    }
}