import { DayForecast } from '../../domain/dayForecast';

export const WEEK_FORECAST: DayForecast[] = [
    {
      state: {
        id: 12,
        description: 'Rain'
      },
      date: new Date(),
      day: 'Sun',
      highestTemperature: 20,
      lowestTemperature: 12
    },
    {
        state: {
          id: 30,
          description: 'Partly Cloudy'
        },
        date: new Date(),
        day: 'Mon',
        highestTemperature: 9,
        lowestTemperature: 4
      },
      {
        state: {
          id: 11,
          description: 'Showers'
        },
        date: new Date(),
        day: 'Tue',
        highestTemperature: 2,
        lowestTemperature: -3
      },
      {
        state: {
          id: 28,
          description: 'Mostly Cloudy'
        },
        date: new Date(),
        day: 'Wed',
        highestTemperature: 30,
        lowestTemperature: 1
      },
      {
        state: {
          id: 1,
          description: 'Scattered Showers'
        },
        date: new Date(),
        day: 'Thu',
        highestTemperature: 26,
        lowestTemperature: 15
      },
      {
        state: {
          id: 32,
          description: 'Sunny'
        },
        date: new Date(),
        day: 'Fri',
        highestTemperature: 18,
        lowestTemperature: 17
      },
      {
        state: {
          id: 47,
          description: 'Scattered Thunderstorms'
        },
        date: new Date(),
        day: 'Sat',
        highestTemperature: 12,
        lowestTemperature: 9
      }
];
