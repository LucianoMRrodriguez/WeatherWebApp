import { TestBed, inject } from '@angular/core/testing';

import { ForecastPlotterService } from './forecast-plotter.service';

describe('ForecastPlotterService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ForecastPlotterService]
    });
  });

  it('should be created', inject([ForecastPlotterService], (service: ForecastPlotterService) => {
    expect(service).toBeTruthy();
  }));
});
