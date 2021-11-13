package com.fr.gestion.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.persistence.entities.ClasseDo;
import com.fr.gestion.persistence.repository.IClasseDao;
import com.fr.gestion.service.IClasseService;
import com.fr.gestion.web.model.ClasseDto;

@Service
public class ClasseServiceImp implements IClasseService {

	@Autowired
	private IClasseDao classeDao;

	@Override
	public List<ClasseDto> findAllClasse() {
		List<ClasseDo> classeList = this.classeDao.findAll();
		return mapToListClasseDto(classeList);
	}

	private ClasseDto mapToClasseDto(ClasseDo classeDo) {
		ClasseDto classeDto = new ClasseDto();
		if (classeDo == null) {
			return null;
		}

		classeDto.setIdClasse(classeDo.getIdClasse());
		classeDto.setCapaciteMax(classeDo.getCapaciteMax());
		classeDto.setCapaciteMin(classeDo.getCapaciteMin());
		classeDto.setEnable(classeDo.isEnable());
		classeDto.setNiveau(classeDo.getNiveau());
		classeDto.setEnseignantDo(classeDo.getEnseignantDo());
		classeDto.setUtilisateur(classeDo.getUtilisateur());
		classeDto.setListeDesEleves(classeDo.getListeDesEleves());
		classeDto.setListeCours(classeDo.getListeCours());
		return classeDto;
	}

	private List<ClasseDto> mapToListClasseDto(final List<ClasseDo> listClasseDo) {
		final List<ClasseDto> listClasseDto = new ArrayList<>();
		for (ClasseDo classeDo : listClasseDo) {
			listClasseDto.add(mapToClasseDto(classeDo));
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
		return mapToClasseDto(classeDoOptional.get());
	}

	@Override
	public void createClasse(ClasseDto classe) {
		ClasseDo classeDo = new ClasseDo();
		classeDo = mapToClasseDo(classe);
		classeDao.save(classeDo);

	}

	private ClasseDo mapToClasseDo(ClasseDto classeDto) {
		ClasseDo classeDo = new ClasseDo();
		if (classeDto == null) {
			return null;
		}
		classeDto.setIdClasse(classeDo.getIdClasse());
		classeDto.setCapaciteMax(classeDo.getCapaciteMax());
		classeDto.setCapaciteMin(classeDo.getCapaciteMin());
		classeDto.setEnable(classeDo.isEnable());
		classeDto.setNiveau(classeDo.getNiveau());
		classeDto.setEnseignantDo(classeDo.getEnseignantDo());
		classeDto.setUtilisateur(classeDo.getUtilisateur());
		classeDto.setListeDesEleves(classeDo.getListeDesEleves());
		classeDto.setListeCours(classeDo.getListeCours());

		return classeDo;
	}

	@Override
	public void updateClasse(ClasseDto classe) {
		ClasseDo classeDo = new ClasseDo();
		classeDo = mapToClasseDo(classe);
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
