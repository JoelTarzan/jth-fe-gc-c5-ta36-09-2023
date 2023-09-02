package com.rest.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.almacenes.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}