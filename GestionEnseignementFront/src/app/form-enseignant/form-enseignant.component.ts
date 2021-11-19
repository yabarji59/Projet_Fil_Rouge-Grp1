import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { EnseignantService } from 'src/app/services/enseignant.service';
import { Enseignant } from 'src/app/model/enseignant.model';

@Component({
  selector: 'app-form-enseignant',
  templateUrl: './form-enseignant.component.html',
  styleUrls: ['./form-enseignant.component.css']
})
export class FormEnseignantComponent implements OnInit {

  addEnseignantForm: FormGroup;
  titre= '';
  editForm= false;
  enseignantGet!: string;

  constructor(
    private enseignantService: EnseignantService,
    private matDialog: MatDialog,
    public formBuilder: FormBuilder,
    @Inject(MAT_DIALOG_DATA) public dialogData: any) {
      this.addEnseignantForm = this.formBuilder.group({
        nom: ['', Validators.maxLength(1000)],
        prenom: ['', Validators.maxLength(1000)],
        age: ['', Validators.maxLength(1000)],
        telephone: ['', Validators.maxLength(1000)],
        email: ['', Validators.maxLength(1000)],
        adresse: ['', Validators.maxLength(1000)],
      });
    if(this.dialogData.modalType == 'edit'){
      this.titre ='Modifier un enseignant';
      this.editForm= true;
      this.enseignantGet= this.dialogData.enseignant;
      this.addEnseignantForm.setValue({
        nom: this.dialogData.enseignant.nom,
        prenom: this.dialogData.enseignant.prenom,
        age: this.dialogData.enseignant.age,
        telephone: this.dialogData.enseignant.telephone,
        email: this.dialogData.enseignant.email,
        adresse: this.dialogData.enseignant.adresse
      });
    } else {
      this.titre ='Ajouter un enseignant';
    }
    
    }

  ngOnInit(): void {
  }

  closeModal() {
    this.matDialog.closeAll();
  }

  addEnseignant(){
    let enseignant= new Enseignant();
    enseignant.nomEnseignant = this.addEnseignantForm.get('nomEnseignant')?.value;
    enseignant.prenomEnseignant = this.addEnseignantForm.get('prenomEnseignant')?.value;
    enseignant.ageEnseignant = this.addEnseignantForm.get('ageEnseignant')?.value;
    enseignant.telephoneEnseignant = this.addEnseignantForm.get('telephoneEnseignant')?.value;
    enseignant.emailEnseignant = this.addEnseignantForm.get('emailEnseignant')?.value;
    enseignant.adresseEnseignant = this.addEnseignantForm.get('adresseEnseignant')?.value;
    this.enseignantService.createEnseignant(enseignant).subscribe(
        (      result: any) => {this.matDialog.closeAll();}
    ,(errors: any) =>{});
  }

  updateEnseignant(){
    this.enseignantGet.nomEnseignant = this.addEnseignantForm.get('nomEnseignant')?.value;
    this.enseignantService.updateEnseignant(this.enseignantGet).subscribe(
        (      result: any) => {this.matDialog.closeAll();}
    ,(errors: any) =>{});
  }
}