package com.rest.almacenes.service;

import java.util.List;

import com.rest.almacenes.dto.Producto;

public interface IProductoService {

	public List<Producto> listarProductos();

	public Producto buscarProductoPorCodigo(int codigo);

	public Producto guardarProducto(Producto producto);

	public Producto actualizarProducto(Producto producto);

	public void eliminarProducto(int codigo);
}