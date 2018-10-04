import { ForecastDTO } from './ForecastDTO';

export class LocationForecastDTO {
  id: string;
  code: string;
  city: string;
  country: string;
  region: string;
  nextWeek: ForecastDTO[];
  lastUpdate: Date;
}
