import { BoardDTO } from '../dtos/BoardDTO';
import { LocationForecast } from '../../domain/locationForecast';
import { DayForecast } from '../../domain/dayForecast';
import { LocationForecastDTO } from '../dtos/LocationForecastDTO';

export class LocationForecastBuilder {

  static buildFromBoard(dto: BoardDTO): LocationForecast[] {
    console.log(dto);
    return dto.subscriptions
      .map(sub =>
        this.buildFromLocation(sub.where));
  }

  static buildFromLocations(dto: LocationForecastDTO[]): LocationForecast[] {
    return dto.map(loc =>
      this.buildFromLocation(loc));
  }

  static buildFromLocation(dto: LocationForecastDTO): LocationForecast {
    return new LocationForecast(
      dto.city,
      dto.country,
      dto.region,
      dto.code,
      dto.nextWeek
        .map(f =>
          new DayForecast(
            f.dayOfTheWeek,
            f.highest.value,
            f.lowest.value,
            +f.code,
            f.description,
            f.when
          )
        )
    );
  }
}
