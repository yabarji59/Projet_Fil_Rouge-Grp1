import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { EnseignantService } from 'src/app/services/enseignant.service';
import { Enseignant} from 'src/app/shared/model/enseignant.model';

@Component({
  selector: 'app-enseignant-edit',
  templateUrl: './enseignant-edit.component.html',
  styleUrls: ['./enseignant-edit.component.css']
})
export class EnseignantEditComponent implements OnInit {
  
  addEnseignantForm: FormGroup;
  titre= '';
  editForm= false;
  enseignantGet: any;
  constructor(
    private enseignantService: EnseignantService,
    private matDialog: MatDialog,
    public formBuilder: FormBuilder,
    @Inject(MAT_DIALOG_DATA) public dialogData: any) {
      this.addEnseignantForm = this.formBuilder.group({
        nomEnseignant: ['', Validators.maxLength(1000)],
        prenomEnseignant: ['', Validators.maxLength(1000)],
        emailEnseignant: ['', Validators.maxLength(1000)],
        telephoneEnseignant: ['', Validators.maxLength(1000)],
        ageEnseignant: ['', Validators.maxLength(1000)],
        adresseEnseignant: ['', Validators.maxLength(1000)],
      });
    if(this.dialogData.modalType == 'edit'){
      this.titre ='Modifier un enseignant';
      this.editForm= true;
      this.enseignantGet= this.dialogData.enseignant;
      this.addEnseignantForm.setValue({
        nomEnseignant: this.dialogData.enseignant.nomEnseignant,
        prenomEnseignant: this.dialogData.enseignant.prenomEnseignant,
        emailEnseignant: this.dialogData.enseignant.emailEnseignant,
        telephoneEnseignant: this.dialogData.enseignant.telephoneEnseignant,
        ageEnseignant: this.dialogData.enseignant.ageEnseignant,
        adresseEnseignant: this.dialogData.enseignant.nomEnseignant,
        
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
    let enseignant = new Enseignant();
    enseignant.nomEnseignant = this.addEnseignantForm.get('nomEnseignant')?.value;
    enseignant.prenomEnseignant = this.addEnseignantForm.get('prenomEnseignant')?.value;
    enseignant.emailEnseignant = this.addEnseignantForm.get('emailEnseignant')?.value;
    enseignant.telephoneEnseignant = this.addEnseignantForm.get('telephoneEnseignant')?.value;
    enseignant.ageEnseignant = this.addEnseignantForm.get('ageEnseignant')?.value;
    enseignant.adresseEnseignant = this.addEnseignantForm.get('adresseEnseignant')?.value;
    this.enseignantService.createEnseignant(enseignant).subscribe(
      result => {this.matDialog.closeAll();}
    ,errors =>{});
  }

  updateEnseignant(){
    this.enseignantGet.nomEnseignant = this.addEnseignantForm.get('nomEnseignant')?.value;
    this.enseignantGet.prenomEnseignant = this.addEnseignantForm.get('prenomEnseignant')?.value;
    this.enseignantGet.emailEnseignant = this.addEnseignantForm.get('emailEnseignant')?.value;
    this.enseignantGet.telephoneEnseignant = this.addEnseignantForm.get('telephoneEnseignant')?.value;
    this.enseignantGet.ageEnseignant = this.addEnseignantForm.get('ageEnseignant')?.value;
    this.enseignantGet.adresseEnseignant = this.addEnseignantForm.get('adresseEnseignant')?.value;
    this.enseignantService.updateEnseignant(this.enseignantGet).subscribe(
      result => {this.matDialog.closeAll();}
    ,errors =>{});
  }
}
