package com.rest.cientificos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.cientificos.dao.ICientificoDAO;
import com.rest.cientificos.dto.Cientifico;

@Service
public class CientificoServiceImpl implements ICientificoService {

	@Autowired
	ICientificoDAO iCientificoDAO;

	@Override
	public List<Cientifico> listarCientificos() {
		
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientifico buscarCientificoPorDni(String dni) {
		
		return iCientificoDAO.findById(dni).get();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String dni) {
		
		iCientificoDAO.deleteById(dni);
	}
}