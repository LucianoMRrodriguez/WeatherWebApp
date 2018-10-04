import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StoreService {

  following: Set<string> = new Set<string>();
  constructor() { }

  addLocation(code: string) {
    this.following.add(code);
  }

  removeLocation(code: string) {
    if (this.following.has(code)) {
      this.following.delete(code);
    }
  }

  isLocationFollowed(code: string) {
    return this.following.has(code);
  }
}
