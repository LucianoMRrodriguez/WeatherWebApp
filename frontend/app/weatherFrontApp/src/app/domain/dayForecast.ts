import { WeatherState } from "./weatherState";

export class DayForecast {
    state: WeatherState;
    date: Date;
    day: string;
    highestTemperature: number;
    lowestTemperature: number;
}