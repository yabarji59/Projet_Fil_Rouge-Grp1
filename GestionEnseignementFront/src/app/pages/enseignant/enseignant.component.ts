import { Component, OnInit } from '@angular/core';
import { EnseignantService } from 'src/app/services/enseignant.service';
import { Enseignant } from 'src/app/shared/model/enseignant.model';
import {MatDialog} from '@angular/material/dialog';
import { EnseignantEditComponent } from './enseignant-edit/enseignant-edit.component';
import { EnseignantDeleteComponent } from './enseignant-delete/enseignant-delete.component';

@Component({
  selector: 'app-enseignant',
  templateUrl: './enseignant.component.html',
  styleUrls: ['./enseignant.component.css']
})
export class EnseignantComponent implements OnInit {
  enseignantList: Enseignant[] = [];
  constructor(private enseignantService: EnseignantService, private matDialog: MatDialog) { }

  ngOnInit(): void {
    this.enseignantService.getEnseignant().subscribe(data =>{       
      console.log(data);
      this.enseignantList= data;
    })
  }
  openAddEnseignant() {
    const modal = this.matDialog.open(EnseignantEditComponent,
      {
        panelClass: 'custom-dialog-container',
        disableClose: true,
        data: { enseignant: null, modalType: 'add' }
      });
    modal.afterClosed().subscribe(() => this.enseignantService.getEnseignant().subscribe(data =>{       
      console.log(data);
      this.enseignantList= data;
    }));
  }
  openUpdateEnseignant(enseignant: Enseignant) {
    const modal = this.matDialog.open(EnseignantEditComponent,
      {
        panelClass: 'custom-dialog-container',
        disableClose: true,
        data: { enseignant: enseignant, modalType: 'edit' }
      });
    modal.afterClosed().subscribe(() => this.enseignantService.getEnseignant().subscribe(data =>{       
      console.log(data);
      this.enseignantList= data;
    }));
  }
  openDeleteEnseignant(enseignant: Enseignant){
    const modal = this.matDialog.open(EnseignantDeleteComponent,
      {
        panelClass: 'custom-dialog-container',
        disableClose: true,
        data: { enseignant: enseignant, modalType: 'delete' }
      });
    modal.afterClosed().subscribe(() => this.enseignantService.getEnseignant().subscribe(data =>{       
      console.log(data);
      this.enseignantList= data;
    }));
  }
}
