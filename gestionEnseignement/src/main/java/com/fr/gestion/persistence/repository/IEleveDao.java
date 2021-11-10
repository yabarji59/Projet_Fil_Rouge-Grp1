package com.fr.gestion.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.gestion.persistence.entities.EleveDo;

public interface IEleveDao extends JpaRepository<EleveDo, Integer> {

}
