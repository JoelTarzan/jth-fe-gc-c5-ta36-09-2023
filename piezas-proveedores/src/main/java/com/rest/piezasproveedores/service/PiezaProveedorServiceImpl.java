package com.rest.piezasproveedores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.piezasproveedores.dao.IPiezaProveedorDAO;
import com.rest.piezasproveedores.dto.PiezaProveedor;

@Service
public class PiezaProveedorServiceImpl implements IPiezaProveedorService {

	@Autowired
	IPiezaProveedorDAO iPiezaProveedorDAO;

	@Override
	public List<PiezaProveedor> listarPiezasProveedores() {
		
		return iPiezaProveedorDAO.findAll();
	}

	@Override
	public PiezaProveedor buscarPiezaProveedorPorId(int id) {
		
		return iPiezaProveedorDAO.findById(id).get();
	}

	@Override
	public PiezaProveedor guardarPiezaProveedor(PiezaProveedor piezaProveedor) {
		
		return iPiezaProveedorDAO.save(piezaProveedor);
	}

	@Override
	public PiezaProveedor actualizarPiezaProveedor(PiezaProveedor piezaProveedor) {
		
		return iPiezaProveedorDAO.save(piezaProveedor);
	}

	@Override
	public void eliminarPiezaProveedor(int id) {
		
		iPiezaProveedorDAO.deleteById(id);
	}
}