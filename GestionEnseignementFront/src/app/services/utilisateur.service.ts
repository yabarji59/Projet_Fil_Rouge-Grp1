import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class UtilisateurService {
    url: 'http://localhost:8080/utilisateurs';
    constructor(private httpClient: HttpClient) {

        
    }


}