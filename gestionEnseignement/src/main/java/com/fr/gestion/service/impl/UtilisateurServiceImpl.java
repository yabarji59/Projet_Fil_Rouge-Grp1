package com.fr.gestion.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.persistence.entities.UtilisateurDo;
import com.fr.gestion.persistence.repository.IUtilisateurDao;
import com.fr.gestion.service.IUtilisateurService;
import com.fr.gestion.web.model.UtilisateurDto;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService {

	@Autowired
	private IUtilisateurDao utilisateurDao;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<UtilisateurDto> findAll() {
		List<UtilisateurDto> listeUser = utilisateurDao.findAll().stream()
				.map(entity -> modelMapper.map(entity, UtilisateurDto.class)).collect(Collectors.toList());
		return listeUser;
	}

	@Override
	public UtilisateurDto findById(Integer id) {
		UtilisateurDto utilisateurDto = modelMapper.map(utilisateurDao.getOne(id), UtilisateurDto.class);
		return utilisateurDto;
	}

	@Override
	public UtilisateurDto findByEmail(String email) {
		Optional<UtilisateurDo> userDo = utilisateurDao.findByEmail(email);

		if (!userDo.isPresent())
			return null;

		UtilisateurDto resultatDoToDto = modelMapper.map(userDo.get(), UtilisateurDto.class);

		return resultatDoToDto;
	}

	@Override
	public UtilisateurDto findByEmailAndPassword(String login, String password) {
		UtilisateurDo user = utilisateurDao.findByEmailAndPassword(login, password);
		if (user == null)
			return null;
		UtilisateurDto resultatDoToDto = modelMapper.map(user, UtilisateurDto.class);

		return resultatDoToDto;
	}

	@Override
	public void deleteById(Integer id) {
		utilisateurDao.deleteById(id);

	}

	@Override
	public UtilisateurDto update(UtilisateurDto utilisateur) {
		UtilisateurDo oldUtilisateurDo = utilisateurDao.findById(utilisateur.getIdUtilisateur()).get();
		if (null != oldUtilisateurDo) {
			UtilisateurDo updatedUser = modelMapper.map(utilisateur, UtilisateurDo.class);
			updatedUser = utilisateurDao.save(updatedUser);
			return modelMapper.map(updatedUser, UtilisateurDto.class);
		}

		return null;
	}

	@Override
	public UtilisateurDto save(UtilisateurDto utilisateurDto) {
		UtilisateurDo utilisateurDoResult = utilisateurDao.save(modelMapper.map(utilisateurDto, UtilisateurDo.class));
		return modelMapper.map(utilisateurDoResult, UtilisateurDto.class);
	}

}
