import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { WeatherDaySummaryComponent } from './weather-day-summary/weather-day-summary.component';
import { WeatherForecastListComponent } from './weather-forecast-list/weather-forecast-list.component';
import { WeatherLocationCardComponent } from './weather-location-card/weather-location-card.component';

@NgModule({
  declarations: [
    AppComponent,
    WeatherDaySummaryComponent,
    WeatherForecastListComponent,
    WeatherLocationCardComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
