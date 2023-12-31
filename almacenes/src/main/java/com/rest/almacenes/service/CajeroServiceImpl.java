package com.rest.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.almacenes.dao.ICajeroDAO;
import com.rest.almacenes.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO iCajeroDAO;

	@Override
	public List<Cajero> listarCajeros() {
		
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero buscarCajeroPorCodigo(int codigo) {
		
		return iCajeroDAO.findById(codigo).get();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(int codigo) {
		
		iCajeroDAO.deleteById(codigo);
	}
}