import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LocationService {

  boardsUrl = 'http://localhost:8080/api/boards/';

  constructor(
    private http: HttpClient
  ) { }

  getBoard(id: string): Observable<Object> {
    return this.http.get(this.boardsUrl + id);
  }
}
