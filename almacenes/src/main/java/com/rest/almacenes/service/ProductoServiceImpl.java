package com.rest.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.almacenes.dao.IProductoDAO;
import com.rest.almacenes.dto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoDAO iProductoDAO;

	@Override
	public List<Producto> listarProductos() {

		return iProductoDAO.findAll();
	}

	@Override
	public Producto buscarProductoPorCodigo(int codigo) {

		return iProductoDAO.findById(codigo).get();
	}

	@Override
	public Producto guardarProducto(Producto producto) {

		return iProductoDAO.save(producto);
	}

	@Override
	public Producto actualizarProducto(Producto producto) {

		return iProductoDAO.save(producto);
	}

	@Override
	public void eliminarProducto(int codigo) {

		iProductoDAO.deleteById(codigo);
	}
}