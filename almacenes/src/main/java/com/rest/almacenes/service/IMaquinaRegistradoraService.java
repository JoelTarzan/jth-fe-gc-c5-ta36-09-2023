package com.rest.almacenes.service;

import java.util.List;

import com.rest.almacenes.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {

	public List<MaquinaRegistradora> listarMaquinasRegistradoras();

	public MaquinaRegistradora buscarMaquinaRegistradoraPorCodigo(int codigo);

	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);

	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);

	public void eliminarMaquinaRegistradora(int codigo);
}