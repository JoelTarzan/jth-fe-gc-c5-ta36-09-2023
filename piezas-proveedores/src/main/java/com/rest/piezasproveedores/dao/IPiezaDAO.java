package com.rest.piezasproveedores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.piezasproveedores.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Integer>{

}