import { Injectable } from '@angular/core';
import { FormEleve } from '../shared/model/form-eleve.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
export { }
@Injectable({
  providedIn: 'root'
})
export class FormEleveService {
  url_formEleve = 'http://localhost:8080/api/form-eleve/'

  constructor(private http: HttpClient) { }

  getAllEleve(): Observable<any> {
    return this.http.get(this.url_formEleve).
      pipe(map((formEleve) => {
        return formEleve;
      }));

  }
  getEleveById(idEleve: number): Observable<any> {
    return this.http.get(this.url_eleve+idEleve).
      pipe(map((eleve) => {
        return eleve;
      }));

  }
  createEleve(eleve : Eleve): Observable<any> {
    return this.http.post(this.url_eleve, eleve);
  }
  updateEleve(eleve : Eleve): Observable<any> {
    return this.http.put(this.url_eleve, eleve);
  }
  deleteEleve(idEleve: number): Observable<any> {
    return this.http.delete(this.url_eleve+idEleve);
  }
}
