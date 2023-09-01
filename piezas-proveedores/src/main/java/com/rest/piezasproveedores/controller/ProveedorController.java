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

import com.rest.piezasproveedores.dto.Proveedor;
import com.rest.piezasproveedores.service.ProveedorServiceImpl;

@RestController
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedores() {
		
		return proveedorServiceImpl.listarProveedores();
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedor buscarProveedorPorId(@PathVariable(name = "id") String id) {
		
		return proveedorServiceImpl.buscarProveedorPorId(id);
	}
	
	@PostMapping("/proveedores")
	public Proveedor guardarProveedor(@RequestBody Proveedor proveedor) {
		
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name = "id") String id, @RequestBody Proveedor proveedor) {
		
		Proveedor proveedorSeleccionado = new Proveedor();
		Proveedor proveedorActualizado = new Proveedor();
		
		proveedorSeleccionado = proveedorServiceImpl.buscarProveedorPorId(id);
		
		proveedorSeleccionado.setNombre(proveedor.getNombre());
		
		proveedorActualizado = proveedorServiceImpl.actualizarProveedor(proveedorSeleccionado);
		
		return proveedorActualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedor(@PathVariable(name = "id") String id) {
		
		proveedorServiceImpl.eliminarProveedor(id);
	}
}