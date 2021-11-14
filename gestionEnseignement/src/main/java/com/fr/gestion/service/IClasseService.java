package com.fr.gestion.service;

import java.util.List;

import com.fr.gestion.web.model.ClasseDto;

public interface IClasseService {

	/**
	 * Permet de recuperer la liste des classe d'un Utilisateur à partir de son id
	 * @param idUtilisateur
	 * @return listeClasseOneUser
	 */
	List<ClasseDto> findAllClasseOneUser(Integer idUtilisateur);

}
