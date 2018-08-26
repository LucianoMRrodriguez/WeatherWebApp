import { Component, OnInit } from '@angular/core';
import { DayForecast } from '../domain/dayForecast';

@Component({
  selector: 'app-weather-day-summary',
  templateUrl: './weather-day-summary.component.html',
  styleUrls: ['./weather-day-summary.component.css']
})
export class WeatherDaySummaryComponent implements OnInit {

  forecast: DayForecast = {
    state: {
      id: 1,
      description: "Rain"
    },
    date: new Date(),
    day: "Sun",
    highestTemperature: 13,
    lowestTemperature: 12
  };

  constructor() { }

  ngOnInit() {
  }

  get imgSrc() {
    return '//ssl.gstatic.com/onebox/weather/48/' 
      + this.forecast.state.description
          .toLowerCase()
          .replace(' ','_') 
      + '.png'
  }
}
