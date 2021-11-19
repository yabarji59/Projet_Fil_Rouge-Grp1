import { Component, Inject, OnInit } from '@angular/core';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { EleveService } from 'src/app/services/eleve.service';

@Component({
  selector: 'app-eleve-delete',
  templateUrl: './eleve-delete.component.html',
  styleUrls: ['./eleve-delete.component.css']
})
export class EleveDeleteComponent implements OnInit {

  constructor( private eleveService: EleveService,
  private matDialog: MatDialog,
  private route: Router,
  @Inject(MAT_DIALOG_DATA) public dialogData: any) {
  
  }

  ngOnInit(): void {
  }
  closeModal() {
    this.matDialog.closeAll();
  }
  
  deleteEleve(){
    let id = this.dialogData.eleve.idEleve;
    this.eleveService.deleteEleve(id).subscribe(
      result => {this.matDialog.closeAll();
      }
    ,errors =>{});
  }
  

}
