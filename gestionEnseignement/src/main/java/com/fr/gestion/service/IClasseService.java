package com.fr.gestion.service;

import java.util.List;

import com.fr.gestion.web.model.ClasseDto;


public interface IClasseService {
	public List<ClasseDto> findAllClasse();

	public void deleteClasse(int idClasse);
	
	public ClasseDto findByIdClasse(int idClasse);
	
	public void createClasse(ClasseDto classe); 
	
	public void updateClasse(ClasseDto classe);
	
	public List<ClasseDto>findAllClasseEnable();
	
	public void enableClasse(int idClasse);

}
