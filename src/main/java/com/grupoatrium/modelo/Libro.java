package com.grupoatrium.modelo;

import java.io.Serializable;
import java.util.List;

public class Libro implements Serializable{

	private static final long serialVersionUID = 6325723170467512741L;

	private String isnb;
	private String titulo;
	private List<Autor> autores;
	private Editorial editorial;
	private int publicacion;
	private double precio;
	private String descripcion;
	
	public Libro() {
		super();
	}
	
	public String getIsnb() {
		return isnb;
	}
	public void setIsnb(String isnb) {
		this.isnb = isnb;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	public int getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ISNB:").append(getIsnb()).append("\n");
		sb.append("Título:").append(getTitulo()).append("\n");
		if(null != getAutores()) {
			sb.append("Autores:").append("\n");
			for(Autor autor:getAutores()) {
				sb.append(autor.toString());
			}
		}
		if(null != getEditorial()) {
			sb.append("Editorial:").append(getEditorial().toString());
		}
		sb.append("Publicación:").append(getPublicacion()).append("\n");
		sb.append("Precio:").append(getPrecio()).append("\n");
		sb.append("Descripción:").append(getDescripcion()).append("\n");
		return sb.toString();
	}
	
}
