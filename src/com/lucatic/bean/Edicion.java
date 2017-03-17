package com.lucatic.bean;

import java.util.Date;

public class Edicion {
	private int idEdicion;
	private int numeroEdicion;
	private String foto;
	private double precioSinIva;
	private Date fechaPublicacion;
	private Editorial editorial;
	
	public Edicion(){
		
	}
	public Edicion(int numeroEdicion, String foto, double precioSinIva, Date fechaPublicacion, Editorial editorial, int idEdicion) {
		super();
		this.numeroEdicion = numeroEdicion;
		this.foto = foto;
		this.precioSinIva = precioSinIva;
		this.fechaPublicacion = fechaPublicacion;
		this.editorial = editorial;
		this.idEdicion = idEdicion;
	}
	public Edicion(int id) {
		// TODO Auto-generated constructor stub
		this.idEdicion = id;
	}
	
	public int getIdEdicion() {
		return idEdicion;
	}
	public void setIdEdicion(int idEdicion) {
		this.idEdicion = idEdicion;
	}
	public int getNumeroEdicion() {
		return numeroEdicion;
	}
	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public double getPrecioSinIva() {
		return precioSinIva;
	}
	public void setPrecioSinIva(double precioSinIva) {
		this.precioSinIva = precioSinIva;
	}
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return "Edicion [idEdicion=" + idEdicion + ", numeroEdicion=" + numeroEdicion + ", foto=" + foto
				+ ", precioSinIva=" + precioSinIva + ", fechaPublicacion=" + fechaPublicacion + ", editorial="
				+ editorial + "]";
	}
	
	
	
}
