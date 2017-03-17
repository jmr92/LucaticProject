package com.lucatic.bean;

import java.util.Date;
import java.util.List;
/**
* A class used to manage purchases.
*/
public class Compra {
	private int idCompra;
	private Date fechaCompra;
	private double precioTotal;
	private List<DetalleCompra> listaDetalleCompra;
	private Cliente cliente;
	private MetodoPago metodoPago;
	private Iva iva;
	
	/**
	* Constructs a Compra object with null values.
	*/
	public Compra() {
		super();
	}
	/**
	* Constructs a Compra object using the given values.
	* @param iDCompra The identification number of the purchase.
	* @param metodoPagoID The identification number of the payment method.
	* @param clienteID The identification number of the customer.
	* @param fechaCompra Date and time the purchase was made.
	* @param precioTotal Total amount of the purchase, including sales, surcharges and taxes.
	*/
	public Compra(int idCompra, Date fechaCompra, double precioTotal, List<DetalleCompra> listaDetalleCompra,
			Cliente cliente, MetodoPago metodoPago) {
		super();
		this.idCompra = idCompra;
		this.fechaCompra = fechaCompra;
		this.precioTotal = precioTotal;
		this.listaDetalleCompra = listaDetalleCompra;
		this.cliente = cliente;
		this.metodoPago = metodoPago;
	}
	

	public Compra(int id) {
		this.idCompra = id;
	}
	public MetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public List<DetalleCompra> getListaDetalleCompra() {
		return listaDetalleCompra;
	}

	public void setListaDetalleCompra(List<DetalleCompra> listaDetalleCompra) {
		this.listaDetalleCompra = listaDetalleCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Compra [idCompra=" + idCompra + ", fechaCompra=" + fechaCompra + ", precioTotal=" + precioTotal
				+ ", listaDetalleCompra=" + listaDetalleCompra + ", cliente=" + cliente + ", metodoPago=" + metodoPago
				+ "]";
	}

	
	
	
}
