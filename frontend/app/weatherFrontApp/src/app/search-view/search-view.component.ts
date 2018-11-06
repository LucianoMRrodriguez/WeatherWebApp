import { Component, OnInit, Input, ApplicationRef } from '@angular/core';
import { Observable } from 'rxjs';
import { LocationForecast } from '../domain/locationForecast';
import { LocationService } from '../services/location.service';
import { tap } from 'rxjs/operators';

@Component({
  selector: 'app-search-view',
  templateUrl: './search-view.component.html',
  styleUrls: ['./search-view.component.css']
})
export class SearchViewComponent implements OnInit {

  searchResult: Observable<LocationForecast[]>;
  name: string;

  constructor(
    private locationService: LocationService,
    private appRef: ApplicationRef
  ) { }

  ngOnInit() {
  }

  search() {
    console.log('name: ${this.name}');
    if (!this.name) {
      return [];
    }
    this.searchResult = this.locationService.searchLocation(this.name)
      .pipe(
        tap(_ => this.appRef.tick())
      );
  }
}
