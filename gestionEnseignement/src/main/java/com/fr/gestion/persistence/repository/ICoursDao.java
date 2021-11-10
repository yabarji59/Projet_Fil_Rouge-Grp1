package com.fr.gestion.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.gestion.persistence.entities.CoursDo;

public interface ICoursDao extends JpaRepository<CoursDo, Integer> {

}
