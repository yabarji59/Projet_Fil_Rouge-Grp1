package com.fr.gestion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.persistence.entities.EleveDo;
import com.fr.gestion.persistence.repository.IEleveDao;
import com.fr.gestion.service.IEleveService;
import com.fr.gestion.web.model.EleveDto;
<<<<<<< HEAD
=======

>>>>>>> a927343ce279d98adc7ed5d4984208e6fffb64da
@Service
public class EleveServiceImp implements IEleveService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IEleveDao eleveDao;

	@Override
	public List<EleveDto> findAllEleve() {
		List<EleveDo> eleveList = this.eleveDao.findAll();
		List<EleveDto> eleveListDto = new ArrayList<>();
		for (EleveDo eleveDo : eleveList) {
			eleveListDto.add(modelMapper.map(eleveDo, EleveDto.class));
		}

		return eleveListDto;
	}

	@Override
	public EleveDto findEleveById(Integer idEleve) {
		EleveDo eleveDo = eleveDao.findById(idEleve).get();
		return modelMapper.map(eleveDo, EleveDto.class);

	}

	@Override
	public EleveDto createEleve(EleveDto eleveDto) {
		EleveDo eleveDo = new EleveDo();
		eleveDo = modelMapper.map(eleveDto, EleveDo.class);

		final EleveDo newEleveDo = eleveDao.save(eleveDo);
		return modelMapper.map(newEleveDo, EleveDto.class);

	}

	@Override
	public void updateEleve(Integer idEleve, EleveDto eleveDto) {
		EleveDo eleveDo = eleveDao.findById(idEleve).get();
		eleveDo.setNomEleve(eleveDto.getNomEleve());
		eleveDo.setPrenomEleve(eleveDto.getPrenomEleve());
		eleveDo.setEmailEleve(eleveDto.getEmailEleve());
		eleveDo.setTelephoneEleve(eleveDto.getTelephoneEleve());
		eleveDo.setAgeEleve(eleveDto.getAgeEleve());
		eleveDo.setAdresseEleve(eleveDto.getAdresseEleve());
		eleveDo.setAvailable(eleveDto.isAvailable());
		eleveDao.save(eleveDo);
	}

	@Override
	public void deleteEleve(Integer idEleve) {
		this.eleveDao.deleteById(idEleve);

	}

	@Override
	public List<EleveDto> findAllEleveByAvailable() {
		
		return null;
	}

}
