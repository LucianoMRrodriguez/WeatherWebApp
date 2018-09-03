import { Component, OnInit } from '@angular/core';
import { WeatherLocation } from '../domain/weatherLocation';

@Component({
    selector: 'app-weather-location-card',
    templateUrl: './weather-location-card.component.html',
    styleUrls: ['./weather-location-card.component.css']
})

export class WeatherLocationCardComponent implements OnInit {

    location: WeatherLocation = {
        name: 'Buenos Aires'
    };

    constructor() { }

    ngOnInit(): void { }
}
