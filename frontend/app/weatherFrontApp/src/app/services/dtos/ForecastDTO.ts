import { Temperature } from './TemperatureDTO';

export class ForecastDTO {
  code: string;
  when: Date;
  dayOfTheWeek: string;
  highest: Temperature;
  lowest: Temperature;
  description: string;
}
