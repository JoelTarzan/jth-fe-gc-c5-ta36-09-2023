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

import com.rest.investigadores.dto.Investigador;
import com.rest.investigadores.service.InvestigadorServiceImpl;

@RestController
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;
	
	@GetMapping("/investigadores")
	public List<Investigador> listarInvestigadores() {
		
		return investigadorServiceImpl.listarInvestigadores();
	}
	
	@GetMapping("/investigadores/{dni}")
	public Investigador buscarInvestigadorPorDni(@PathVariable(name = "dni") String dni) {
		
		return investigadorServiceImpl.buscarInvestigadorPorDni(dni);
	}
	
	@PostMapping("/investigadores")
	public Investigador guardarInvestigador(@RequestBody Investigador investigador) {
		
		return investigadorServiceImpl.guardarInvestigador(investigador);
	}
	
	@PutMapping("/investigadores/{dni}")
	public Investigador actualizarInvestigador(@PathVariable(name = "dni") String dni, @RequestBody Investigador investigador) {
		
		Investigador investigadorSeleccionado = new Investigador();
		Investigador investigadorActualizado = new Investigador();
		
		investigadorSeleccionado = investigadorServiceImpl.buscarInvestigadorPorDni(dni);
		
		investigadorSeleccionado.setNomApels(investigador.getNomApels());
		investigadorSeleccionado.setFacultad(investigador.getFacultad());
		
		investigadorActualizado = investigadorServiceImpl.actualizarInvestigador(investigadorSeleccionado);
		
		return investigadorActualizado;
	}
	
	@DeleteMapping("/investigadores/{dni}")
	public void eliminarInvestigador(@PathVariable(name = "dni") String dni) {
		
		investigadorServiceImpl.eliminarInvestigador(dni);
	}
}