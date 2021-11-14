import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PageAccueilComponent } from './page-accueil/page-accueil.component';
import { AuthComponent } from './pages/auth/auth.component';
import { AuthService } from './services/auth.service';
import { FooterComponent } from './shared/footer/footer.component';
import { HeaderComponent } from './shared/header/header.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { CoursComponent } from './pages/cours/cours.component';
import { CoursService } from './services/cours.service';
import { HttpClientModule } from '@angular/common/http';

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
    CoursComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    AuthService,
    CoursService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
