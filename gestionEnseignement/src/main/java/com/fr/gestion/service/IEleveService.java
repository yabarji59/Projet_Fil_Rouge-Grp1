package com.fr.gestion.service;

import java.util.List;

import com.fr.gestion.web.model.EleveDto;


public interface IEleveService {
	
	List<EleveDto> findAllEleve();
	
	EleveDto findEleveById(Integer idEleve);
	
	
	
	EleveDto createEleve(EleveDto eleveDto);
	
	void updateEleve(Integer idEleve, EleveDto eleveDto);
	
	
	void deleteEleve(Integer idEleve);
}
