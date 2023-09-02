package com.rest.almacenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.almacenes.dto.Cajero;
import com.rest.almacenes.service.CajeroServiceImpl;

@RestController
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros() {
		
		return cajeroServiceImpl.listarCajeros();
	}
	
	@GetMapping("/cajeros/{codigo}")
	public Cajero buscarCajeroPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return cajeroServiceImpl.buscarCajeroPorCodigo(codigo);
	}
	
	@PostMapping("/cajeros")
	public Cajero guardarCajero(@RequestBody Cajero cajero) {
		
		return cajeroServiceImpl.guardarCajero(cajero);
	}
	
	@PutMapping("/cajeros/{codigo}")
	public Cajero actualizarCajero(@PathVariable(name = "codigo") int codigo, @RequestBody Cajero cajero) {
		
		Cajero cajeroSeleccionado = new Cajero();
		Cajero cajeroActualizado = new Cajero();
		
		cajeroSeleccionado = cajeroServiceImpl.buscarCajeroPorCodigo(codigo);
		
		cajeroSeleccionado.setNomApels(cajero.getNomApels());
		
		cajeroActualizado = cajeroServiceImpl.actualizarCajero(cajeroSeleccionado);
		
		return cajeroActualizado;
	}
	
	@DeleteMapping("/cajeros/{codigo}")
	public void eliminarCajero(@PathVariable(name = "codigo") int codigo) {
		
		cajeroServiceImpl.eliminarCajero(codigo);
	}
}