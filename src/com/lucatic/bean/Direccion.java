package com.lucatic.bean;

public class Direccion {
	private int idDireccion;
	private String tipoVia;
	private String nombreVia;
	private int numero;
	private int piso;
	private String escalera;
	private String bloque;
	private String ciudad;
	private String provincia;
	
	
	public Direccion() {
		super();
	}

	public Direccion(int idDireccion, String tipoVia, String nombreVia, int numero, int piso, String escalera,
			String bloque, String ciudad, String provincia) {
		super();
		this.idDireccion = idDireccion;
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.numero = numero;
		this.piso = piso;
		this.escalera = escalera;
		this.bloque = bloque;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}

	public Direccion(int id) {
		// TODO Auto-generated constructor stub
		this.idDireccion = id;
	}

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getEscalera() {
		return escalera;
	}

	public void setEscalera(String escalera) {
		this.escalera = escalera;
	}

	public String getBloque() {
		return bloque;
	}

	public void setBloque(String bloque) {
		this.bloque = bloque;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Direccion [idDireccion=" + idDireccion + ", tipoVia=" + tipoVia + ", nombreVia=" + nombreVia
				+ ", numero=" + numero + ", piso=" + piso + ", escalera=" + escalera + ", bloque=" + bloque
				+ ", ciudad=" + ciudad + ", provincia=" + provincia + "]";
	}
	
	
}
