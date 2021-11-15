package com.fr.gestion.service;

import java.util.List;

import com.fr.gestion.web.model.EnseignantDto;

public interface IEnseignantService {

	/**
	 * Permet de retourner la liste des enseignants
	 * 
	 * @param name
	 * @return listEnseignant
	 */
	List<EnseignantDto> findAllEnseignant();

	/**
	 * Permet de chercher un enseignant à partir de son id
	 * 
	 * @param id
	 * @return enseignant
	 */
	EnseignantDto findEnseignantById(Integer idEnseignant);

	/**
	 * Permet de creer un nouveau enseignant
	 * 
	 * @param enseignantDto
	 * @return enseignant
	 */
	EnseignantDto createEnseignant(EnseignantDto enseignantDto);

	/**
	 * Permet de mettre à jour un enseignant à partir de son id
	 * 
	 * @param id
	 * @param enseignantDto
	 */
	void updateEnseignant(Integer idEnseignant, EnseignantDto enseignantDto);

	/**
	 * Permet de supprimer un enseignant
	 * 
	 * @param id
	 */
	void deleteEnseignant(Integer idEnseignant);

}
