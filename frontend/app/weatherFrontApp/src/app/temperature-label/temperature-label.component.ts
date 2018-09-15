import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-temperature-label',
  templateUrl: './temperature-label.component.html',
  styleUrls: ['./temperature-label.component.css']
})
export class TemperatureLabelComponent implements OnInit {

  @Input() value: Number
  @Input() unit: String
  @Input() showInCelcius: Boolean

  constructor() { }

  ngOnInit() {
  }

}
