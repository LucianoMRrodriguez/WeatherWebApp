import { Component, OnInit } from '@angular/core';
import { LocationForecast } from '../domain/locationForecast';
import { LocationService } from '../services/location.service';
import { LocationForecastBuilder } from '../services/builders/LocationForecastBuilder';
import { StoreService } from '../store.service';

@Component({
  selector: 'app-board',
  templateUrl: './board.component.html',
  styleUrls: ['./board.component.css']
})
export class BoardComponent implements OnInit {

  locations: LocationForecast[];

  constructor(
    private locationService: LocationService,
    private storeService: StoreService,
  ) { }

  ngOnInit() {
    this.locationService.getBoard('asd123')
      .subscribe(resp => {
        this.locations = LocationForecastBuilder.buildFromBoard(resp.body['body']);
        this.locations.forEach(
          locationForecast => this.storeService.addLocation(
            locationForecast.location.code
          )
        );
      });
  }
}
