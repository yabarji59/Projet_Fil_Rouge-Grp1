import { Component, OnInit } from '@angular/core';
import { CoursService } from 'src/app/services/cours.service';
import { Cours } from 'src/app/shared/model/cours.model';
import {MatDialog} from '@angular/material/dialog';
import { CoursEditComponent } from './cours-edit/cours-edit.component';
import { CoursDeleteComponent } from './cours-delete/cours-delete.component';

@Component({
  selector: 'app-cours',
  templateUrl: './cours.component.html',
  styleUrls: ['./cours.component.css']
})
export class CoursComponent implements OnInit {
  coursList: Cours[] = [];
  constructor(private coursService: CoursService, private matDialog: MatDialog) { }

  ngOnInit(): void {
    this.coursService.getCours().subscribe(data =>{       
      console.log(data);
      this.coursList= data;
    })
  }
  openAddCours() {
    const modal = this.matDialog.open(CoursEditComponent,
      {
        panelClass: 'custom-dialog-container',
        disableClose: true,
        data: { cours: null, modalType: 'add' }
      });
    modal.afterClosed().subscribe(() => this.coursService.getCours().subscribe(data =>{       
      console.log(data);
      this.coursList= data;
    }));
  }
  openUpdateCours(cours: Cours) {
    const modal = this.matDialog.open(CoursEditComponent,
      {
        panelClass: 'custom-dialog-container',
        disableClose: true,
        data: { cours: cours, modalType: 'edit' }
      });
    modal.afterClosed().subscribe(() => this.coursService.getCours().subscribe(data =>{       
      console.log(data);
      this.coursList= data;
    }));
  }
  openDeleteCours(cours: Cours){
    const modal = this.matDialog.open(CoursDeleteComponent,
      {
        panelClass: 'custom-dialog-container',
        disableClose: true,
        data: { cours: cours, modalType: 'delete' }
      });
    modal.afterClosed().subscribe(() => this.coursService.getCours().subscribe(data =>{       
      console.log(data);
      this.coursList= data;
    }));
  }
}
