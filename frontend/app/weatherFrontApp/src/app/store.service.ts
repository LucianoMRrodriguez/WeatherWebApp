import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StoreService {

  following: Set<string> = new Set<string>();
  public get userId(): string {
    return localStorage.getItem('userId');
  }
  constructor() { }

  addLocation(code: string) {
    this.following.add(code);
  }

  removeLocation(code: string) {
    if (this.following.has(code)) {
      this.following.delete(code);
    }
  }

  isLocationFollowed(code: string): Boolean {
    return this.following.has(code);
  }

  setUserId(id: string) {
    console.log(id);
    localStorage.setItem('userId', id);
  }

  isLoggedIn(): Boolean {
    return !!this.userId;
  }
}
