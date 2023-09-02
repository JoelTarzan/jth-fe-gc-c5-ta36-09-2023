package com.rest.cientificos.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cientificos")
public class Cientifico {

	// Atributos
	@Id
	@Column(name = "dni", length=8)
	private String dni;

	@Column(name = "nom_apels")
	private String nomApels;

	@OneToMany(mappedBy = "cientifico", fetch = FetchType.LAZY)
	private List<Asignacion> asignacion;

	// Constructores
	public Cientifico() {
		super();
	}

	public Cientifico(String dni, String nomApels) {
		this.dni = dni;
		this.nomApels = nomApels;
	}

	// Métodos
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@JsonIgnore
	public List<Asignacion> getAsignacion() {
		return asignacion;
	}

	public void setAsignacion(List<Asignacion> asignacion) {
		this.asignacion = asignacion;
	}

	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nomApels=" + nomApels + "]";
	}
}