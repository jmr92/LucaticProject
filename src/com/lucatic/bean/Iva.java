package com.lucatic.bean;

import java.util.Date;

public class Iva {
	private int idIva;
	private double valor;
	private Date fechaIva;
	
	
	
	public Iva() {
		super();
	}



	public Iva(int idIva, double valor, Date fechaIva) {
		super();
		this.idIva = idIva;
		this.valor = valor;
		this.fechaIva = fechaIva;
	}



	public Iva(int id) {
		// TODO Auto-generated constructor stub
		this.idIva = id;
	}



	public int getIdIva() {
		return idIva;
	}



	public void setIdIva(int idIva) {
		this.idIva = idIva;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public Date getFechaIva() {
		return fechaIva;
	}



	public void setFechaIva(Date fechaIva) {
		this.fechaIva = fechaIva;
	}



	@Override
	public String toString() {
		return "Iva [idIva=" + idIva + ", valor=" + valor + ", fechaIva=" + fechaIva + "]";
	}
	
	
	
}
