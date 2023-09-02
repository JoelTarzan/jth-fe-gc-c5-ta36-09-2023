package com.rest.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.almacenes.dao.IMaquinaRegistradoraDAO;
import com.rest.almacenes.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService {

	@Autowired
	IMaquinaRegistradoraDAO iMaquinaRegistradoraDAO;

	@Override
	public List<MaquinaRegistradora> listarMaquinasRegistradoras() {
		
		return iMaquinaRegistradoraDAO.findAll();
	}

	@Override
	public MaquinaRegistradora buscarMaquinaRegistradoraPorCodigo(int codigo) {
		
		return iMaquinaRegistradoraDAO.findById(codigo).get();
	}

	@Override
	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public void eliminarMaquinaRegistradora(int codigo) {
		
		iMaquinaRegistradoraDAO.deleteById(codigo);
	}
}