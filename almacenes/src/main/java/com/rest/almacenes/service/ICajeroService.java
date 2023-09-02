package com.rest.almacenes.service;

import java.util.List;

import com.rest.almacenes.dto.Cajero;

public interface ICajeroService {

	public List<Cajero> listarCajeros();

	public Cajero buscarCajeroPorCodigo(int codigo);

	public Cajero guardarCajero(Cajero cajero);

	public Cajero actualizarCajero(Cajero cajero);

	public void eliminarCajero(int codigo);
}