package com.rest.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.investigadores.dto.Facultad;

public interface IFacultadDAO extends JpaRepository<Facultad, Integer> {

}