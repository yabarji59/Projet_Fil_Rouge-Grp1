package com.fr.gestion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.persistence.entities.EnseignantDo;
import com.fr.gestion.persistence.repository.IEnseignantDao;
import com.fr.gestion.service.IEnseignantService;
import com.fr.gestion.web.model.EnseignantDto;

@Service

public class EnseignantServiceImp implements IEnseignantService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IEnseignantDao enseignantDao;

	@Override
	public List<EnseignantDto> findAllEnseignant() {
		List<EnseignantDo> enseignantList = this.enseignantDao.findAll();
		List<EnseignantDto> enseignantListDto = new ArrayList<>();
		for (EnseignantDo enseignantDo : enseignantList) {
			enseignantListDto.add(modelMapper.map(enseignantDo, EnseignantDto.class));
		}

		return enseignantListDto;
	}

	@Override
	public EnseignantDto findEnseignantById(final Integer idEnseignant) {
		EnseignantDo enseignantDo = enseignantDao.findById(idEnseignant).get();
		return modelMapper.map(enseignantDo, EnseignantDto.class);

	}

	@Override
	public EnseignantDto createEnseignant(final EnseignantDto enseignantDto) {

		EnseignantDo enseignantDo = new EnseignantDo();
		enseignantDo = modelMapper.map(enseignantDto, EnseignantDo.class);

		final EnseignantDo newEnseignantDo = enseignantDao.save(enseignantDo);
		return modelMapper.map(newEnseignantDo, EnseignantDto.class);

	}

	@Override
	public void updateEnseignant(final Integer idEnseignant, EnseignantDto enseignantDto) {
		EnseignantDo enseignantDo = enseignantDao.findById(idEnseignant).get();
		enseignantDo.setNomEnseignant(enseignantDto.getNomEnseignant());
		enseignantDo.setPrenomEnseignant(enseignantDto.getPrenomEnseignant());
		enseignantDo.setEmailEnseignant(enseignantDto.getEmailEnseignant());
		enseignantDo.setTelephoneEnseignant(enseignantDto.getTelephoneEnseignant());
		enseignantDo.setAgeEnseignant(enseignantDto.getAgeEnseignant());
		enseignantDo.setAdresseEnseignant(enseignantDto.getAdresseEnseignant());
		enseignantDo.setAvailable(enseignantDto.isAvailable());
		enseignantDao.save(enseignantDo);
	}

	@Override
	public void deleteEnseignant(final Integer idEnseignant) {
		this.enseignantDao.deleteById(idEnseignant);

	}

}
