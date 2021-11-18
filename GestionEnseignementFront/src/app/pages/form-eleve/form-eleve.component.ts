import { Component, Inject, OnInit } from '@angular/core';
import { Eleve} from 'src/app/shared/model/eleve.model';
import { EleveService } from '../../services/eleve.service';

@Component({
  selector: 'app-form-eleve',
  templateUrl: './form-eleve.component.html',
  styleUrls: ['./form-eleve.component.css']
})
export class FormEleveComponent implements OnInit {
  eleve: Eleve[];

  constructor(private readonly eleveService: EleveService) {
    this.eleve = this.eleveService.getEleve();
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  prepareEdit(eleve: Eleve) {
    this.eleveService.prepareEditEleve(eleve);
  }

  delete(eleve: Eleve) {
    this.eleveService.deleteEleve(eleve.id);
  }
}
