package com.rest.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.almacenes.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraDAO extends JpaRepository<MaquinaRegistradora, Integer> {

}