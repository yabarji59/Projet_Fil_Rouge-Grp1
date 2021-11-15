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

import com.fr.gestion.service.IClasseService;
import com.fr.gestion.web.model.ClasseDto;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClasseController {
	@Autowired
	private IClasseService classeService;

	/**
	 * 
	 * @return
	 */
	@GetMapping({ "/classe" })
	public List<ClasseDto> classeList() {
		return classeService.findAllClasse();
	}

	/**
	 * 
	 * @param id
	 */
	@DeleteMapping({ "/classe/{id}" })
	public void delete(@PathVariable int id) {
		this.classeService.deleteClasse(id);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping({ "/classe/{id}" })
	public ClasseDto findById(@PathVariable int id) {
		return this.classeService.findByIdClasse(id);
	}

	@PostMapping({ "/classe" })
	public void save(@RequestBody ClasseDto classe) {
		this.classeService.createClasse(classe);

	}

	@PutMapping({ "/classe" })
	public void update(@RequestBody ClasseDto classe) {
		this.classeService.updateClasse(classe);

	}
	/**
	 * 
	 * @return
	 */
	@GetMapping({ "/classe/isEnabled" })
	public List<ClasseDto> classeListEnable() {
		return classeService.findAllClasseEnable();
		
	}
	@GetMapping({ "/classe/{id}/enabled" })
	public void enable(@PathVariable int id) {
		this.classeService.enableClasse(id);

	}

}
