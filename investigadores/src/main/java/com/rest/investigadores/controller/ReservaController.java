package com.rest.investigadores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.investigadores.dto.Reserva;
import com.rest.investigadores.service.ReservaServiceImpl;

@RestController
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	@GetMapping("/reservas")
	public List<Reserva> listarReservas() {
		
		return reservaServiceImpl.listarReservas();
	}
	
	@GetMapping("/reservas/{codigo}")
	public Reserva buscarReservaPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return reservaServiceImpl.buscarReservaPorCodigo(codigo);
	}
	
	@PostMapping("/reservas")
	public Reserva guardarReserva(@RequestBody Reserva reserva) {
		
		return reservaServiceImpl.guardarReserva(reserva);
	}
	
	@PutMapping("/reservas/{codigo}")
	public Reserva actualizarReserva(@PathVariable(name = "codigo") int codigo, @RequestBody Reserva reserva) {
		
		Reserva reservaSeleccionada = new Reserva();
		Reserva reservaActualizada = new Reserva();
		
		reservaSeleccionada = reservaServiceImpl.buscarReservaPorCodigo(codigo);
		
		reservaSeleccionada.setComienzo(reserva.getComienzo());
		reservaSeleccionada.setFin(reserva.getFin());
		reservaSeleccionada.setInvestigador(reserva.getInvestigador());
		reservaSeleccionada.setEquipo(reserva.getEquipo());
		
		reservaActualizada = reservaServiceImpl.actualizarReserva(reservaSeleccionada);
		
		return reservaActualizada;
	}
	
	@DeleteMapping("/reservas/{codigo}")
	public void eliminarReserva(@PathVariable(name = "codigo") int codigo) {
		
		reservaServiceImpl.eliminarReserva(codigo);
	}
}