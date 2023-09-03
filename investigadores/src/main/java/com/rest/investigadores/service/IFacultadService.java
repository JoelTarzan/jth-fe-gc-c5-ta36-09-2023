package com.rest.investigadores.service;

import java.util.List;

import com.rest.investigadores.dto.Facultad;

public interface IFacultadService {

	public List<Facultad> listarFacultades();

	public Facultad buscarFacultadPorCodigo(int codigo);

	public Facultad guardarFacultad(Facultad facultad);

	public Facultad actualizarFacultad(Facultad facultad);

	public void eliminarFacultad(int codigo);
}