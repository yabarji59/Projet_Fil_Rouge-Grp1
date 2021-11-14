import { Component, OnInit } from '@angular/core';
import { CoursService } from 'src/app/services/cours.service';
import { Cours } from 'src/app/shared/model/cours.model';

@Component({
  selector: 'app-cours',
  templateUrl: './cours.component.html',
  styleUrls: ['./cours.component.css']
})
export class CoursComponent implements OnInit {
  coursList: Cours[] = [];
  constructor(private coursService: CoursService) { }

  ngOnInit(): void {
    this.coursService.getCours().subscribe(data =>{       
      console.log(data);
      this.coursList= data;
    })
  }

}
