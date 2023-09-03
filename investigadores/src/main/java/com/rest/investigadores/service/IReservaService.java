package com.rest.investigadores.service;

import java.util.List;

import com.rest.investigadores.dto.Reserva;

public interface IReservaService {

	public List<Reserva> listarReservas();

	public Reserva buscarReservaPorCodigo(int codigo);

	public Reserva guardarReserva(Reserva reserva);

	public Reserva actualizarReserva(Reserva reserva);

	public void eliminarReserva(int codigo);
}