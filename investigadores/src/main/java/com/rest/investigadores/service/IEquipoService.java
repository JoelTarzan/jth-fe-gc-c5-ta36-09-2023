package com.rest.investigadores.service;

import java.util.List;

import com.rest.investigadores.dto.Equipo;

public interface IEquipoService {

	public List<Equipo> listarEquipos();

	public Equipo buscarEquipoPorNumSerie(String numSerie);

	public Equipo guardarEquipo(Equipo equipo);

	public Equipo actualizarEquipo(Equipo equipo);

	public void eliminarEquipo(String numSerie);
}