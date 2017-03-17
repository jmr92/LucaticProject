package com.lucatic.bean;

public class Stock {
	private int idStock;
	private int cantidadEjemplar;
	
	public Stock() {
		super();
	}

	public Stock(int idStock,int cantidadEjemplar) {
		super();
		this.idStock = idStock;
		this.cantidadEjemplar = cantidadEjemplar;
	}
	
	public Stock(int id) {
		// TODO Auto-generated constructor stub
		this.idStock = id;
	}

	public int getIdStock() {
		return idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	public int getCantidadEjemplar() {
		return cantidadEjemplar;
	}

	public void setCantidadEjemplar(int cantidadEjemplar) {
		this.cantidadEjemplar = cantidadEjemplar;
	}

	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", cantidadEjemplar=" + cantidadEjemplar + "]";
	}

	
	
	
}
