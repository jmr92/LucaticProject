package com.lucatic.bean;

public class MetodoPago {
	private int idMetodoPago;
	
	public MetodoPago(){
		
	}
	public MetodoPago(int idMetodoPago) {
		super();
		this.idMetodoPago = idMetodoPago;
	}
	public int getIdMetodoPago() {
		return idMetodoPago;
	}
	public void setIdMetodoPago(int idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
	}
	@Override
	public String toString() {
		return "MetodoPago [idMetodoPago=" + idMetodoPago + "]";
	}
	
	
}
