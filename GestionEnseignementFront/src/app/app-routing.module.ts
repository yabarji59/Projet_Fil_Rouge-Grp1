import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EleveComponent } from './pages/eleve/eleve.component';
import { PageAccueilComponent } from './page/page-accueil/page-accueil.component';
import { DetailsEleveComponent } from './pages/details-eleve/details-eleve.component';

const routes: Routes = [
  // component " eleve" 
  { path: 'eleve', component:EleveComponent  },
  // 2ème route - 
  // component " user-details "
  {path:'details-eleve', component:DetailsEleveComponent},
  //component "accueil"
  {path: 'Accueil',component: PageAccueilComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }