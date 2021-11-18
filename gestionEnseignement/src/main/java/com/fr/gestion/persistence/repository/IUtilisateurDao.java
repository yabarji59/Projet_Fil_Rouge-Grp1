package com.fr.gestion.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fr.gestion.persistence.entities.UtilisateurDo;

@Repository
public interface IUtilisateurDao extends JpaRepository<UtilisateurDo, Integer> {

	// recherche par nom de methode

	/**
	 * Permet de chercher un utilisateur à partir de son email et de son password
	 * 
	 * @param login
	 * @param password
	 * @return
	 */
	UtilisateurDo findByEmailAndPassword(final String login, final String password);

	/**
	 * Permet de chercher un utilisateur à partir de son nom et son prenom
	 * 
	 * @param nom
	 * @param prenom
	 * @return
	 */
	UtilisateurDo findByNomOrPrenom(final String nom, final String prenom);

	/**
	 * Permet de chercher un utilisateur à partir de son email
	 * 
	 * @param email
	 * @return
	 */
	@Query("select u from UtilisateurDo u where lower(u.email)=lower(:email)")
	Optional<UtilisateurDo> findByEmail(final String email);

}
