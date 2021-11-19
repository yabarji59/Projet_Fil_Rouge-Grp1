package com.fr.gestion.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fr.gestion.persistence.entities.EnseignantDo;

public interface IEnseignantDao extends JpaRepository<EnseignantDo, Integer> {
	@Query("select enseignant from EnseignantDo enseignant where enseignant.available=true")
	public List<EnseignantDo> findAllEnseignantByAvailable();
}
