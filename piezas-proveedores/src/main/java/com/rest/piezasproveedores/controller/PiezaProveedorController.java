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

import com.rest.piezasproveedores.dto.PiezaProveedor;
import com.rest.piezasproveedores.dto.Proveedor;
import com.rest.piezasproveedores.service.PiezaProveedorServiceImpl;

@RestController
public class PiezaProveedorController {

	@Autowired
	PiezaProveedorServiceImpl piezaProveedorServiceImpl;
	
	@GetMapping("/piezasproveedores")
	public List<PiezaProveedor> listarPiezasProveedores() {
		
		return piezaProveedorServiceImpl.listarPiezasProveedores();
	}
	
	@GetMapping("/piezasproveedores/{id}")
	public PiezaProveedor buscarPiezaProveedorPorId(@PathVariable(name = "id") int id) {
		
		return piezaProveedorServiceImpl.buscarPiezaProveedorPorId(id);
	}
	
	@PostMapping("/piezasproveedores")
	public PiezaProveedor guardarPiezaProveedor(@RequestBody PiezaProveedor piezaProveedor) {
		
		return piezaProveedorServiceImpl.guardarPiezaProveedor(piezaProveedor);
	}
	
	@PutMapping("/piezasproveedores/{id}")
	public PiezaProveedor actualizarPiezaProveedor(@PathVariable(name = "id") int id, @RequestBody PiezaProveedor piezaProveedor) {
		
		PiezaProveedor piezaProveedorSeleccionado = new PiezaProveedor();
		PiezaProveedor piezaProveedorActualizado = new PiezaProveedor();
		
		piezaProveedorSeleccionado = piezaProveedorServiceImpl.buscarPiezaProveedorPorId(id);
		
		piezaProveedorSeleccionado.setPieza(piezaProveedor.getPieza());
		piezaProveedorSeleccionado.setProveedor(piezaProveedor.getProveedor());
		piezaProveedorSeleccionado.setPrecio(piezaProveedor.getPrecio());
		
		piezaProveedorActualizado = piezaProveedorServiceImpl.actualizarPiezaProveedor(piezaProveedorSeleccionado);
		
		return piezaProveedorActualizado;
	}
	
	@DeleteMapping("/piezasproveedores/{id}")
	public void eliminarPiezaProveedor(@PathVariable(name = "id") int id) {
		
		piezaProveedorServiceImpl.eliminarPiezaProveedor(id);
	}
}