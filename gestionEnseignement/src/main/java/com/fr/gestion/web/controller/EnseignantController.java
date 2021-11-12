package com.fr.gestion.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fr.gestion.service.IEnseignantService;
import com.fr.gestion.web.model.EnseignantDto;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EnseignantController {

	@Autowired
	private IEnseignantService enseignantService;

	/**
	 * Permet de retouner la liste de tous les enseignants
	 * 
	 * @return liste
	 */
	@GetMapping("/enseignants")
	public List<EnseignantDto> listEnseignants() {
		return enseignantService.findAllEnseignant();
	}

	@GetMapping("/enseignants/{id}")
	public EnseignantDto findEnseignantById(@PathVariable(value = "id") Integer id) {
		return enseignantService.findEnseignantById(id);
	}

	/**
	 * Save an teacher
	 * 
	 * @param enseignantDto the teacher to create
	 */

	@PostMapping({ "/enseignants" })
	public void  save(@RequestBody EnseignantDto enseignant) {
		EnseignantDto newEnseignant=enseignantService.createEnseignant(enseignant);
		
		
	}

	/**
	 * Update an teacher
	 * 
	 * @param enseignantDto the article to be updated
	 */
	@PutMapping("/enseignants/{id}")
	public void update(@PathVariable Integer id, @RequestBody EnseignantDto enseignantDto) {
		EnseignantDto enseignant = enseignantService.findEnseignantById(id);
		if (enseignant != null) {
			enseignantService.updateEnseignant(id, enseignantDto);
		} else {
			enseignantService.createEnseignant(enseignantDto);
		}
	}

	/**
	 * Delete an teacher
	 * 
	 * @param id the id of the object we want to delete
	 */
	@DeleteMapping({ "/enseignants/{id}" })
	public void delete(@PathVariable(value = "id") Integer id) {
		this.enseignantService.deleteEnseignant(id);

	}

}
