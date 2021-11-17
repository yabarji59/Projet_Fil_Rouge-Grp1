package com.fr.gestion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.persistence.entities.CoursDo;
import com.fr.gestion.persistence.repository.ICoursDao;
import com.fr.gestion.service.ICoursService;
import com.fr.gestion.web.model.CoursDto;

@Service
public class CoursServiceImp implements ICoursService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ICoursDao coursDao;

	@Override
	public List<CoursDto> findAllCours() {
		List<CoursDo> coursList = this.coursDao.findAll();
		return mapToListCoursDto(coursList);
	}

	private List<CoursDto> mapToListCoursDto(final List<CoursDo> listCoursDo) {
		final List<CoursDto> listCoursDto = new ArrayList<>();
		for (CoursDo coursDo : listCoursDo) {
			listCoursDto.add(modelMapper.map(coursDo, CoursDto.class));
		}

		return listCoursDto;
	}

	@Override
	public void deleteCours(int idCours) {
		this.coursDao.deleteById(idCours);
	}

	@Override
	public CoursDto findByIdCours(int idCours) {
		CoursDo coursDoOptional = coursDao.findById(idCours).get();

		if (null == coursDoOptional) {
			return null;
		}
		return modelMapper.map(coursDoOptional, CoursDto.class);
	}

	@Override
	public void createCours(CoursDto cours) {
		CoursDo coursDo = new CoursDo();
		coursDo = modelMapper.map(cours, CoursDo.class);
		coursDao.save(coursDo);

	}

	@Override
	public void updateCours(CoursDto cours) {
		CoursDo coursDo = new CoursDo();
		coursDo = modelMapper.map(cours, CoursDo.class);

		if (null != findByIdCours(cours.getIdCours())) {
			coursDao.save(coursDo);
		} else {
			createCours(cours);
		}

	}

}
