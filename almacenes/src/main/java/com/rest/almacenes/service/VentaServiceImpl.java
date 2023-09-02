package com.rest.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.almacenes.dao.IVentaDAO;
import com.rest.almacenes.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarVentas() {
		
		return iVentaDAO.findAll();
	}

	@Override
	public Venta buscarVentaPorCodigo(int codigo) {
		
		return iVentaDAO.findById(codigo).get();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int codigo) {
		
		iVentaDAO.deleteById(codigo);
	}
}