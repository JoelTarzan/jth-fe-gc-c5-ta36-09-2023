package com.rest.cientificos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.cientificos.dao.IAsignacionDAO;
import com.rest.cientificos.dto.Asignacion;

@Service
public class AsignacionServiceImpl implements IAsignacionService {

	@Autowired
	IAsignacionDAO iAsignacionDAO;

	@Override
	public List<Asignacion> listarAsignaciones() {
		
		return iAsignacionDAO.findAll();
	}

	@Override
	public Asignacion buscarAsignacionPorId(int id) {
		
		return iAsignacionDAO.findById(id).get();
	}

	@Override
	public Asignacion guardarAsignacion(Asignacion asignacion) {
		
		return iAsignacionDAO.save(asignacion);
	}

	@Override
	public Asignacion actualizarAsignacion(Asignacion asignacion) {
		
		return iAsignacionDAO.save(asignacion);
	}

	@Override
	public void eliminarAsignacion(int id) {
		
		iAsignacionDAO.deleteById(id);
	}
}