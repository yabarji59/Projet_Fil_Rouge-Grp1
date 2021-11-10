package com.fr.gestion.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.gestion.persistence.entities.EnseignantDo;

public interface IEnseignantService extends JpaRepository<EnseignantDo, Integer> {

}
