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
  d: number [] = []
  constructor() { }

  ngOnInit() {
    this.days = WEEK_FORECAST
    let i = 0;
    while (i < 49) {
      this.d.push(i);
      i++;
    };
  }

}
