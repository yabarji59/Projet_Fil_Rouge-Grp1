

ALTER SEQUENCE classe_id_classe_seq RESTART WITH 1;
--INSERT INTO public.classes(id_classe, capacite_max, capacite_min, "enable", niveau, id_utilisateur) VALUES(0, 0, 0, false, '', 0);
INSERT INTO public.classes(id_classe,capacite_max,capacite_min,enable,niveau,id_utilisateur) VALUES ((select nextval('classe_id_classe_seq')),20,10,true,'CP',null);
INSERT INTO public.classes(id_classe,capacite_max,capacite_min,enable,niveau,id_utilisateur) VALUES ((select nextval('classe_id_classe_seq')),20,10,true,'CE1',null);
INSERT INTO public.classes(id_classe,capacite_max,capacite_min,enable,niveau,id_utilisateur) VALUES ((select nextval('classe_id_classe_seq')),20,10,true,'CE2',null);
INSERT INTO public.classes(id_classe,capacite_max,capacite_min,enable,niveau,id_utilisateur) VALUES ((select nextval('classe_id_classe_seq')),20,10,true,'CM1',null);
INSERT INTO public.classes(id_classe,capacite_max,capacite_min,enable,niveau,id_utilisateur) VALUES ((select nextval('classe_id_classe_seq')),20,10,true,'CM2',null);


ALTER SEQUENCE cours_id_cours_seq RESTART WITH 1;
--INSERT INTO public.cours(id_cours, description, libelle, classe_id_classe) VALUES(0, '', '', 0);
INSERT INTO public.cours(id_cours,description,libelle, classe_id_classe) VALUES ((select nextval('cours_id_cours_seq')),'Les horaires d''enseignement à l''école élémentaire sont répartis par matière. Ils dépendent du cycle dans lequel se trouve l''enfant. La semaine scolaire ne peut pas dépasser 24 heures d''enseignement. L''année scolaire comporte 36 semaines d''école.','Programme CP',1);
INSERT INTO public.cours(id_cours,description,libelle, classe_id_classe) VALUES ((select nextval('cours_id_cours_seq')),'Les horaires d''enseignement à l''école élémentaire sont répartis par matière. Ils dépendent du cycle dans lequel se trouve l''enfant. La semaine scolaire ne peut pas dépasser 24 heures d''enseignement. L''année scolaire comporte 36 semaines d''école.','Programme CE1',2);
INSERT INTO public.cours(id_cours,description,libelle, classe_id_classe) VALUES ((select nextval('cours_id_cours_seq')),'Les horaires d''enseignement à l''école élémentaire sont répartis par matière. Ils dépendent du cycle dans lequel se trouve l''enfant. La semaine scolaire ne peut pas dépasser 24 heures d''enseignement. L''année scolaire comporte 36 semaines d''école.','Programme CE2',3);
INSERT INTO public.cours(id_cours,description,libelle, classe_id_classe) VALUES ((select nextval('cours_id_cours_seq')),'Les horaires d''enseignement à l''école élémentaire sont répartis par matière. Ils dépendent du cycle dans lequel se trouve l''enfant. La semaine scolaire ne peut pas dépasser 24 heures d''enseignement. L''année scolaire comporte 36 semaines d''école.','Programme CM1',4);
INSERT INTO public.cours(id_cours,description,libelle, classe_id_classe) VALUES ((select nextval('cours_id_cours_seq')),'Les horaires d''enseignement à l''école élémentaire sont répartis par matière. Ils dépendent du cycle dans lequel se trouve l''enfant. La semaine scolaire ne peut pas dépasser 24 heures d''enseignement. L''année scolaire comporte 36 semaines d''école.','Programme CM2',5);

ALTER SEQUENCE enseignant_id_enseignant_seq RESTART WITH 1;
--INSERT INTO public.enseignants(id_enseignant, adresse_enseignant, age_enseignant, available, email_enseignant, nom_enseignant, prenom_enseignant, telephone_enseignant, classe_id_classe) VALUES(0, '', 0, false, '', '', '', '', 0);
INSERT INTO public.enseignants(id_enseignant,adresse_enseignant,age_enseignant,available,email_enseignant,nom_enseignant,prenom_enseignant,telephone_enseignant, classe_id_classe) VALUES ((select nextval('enseignant_id_enseignant_seq')),'40 rue de l',40,false,'jean@professeur.com','dupont','jean','067543232',1);
INSERT INTO public.enseignants(id_enseignant,adresse_enseignant,age_enseignant,available,email_enseignant,nom_enseignant,prenom_enseignant,telephone_enseignant, classe_id_classe) VALUES ((select nextval('enseignant_id_enseignant_seq')),'124 rue de A',40,false,'pierre@professeur.com','dupont','pierre','066753232',2);
INSERT INTO public.enseignants(id_enseignant,adresse_enseignant,age_enseignant,available,email_enseignant,nom_enseignant,prenom_enseignant,telephone_enseignant, classe_id_classe) VALUES ((select nextval('enseignant_id_enseignant_seq')),'120 rue de H',40,false,'julien@professeur.com','dupont','julien','069064352',3);
INSERT INTO public.enseignants(id_enseignant,adresse_enseignant,age_enseignant,available,email_enseignant,nom_enseignant,prenom_enseignant,telephone_enseignant, classe_id_classe) VALUES ((select nextval('enseignant_id_enseignant_seq')),'56 rue de K',40,false,'lucile@professeur.com','dupont','lucile','0671235788',4);
INSERT INTO public.enseignants(id_enseignant,adresse_enseignant,age_enseignant,available,email_enseignant,nom_enseignant,prenom_enseignant,telephone_enseignant, classe_id_classe) VALUES ((select nextval('enseignant_id_enseignant_seq')),'39 rue de O',40,false,'arwa@professeur.com','dupont','arwa','067743790',5);




ALTER SEQUENCE eleve_id_eleve_seq RESTART WITH 1;
--INSERT INTO public.eleves(id_eleve, adresse_eleve, age_eleve, available, email_eleve, nom_eleve, prenom_eleve, telephone_eleve, id_classe) VALUES(0, '', 0, false, '', '', '', '', 0);
--**CP
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',1);
--**CE1
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',2);
--**CE2
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',3);
--**CM1
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',4);
--**CM2
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',5);













