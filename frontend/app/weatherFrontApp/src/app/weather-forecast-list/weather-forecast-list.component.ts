import { Component, OnInit, Input } from '@angular/core';
import { DayForecast } from '../domain/dayForecast';
import { NguCarouselConfig } from '@ngu/carousel';

@Component({
  selector: 'app-weather-forecast-list',
  templateUrl: './weather-forecast-list.component.html',
  styleUrls: ['./weather-forecast-list.component.css']
})
export class WeatherForecastListComponent implements OnInit {

  @Input() days: DayForecast[];

  public carouselConfig: NguCarouselConfig = {
    grid: { xs: 5, sm: 5, md: 5, lg: 5, all: 0 },
    slide: 2,
    speed: 500,
    point: {
      visible: false
    },
    load: 2,
    velocity: 0,
    touch: true,
    easing: 'cubic-bezier(0, 0, 0.2, 1)'
  };

  constructor() { }

  ngOnInit() { }
}
