import { Component, OnInit } from '@angular/core';
import { LocationForecast } from './domain/locationForecast';
import { LocationService } from './location.service';
import { LOCATIONS_WEEK_FORECAST } from './services/mockers/locationsForecast';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'weatherFrontApp';
  locations: LocationForecast[];

  constructor(
    private locationService: LocationService
  ) { }

  ngOnInit(): void {
      this.locations = LOCATIONS_WEEK_FORECAST;
      this.locationService.getBoard('asd123')
                          .subscribe(r => console.log(r));
  }
}
