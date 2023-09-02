package com.rest.cientificos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.cientificos.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, String> {

}