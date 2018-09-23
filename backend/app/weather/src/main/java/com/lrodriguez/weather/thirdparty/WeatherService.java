package com.lrodriguez.weather.thirdparty;

import java.util.List;

import com.lrodriguez.weather.domain.Location;

public interface WeatherService {

    public Location findOne(String code);

    public List<Location> findAll(String nameFilter);
}