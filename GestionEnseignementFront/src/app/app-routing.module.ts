import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EleveComponent } from './pages/eleve/eleve.component';
import { PageAccueilComponent } from './page/page-accueil/page-accueil.component';
import { FormEleveComponent } from './pages/form-eleve/form-eleve.component';

const routes: Routes = [
  // component " eleve" 
  { path: 'eleve', component:EleveComponent  },
  // 2ème route 
  // component " user-details "
  {path:'form-eleve/id', component:FormEleveComponent},
  //component "accueil"
  {path: 'accueil',component: PageAccueilComponent}

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }