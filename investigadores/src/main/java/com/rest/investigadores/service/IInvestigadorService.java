package com.rest.investigadores.service;

import java.util.List;

import com.rest.investigadores.dto.Investigador;

public interface IInvestigadorService {

	public List<Investigador> listarInvestigadores();

	public Investigador buscarInvestigadorPorDni(String dni);

	public Investigador guardarInvestigador(Investigador investigador);

	public Investigador actualizarInvestigador(Investigador investigador);

	public void eliminarInvestigador(String dni);
}