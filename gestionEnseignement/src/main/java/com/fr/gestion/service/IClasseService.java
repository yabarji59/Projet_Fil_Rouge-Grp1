package com.fr.gestion.service;

import java.util.List;

<<<<<<< HEAD
=======
import com.fr.gestion.persistence.entities.ClasseDo;
>>>>>>> a927343ce279d98adc7ed5d4984208e6fffb64da
import com.fr.gestion.web.model.ClasseDto;


public interface IClasseService {
	public List<ClasseDto> findAllClasse();

	public void deleteClasse(int idClasse);
	
	public ClasseDto findByIdClasse(int idClasse);
	
	public void createClasse(ClasseDto classe); 
	
	public void updateClasse(ClasseDto classe);
	
	public List<ClasseDto>findAllClasseEnable();
	
	public void enableClasse(int idClasse);

	/**
	 * Permet de recuperer la liste des classe d'un Utilisateur à partir de son id
	 * @param idUtilisateur
	 * @return listeClasseOneUser
	 */
	List<ClasseDto> findAllClasseOneUser(Integer idUtilisateur);

}
