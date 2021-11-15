import { Injectable } from '@angular/core';
import { eleve } from '../shared/model/Eleve.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class CoursService {
  url_eleve = 'http://localhost:8080/api/eleve/'

  constructor(private http: HttpClient) { }

  getEleve(): Observable<any> {
    return this.http.get(this.url_eleve).
      pipe(map((eleve) => {
        return eleve;
      }));

  }

  deleteEleve(idEleve: number): Observable<any> {
    return this.http.delete(this.url_eleve+idEleve);
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
}