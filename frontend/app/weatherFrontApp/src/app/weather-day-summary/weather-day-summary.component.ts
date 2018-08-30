import { Component, OnInit, Input } from '@angular/core';
import { DayForecast } from '../domain/dayForecast';
import { ForecastPlotterService} from '../services/forecast-plotter.service'

@Component({
  selector: 'app-weather-day-summary',
  templateUrl: './weather-day-summary.component.html',
  styleUrls: ['./weather-day-summary.component.css']
})
export class WeatherDaySummaryComponent implements OnInit {

  @Input() forecast: DayForecast;

  constructor(private forecastPlotter:ForecastPlotterService) { }

  ngOnInit() {
  }

  get imgSrc() {
    let src = '../../assets/img/' 
                + this.forecastPlotter.getImgName(this.forecast.state.id)
                + '.png';
    console.log(src);
    return src;
  }
}
