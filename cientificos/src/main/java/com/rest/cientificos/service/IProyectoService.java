package com.rest.cientificos.service;

import java.util.List;

import com.rest.cientificos.dto.Proyecto;

public interface IProyectoService {

	public List<Proyecto> listarProyectos();

	public Proyecto buscarProyectoPorId(String id);

	public Proyecto guardarProyecto(Proyecto proyecto);

	public Proyecto actualizarProyecto(Proyecto proyecto);

	public void eliminarProyecto(String id);
}