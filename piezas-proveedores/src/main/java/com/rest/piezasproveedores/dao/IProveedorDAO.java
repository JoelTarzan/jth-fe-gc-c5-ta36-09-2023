package com.rest.piezasproveedores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.piezasproveedores.dto.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, String>{

}