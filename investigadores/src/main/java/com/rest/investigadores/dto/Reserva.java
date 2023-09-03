package com.rest.investigadores.dto;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reserva {

	// Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "comienzo")
    private LocalDateTime comienzo;
    
    @Column(name = "fin")
    private LocalDateTime fin;
    
    @ManyToOne
    @JoinColumn(name = "dni")
    private Investigador investigador;
    
    @ManyToOne
    @JoinColumn(name = "num_serie")
    private Equipo equipo;

    // Constructores
    public Reserva() {
        
    }
    
    public Reserva(int codigo, LocalDateTime comienzo, LocalDateTime fin, Investigador investigador, Equipo equipo) {
		this.codigo = codigo;
		this.comienzo = comienzo;
		this.fin = fin;
		this.investigador = investigador;
		this.equipo = equipo;
	}

    // Métodos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getComienzo() {
		return comienzo;
	}

	public void setComienzo(LocalDateTime comienzo) {
		this.comienzo = comienzo;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public Investigador getInvestigador() {
		return investigador;
	}

	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", comienzo=" + comienzo + ", fin=" + fin + ", investigador="
				+ investigador + ", equipo=" + equipo + "]";
	}
}