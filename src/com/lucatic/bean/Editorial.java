package com.lucatic.bean;

public class Editorial {
	private int idEditorial;
	private String nombre;
	
	public Editorial(){
		
	}
	public Editorial(int idEditorial, String nombre) {
		super();
		this.idEditorial = idEditorial;
		this.nombre = nombre;
	}
	
	public Editorial(int id) {
		// TODO Auto-generated constructor stub
		this.idEditorial = id;
	}
	public int getIdEditorial() {
		return idEditorial;
	}
	public void setIdEditorial(int idEditorial) {
		this.idEditorial = idEditorial;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Editorial [idEditorial=" + idEditorial + ", nombre=" + nombre + "]";
	}
	
	
	
}
