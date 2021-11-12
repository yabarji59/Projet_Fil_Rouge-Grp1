package com.fr.gestion.service;

import java.util.List;

import com.fr.gestion.web.model.CoursDto;

public interface ICoursService {
	public List<CoursDto> findAllCours();

	public void deleteCours(int idCours);
	
	public CoursDto findByIdCours(int idCours);
	
	public void createCours(CoursDto cours); 
	
	public void updateCours(CoursDto cours);

}
