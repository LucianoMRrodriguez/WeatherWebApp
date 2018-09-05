import { Component, OnInit } from '@angular/core';
import { LocationForecast } from './domain/locationForecast';
import { LOCATIONS_WEEK_FORECAST } from './services/mockers/locationsForecast';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'weatherFrontApp';
  locations: LocationForecast[];

  constructor() { }

  ngOnInit(): void {
      this.locations = LOCATIONS_WEEK_FORECAST;
  }
}
