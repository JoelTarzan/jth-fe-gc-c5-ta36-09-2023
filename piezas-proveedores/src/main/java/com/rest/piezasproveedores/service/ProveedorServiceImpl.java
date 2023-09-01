package com.rest.piezasproveedores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.piezasproveedores.dao.IProveedorDAO;
import com.rest.piezasproveedores.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedorDAO iProveedorDAO;

	@Override
	public List<Proveedor> listarProveedores() {
		
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor buscarProveedorPorId(String id) {
		
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {
		
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(String id) {
		
		iProveedorDAO.deleteById(id);
	}
}