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

import com.rest.investigadores.dto.Equipo;
import com.rest.investigadores.service.EquipoServiceImpl;

@RestController
public class EquipoController {

	@Autowired
	EquipoServiceImpl equipoServiceImpl;

	@GetMapping("/equipos")
	public List<Equipo> listarEquipos() {
		
		return equipoServiceImpl.listarEquipos();
	}
	
	@GetMapping("/equipos/{numSerie}")
	public Equipo buscarEquipoPorNumSerie(@PathVariable(name = "numSerie") String numSerie) {
		
		return equipoServiceImpl.buscarEquipoPorNumSerie(numSerie);
	}
	
	@PostMapping("/equipos")
	public Equipo guardarEquipo(@RequestBody Equipo equipo) {
		
		return equipoServiceImpl.guardarEquipo(equipo);
	}
	
	@PutMapping("/equipos/{numSerie}")
	public Equipo actualizarEquipo(@PathVariable(name = "numSerie") String numSerie, @RequestBody Equipo equipo) {
		
		Equipo equipoSeleccionado = new Equipo();
		Equipo equipoActualizado = new Equipo();
		
		equipoSeleccionado = equipoServiceImpl.buscarEquipoPorNumSerie(numSerie);
		
		equipoSeleccionado.setNombre(equipo.getNombre());
		equipoSeleccionado.setFacultad(equipo.getFacultad());
		
		equipoActualizado = equipoServiceImpl.actualizarEquipo(equipoSeleccionado);
		
		return equipoActualizado;
	}
	
	@DeleteMapping("/equipos/{numSerie}")
	public void eliminarEquipo(@PathVariable(name = "numSerie") String numSerie) {
		
		equipoServiceImpl.eliminarEquipo(numSerie);
	}
}