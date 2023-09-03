package com.rest.investigadores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.investigadores.dto.Facultad;
import com.rest.investigadores.service.FacultadServiceImpl;

@RestController
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	@GetMapping("/facultades")
	public List<Facultad> listarFacultades() {
		
		return facultadServiceImpl.listarFacultades();
	}
	
	@GetMapping("/facultades/{codigo}")
	public Facultad buscarFacultadPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return facultadServiceImpl.buscarFacultadPorCodigo(codigo);
	}
	
	@PostMapping("/facultades")
	public Facultad guardarFacultad(@RequestBody Facultad facultad) {
		
		return facultadServiceImpl.guardarFacultad(facultad);
	}
	
	@PutMapping("/facultades/{codigo}")
	public Facultad actualizarFacultad(@PathVariable(name = "codigo") int codigo, @RequestBody Facultad facultad) {
		
		Facultad facultadSeleccionada = new Facultad();
		Facultad facultadActualizada = new Facultad();
		
		facultadSeleccionada = facultadServiceImpl.buscarFacultadPorCodigo(codigo);
		
		facultadSeleccionada.setNombre(facultad.getNombre());
		
		facultadActualizada = facultadServiceImpl.actualizarFacultad(facultadSeleccionada);
		
		return facultadActualizada;
	}
	
	@DeleteMapping("/facultades/{codigo}")
	public void eliminarFacultad(@PathVariable(name = "codigo") int codigo) {
		
		facultadServiceImpl.eliminarFacultad(codigo);
	}
}