package com.lucatic.bean;

public class Categoria {
	private int idCategoria;
	private String descripcion;
	
	
	
	public Categoria() {
		super();
	}



	public Categoria(int idCategoria, String descripcion) {
		super();
		this.idCategoria = idCategoria;
		this.descripcion = descripcion;
	}



	public Categoria(int id) {
		// TODO Auto-generated constructor stub
		this.idCategoria = id;
	}



	public int getIdCategoria() {
		return idCategoria;
	}



	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
