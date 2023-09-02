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

import com.rest.cientificos.dto.Asignacion;
import com.rest.cientificos.service.AsignacionServiceImpl;

@RestController
public class AsignacionController {

	@Autowired
	AsignacionServiceImpl asignacionServiceImpl;
	
	@GetMapping("/asignaciones")
	public List<Asignacion> listarAsignaciones() {
		
		return asignacionServiceImpl.listarAsignaciones();
	}
	
	@GetMapping("/asignaciones/{id}")
	public Asignacion buscarAsignacionPorId(@PathVariable(name = "id") int id) {
		
		return asignacionServiceImpl.buscarAsignacionPorId(id);
	}
	
	@PostMapping("/asignaciones")
	public Asignacion guardarAsignacion(@RequestBody Asignacion asignacion) {
		
		return asignacionServiceImpl.guardarAsignacion(asignacion);
	}
	
	@PutMapping("/asignaciones/{id}")
	public Asignacion actualizarAsignacion(@PathVariable(name = "id") int id, @RequestBody Asignacion asignacion) {
		
		Asignacion asignacionSeleccionada = new Asignacion();
		Asignacion asignacionActualizada = new Asignacion();
		
		asignacionSeleccionada = asignacionServiceImpl.buscarAsignacionPorId(id);
		
		asignacionSeleccionada.setCientifico(asignacion.getCientifico());
		asignacionSeleccionada.setProyecto(asignacion.getProyecto());
		
		asignacionActualizada = asignacionServiceImpl.actualizarAsignacion(asignacionSeleccionada);
		
		return asignacionActualizada;
	}
	
	@DeleteMapping("/asignaciones/{id}")
	public void eliminarAsignacion(@PathVariable(name = "id") int id) {
		
		asignacionServiceImpl.eliminarAsignacion(id);
	}
}