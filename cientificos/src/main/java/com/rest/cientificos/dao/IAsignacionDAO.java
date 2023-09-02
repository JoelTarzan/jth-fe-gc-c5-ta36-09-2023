package com.rest.cientificos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.cientificos.dto.Asignacion;

public interface IAsignacionDAO extends JpaRepository<Asignacion, Integer> {

}