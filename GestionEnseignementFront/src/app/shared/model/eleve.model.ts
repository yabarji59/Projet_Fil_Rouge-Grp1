import { Classe } from './classe';

export interface Eleve {
  id: number;
  nom: string;
  prenom: string;
  classe?: Classe;
}





// export interface Eleve{
//     idEleve : number;
//     nomEleve : string;
//     prenomEleve : string;
//     emailEleve : string;
//     telephoneEleve : string;
//     ageEleve : number;
//     adresseEleve : string;
// }