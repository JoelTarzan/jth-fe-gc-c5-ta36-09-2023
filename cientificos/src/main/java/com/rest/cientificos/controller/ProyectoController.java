package com.rest.cientificos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.cientificos.dto.Proyecto;
import com.rest.cientificos.service.ProyectoServiceImpl;

@RestController
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos() {
		
		return proyectoServiceImpl.listarProyectos();
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyecto buscarProyectoPorId(@PathVariable(name = "id") String id) {
		
		return proyectoServiceImpl.buscarProyectoPorId(id);
	}
	
	@PostMapping("/proyectos")
	public Proyecto guardarProyecto(@RequestBody Proyecto proyecto) {
		
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name = "id") String id, @RequestBody Proyecto proyecto) {
		
		Proyecto proyectoSeleccionado = new Proyecto();
		Proyecto proyectoActualizado = new Proyecto();
		
		proyectoSeleccionado = proyectoServiceImpl.buscarProyectoPorId(id);
		
		proyectoSeleccionado.setNombre(proyecto.getNombre());
		proyectoSeleccionado.setHoras(proyecto.getHoras());
		
		proyectoActualizado = proyectoServiceImpl.actualizarProyecto(proyectoSeleccionado);
		
		return proyectoActualizado;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name = "id") String id) {
		
		proyectoServiceImpl.eliminarProyecto(id);
	}
}