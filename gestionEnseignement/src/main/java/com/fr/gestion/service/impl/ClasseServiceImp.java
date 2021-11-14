package com.fr.gestion.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fr.gestion.service.IClasseService;
import com.fr.gestion.web.model.ClasseDto;

@Service
public class ClasseServiceImp implements IClasseService {

    @Override
    public List<ClasseDto> findAllClasseOneUser(final Integer idUtilisateur) {
        // TODO Auto-generated method stub
        return null;
    }

}
