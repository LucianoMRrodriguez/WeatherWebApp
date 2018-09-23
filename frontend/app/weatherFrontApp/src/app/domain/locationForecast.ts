import { DayForecast } from './dayForecast';
import { Location } from './location';

export class LocationForecast {
    location: Location;
    forecast: DayForecast[];
    constructor(locationName: string) {
        this.location = new Location(locationName);
        this.forecast = [];
    }
}
