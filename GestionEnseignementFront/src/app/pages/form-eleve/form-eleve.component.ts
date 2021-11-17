import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { EleveService } from 'src/app/services/eleve.service';
import { Eleve } from 'src/app/shared/model/eleve.model';

@Component({
  selector: 'app-form-eleve',
  templateUrl: './form-eleve.component.html',
  styleUrls: ['./form-eleve.component.css']
})
export class FormEleveComponent implements OnInit {

  addEleveForm: FormGroup;
  titre= '';
  editForm= false;
  eleveGet: string;
  constructor(
    private coursService: EleveService,
    private matDialog: MatDialog,
    public formBuilder: FormBuilder,
    @Inject(MAT_DIALOG_DATA) public dialogData: any) {
      this.addEleveForm = this.formBuilder.group({
        nom: ['', Validators.maxLength(1000)],
        prenom: ['', Validators.maxLength(1000)],
        age: ['', Validators.maxLength(1000)],
        telephone: ['', Validators.maxLength(1000)],
        email: ['', Validators.maxLength(1000)],
        adresse: ['', Validators.maxLength(1000)],
      });
    if(this.dialogData.modalType == 'edit'){
      this.titre ='Modifier un eleve';
      this.editForm= true;
      this.eleveGet= this.dialogData.eleve;
      this.addEleveForm.setValue({
        nom: this.dialogData.eleve.nom,
        prenom: this.dialogData.eleve.prenom,
        age: this.dialogData.eleve.age,
        telephone: this.dialogData.eleve.telephone,
        email: this.dialogData.eleve.email,
        adresse: this.dialogData.eleve.adresse
      });
    } else {
      this.titre ='Ajouter un eleve';
    }
    
    }

  ngOnInit(): void {
  }

  closeModal() {
    this.matDialog.closeAll();
  }

  addEleve(){
    let eleve= new Eleve();
    eleve.nom = this.addEleveForm.get('nom')?.value;
    eleve.prenom = this.addEleveForm.get('prenom')?.value;
    eleve.age = this.addEleveForm.get('age')?.value;
    eleve.telephone = this.addEleveForm.get('telephone')?.value;
    eleve.email= this.addEleveForm.get('email')?.value;
    eleve.adresse = this.addEleveForm.get('adresse')?.value;
    this.eleveService.createEleve(eleve).subscribe(
      result => {this.matDialog.closeAll();}
    ,errors =>{});
  }

  updateEleve(){
    this.eleveGet.nom = this.addEleveForm.get('nom')?.value;
    this.eleveService.updateEleve(this.eleveGet).subscribe(
      result => {this.matDialog.closeAll();}
    ,errors =>{});
  }
}

