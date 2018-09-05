import { Component, OnInit, Input } from '@angular/core';
import { LocationForecast } from '../domain/locationForecast';

@Component({
    selector: 'app-weather-location-card',
    templateUrl: './weather-location-card.component.html',
    styleUrls: ['./weather-location-card.component.css']
})

export class WeatherLocationCardComponent implements OnInit {

    @Input() locationForecast: LocationForecast;

    constructor() { }

    ngOnInit(): void { }
}
