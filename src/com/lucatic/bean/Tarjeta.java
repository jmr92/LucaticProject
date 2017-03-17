package com.lucatic.bean;

public class Tarjeta extends MetodoPago{
	private int idTarjeta;
	private String numeroTarjeta;
	private double sobrecoste;
	
	
	
	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tarjeta(int idMetodoPago, int idTarjeta, String numeroTarjeta, double sobrecoste) {
		super(idMetodoPago);
		// TODO Auto-generated constructor stub
		this.idTarjeta = idMetodoPago;
		this.numeroTarjeta = numeroTarjeta;
		this.sobrecoste = sobrecoste;
	}
	public int getIdTarjeta() {
		return idTarjeta;
	}
	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public double getSobrecoste() {
		return sobrecoste;
	}
	public void setSobrecoste(double sobrecoste) {
		this.sobrecoste = sobrecoste;
	}
	@Override
	public String toString() {
		return super.toString() + "Tarjeta [idTarjeta=" + idTarjeta + ", numeroTarjeta=" + numeroTarjeta + ", sobrecoste=" + sobrecoste
				+ "]";
	}
	
	
}
