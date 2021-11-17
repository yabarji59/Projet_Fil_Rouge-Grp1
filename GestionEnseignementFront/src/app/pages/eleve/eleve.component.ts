import { Component, OnInit } from '@angular/core';
import { Eleve } from 'src/app/shared/model/eleve.model';
import { EleveService } from "src/app/services/eleve.service";
import {MatDialog} from '@angular/material/dialog';
import { FormEleveComponent } from './form-eleve/form-eleve.component';

@Component({
  selector: 'app-eleve',
  templateUrl: './eleve.component.html',
  styleUrls: ['./eleve.component.css']
})
export class EleveComponent implements OnInit {
  // Créer un tableau eleves en utilisant l'interface
  listEleve: Eleve[] = [];
  constructor(private eleveService: EleveService, private matDialog: MatDialog) { }

  ngOnInit(): void {
    //Relier les données 
    this.eleveService.getEleve().subscribe(data =>{       
      console.log(data);
      this.listEleve= data;
    })
 }
 openAddEleve() {
  const modal = this.matDialog.open(EleveFormComponent,
    {
      panelClass: 'custom-dialog-container',
      disableClose: true,
      data: { cours: null, modalType: 'add' }
    });
  modal.afterClosed().subscribe(() => this.eleveService.getEleve));
}
openUpdateEleve(eleve: Eleve) {
  const modal = this.matDialog.open(EleveFormComponent,
    {
      panelClass: 'custom-dialog-container',
      disableClose: true,
      data: { eleve: eleve, modalType: 'edit' }
    });
  modal.afterClosed().subscribe(() => this.eleveService.getEleve());
}
}

  

