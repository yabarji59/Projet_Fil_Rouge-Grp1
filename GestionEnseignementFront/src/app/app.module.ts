import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PageAccueilComponent } from './page/page-accueil/page-accueil.component';
import { RouterModule, Routes } from '@angular/router';

const appRoutes: Routes = [{ path: '', component: PageAccueilComponent }];
@NgModule({
  declarations: [AppComponent, PageAccueilComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
