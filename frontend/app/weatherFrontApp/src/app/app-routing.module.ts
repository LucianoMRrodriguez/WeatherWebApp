import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginViewComponent } from './login-view/login-view.component';
import { MainViewComponent } from './main-view/main-view.component';

const appRoutes: Routes = [
  { path: 'login', component: LoginViewComponent },
  { path: 'myboard', component: MainViewComponent },
  { path: '**', redirectTo: '/myboard', pathMatch: 'full' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
