import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { WeatherDaySummaryComponent } from './weather-day-summary/weather-day-summary.component';
import { WeatherForecastListComponent } from './weather-forecast-list/weather-forecast-list.component';

@NgModule({
  declarations: [
    AppComponent,
    WeatherDaySummaryComponent,
    WeatherForecastListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
