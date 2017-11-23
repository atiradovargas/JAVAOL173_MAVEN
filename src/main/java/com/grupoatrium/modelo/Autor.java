package com.grupoatrium.modelo;

import java.io.Serializable;

public class Autor implements Serializable{

	private static final long serialVersionUID = 1559121743716812299L;

	private String nombre;
	private String nacionalidad;
	private String comentarios;
	
	public Autor() {
		super();
	}
	
	public Autor(String nombre, String nacionalidad, String comentarios) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.comentarios = comentarios;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("Nombre:").append(getNombre()).append("\n");
		sb.append("\t").append("Nacionalidad:").append(getNacionalidad()).append("\n");
		sb.append("\t").append("Comentarios:").append(getComentarios()).append("\n");
		return sb.toString();
	}
	
	
}
