package com.fr.gestion.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fr.gestion.persistence.entities.ClasseDo;

public interface IClasseDao extends JpaRepository<ClasseDo, Integer> {
	@Query("select classe from ClasseDo classe where classe.enable=true")
	public List<ClasseDo> findAllClasseEnable();
	

}