package com.rest.piezasproveedores.service;

import java.util.List;

import com.rest.piezasproveedores.dto.Proveedor;

public interface IProveedorService {

	public List<Proveedor> listarProveedores();

	public Proveedor buscarProveedorPorId(String id);

	public Proveedor guardarProveedor(Proveedor proveedor);

	public Proveedor actualizarProveedor(Proveedor proveedor);

	public void eliminarProveedor(String id);
}