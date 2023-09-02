package com.rest.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.almacenes.dto.Cajero;

public interface ICajeroDAO extends JpaRepository<Cajero, Integer> {

}