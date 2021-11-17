import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
import { Eleve } from '../shared/model/eleve.model';
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
    return this.http.get(this.url_formEleve+idEleve).
      pipe(map((eleve) => {
        return eleve;
      }));

  }
  createEleve(eleve : Eleve): Observable<any> {
    return this.http.post(this.url_formEleve, eleve);
  }
  updateEleve(eleve : Eleve): Observable<any> {
    return this.http.put(this.url_formEleve, eleve);
  }
  deleteEleve(idEleve: number): Observable<any> {
    return this.http.delete(this.url_formEleve+idEleve);
  }
}
