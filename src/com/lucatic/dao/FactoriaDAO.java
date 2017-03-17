package com.lucatic.dao;

import com.lucatic.bean.Categoria;
import com.lucatic.bean.Cliente;
import com.lucatic.bean.Compra;
import com.lucatic.bean.DetalleCompra;
import com.lucatic.bean.Edicion;
import com.lucatic.bean.Editorial;
import com.lucatic.bean.Iva;
import com.lucatic.bean.Libro;
import com.lucatic.bean.Stock;
import com.lucatic.bean.Valoracion;

public abstract class FactoriaDAO {
	private static FactoriaDAOImp instancia;
	/**
	 * Coge la instancia de la 
	 * @return FactoriaDAO
	 */
	public static FactoriaDAO getInstancia(){
		if(instancia == null){
			instancia = new FactoriaDAOImp();
		}
		return instancia;
	}
	
	public abstract DAO<Compra> crearDAOCompra();
	public abstract DAO<Libro> crearDAOLibro();
	public abstract DAO<Cliente> crearDAOCliente();
	public abstract DAO<Categoria> crearDAOCategoria();
	public abstract DAO<Edicion> crearDAOEdicion();
	public abstract DAO<Editorial> crearDAOEditorial();
	public abstract DAO<Iva> crearDAOIva();
	public abstract DAO<Stock> crearDAOStock();
	public abstract DAO<Valoracion> crearDAOValoracion();
	public abstract DAO<DetalleCompra> crearDAODetalleCompra();
	
}
