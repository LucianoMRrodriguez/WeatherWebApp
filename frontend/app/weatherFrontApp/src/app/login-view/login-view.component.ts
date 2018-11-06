import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';

@Component({
  selector: 'app-login-view',
  templateUrl: './login-view.component.html',
  styleUrls: ['./login-view.component.css']
})
export class LoginViewComponent implements OnInit {

  username: string;
  constructor(private storeService: StoreService) { }

  ngOnInit() {
  }

  login() {
    this.storeService.setUserId(this.username);
  }
}
