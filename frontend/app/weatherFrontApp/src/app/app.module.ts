import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { WeatherDaySummaryComponent } from './weather-day-summary/weather-day-summary.component';
import { WeatherForecastListComponent } from './weather-forecast-list/weather-forecast-list.component';
import { WeatherLocationCardComponent } from './weather-location-card/weather-location-card.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NguCarouselModule } from '@ngu/carousel';
import { MatTabsModule, MatButtonModule } from '@angular/material';
import { MatIconModule } from '@angular/material/icon';
import { BoardComponent } from './board/board.component';
import { SearchViewComponent } from './search-view/search-view.component';
import { ProfileComponent } from './profile/profile.component';
import { FormsModule } from '@angular/forms';
import { FollowButtonComponent } from './follow-button/follow-button.component';

@NgModule({
  declarations: [
    AppComponent,
    WeatherDaySummaryComponent,
    WeatherForecastListComponent,
    WeatherLocationCardComponent,
    BoardComponent,
    SearchViewComponent,
    ProfileComponent,
    FollowButtonComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    BrowserAnimationsModule,
    NgbModule,
    NguCarouselModule,
    HttpClientModule,
    MatTabsModule,
    MatIconModule,
    MatButtonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
