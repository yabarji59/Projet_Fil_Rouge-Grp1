import { Injectable } from '@angular/core';
import { Enseignant } from '../shared/model/enseignant.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class EnseignantService {
  url_enseignant = 'http://localhost:8080/api/enseignants/'


  constructor(private http: HttpClient) { }

  getEnseignant(): Observable<any> {
    return this.http.get(this.url_enseignant).
      pipe(map((enseignant) => {
        return enseignant;
      }));

  }

  deleteEnseignant(idEnseignant: number): Observable<any> {
    return this.http.delete(this.url_enseignant+idEnseignant);
  }

  getEnseignantById(idEnseignant: number): Observable<any> {
    return this.http.get(this.url_enseignant+idEnseignant).
      pipe(map((enseignant) => {
        return enseignant;
      }));

  }
  createEnseignant(enseignant : Enseignant): Observable<any> {
    return this.http.post(this.url_enseignant, enseignant);
  }
  updateEnseignant(enseignant : Enseignant): Observable<any> {
    return this.http.put(this.url_enseignant, enseignant);
  }
}
