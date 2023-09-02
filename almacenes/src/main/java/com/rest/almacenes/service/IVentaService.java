package com.rest.almacenes.service;

import java.util.List;

import com.rest.almacenes.dto.Venta;

public interface IVentaService {

	public List<Venta> listarVentas();

	public Venta buscarVentaPorCodigo(int codigo);

	public Venta guardarVenta(Venta venta);

	public Venta actualizarVenta(Venta venta);

	public void eliminarVenta(int codigo);
}