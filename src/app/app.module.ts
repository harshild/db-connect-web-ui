import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { MysqlConnectorComponent } from './mysql-connector/mysql-connector.component';

const appRoutes: Routes = [
  { path: 'mysql', component: MysqlConnectorComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    MysqlConnectorComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(
      appRoutes
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
