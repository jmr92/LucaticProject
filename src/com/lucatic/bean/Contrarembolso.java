package com.lucatic.bean;

public class Contrarembolso extends MetodoPago{
	private int idContrarembolso;
	private double sobrecoste;
	
	
	
	public Contrarembolso() {
		super();
	}



	public Contrarembolso(int idContrarembolso, double sobrecoste, int idMetodoPago) {
		super(idMetodoPago);
		this.idContrarembolso = idContrarembolso;
		this.sobrecoste = sobrecoste;
	}



	public int getIdContrarembolso() {
		return idContrarembolso;
	}



	public void setIdContrarembolso(int idContrarembolso) {
		this.idContrarembolso = idContrarembolso;
	}



	public double getSobrecoste() {
		return sobrecoste;
	}



	public void setSobrecoste(double sobrecoste) {
		this.sobrecoste = sobrecoste;
	}



	@Override
	public String toString() {
		return "Contrarembolso [idContrarembolso=" + idContrarembolso + ", sobrecoste=" + sobrecoste + "]";
	}
	
	
	
}
