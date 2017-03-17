package com.lucatic.bean;

public class Publicacion {
	private int idPublicacion;
	
	
	public Publicacion() {
		super();
	}


	public Publicacion(int idPublicacion) {
		super();
		this.idPublicacion = idPublicacion;
	}
	

	public int getIdPublicacion() {
		return idPublicacion;
	}


	public void setIdPublicacion(int idPublicacion) {
		this.idPublicacion = idPublicacion;
	}


	@Override
	public String toString() {
		return "Publicacion [idPublicacion=" + idPublicacion + "]";
	}
	
	
}
