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

import com.fr.gestion.service.IEleveService;
import com.fr.gestion.web.model.EleveDto;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class EleveController {

	@Autowired
	private IEleveService eleveService;
	
	
	@GetMapping({ "/eleve/isAvailable" })
	public List<EleveDto> ListEleveAvailable() {
		return eleveService.findAllEleveByAvailable();
		
	}

	@GetMapping("/eleves")
	public List<EleveDto> listEleve() {
		return eleveService.findAllEleve();
	}

	@GetMapping("/eleves/{id}")
	public EleveDto findEleveById(@PathVariable(value = "id") Integer id) {
		return eleveService.findEleveById(id);
	}

	@PostMapping({ "/eleves" })
	public void save(@RequestBody EleveDto eleve) {
		EleveDto newEleve = eleveService.createEleve(eleve);

	}

	@PutMapping("/eleves/{id}")
	public void update(@PathVariable Integer id, @RequestBody EleveDto eleveDto) {
		EleveDto eleve = eleveService.findEleveById(id);
		if (eleve != null) {
			eleveService.updateEleve(id, eleveDto);
		} else {
			eleveService.createEleve(eleveDto);
		}
	}

	@DeleteMapping({ "/eleves/{id}" })
	public void delete(@PathVariable(value = "id") Integer id) {
		this.eleveService.deleteEleve(id);

	}

}
