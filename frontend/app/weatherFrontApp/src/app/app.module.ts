import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { WeatherDaySummaryComponent } from './weather-day-summary/weather-day-summary.component';
import { WeatherForecastListComponent } from './weather-forecast-list/weather-forecast-list.component';
import { WeatherLocationCardComponent } from './weather-location-card/weather-location-card.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    WeatherDaySummaryComponent,
    WeatherForecastListComponent,
    WeatherLocationCardComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
