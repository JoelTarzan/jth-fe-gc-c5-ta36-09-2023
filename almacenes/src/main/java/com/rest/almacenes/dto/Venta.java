package com.rest.almacenes.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ventas")
public class Venta {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;

	@ManyToOne
	@JoinColumn(name = "cajero")
	private Cajero cajero;

	@ManyToOne
	@JoinColumn(name = "maquina")
	private MaquinaRegistradora maquinaRegistradora;

	@ManyToOne
	@JoinColumn(name = "producto")
	private Producto producto;

	// Constructores
	public Venta() {

	}

	public Venta(int codigo, Cajero cajero, MaquinaRegistradora maquinaRegistradora, Producto producto) {
		this.codigo = codigo;
		this.cajero = cajero;
		this.maquinaRegistradora = maquinaRegistradora;
		this.producto = producto;
	}

	// Métodos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public MaquinaRegistradora getMaquinaRegistradora() {
		return maquinaRegistradora;
	}

	public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		this.maquinaRegistradora = maquinaRegistradora;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Venta [codigo=" + codigo + ", cajero=" + cajero + ", maquinaRegistradora=" + maquinaRegistradora
				+ ", producto=" + producto + "]";
	}
}