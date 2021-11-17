package com.fr.gestion.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fr.gestion.service.IClasseService;
import com.fr.gestion.service.IUtilisateurService;
import com.fr.gestion.web.model.ClasseDto;
import com.fr.gestion.web.model.UtilisateurDto;

/**
 * Classe UtilisateurController
 * 
 * @author Apprenant
 *
 */
@RestController
public class UtilisateurController {

	@Autowired
	IUtilisateurService utilisateurService;
	@Autowired
	IClasseService classeService;

	// GET /utilisateurs/
	@GetMapping({ "/utilisateurs" })
	public List<UtilisateurDto> getAll() {
		List<UtilisateurDto> utilisateurs = utilisateurService.findAll();
		return utilisateurs;
	}

	// DELETE /utilisateurs/{idUser}
	@DeleteMapping("/utilisateurs/{id}")
	public void supprimerUtilisateur(final @PathVariable Integer id) {
		utilisateurService.deleteById(id);
	}

	// GET /utilisateurs/{idUser} ==> getById
	@GetMapping("/utilisateurs/{id}")
	public UtilisateurDto findById(final @PathVariable Integer id, final HttpServletRequest request) {
		return utilisateurService.findById(id);
	}

	// POST /utilisateurs/
	@PostMapping("/utilisateurs")
	@ResponseStatus(value = HttpStatus.CREATED)
	public UtilisateurDto save(final @RequestParam(value = "file_image", required = false) MultipartFile uneImage,
			final @RequestBody UtilisateurDto utilisateur) {
		UtilisateurDto newUtilisateur = new UtilisateurDto();
		newUtilisateur = utilisateurService.save(utilisateur);
		return newUtilisateur;
	}

	// PUT /utilisateurs/{idUser}
	@PutMapping("/utilisateurs/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public UtilisateurDto update(final @RequestBody UtilisateurDto utilisateur) {
		UtilisateurDto newUtilisateur = new UtilisateurDto();
		
			newUtilisateur = utilisateurService.update(utilisateur);

		return newUtilisateur;
	}

}
