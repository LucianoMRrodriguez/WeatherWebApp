import { Injectable } from '@angular/core';
import { YahooForecastCodeMap } from './yahoo-forecast.code-map'

@Injectable({
  providedIn: 'root'
})
export class ForecastPlotterService {

  constructor() { }

  getImgName( code:number ) {
    return YahooForecastCodeMap.codeMap[code];
  }
}
