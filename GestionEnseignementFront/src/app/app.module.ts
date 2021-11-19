import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PageAccueilComponent } from './pages/page-accueil/page-accueil.component';
import { AuthComponent } from './pages/auth/auth.component';
import { AuthService } from './services/auth.service';
import { FooterComponent } from './shared/footer/footer.component';
import { HeaderComponent } from './shared/header/header.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { CoursComponent } from './pages/cours/cours.component';
import { CoursService } from './services/cours.service';
import { MatSliderModule } from '@angular/material/slider';
import {MatDialogModule} from '@angular/material/dialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CoursEditComponent } from './pages/cours/cours-edit/cours-edit.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CoursDeleteComponent } from './pages/cours/cours-delete/cours-delete.component';
import { BannetteComponent } from './shared/banette/bannette/bannette.component';
import { EleveDeleteComponent } from './pages/eleve/eleve-delete/eleve-delete.component';
import { EleveEditComponent } from './pages/eleve/eleve-edit/eleve-edit.component';
import { EleveComponent } from './pages/eleve/eleve.component';
import { EleveService } from './services/eleve.service';
import { EnseignantEditComponent } from './pages/enseignant/enseignant-edit/enseignant-edit.component';
import { EnseignantDeleteComponent } from './pages/enseignant/enseignant-delete/enseignant-delete.component';
import { EnseignantComponent } from './pages/enseignant/enseignant.component';
import { EnseignantService } from './services/enseignant.service';

@NgModule({
  declarations: [
    AppComponent,
    PageAccueilComponent,
    AuthComponent,
    FooterComponent,
    HeaderComponent,
    NavbarComponent,
    CoursComponent,
    CoursEditComponent,
    CoursDeleteComponent,
    BannetteComponent,
    EleveComponent,
    EleveEditComponent,
    EleveDeleteComponent,
    
    EnseignantEditComponent,
    EnseignantDeleteComponent,
    EnseignantComponent,
    



  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    MatSliderModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    MatDialogModule
  ],
  providers: [
    AuthService,
    CoursService,
    EleveService,
    EnseignantService


  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
