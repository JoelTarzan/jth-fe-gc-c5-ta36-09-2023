package com.rest.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.investigadores.dao.IReservaDAO;
import com.rest.investigadores.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	IReservaDAO iReservaDAO;

	@Override
	public List<Reserva> listarReservas() {
		
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva buscarReservaPorCodigo(int codigo) {
		
		return iReservaDAO.findById(codigo).get();
	}

	@Override
	public Reserva guardarReserva(Reserva reserva) {
		
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		
		return iReservaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(int codigo) {
		
		iReservaDAO.deleteById(codigo);
	}
}