package com.fr.gestion.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.gestion.persistence.entities.ClasseDo;

public interface IClasseDao extends JpaRepository<ClasseDo, Integer> {

}
