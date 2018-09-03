import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WeatherLocationCardComponent } from './weather-location-card.component';

describe('WeatherForecastListComponent', () => {
  let component: WeatherLocationCardComponent;
  let fixture: ComponentFixture<WeatherLocationCardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WeatherLocationCardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WeatherLocationCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
