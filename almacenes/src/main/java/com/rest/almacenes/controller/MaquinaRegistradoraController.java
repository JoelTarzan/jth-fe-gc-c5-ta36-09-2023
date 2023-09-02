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

import com.rest.almacenes.dto.MaquinaRegistradora;
import com.rest.almacenes.service.MaquinaRegistradoraServiceImpl;

@RestController
public class MaquinaRegistradoraController {

	@Autowired
	MaquinaRegistradoraServiceImpl maquinaRegistradoraServiceImpl;
	
	@GetMapping("/maquinasregistradoras")
	public List<MaquinaRegistradora> listarMaquinasRegistradoras() {
		
		return maquinaRegistradoraServiceImpl.listarMaquinasRegistradoras();
	}
	
	@GetMapping("/maquinasregistradoras/{codigo}")
	public MaquinaRegistradora buscarMaquinaRegistradoraPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return maquinaRegistradoraServiceImpl.buscarMaquinaRegistradoraPorCodigo(codigo);
	}
	
	@PostMapping("/maquinasregistradoras")
	public MaquinaRegistradora guardarMaquinaRegistradora(@RequestBody MaquinaRegistradora maquinaRegistradora) {
		
		return maquinaRegistradoraServiceImpl.guardarMaquinaRegistradora(maquinaRegistradora);
	}
	
	@PutMapping("/maquinasregistradoras/{codigo}")
	public MaquinaRegistradora actualizarMaquinaRegistradora(@PathVariable(name = "codigo") int codigo, @RequestBody MaquinaRegistradora maquinaRegistradora) {
		
		MaquinaRegistradora maquinaRegistradoraSeleccionada = new MaquinaRegistradora();
		MaquinaRegistradora maquinaRegistradoraActualizada = new MaquinaRegistradora();
		
		maquinaRegistradoraSeleccionada = maquinaRegistradoraServiceImpl.buscarMaquinaRegistradoraPorCodigo(codigo);
		
		maquinaRegistradoraSeleccionada.setPiso(maquinaRegistradora.getPiso());
		
		maquinaRegistradoraActualizada = maquinaRegistradoraServiceImpl.actualizarMaquinaRegistradora(maquinaRegistradoraSeleccionada);
		
		return maquinaRegistradoraActualizada;
	}
	
	@DeleteMapping("/maquinasregistradoras/{codigo}")
	public void eliminarMaquinaRegistradora(@PathVariable(name = "codigo") int codigo) {
		
		maquinaRegistradoraServiceImpl.eliminarMaquinaRegistradora(codigo);
	}
}