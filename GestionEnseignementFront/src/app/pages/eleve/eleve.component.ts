import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Eleve} from 'src/app/shared/model/eleve.model';
import { EleveService } from '../../services/eleve.service';


@Component({
  selector: 'app-eleve',
  templateUrl: './eleve.component.html',
  styleUrls: ['./eleve.component.css']
})
export class EleveComponent implements OnInit {

  form: FormGroup;
  classes = ['L1', 'L2', 'L3', 'M1', 'M2'];
  mode: 'ADD' | 'EDIT';

  constructor(fb: FormBuilder, private readonly eleveService: EleveService) {
    this.form = fb.group({
      nom: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(50)]],
      prenom: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(50)]],
      classe: [null]
    });

    this.form.controls.role.valueChanges.subscribe(role => {
      const classeControl = this.form.controls.classe;
      classeControl.clearValidators();

      if (role === 'E') {
        classeControl.setValidators(Validators.required);
      } else if (role === 'I') {
        classeControl.setValue(null);
      }

      classeControl.updateValueAndValidity();
    });

    this.mode = 'ADD';

    this.eleveService.onEdit.subscribe((eleve: Eleve) => {
      this.mode = 'EDIT';
      this.form.patchValue(eleve);
    });
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  onSubmit() {
    const eleve = this.form.value as Eleve;

    if (this.mode == 'ADD') {
      this.eleveService.addEleve(eleve);
    } else if (this.mode == 'EDIT') {
      this.eleveService.finishEditEleve(eleve);
    }

    this.mode = 'ADD';
    this.form.reset();
  }
}
