import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-follow-button',
  templateUrl: './follow-button.component.html',
  styleUrls: ['./follow-button.component.css']
})
export class FollowButtonComponent implements OnInit {

  @Input() followed: Boolean;
  @Output() follow = new EventEmitter();
  @Output() unfollow = new EventEmitter();
  constructor() { }

  ngOnInit() {
  }

  emitEvent() {
    this.followed ? this.unfollow.emit() : this.follow.emit();
  }
}
