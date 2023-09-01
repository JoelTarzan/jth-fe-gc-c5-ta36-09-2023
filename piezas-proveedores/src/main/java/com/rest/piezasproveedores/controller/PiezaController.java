package com.rest.piezasproveedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.piezasproveedores.dto.Pieza;
import com.rest.piezasproveedores.service.PiezaServiceImpl;

@RestController
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas() {
		
		return piezaServiceImpl.listarPiezas();
	}
	
	@GetMapping("/piezas/{codigo}")
	public Pieza buscarPiezaPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return piezaServiceImpl.buscarPiezaPorCodigo(codigo);
	}
	
	@PostMapping("/piezas")
	public Pieza guardarPieza(@RequestBody Pieza pieza) {
		
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	@PutMapping("/piezas/{codigo}")
	public Pieza actualizarPieza(@PathVariable(name = "codigo") int codigo, @RequestBody Pieza pieza) {
		
		Pieza piezaSeleccionada = new Pieza();
		Pieza piezaActualizada = new Pieza();
		
		piezaSeleccionada = piezaServiceImpl.buscarPiezaPorCodigo(codigo);
		
		piezaSeleccionada.setNombre(pieza.getNombre());
		
		piezaActualizada = piezaServiceImpl.actualizarPieza(piezaSeleccionada);
		
		return piezaActualizada;
	}
	
	@DeleteMapping("/piezas/{codigo}")
	public void eliminarPieza(@PathVariable(name = "codigo") int codigo) {
		
		piezaServiceImpl.eliminarPieza(codigo);
	}
}