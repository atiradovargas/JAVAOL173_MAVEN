package com.grupoatrium.modelo;

import java.io.Serializable;

public class Editorial implements Serializable{

	private static final long serialVersionUID = -4148860882212748897L;

	private String nombre;
	private Direccion direccion;
	private String nif;
	
	public Editorial() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n").append("\t").append("Nombre:").append(getNombre()).append("\n");
		if(null != getDireccion()) {
			sb.append("\t").append("Direccion:").append("\n").append(getDireccion().toString());
		}	
		sb.append("\t").append("Nif:").append(getNif().toString()).append("\n");
		return sb.toString();
	}
	
	
}
