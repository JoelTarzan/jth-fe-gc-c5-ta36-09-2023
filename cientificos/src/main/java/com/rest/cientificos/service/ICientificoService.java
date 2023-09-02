package com.rest.cientificos.service;

import java.util.List;

import com.rest.cientificos.dto.Cientifico;

public interface ICientificoService {

	public List<Cientifico> listarCientificos();

	public Cientifico buscarCientificoPorDni(String dni);

	public Cientifico guardarCientifico(Cientifico cientifico);

	public Cientifico actualizarCientifico(Cientifico cientifico);

	public void eliminarCientifico(String dni);
}