package com.fr.gestion.service;

import java.util.List;

import com.fr.gestion.web.model.UtilisateurDto;

/**
 * 
 * Interface IUtilisateurService
 * 
 * @author Apprenant
 *
 */
public interface IUtilisateurService {

	/**
	 * Permet d'afficher la liste de tous les utilisateurs
	 * 
	 * @return listeDesUtilisateurs
	 */
	public List<UtilisateurDto> findAll();

	/**
	 * Permet de chercher un utilisateur à partir de son Id
	 * 
	 * @param id
	 * @return utilisateur
	 */
	public UtilisateurDto findById(final Integer id);

	/**
	 * Permet de chercher un user à partir de son email
	 * 
	 * @param email
	 * @return utilisateur
	 */
	public UtilisateurDto findByEmail(String email);

	/**
	 * Permet de chercher un utilisateur à partir de son Email et son Mot de passe
	 * 
	 * @param login
	 * @param password
	 * @return utilisateur
	 */
	public UtilisateurDto findByEmailAndPassword(final String login, final String password);

	/**
	 * Permet de supprimer un utilisateur
	 * 
	 * @param id
	 */
	public void deleteById(final Integer id);

	/**
	 * metre à jour un utilisateur
	 * 
	 * @param utilisateur
	 * @return utilisateur
	 */
	public UtilisateurDto update(final UtilisateurDto utilisateur);

	/**
	 * creation un utilisateur
	 * 
	 * @param utilisateurDto
	 * @return utilisateur
	 */
	public UtilisateurDto save(final UtilisateurDto utilisateurDto);

}
