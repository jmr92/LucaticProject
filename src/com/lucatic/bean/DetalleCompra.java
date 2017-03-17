package com.lucatic.bean;

public class DetalleCompra {
	private int idDetalleCompra;
	private int cantidadComprada;
	private double descuento;
	private Compra compra;
	private Publicacion publicacion;
	private Iva iva;
	
	public DetalleCompra(){
		
	}
	
	public DetalleCompra(int idDetalleCompra, int cantidadComprada, double descuento, Compra compra,
			Publicacion publicacion, Iva iva) {
		super();
		this.idDetalleCompra = idDetalleCompra;
		this.cantidadComprada = cantidadComprada;
		this.descuento = descuento;
		this.compra = compra;
		this.publicacion = publicacion;
		this.iva = iva;
	}

	
	public Iva getIva() {
		return iva;
	}

	public void setIva(Iva iva) {
		this.iva = iva;
	}

	public Compra getCompra() {
		return compra;
	}



	public void setCompra(Compra compra) {
		this.compra = compra;
	}



	public int getIdDetalleCompra() {
		return idDetalleCompra;
	}

	public void setIdDetalleCompra(int idDetalleCompra) {
		this.idDetalleCompra = idDetalleCompra;
	}

	public int getCantidadComprada() {
		return cantidadComprada;
	}

	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

	@Override
	public String toString() {
		return "DetalleCompra [idDetalleCompra=" + idDetalleCompra + ", cantidadComprada=" + cantidadComprada
				+ ", descuento=" + descuento + ", compra=" + compra + ", publicacion=" + publicacion + ", iva=" + iva
				+ "]";
	}



	
	
	
	
	
}
