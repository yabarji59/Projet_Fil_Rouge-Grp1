import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PageAccueilComponent } from './pages/page-accueil/page-accueil.component';
import { FooterComponent } from './shared/footer/footer.component';
import { HeaderComponent } from './shared/header/header.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
<<<<<<< HEAD
import { EleveComponent } from './pages/eleve/eleve.component';
import { HttpClientModule } from '@angular/common/http';
import { EleveService} from './services/eleve.service';
import { FormEleveComponent } from './pages/form-eleve/form-eleve.component';
import { EnseignantComponent } from './pages/enseignant/enseignant.component';
import { EnseignantService } from './services/enseignant/enseignant.service';
import { FormEnseignantComponent } from './form-enseignant/form-enseignant.component';


const appRoutes: Routes = [
]

=======
import { CoursComponent } from './pages/cours/cours.component';
import { CoursService } from './services/cours.service';
import { MatSliderModule } from '@angular/material/slider';
import {MatDialogModule} from '@angular/material/dialog';
>>>>>>> a06d6df34bf0c29eb2c289c42123cb1deb85e446
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
<<<<<<< HEAD
import { Routes } from '@angular/router';
import { CoursService } from './services/cours.service';
import { CoursComponent } from './pages/cours/cours.component';
import { CoursEditComponent } from './pages/cours/cours-edit/cours-edit.component';

=======
import { CoursDeleteComponent } from './pages/cours/cours-delete/cours-delete.component';
import { BannetteComponent } from './shared/banette/bannette/bannette.component';
import { EleveDeleteComponent } from './pages/eleve/eleve-delete/eleve-delete.component';
import { EleveEditComponent } from './pages/eleve/eleve-edit/eleve-edit.component';
import { EleveComponent } from './pages/eleve/eleve.component';
import { EleveService } from './services/eleve.service';
>>>>>>> a06d6df34bf0c29eb2c289c42123cb1deb85e446


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
<<<<<<< HEAD
    EnseignantComponent,
    FormEnseignantComponent
=======
    CoursDeleteComponent,
    BannetteComponent,
    EleveComponent,
    EleveEditComponent,
    EleveDeleteComponent

  
    
>>>>>>> a06d6df34bf0c29eb2c289c42123cb1deb85e446
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
<<<<<<< HEAD

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
=======
    AuthService,
    CoursService,
    EleveService,
    
  
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
>>>>>>> a06d6df34bf0c29eb2c289c42123cb1deb85e446
