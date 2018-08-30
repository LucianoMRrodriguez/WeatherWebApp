import { Component, OnInit } from '@angular/core';
import { DayForecast } from '../domain/dayForecast';
import { WEEK_FORECAST } from '../services/mockers/weekForecast';

@Component({
  selector: 'app-weather-forecast-list',
  templateUrl: './weather-forecast-list.component.html',
  styleUrls: ['./weather-forecast-list.component.css']
})
export class WeatherForecastListComponent implements OnInit {

  days: DayForecast[]

  constructor() { }

  ngOnInit() {
    this.days = WEEK_FORECAST
  }
}
