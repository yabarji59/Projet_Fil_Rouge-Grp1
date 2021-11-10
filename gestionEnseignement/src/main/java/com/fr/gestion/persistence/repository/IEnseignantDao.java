package com.fr.gestion.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.gestion.persistence.entities.EnseignantDo;

public interface IEnseignantDao extends JpaRepository<EnseignantDo, Integer> {

}
