import { Component, OnInit, Input } from '@angular/core';
import { LocationForecast } from '../domain/locationForecast';
import { StoreService } from '../store.service';

@Component({
  selector: 'app-weather-location-card',
  templateUrl: './weather-location-card.component.html',
  styleUrls: ['./weather-location-card.component.css']
})

export class WeatherLocationCardComponent implements OnInit {

  @Input() locationForecast: LocationForecast;

  constructor(private storeService: StoreService) { }

  ngOnInit(): void { }

  isLocationFollowed() {
    return this.storeService.isLocationFollowed(
      this.locationForecast.location.code
    );
  }

  handleFollow() {
    console.log('follow');
    this.storeService.addLocation(
      this.locationForecast.location.code
    );
  }
  handleUnfollow() {
    console.log('unfollow');
    this.storeService.removeLocation(
      this.locationForecast.location.code
    );
  }
}
