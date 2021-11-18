import { Component, Inject, OnInit } from '@angular/core';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { CoursService } from 'src/app/services/cours.service';

@Component({
  selector: 'app-cours-delete',
  templateUrl: './cours-delete.component.html',
  styleUrls: ['./cours-delete.component.css']
})
export class CoursDeleteComponent implements OnInit {

  constructor( private coursService: CoursService,
  private matDialog: MatDialog,
  private route: Router,
  @Inject(MAT_DIALOG_DATA) public dialogData: any) {
  
  }

  ngOnInit(): void {
  }
  closeModal() {
    this.matDialog.closeAll();
  }
  
  deleteCours(){
    let id = this.dialogData.cours.idCours;
    this.coursService.deleteCours(id).subscribe(
      result => {this.matDialog.closeAll();
      }
    ,errors =>{});
  }
  

}
