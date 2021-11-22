import { Component, OnInit } from '@angular/core';
import { EleveService } from 'src/app/services/eleve.service';
import { Eleve } from 'src/app/shared/model/eleve.model';
import {MatDialog} from '@angular/material/dialog';
import { EleveEditComponent } from './eleve-edit/eleve-edit.component';
import { EleveDeleteComponent } from './eleve-delete/eleve-delete.component';

@Component({
  selector: 'app-eleve',
  templateUrl: './eleve.component.html',
  styleUrls: ['./eleve.component.css']
})
export class EleveComponent implements OnInit {
  eleveList: Eleve[] = [];
  constructor(private eleveService: EleveService, private matDialog: MatDialog) { }

  ngOnInit(): void {
    this.eleveService.getEleve().subscribe(data =>{       
      console.log(data);
      this.eleveList= data;
    })
  }
  openAddEleve() {
    const modal = this.matDialog.open(EleveEditComponent,
      {
        panelClass: 'custom-dialog-container',
        disableClose: true,
        data: { eleve: null, modalType: 'add' }
      });
    modal.afterClosed().subscribe(() => this.eleveService.getEleve().subscribe(data =>{       
      console.log(data);
      this.eleveList= data;
    }));
  }
  openUpdateEleve(eleve: Eleve) {
    const modal = this.matDialog.open(EleveEditComponent,
      {
        panelClass: 'custom-dialog-container',
        disableClose: true,
        data: { eleve: eleve, modalType: 'edit' }
      });
    modal.afterClosed().subscribe(() => this.eleveService.getEleve().subscribe(data =>{       
      console.log(data);
      this.eleveList= data;
    }));
  }
  openDeleteEleve(eleve: Eleve){
    const modal = this.matDialog.open(EleveDeleteComponent,
      {
        panelClass: 'custom-dialog-container',
        disableClose: true,
        data: { eleve: eleve, modalType: 'delete' }
      });
    modal.afterClosed().subscribe(() => this.eleveService.getEleve().subscribe(data =>{       
      console.log(data);
      this.eleveList= data;
    }));
  }

  
}
