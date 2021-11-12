package com.fr.gestion.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.persistence.entities.EnseignantDo;
import com.fr.gestion.persistence.repository.IEnseignantDao;
import com.fr.gestion.service.IEnseignantService;
import com.fr.gestion.web.model.EnseignantDto;
@Service

public class EnseignantServiceImp implements IEnseignantService {
	
	
	 @Autowired
	    private IEnseignantDao enseignantDao; 
// map un enseignant do -> enseignantDto
    
    public EnseignantDto mapToEnseignantDto(EnseignantDo enseignantDo) {
    	EnseignantDto enseignantDto = new EnseignantDto();
       if (enseignantDo == null) {
           return null;
       }
       enseignantDto.setIdEnseignant(enseignantDo.getIdEnseignant());
       enseignantDto.setNomEnseignant(enseignantDo.getNomEnseignant());
       enseignantDto.setPrenomEnseignant(enseignantDo.getPrenomEnseignant());
       enseignantDto.setEmailEnseignant(enseignantDo.getEmailEnseignant());
       enseignantDto.setTelephoneEnseignant(enseignantDo.getTelephoneEnseignant());
       enseignantDto.setAgeEnseignant(enseignantDo.getAgeEnseignant());
       enseignantDto.setAdresseEnseignant(enseignantDo.getAdresseEnseignant());
       enseignantDto.setAvailable(enseignantDo.isAvailable());
       return enseignantDto;
   }

    //map un enseignant Dto -> enseignant
    
    public EnseignantDo mapToEnseignantDo(final EnseignantDto enseignantDto) {
        final EnseignantDo enseignantDo= new EnseignantDo();
        if (enseignantDto == null) {
            return null;
        }
        enseignantDo.setIdEnseignant(enseignantDto.getIdEnseignant());
        enseignantDo.setNomEnseignant(enseignantDto.getNomEnseignant());
        enseignantDo.setPrenomEnseignant(enseignantDto.getPrenomEnseignant());
        enseignantDo.setEmailEnseignant(enseignantDto.getEmailEnseignant());
        enseignantDo.setAgeEnseignant(enseignantDto.getAgeEnseignant());
        enseignantDo.setTelephoneEnseignant(enseignantDto.getTelephoneEnseignant());
        enseignantDo.setAdresseEnseignant(enseignantDto.getAdresseEnseignant());
        enseignantDo.setAvailable(enseignantDto.isAvailable());
        return enseignantDo;
    }
    
    //map une liste d'objets Do -> liste d'objets Dto
    public List<EnseignantDto> mapToListEnseignantsDto(final List<EnseignantDo> listEnseignantsDo) {
      System.out.println(listEnseignantsDo);
      List<EnseignantDto> listEnseignantsDto = new ArrayList<>();
      for (EnseignantDo enseignantDo : listEnseignantsDo) {
          listEnseignantsDto.add(mapToEnseignantDto(enseignantDo));
    
      }
      return listEnseignantsDto;
  }

    
    
   
	@Override
	public List<EnseignantDto> findAllEnseignant() {
		List<EnseignantDo> enseignantList = this.enseignantDao.findAll();
		return mapToListEnseignantsDto(enseignantList);
	}
	
	
	@Override
	public EnseignantDto findEnseignantById(Integer idEnseignant) {
	 			  Optional<EnseignantDo> opEnseignantDo =this.enseignantDao.findById(idEnseignant);
	               return opEnseignantDo.map(opEnseignantDto -> new EnseignantDto(
	                   opEnseignantDto.getIdEnseignant(),opEnseignantDto.getNomEnseignant(),opEnseignantDto.getPrenomEnseignant(),
	                   opEnseignantDto.getEmailEnseignant(), opEnseignantDto.getTelephoneEnseignant(), opEnseignantDto.getAgeEnseignant(), 
	                   opEnseignantDto.getAdresseEnseignant(), opEnseignantDto.getAvailable());
	 			
	 		}

	

	@Override
	public String createEnseignant(final EnseignantDto enseignantDto) {
		return null;
		//EnseignantDo enseignantDo = new EnseignantDo();
	    	//enseignantDo =mapToEnseignantDo(enseignantDto);

	        //final EnseignantDo newEnseignantDo =  enseignantDao.save(enseignantDo);
	        //return newEnseignantDo.getId();
		
	}

	@Override
	public void updateEnseignant(Integer idEnseignant, EnseignantDto enseignantDto) {
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
	public void deleteEnseignant(Integer idEnseignant) {
		 this.enseignantDao.deleteById(idEnseignant);
		
	}
	
	
	
	
	
 		
 }
