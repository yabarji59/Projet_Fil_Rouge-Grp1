import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { AuthComponent } from './pages/auth/auth.component';
import { AuthService } from './services/auth.service';
import { FooterComponent } from './shared/footer/footer.component';
import { HeaderComponent } from './shared/header/header.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { EleveComponent } from './pages/eleve/eleve.component';
import { HttpClientModule } from '@angular/common/http';
import { PageAccueilComponent } from './page/page-accueil/page-accueil.component';
import {EleveService} from './services/eleve.service'
const appRoutes: Routes = [
{ path: 'auth', component: AuthComponent },

]

@NgModule({
  declarations: [
    AppComponent,
    PageAccueilComponent,
    AuthComponent,
    FooterComponent,
    HeaderComponent,
    NavbarComponent,
    EleveComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    AuthService,
    EleveService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }