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

import com.fr.gestion.service.ICoursService;
import com.fr.gestion.web.model.CoursDto;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CoursController {
	@Autowired
	private ICoursService coursService;

	/**
	 * Permet de récuperer la liste des cours
	 * 
	 * @return coursListe
	 */
	@GetMapping({ "/cours" })
	public List<CoursDto> coursList() {
		return coursService.findAllCours();
	}

	/**
	 * Permet de supprimer un cours
	 * 
	 * @param id
	 */
	@DeleteMapping({ "/cours/{id}" })
	public void delete(@PathVariable int id) {
		this.coursService.deleteCours(id);
	}

	/**
	 * Permet de récupérer un cours à partir de son id
	 * 
	 *  * @param id
	 * @return coursDto
	 */
	@GetMapping({ "/cours/{id}" })
	public CoursDto findById(@PathVariable int id) {
		final CoursDto coursDto =coursService.findByIdCours(id);
		return coursDto;
	}
	
	/**
	 * Permet de créer un cours
	 * 
	 *  * @param cours
	 */

	@PostMapping({ "/cours" })
	public void save(@RequestBody CoursDto cours) {
		this.coursService.createCours(cours);

	}
	
	/**
	 * Permet de modifier un cours 
	 * 
	 * 
	 * @param cours
	 */

	@PutMapping({ "/cours" })
	public void update(@RequestBody CoursDto cours) {
		this.coursService.updateCours(cours);

	}
}
