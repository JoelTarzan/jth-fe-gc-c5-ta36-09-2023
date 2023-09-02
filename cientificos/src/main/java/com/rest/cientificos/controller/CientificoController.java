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

import com.rest.cientificos.dto.Cientifico;
import com.rest.cientificos.service.CientificoServiceImpl;

@RestController
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos() {
		
		return cientificoServiceImpl.listarCientificos();
	}
	
	@GetMapping("/cientificos/{dni}")
	public Cientifico buscarCientificoPorDni(@PathVariable(name = "dni") String dni) {
		
		return cientificoServiceImpl.buscarCientificoPorDni(dni);
	}
	
	@PostMapping("/cientificos")
	public Cientifico guardarCientifico(@RequestBody Cientifico cientifico) {
		
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientifico actualizarCientifico(@PathVariable(name = "dni") String dni, @RequestBody Cientifico cientifico) {
		
		Cientifico cientificoSeleccionado = new Cientifico();
		Cientifico cientificoActualizado = new Cientifico();
		
		cientificoSeleccionado = cientificoServiceImpl.buscarCientificoPorDni(dni);
		
		cientificoSeleccionado.setNomApels(cientifico.getNomApels());
		
		cientificoActualizado = cientificoServiceImpl.actualizarCientifico(cientificoSeleccionado);
		
		return cientificoActualizado;
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eliminarCientifico(@PathVariable(name = "dni") String dni) {
		
		cientificoServiceImpl.eliminarCientifico(dni);
	}
}