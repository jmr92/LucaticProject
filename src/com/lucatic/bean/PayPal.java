package com.lucatic.bean;

public class PayPal extends MetodoPago{
	private int idPayPal;
	private String cuenta;
	private double sobrecoste;
	
	public PayPal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PayPal(int idPayPal, String cuenta, double sobrecoste, int idMetodoPago) {
		super(idMetodoPago);
		this.idPayPal = idPayPal;
		this.cuenta = cuenta;
		this.sobrecoste = sobrecoste;
	}

	public int getIdPayPal() {
		return idPayPal;
	}

	public void setIdPayPal(int idPayPal) {
		this.idPayPal = idPayPal;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSobrecoste() {
		return sobrecoste;
	}

	public void setSobrecoste(double sobrecoste) {
		this.sobrecoste = sobrecoste;
	}

	@Override
	public String toString() {
		return super.toString() + "PayPal [idPayPal=" + idPayPal + ", cuenta=" + cuenta + ", sobrecoste=" + sobrecoste + "]";
	}
	
	
	
	
}
