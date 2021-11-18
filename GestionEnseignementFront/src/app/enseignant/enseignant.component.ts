import { Component, OnInit } from '@angular/core';
import { Enseignant } from './src/app/page/enseignant';
import { EnseignantService } from "./services/enseignant/enseignant.service";
import {MatDialog} from '@angular/material/dialog';
import { FormEnseignantComponent } from './form-enseignant/form-enseignant.component';

@Component({
  selector: 'app-enseignant',
  templateUrl: './enseignant.component.html',
  styleUrls: ['./enseignant.component.css']
})
export class EnseignantComponent implements OnInit {
  // Créer un tableau enseignants en utilisant l'interface
  listEnseignant: Enseignant[] = [];
  constructor(private enseignantService: EnseignantService, private matDialog: MatDialog) { }

  ngOnInit(): void {
    //Relier les données 
    this.enseignantService.getEnseignant().subscribe((data: any[]) =>{       
      console.log(data);
      this.listEnseignant= data;
    })
 }
 openAddEnseignant() {
  const modal = this.matDialog.open(FormEnseignantComponent,
    {
      panelClass: 'custom-dialog-container',
      disableClose: true,
      data: { cours: null, modalType: 'add' }
    });
  modal.afterClosed().subscribe(() => this.enseignantService.getEnseignant);
}
openUpdateEnseignant(enseignant: Enseignant) {
  const modal = this.matDialog.open(FormEnseignantComponent,
    {
      panelClass: 'custom-dialog-container',
      disableClose: true,
      data: { enseignant: enseignant, modalType: 'edit' }
    });
  modal.afterClosed().subscribe(() => this.enseignantService.getEnseignant());
}
}