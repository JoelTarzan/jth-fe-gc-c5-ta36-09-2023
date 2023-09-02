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

import com.rest.almacenes.dto.Venta;
import com.rest.almacenes.service.VentaServiceImpl;

@RestController
public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/ventas")
	public List<Venta> listarVentas() {
		
		return ventaServiceImpl.listarVentas();
	}
	
	@GetMapping("/ventas/{codigo}")
	public Venta buscarVentaPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return ventaServiceImpl.buscarVentaPorCodigo(codigo);
	}
	
	@PostMapping("/ventas")
	public Venta guardarVenta(@RequestBody Venta venta) {
		
		return ventaServiceImpl.guardarVenta(venta);
	}
	
	@PutMapping("/ventas/{codigo}")
	public Venta actualizarVenta(@PathVariable(name = "codigo") int codigo, @RequestBody Venta venta) {
		
		Venta ventaSeleccionada = new Venta();
		Venta ventaActualizada = new Venta();
		
		ventaSeleccionada = ventaServiceImpl.buscarVentaPorCodigo(codigo);
		
		ventaSeleccionada.setCajero(venta.getCajero());
		ventaSeleccionada.setMaquinaRegistradora(venta.getMaquinaRegistradora());
		ventaSeleccionada.setProducto(venta.getProducto());
		
		ventaActualizada = ventaServiceImpl.actualizarVenta(ventaSeleccionada);
		
		return ventaActualizada;
	}
	
	@DeleteMapping("/ventas/{codigo}")
	public void eliminarVenta(@PathVariable(name = "codigo") int codigo) {
		
		ventaServiceImpl.eliminarVenta(codigo);
	}
}