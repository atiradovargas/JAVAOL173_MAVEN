package com.grupoatrium.modelo;

import java.io.Serializable;

public class Direccion implements Serializable{

	private static final long serialVersionUID = -4675238149234426109L;
	
	private String calle;
	private int numero;
	private String poblacion;
	private int cp;
	private String provincia;
	
	public Direccion() {
		super();
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("\t").append("\t").append("Calle:").append(getCalle()).append("\n");
		sb.append("\t").append("\t").append("Número:").append(getNumero()).append("\n");
		sb.append("\t").append("\t").append("Población:").append(getPoblacion()).append("\n");
		sb.append("\t").append("\t").append("CP:").append(getCp()).append("\n");
		sb.append("\t").append("\t").append("Provincia:").append(getProvincia()).append("\n");
		return sb.toString();
		
	}
	
	

}
