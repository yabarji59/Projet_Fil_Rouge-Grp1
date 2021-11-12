package com.fr.gestion.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.persistence.entities.CoursDo;
import com.fr.gestion.persistence.repository.ICoursDao;
import com.fr.gestion.service.ICoursService;
import com.fr.gestion.web.model.CoursDto;

@Service
public class CoursServiceImp implements ICoursService {

	@Autowired
	private ICoursDao coursDao;

	@Override
	public List<CoursDto> findAllCours() {
		List<CoursDo> coursList = this.coursDao.findAll();
		return mapToListCoursDto(coursList);
	}

	private CoursDto mapToCoursDto(CoursDo coursDo) {
		CoursDto coursDto = new CoursDto();
		if (coursDo == null) {
			return null;
		}

		coursDto.setIdCours(coursDo.getIdCours());
		coursDto.setLibelle(coursDo.getLibelle());
		return coursDto;
	}

	private List<CoursDto> mapToListCoursDto(final List<CoursDo> listCoursDo) {
		final List<CoursDto> listCoursDto = new ArrayList<>();
		for (CoursDo coursDo : listCoursDo) {
			listCoursDto.add(mapToCoursDto(coursDo));
		}

		return listCoursDto;
	}

	@Override
	public void deleteCours(int idCours) {
		this.coursDao.deleteById(idCours);
	}

	@Override
	public CoursDto findByIdCours(int idCours) {
		Optional<CoursDo> coursDoOptional = this.coursDao.findById(idCours);
		if (coursDoOptional.isEmpty()) {
			return null;
		}
		return mapToCoursDto(coursDoOptional.get());
	}

	@Override
	public void createCours(CoursDto cours) {
		CoursDo coursDo = new CoursDo();
		coursDo = mapToCoursDo(cours);
		coursDao.save(coursDo);

	}

	private CoursDo mapToCoursDo(CoursDto coursDto) {
		CoursDo coursDo = new CoursDo();
		if (coursDto == null) {
			return null;
		}
		coursDo.setIdCours(coursDto.getIdCours());
		coursDo.setLibelle(coursDto.getLibelle());
		return coursDo;
	}

	@Override
	public void updateCours(CoursDto cours) {
		CoursDo coursDo = new CoursDo();
		coursDo = mapToCoursDo(cours);
		coursDao.save(coursDo);

	}

}
