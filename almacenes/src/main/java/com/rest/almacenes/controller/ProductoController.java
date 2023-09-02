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

import com.rest.almacenes.dto.Producto;
import com.rest.almacenes.service.ProductoServiceImpl;

@RestController
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/productos")
	public List<Producto> listarProductos() {
		
		return productoServiceImpl.listarProductos();
	}
	
	@GetMapping("/productos/{codigo}")
	public Producto buscarProductoPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return productoServiceImpl.buscarProductoPorCodigo(codigo);
	}
	
	@PostMapping("/productos")
	public Producto guardarProducto(@RequestBody Producto producto) {
		
		return productoServiceImpl.guardarProducto(producto);
	}
	
	@PutMapping("/productos/{codigo}")
	public Producto actualizarProducto(@PathVariable(name = "codigo") int codigo, @RequestBody Producto producto) {
		
		Producto productoSeleccionado = new Producto();
		Producto productoActualizado = new Producto();
		
		productoSeleccionado = productoServiceImpl.buscarProductoPorCodigo(codigo);
		
		productoSeleccionado.setNombre(producto.getNombre());
		productoSeleccionado.setPrecio(producto.getPrecio());
		
		productoActualizado = productoServiceImpl.actualizarProducto(productoSeleccionado);
		
		return productoActualizado;
	}
	
	@DeleteMapping("/productos/{codigo}")
	public void eliminarProducto(@PathVariable(name = "codigo") int codigo) {
		
		productoServiceImpl.eliminarProducto(codigo);
	}
}