import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageAccueilComponent } from './pages/page-accueil/page-accueil.component';
import { CoursComponent } from './pages/cours/cours.component';
import { AuthComponent } from './pages/auth/auth.component';
import { EleveComponent } from './pages/eleve/eleve.component';
import { EnseignantComponent } from './pages/enseignant/enseignant.component';



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
  path: 'Enseignant',
  component: EnseignantComponent
},

  { path: 'auth', component: AuthComponent }

];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
