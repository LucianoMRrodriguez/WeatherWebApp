import { DayForecast } from './dayForecast';
import { Location } from './location';

export class LocationForecast {
  location: Location;
  forecast: DayForecast[];

  constructor(
    city: string,
    country: string,
    region: string,
    code: string,
    forecast?: DayForecast[]
  ) {
    this.location = new Location(city, country, region, code);
    this.forecast = forecast || [];
  }
}
