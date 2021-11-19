import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { EleveService } from 'src/app/services/eleve.service';
import { Eleve} from 'src/app/shared/model/eleve.model';

@Component({
  selector: 'app-eleve-edit',
  templateUrl: './eleve-edit.component.html',
  styleUrls: ['./eleve-edit.component.css']
})
export class EleveEditComponent implements OnInit {
  
  addEleveForm: FormGroup;
  titre= '';
  editForm= false;
  eleveGet: any;
  constructor(
    private eleveService: EleveService,
    private matDialog: MatDialog,
    public formBuilder: FormBuilder,
    @Inject(MAT_DIALOG_DATA) public dialogData: any) {
      this.addEleveForm = this.formBuilder.group({
        nomEleve: ['', Validators.maxLength(1000)],
        prenomEleve: ['', Validators.maxLength(1000)],
        email: ['', Validators.maxLength(1000)],
        telephoneEleve: ['', Validators.maxLength(1000)],
        ageEleve: ['', Validators.maxLength(1000)],
        adresseEleve: ['', Validators.maxLength(1000)],
      });
    if(this.dialogData.modalType == 'edit'){
      this.titre ='Modifier un eleve';
      this.editForm= true;
      this.eleveGet= this.dialogData.eleve;
      this.addEleveForm.setValue({
        nomEleve: this.dialogData.eleve.nomEleve,
        prenomEleve: this.dialogData.eleve.prenomEleve,
        emailEleve: this.dialogData.eleve.emailEleve,
        telephoneEleve: this.dialogData.eleve.telephoneEleve,
        ageEleve: this.dialogData.eleve.ageEleve,
        adresseEleve: this.dialogData.eleve.nomEleve,
        
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
    eleve.nomEleve = this.addEleveForm.get('nomEleve')?.value;
    eleve.prenomEleve = this.addEleveForm.get('prenomEleve')?.value;
    eleve.emailEleve = this.addEleveForm.get('emailEleve')?.value;
    eleve.telephoneEleve = this.addEleveForm.get('telephoneEleve')?.value;
    eleve.ageEleve = this.addEleveForm.get('ageEleve')?.value;
    eleve.adresseEleve = this.addEleveForm.get('adresseEleve')?.value;
    this.eleveService.createEleve(eleve).subscribe(
      result => {this.matDialog.closeAll();}
    ,errors =>{});
  }

  updateEleve(){
    this.eleveGet.nomEleve = this.addEleveForm.get('nomEleve')?.value;
    this.eleveGet.prenomEleve = this.addEleveForm.get('prenomEleve')?.value;
    this.eleveGet.emailEleve = this.addEleveForm.get('emailEleve')?.value;
    this.eleveGet.telephoneEleve = this.addEleveForm.get('telephoneEleve')?.value;
    this.eleveGet.ageEleve = this.addEleveForm.get('ageEleve')?.value;
    this.eleveGet.adresseEleve = this.addEleveForm.get('adresseEleve')?.value;
    this.eleveService.updateEleve(this.eleveGet).subscribe(
      result => {this.matDialog.closeAll();}
    ,errors =>{});
  }
}
