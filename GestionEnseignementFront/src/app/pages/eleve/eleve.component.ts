import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eleve',
  templateUrl: './eleve.component.html',
  styleUrls: ['./eleve.component.css']
})
export class EleveComponent implements OnInit {
  listEleve: Eleve[] = [];
  constructor() { }

  ngOnInit(): void {
    this.eleveService.getEleve().subscribe(data =>{       
      console.log(data);
      this.listEleve= data;
    })
  }
  }


