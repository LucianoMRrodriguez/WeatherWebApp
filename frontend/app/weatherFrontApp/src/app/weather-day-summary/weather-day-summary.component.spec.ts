import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WeatherDaySummaryComponent } from './weather-day-summary.component';

describe('WeatherDaySummaryComponent', () => {
  let component: WeatherDaySummaryComponent;
  let fixture: ComponentFixture<WeatherDaySummaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WeatherDaySummaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WeatherDaySummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
