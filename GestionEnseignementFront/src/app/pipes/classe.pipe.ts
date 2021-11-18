import { Pipe, PipeTransform } from '@angular/core';
import { Eleve } from '../shared/model/eleve.model';


@Pipe({
  name: 'classe'
})
export class ClassePipe implements PipeTransform {
  transform(eleve: Eleve) {
    return eleve.classe ? eleve.classe : 'Non concerné';
  }
}
