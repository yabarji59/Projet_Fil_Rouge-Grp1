import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { PageAccueilComponent } from './page/page-accueil/page-accueil.component';
import { RouterModule, Routes } from '@angular/router';
=======
import { PageAccueilComponent } from './page-accueil/page-accueil.component';
import { AuthComponent } from './pages/auth/auth.component';
import { AuthService } from './services/auth.service';
import { FooterComponent } from './shared/footer/footer.component';
import { HeaderComponent } from './shared/header/header.component';
import { NavbarComponent } from './shared/navbar/navbar.component';

const appRoutes: Routes = [
{ path: 'auth', component: AuthComponent },

]
>>>>>>> f4d843c27d53b67c9bb6d64a64e6db6ed71ca303

const appRoutes: Routes = [{ path: '', component: PageAccueilComponent }];
@NgModule({
<<<<<<< HEAD
  declarations: [AppComponent, PageAccueilComponent],
=======
  declarations: [
    AppComponent,
    PageAccueilComponent,
    AuthComponent,
    FooterComponent,
    HeaderComponent,
    NavbarComponent,
  ],
>>>>>>> f4d843c27d53b67c9bb6d64a64e6db6ed71ca303
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
  ],
<<<<<<< HEAD
  providers: [],
  bootstrap: [AppComponent],
=======
  providers: [
    AuthService,
  ],
  bootstrap: [AppComponent]
>>>>>>> f4d843c27d53b67c9bb6d64a64e6db6ed71ca303
})
export class AppModule {}
