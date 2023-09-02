package com.rest.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.almacenes.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer> {

}