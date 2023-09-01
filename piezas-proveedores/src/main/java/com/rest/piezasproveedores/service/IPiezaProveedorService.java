package com.rest.piezasproveedores.service;

import java.util.List;

import com.rest.piezasproveedores.dto.PiezaProveedor;

public interface IPiezaProveedorService {

	public List<PiezaProveedor> listarPiezasProveedores();

	public PiezaProveedor buscarPiezaProveedorPorId(int id);

	public PiezaProveedor guardarPiezaProveedor(PiezaProveedor piezaProveedor);

	public PiezaProveedor actualizarPiezaProveedor(PiezaProveedor piezaProveedor);

	public void eliminarPiezaProveedor(int id);
}