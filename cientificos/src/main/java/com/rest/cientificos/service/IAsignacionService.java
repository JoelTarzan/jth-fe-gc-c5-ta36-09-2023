package com.rest.cientificos.service;

import java.util.List;

import com.rest.cientificos.dto.Asignacion;

public interface IAsignacionService {

	public List<Asignacion> listarAsignaciones();

	public Asignacion buscarAsignacionPorId(int id);

	public Asignacion guardarAsignacion(Asignacion asignacion);

	public Asignacion actualizarAsignacion(Asignacion asignacion);

	public void eliminarAsignacion(int id);
}