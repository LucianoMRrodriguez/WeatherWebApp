import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { BoardDTO } from './dtos/BoardDTO';
import { LocationForecastDTO } from './dtos/LocationForecastDTO';
import { LocationForecast } from '../domain/locationForecast';
import { LocationForecastBuilder } from './builders/LocationForecastBuilder';

@Injectable({
  providedIn: 'root'
})
export class LocationService {

  boardsUrl = 'http://localhost:8080/api/boards/';
  locationsUrl = 'http://localhost:8080/api/locations/';

  constructor(
    private http: HttpClient
  ) { }

  getBoard(id: string): Observable<HttpResponse<BoardDTO>> {
    return this.http.get<BoardDTO>(this.boardsUrl + id, { observe: 'response' });
  }

  searchLocation(name: string): Observable<LocationForecast[]> {
    const locations = [];
    return Observable.create((observer) => {
      const eventSrc = new EventSource(this.locationsUrl + '?name=' + name);
      eventSrc.onmessage = (event) => {
        console.log('New event!');
        const json = JSON.parse(event.data);
        locations.push(LocationForecastBuilder.buildFromLocation(json['body']));
        observer.next(locations);
      };
      eventSrc.onerror = (error) => {
        if (eventSrc.readyState === 0) {
          eventSrc.close();
          observer.complete();
        } else {
          observer.error('EventSource error: ' + error);
        }
      };
    });
  }
}
