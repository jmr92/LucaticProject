package com.lucatic.bean;

public class Valoracion {
	private int idValoracion;
	private double valoracion;
	
	public Valoracion(){
		
	}
	
	public Valoracion(int idValoracion, double valoracion) {
		super();
		this.idValoracion = idValoracion;
		this.valoracion = valoracion;
	}
	
	public Valoracion(int id) {
		// TODO Auto-generated constructor stub
		this.idValoracion = id;
	}

	public int getIdValoracion() {
		return idValoracion;
	}
	public void setIdValoracion(int idValoracion) {
		this.idValoracion = idValoracion;
	}
	public double getValoracion() {
		return valoracion;
	}
	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "Valoracion [idValoracion=" + idValoracion + ", valoracion=" + valoracion + "]";
	}
	
	
}
