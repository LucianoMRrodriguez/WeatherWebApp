import { Component, OnInit, Input } from '@angular/core';
import { DayForecast } from '../domain/dayForecast';

@Component({
  selector: 'app-weather-day-summary',
  templateUrl: './weather-day-summary.component.html',
  styleUrls: ['./weather-day-summary.component.css']
})
export class WeatherDaySummaryComponent implements OnInit {

  @Input() forecast: DayForecast;

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
