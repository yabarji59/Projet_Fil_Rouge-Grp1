import { EventEmitter, Injectable } from '@angular/core';
import { Eleve } from '../shared/model/eleve.model';
import { HttpClient } from '@angular/common/http';
import { Classe } from "../shared/model/classe";
export { }
@Injectable({
  providedIn: 'root'
})
export class EleveService {
  private eleve: Eleve[] = [];
  public onEdit = new EventEmitter<Eleve>();
  //url_eleve = 'http://localhost:8080/api/eleve/'

  constructor(private http: HttpClient) { }

  public getEleve() {
    return this.eleve;
  }

  public addEleve(eleve: Eleve) {
    const lastEleve = this.eleve[this.eleve.length - 1];
    const lastId = (lastEleve && lastEleve.id) || 0;
    const newId = lastId + 1;
    eleve.id = newId;

    this.eleve.push(eleve);
  }

  public prepareEditEleve(eleve: Eleve) {
    this.onEdit.emit(eleve);
  }

  public finishEditEleve(eleve: Eleve) {
    const index = this.eleve.findIndex(p => p.id === eleve.id);
    this.eleve.splice(index, 1, eleve);
  }

  public deleteEleve(id: number) {
    const index = this.eleve.findIndex(p => p.id === id);
    this.eleve.splice(index, 1);
  }
}
