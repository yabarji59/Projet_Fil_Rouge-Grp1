import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageAccueilComponent } from './page-accueil/page-accueil.component';
import { CoursComponent } from './pages/cours/cours.component';


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
  { path: '**', component: PageAccueilComponent }

];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }

