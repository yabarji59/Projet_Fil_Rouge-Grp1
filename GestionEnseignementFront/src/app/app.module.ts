import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PageAccueilComponent } from './pages/page-accueil/page-accueil.component';
import { FooterComponent } from './shared/footer/footer.component';
import { HeaderComponent } from './shared/header/header.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { EleveComponent } from './pages/eleve/eleve.component';
import { HttpClientModule } from '@angular/common/http';
import { EleveService} from './services/eleve.service';
import { FormEleveComponent } from './pages/form-eleve/form-eleve.component';


const appRoutes: Routes = [
]
import { CoursComponent } from './pages/cours/cours.component';
import { CoursService } from './services/cours.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CoursEditComponent } from './pages/cours/cours-edit/cours-edit.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Routes } from '@angular/router';
import { ClassePipe } from './pipes/classe.pipe';
import { AuthComponent } from './pages/auth/auth.component';


@NgModule({
  declarations: [
    AppComponent,
    PageAccueilComponent,
    FooterComponent,
    HeaderComponent,
    NavbarComponent,
    EleveComponent,
    FormEleveComponent,
    CoursComponent,
    CoursEditComponent,
    ClassePipe,
    AuthComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [

    EleveService,
    HttpClientModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    CoursService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }