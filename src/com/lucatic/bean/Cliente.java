package com.lucatic.bean;

public class Cliente {
	private int idCliente;
	private String nombre;
	private String apellidos;
	private String email;
	private int telefono;
	private String contraseña;
	private boolean baja;
	private Direccion direccion;
	
	public Cliente() {
		super();
	}

	public Cliente(int idCliente, String nombre, String apellidos, String email, int telefono, String contraseña,
			boolean baja, Direccion direccion) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.contraseña = contraseña;
		this.baja = baja;
		this.direccion = direccion;
	}

	public Cliente(int id) {
		// TODO Auto-generated constructor stub
		this.idCliente = id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + ", telefono=" + telefono + ", contraseña=" + contraseña + ", baja=" + baja + ", direccion="
				+ direccion + "]";
	}
	
	
	
}
