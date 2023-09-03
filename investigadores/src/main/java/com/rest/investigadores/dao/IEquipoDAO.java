package com.rest.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.investigadores.dto.Equipo;

public interface IEquipoDAO extends JpaRepository<Equipo, String> {

}