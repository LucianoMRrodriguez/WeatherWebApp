import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { WeatherDaySummaryComponent } from './weather-day-summary/weather-day-summary.component';
import { WeatherForecastListComponent } from './weather-forecast-list/weather-forecast-list.component';
import { WeatherLocationCardComponent } from './weather-location-card/weather-location-card.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NguCarouselModule } from '@ngu/carousel';

@NgModule({
  declarations: [
    AppComponent,
    WeatherDaySummaryComponent,
    WeatherForecastListComponent,
    WeatherLocationCardComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    NgbModule,
    NguCarouselModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
