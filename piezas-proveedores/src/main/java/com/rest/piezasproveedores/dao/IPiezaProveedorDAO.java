package com.rest.piezasproveedores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.piezasproveedores.dto.PiezaProveedor;

public interface IPiezaProveedorDAO extends JpaRepository<PiezaProveedor, Integer>{

}