import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageAccueilComponent } from './pages/page-accueil/page-accueil.component';
import { CoursComponent } from './pages/cours/cours.component';
import { AuthComponent } from './pages/auth/auth.component';
import { FormEleveComponent } from './pages/form-eleve/form-eleve.component';
import { EleveComponent } from './pages/eleve/eleve.component';


const routes: Routes = [
  {
      path: '', redirectTo: '/Accueil', pathMatch: 'full',
  },
  {
      path: 'Accueil',
      component: PageAccueilComponent,
  },
  {
    path: 'Cours',
    component: CoursComponent
},
{
  path: 'Eleve',
  component: EleveComponent
},
{
  path: 'Form-eleve',
  component: FormEleveComponent
},
  { path: '**', component: PageAccueilComponent },
  { path: 'auth', component: AuthComponent }

];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }