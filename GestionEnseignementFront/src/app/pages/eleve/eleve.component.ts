import { Component, OnInit } from '@angular/core';
import { Eleve } from 'src/app/shared/model/eleve.model';

@Component({
  selector: 'app-eleve',
  templateUrl: './eleve.component.html',
  styleUrls: ['./eleve.component.css']
})
export class EleveComponent implements OnInit {
  // Créer un tableau eleves en utilisant l'interface
  listEleve: Eleve[] = [];
  constructor() { }

  ngOnInit(): void {
    // Relier les données 
  // //   this.eleveService.getEleve().subscribe(data =>{       
  // //    
  // //     this.listEleve= data;
  // //   })
 }
  }


