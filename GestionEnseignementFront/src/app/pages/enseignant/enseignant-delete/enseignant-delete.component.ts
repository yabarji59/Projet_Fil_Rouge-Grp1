import { Component, Inject, OnInit } from '@angular/core';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { EnseignantService } from 'src/app/services/enseignant.service';

@Component({
  selector: 'app-enseignant-delete',
  templateUrl: './enseignant-delete.component.html',
  styleUrls: ['./enseignant-delete.component.css']
})
export class EnseignantDeleteComponent implements OnInit {

  constructor( private enseignantService: EnseignantService,
  private matDialog: MatDialog,
  private route: Router,
  @Inject(MAT_DIALOG_DATA) public dialogData: any) {
  
  }

  ngOnInit(): void {
  }
  closeModal() {
    this.matDialog.closeAll();
  }
  
  deleteEnseignant(){
    let id = this.dialogData.enseignant.idEnseignant;
    this.enseignantService.deleteEnseignant(id).subscribe(
      result => {this.matDialog.closeAll();
      }
    ,errors =>{});
  }
  

}
