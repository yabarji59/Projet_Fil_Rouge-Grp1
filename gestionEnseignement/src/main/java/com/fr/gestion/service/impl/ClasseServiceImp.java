package com.fr.gestion.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.persistence.entities.ClasseDo;
import com.fr.gestion.persistence.repository.IClasseDao;
import com.fr.gestion.service.IClasseService;
import com.fr.gestion.web.model.ClasseDto;
import com.fr.gestion.web.model.CoursDto;

@Service
public class ClasseServiceImp implements IClasseService {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IClasseDao classeDao;

	@Override
	public List<ClasseDto> findAllClasse() {
		List<ClasseDo> classeList = this.classeDao.findAll();
		return mapToListClasseDto(classeList);
	}

	

	private List<ClasseDto> mapToListClasseDto(final List<ClasseDo> listClasseDo) {
		final List<ClasseDto> listClasseDto = new ArrayList<>();
		for (ClasseDo classeDo : listClasseDo) {
			listClasseDto.add(modelMapper.map(classeDo, ClasseDto.class));
		}

		return listClasseDto;
	}

	@Override
	public void deleteClasse(int idClasse) {
		this.classeDao.deleteById(idClasse);

	}

	@Override
	public ClasseDto findByIdClasse(int idClasse) {
		Optional<ClasseDo> classeDoOptional = this.classeDao.findById(idClasse);
		if (classeDoOptional.isEmpty()) {
			return null;
		}
		return modelMapper.map(classeDoOptional.get(), ClasseDto.class);
	}

	@Override
	public void createClasse(ClasseDto classe) {
		ClasseDo classeDo = new ClasseDo();
		classeDo = modelMapper.map(classe, ClasseDo.class);
		classeDao.save(classeDo);

	}

	
	@Override
	public void updateClasse(ClasseDto classe) {
		ClasseDo classeDo = new ClasseDo();
		classeDo = modelMapper.map(classe, ClasseDo.class);
		classeDao.save(classeDo);

	}

	@Override
	public List<ClasseDto> findAllClasseEnable() {
		List<ClasseDo> classeListDo = this.classeDao.findAllClasseEnable();
		return mapToListClasseDto(classeListDo);

	}

	@Override
	public void enableClasse(int idClasse) {
		Optional<ClasseDo> classeDoOptional = this.classeDao.findById(idClasse);
		if (!classeDoOptional.isEmpty()) {
			ClasseDo classe = classeDoOptional.get();
			classe.setEnable(true);
		}

	}
}
