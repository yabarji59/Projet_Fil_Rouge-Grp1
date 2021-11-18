import { Injectable } from '@angular/core';
import { Cours } from '../shared/model/cours.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class CoursService {
  url_cours = 'http://localhost:8080/api/cours/'

  constructor(private http: HttpClient) { }

  getCours(): Observable<any> {
    return this.http.get(this.url_cours).
      pipe(map((cours) => {
        return cours;
      }));

  }

  deleteCours(idCours: number): Observable<any> {
    return this.http.delete(this.url_cours+idCours);
  }

  getCoursById(idCours: number): Observable<any> {
    return this.http.get(this.url_cours+idCours).
      pipe(map((cours) => {
        return cours;
      }));

  }
  createCours(cours : Cours): Observable<any> {
    return this.http.post(this.url_cours, cours);
  }
  updateCours(cours : Cours): Observable<any> {
    return this.http.put(this.url_cours, cours);
  }
}
