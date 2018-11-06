import { WeatherState } from './weatherState';

export class DayForecast {
    state: WeatherState;
    date: Date;
    day: string;
    highestTemperature: number;
    lowestTemperature: number;

    constructor(day: string, high: number,
        low: number, id: number,
        description: string, when: Date) {
        this.day = day;
        this.highestTemperature = high;
        this.lowestTemperature = low;
        this.state = new WeatherState(id, description);
        this.date = when;
    }
}
