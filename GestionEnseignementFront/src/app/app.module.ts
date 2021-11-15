import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
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

const appRoutes: Routes = [
{ path: 'auth', component: AuthComponent },

]
import { PageAccueilComponent } from './page/page-accueil/page-accueil.component';
import { RouterModule, Routes } from '@angular/router';

const appRoutes: Routes = [{ path: '', component: PageAccueilComponent }];
@NgModule({
  declarations: [
    AppComponent,
    PageAccueilComponent,
    AuthComponent,
    FooterComponent,
    HeaderComponent,
    NavbarComponent,
  ],
  declarations: [AppComponent, PageAccueilComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
  ],
  providers: [
    AuthService,
  ],
  bootstrap: [AppComponent]
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
