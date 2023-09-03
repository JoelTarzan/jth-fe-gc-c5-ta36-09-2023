package com.rest.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.investigadores.dao.IEquipoDAO;
import com.rest.investigadores.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService {

	@Autowired
	IEquipoDAO iEquipoDAO;

	@Override
	public List<Equipo> listarEquipos() {
		
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo buscarEquipoPorNumSerie(String numSerie) {
		
		return iEquipoDAO.findById(numSerie).get();
	}

	@Override
	public Equipo guardarEquipo(Equipo equipo) {
		
		return iEquipoDAO.save(equipo);
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {
		
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(String numSerie) {
		
		iEquipoDAO.deleteById(numSerie);
	}
}