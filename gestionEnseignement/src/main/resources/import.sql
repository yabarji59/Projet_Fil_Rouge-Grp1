
ALTER SEQUENCE cours_id_cours_seq RESTART WITH 1;
INSERT INTO public.cours(id_cours,libelle) VALUES ((select nextval('cours_id_cours_seq')),'Français');
INSERT INTO public.cours(id_cours,libelle) VALUES ((select nextval('cours_id_cours_seq')),'Anglais');
INSERT INTO public.cours(id_cours,libelle) VALUES ((select nextval('cours_id_cours_seq')),'Mathématiques');
INSERT INTO public.cours(id_cours,libelle) VALUES ((select nextval('cours_id_cours_seq')),'Histoire');
INSERT INTO public.cours(id_cours,libelle) VALUES ((select nextval('cours_id_cours_seq')),'Physique-Chimie');
INSERT INTO public.cours(id_cours,libelle) VALUES ((select nextval('cours_id_cours_seq')),'SVT');
INSERT INTO public.cours(id_cours,libelle) VALUES ((select nextval('cours_id_cours_seq')),'Géographie');
INSERT INTO public.cours(id_cours,libelle) VALUES ((select nextval('cours_id_cours_seq')),'Sport');
INSERT INTO public.cours(id_cours,libelle) VALUES ((select nextval('cours_id_cours_seq')),'Bureautique');


ALTER SEQUENCE enseignant_id_enseignant_seq RESTART WITH 1;
INSERT INTO public.enseignants(id_enseignant,adresse_enseignant,age_enseignant,available,email_enseignant,nom_enseignant,prenom_enseignant,telephone_enseignant) VALUES ((select nextval('enseignant_id_enseignant_seq')),'40 rue de l',40,false,'jean@professeur.com','dupont','jean','067543232');
INSERT INTO public.enseignants(id_enseignant,adresse_enseignant,age_enseignant,available,email_enseignant,nom_enseignant,prenom_enseignant,telephone_enseignant) VALUES ((select nextval('enseignant_id_enseignant_seq')),'124 rue de A',40,false,'pierre@professeur.com','dupont','pierre','066753232');
INSERT INTO public.enseignants(id_enseignant,adresse_enseignant,age_enseignant,available,email_enseignant,nom_enseignant,prenom_enseignant,telephone_enseignant) VALUES ((select nextval('enseignant_id_enseignant_seq')),'120 rue de H',40,false,'julien@professeur.com','dupont','julien','069064352');
INSERT INTO public.enseignants(id_enseignant,adresse_enseignant,age_enseignant,available,email_enseignant,nom_enseignant,prenom_enseignant,telephone_enseignant) VALUES ((select nextval('enseignant_id_enseignant_seq')),'56 rue de K',40,false,'lucile@professeur.com','dupont','lucile','0671235788');
INSERT INTO public.enseignants(id_enseignant,adresse_enseignant,age_enseignant,available,email_enseignant,nom_enseignant,prenom_enseignant,telephone_enseignant) VALUES ((select nextval('enseignant_id_enseignant_seq')),'39 rue de O',40,false,'arwa@professeur.com','dupont','arwa','067743790');


ALTER SEQUENCE classe_id_classe_seq RESTART WITH 1;
INSERT INTO public.classes(id_classe,capacite_max,capacite_min,enable,niveau,enseignant_do_id_enseignant,id_utilisateur) VALUES ((select nextval('classe_id_classe_seq')),20,10,true,'CP',1,null);
INSERT INTO public.classes(id_classe,capacite_max,capacite_min,enable,niveau,enseignant_do_id_enseignant,id_utilisateur) VALUES ((select nextval('classe_id_classe_seq')),20,10,true,'CE1',2,null);
INSERT INTO public.classes(id_classe,capacite_max,capacite_min,enable,niveau,enseignant_do_id_enseignant,id_utilisateur) VALUES ((select nextval('classe_id_classe_seq')),20,10,true,'CE2',3,null);
INSERT INTO public.classes(id_classe,capacite_max,capacite_min,enable,niveau,enseignant_do_id_enseignant,id_utilisateur) VALUES ((select nextval('classe_id_classe_seq')),20,10,true,'CM1',4,null);
INSERT INTO public.classes(id_classe,capacite_max,capacite_min,enable,niveau,enseignant_do_id_enseignant,id_utilisateur) VALUES ((select nextval('classe_id_classe_seq')),20,10,true,'CM2',5,null);


--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CP'),(select id_cours from public.cours where libelle='Français'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CP'),(select id_cours from public.cours where libelle='Sport'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE1'),(select id_cours from public.cours where libelle='Français'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE1'),(select id_cours from public.cours where libelle='Anglais'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE1'),(select id_cours from public.cours where libelle='Sport'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE1'),(select id_cours from public.cours where libelle='Mathématiques'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE2'),(select id_cours from public.cours where libelle='Histoire'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE2'),(select id_cours from public.cours where libelle='Français'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE2'),(select id_cours from public.cours where libelle='Anglais'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE2'),(select id_cours from public.cours where libelle='Sport'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE2'),(select id_cours from public.cours where libelle='Géographie'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE2'),(select id_cours from public.cours where libelle='SVT'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CE2'),(select id_cours from public.cours where libelle='Mathématiques'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM1'),(select id_cours from public.cours where libelle='Histoire'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM1'),(select id_cours from public.cours where libelle='Français'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM1'),(select id_cours from public.cours where libelle='Anglais'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM1'),(select id_cours from public.cours where libelle='Géographie'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM1'),(select id_cours from public.cours where libelle='Sport'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM1'),(select id_cours from public.cours where libelle='SVT'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM1'),(select id_cours from public.cours where libelle='Physique-Chimie'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM1'),(select id_cours from public.cours where libelle='Bureautique'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM1'),(select id_cours from public.cours where libelle='Mathématiques'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM2'),(select id_cours from public.cours where libelle='Bureautique'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM2'),(select id_cours from public.cours where libelle='Français'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM2'),(select id_cours from public.cours where libelle='Anglais'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM2'),(select id_cours from public.cours where libelle='Histoire'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM2'),(select id_cours from public.cours where libelle='Géographie'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM2'),(select id_cours from public.cours where libelle='Sport'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM2'),(select id_cours from public.cours where libelle='SVT'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM2'),(select id_cours from public.cours where libelle='Physique-Chimie'));
--INSERT INTO public.classes_liste_cours(classe_do_id_classe,liste_cours_id_cours) VALUES ((select id_classe from public.classes where niveau='CM2'),(select id_cours from public.cours where libelle='Mathématiques'));

ALTER SEQUENCE eleve_id_eleve_seq RESTART WITH 1;
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'32 rue de P',6,false,'Manon@eleve.com','dupont','manon','067543232',null);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'37 rue de P',7,false,'Anais@eleve.com','dupont','Anais','0679887542',null);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'123 rue de P',8,false,'Marc@eleve.com','dupont','Marc','0763566782',null);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'321 rue de P',9,false,'Elyane@eleve.com','dupont','Elyane','067532232',null);
INSERT INTO public.eleves(id_eleve,adresse_eleve,age_eleve,available,email_eleve,nom_eleve,prenom_eleve,telephone_eleve,id_classe) VALUES ((select nextval('eleve_id_eleve_seq')),'213 rue de P',10,false,'Benjamin@eleve.com','dupont','Benjamin','0675878765',null);













