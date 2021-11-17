package com.fr.gestion.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fr.gestion.persistence.entities.EleveDo;


public interface IEleveDao extends JpaRepository<EleveDo, Integer> {
	@Query("select eleve from EleveDo eleve where eleve.available=true")
	public List<EleveDo> findAllEleveByAvailable();
}
