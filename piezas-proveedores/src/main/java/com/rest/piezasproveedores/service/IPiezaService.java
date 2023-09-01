package com.rest.piezasproveedores.service;

import java.util.List;

import com.rest.piezasproveedores.dto.Pieza;

public interface IPiezaService {

	public List<Pieza> listarPiezas();
	
	public Pieza buscarPiezaPorCodigo(int codigo);
	
	public Pieza guardarPieza(Pieza pieza);
	
	public Pieza actualizarPieza(Pieza pieza);
	
	public void eliminarPieza(int codigo);
}