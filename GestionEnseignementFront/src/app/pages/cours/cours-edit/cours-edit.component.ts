import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { CoursService } from 'src/app/services/cours.service';
import { Cours } from 'src/app/shared/model/cours.model';

@Component({
  selector: 'app-cours-edit',
  templateUrl: './cours-edit.component.html',
  styleUrls: ['./cours-edit.component.css']
})
export class CoursEditComponent implements OnInit {
  
  addCoursForm: FormGroup;
  titre= '';
  editForm= false;
  coursGet: any;
  constructor(
    private coursService: CoursService,
    private matDialog: MatDialog,
    public formBuilder: FormBuilder,
    @Inject(MAT_DIALOG_DATA) public dialogData: any) {
      this.addCoursForm = this.formBuilder.group({
        libelle: ['', Validators.maxLength(1000)],
        description: ['', Validators.maxLength(4000)],
      });
    if(this.dialogData.modalType == 'edit'){
      this.titre ='Modifier un cours';
      this.editForm= true;
      this.coursGet= this.dialogData.cours;
      this.addCoursForm.setValue({
        libelle: this.dialogData.cours.libelle,
        description: this.dialogData.cours.description
      });
    } else {
      this.titre ='Ajouter un cours';
    }
    
    }

  ngOnInit(): void {
  }

  closeModal() {
    this.matDialog.closeAll();
  }

  addCours(){
    let cours= new Cours();
    cours.libelle = this.addCoursForm.get('libelle')?.value;
    cours.description = this.addCoursForm.get('description')?.value;
    this.coursService.createCours(cours).subscribe(
      result => {this.matDialog.closeAll();}
    ,errors =>{});
  }

  updateCours(){
    this.coursGet.libelle = this.addCoursForm.get('libelle')?.value;
    this.coursGet.description = this.addCoursForm.get('description')?.value;
    this.coursService.updateCours(this.coursGet).subscribe(
      result => {this.matDialog.closeAll();}
    ,errors =>{});
  }
}
