package com.lucatic.bean;

public class Transferencia extends MetodoPago{
	private int idTransferencia;
	private String numeroTransferencia;
	
	public Transferencia(){
		
	}
	public Transferencia(int idTransferencia, String numeroTransferencia, int idMetodoPago) {
		super(idMetodoPago);
		this.idTransferencia = idTransferencia;
		this.numeroTransferencia = numeroTransferencia;
	}
	public int getIdTransferencia() {
		return idTransferencia;
	}
	public void setIdTransferencia(int idTransferencia) {
		this.idTransferencia = idTransferencia;
	}
	public String getNumeroTransferencia() {
		return numeroTransferencia;
	}
	public void setNumeroTransferencia(String numeroTransferencia) {
		this.numeroTransferencia = numeroTransferencia;
	}
	@Override
	public String toString() {
		return super.toString() + "Transferencia [idTransferencia=" + idTransferencia + ", numeroTransferencia=" + numeroTransferencia
				+ "]";
	}
	
	
}
