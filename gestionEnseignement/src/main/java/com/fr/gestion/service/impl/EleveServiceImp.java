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
	public EleveDto findEleveById(final Integer idEleve) {
		EleveDo eleveDo = eleveDao.findById(idEleve).get();
		return modelMapper.map(eleveDo, EleveDto.class);

	}

	@Override
	public EleveDto createEleve(final EleveDto eleveDto) {

		EleveDo eleveDo = new EleveDo();
		eleveDo = modelMapper.map(eleveDto, EleveDo.class);

		final EleveDo newEleveDo = eleveDao.save(eleveDo);
		return modelMapper.map(newEleveDo, EleveDto.class);

	}

	@Override
	public void updateEleve(final Integer idEleve, EleveDto eleveDto) {
		EleveDo eleveDo = eleveDao.findById(idEleve).get();
		eleveDo.setNomEleve(eleveDto.getNomEleve());
		eleveDo.setPrenomEleve(eleveDto.getPrenomEleve());
		eleveDo.setEmailEleve(eleveDto.getEmailEleve());
		eleveDo.setTelephoneEleve(eleveDto.getTelephoneEleve());
		eleveDo.setAgeEleve(eleveDto.getAgeEleve());
		eleveDo.setAdresseEleve(eleveDto.getAdresseEleve());
		eleveDo.setAvailable(eleveDto.isAvailable());
		eleveDo.save(eleveDo);
	}

	@Override
	public void deleteEleve(final Integer idEleve) {
		this.eleveDao.deleteById(idEleve);

    }

}

