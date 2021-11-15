package com.fr.gestion.service;

import java.util.List;

import com.fr.gestion.web.model.EleveDto;


public interface IEleveService {

	/**
	 * Permet de retourner la liste des eleves
	 * 
	 * @param name
	 * @return listEleve
	 */
	List<EleveDto> findAllEleve();

	/**
	 * Permet de chercher un eleve à partir de son id
	 * 
	 * @param id
	 * @return eleve
	 */
	EleveDto findEleveById(Integer idEleve);

	/**
	 * Permet de creer un nouveau eleve
	 * 
	 * @param eleveDto
	 * @return eleve
	 */
	EleveDto createEleve(EleveDto eleveDto);

	/**
	 * Permet de mettre à jour un eleve à partir de son id
	 * 
	 * @param id
	 * @param eleveDto
	 */
	void updateEleve(Integer id, EleveDto eleveDto);

	/**
	 * Permet de supprimer un eleve
	 * 
	 * @param id
	 */
	void deleteEleve(Integer idEleve);

}
