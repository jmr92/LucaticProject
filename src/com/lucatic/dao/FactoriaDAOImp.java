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

public class FactoriaDAOImp extends FactoriaDAO{

	@Override
	public DAO<Compra> crearDAOCompra() {
		// TODO Auto-generated method stub
		return new DAOCompraImp();
	}

	@Override
	public DAO<Libro> crearDAOLibro() {
		// TODO Auto-generated method stub
		return new DAOLibroImp();
	}

	@Override
	public DAO<Cliente> crearDAOCliente() {
		// TODO Auto-generated method stub
		return new DAOClienteImp();
	}

	@Override
	public DAO<Categoria> crearDAOCategoria() {
		// TODO Auto-generated method stub
		return new DAOCategoriaImp();
	}

	@Override
	public DAO<Edicion> crearDAOEdicion() {
		// TODO Auto-generated method stub
		return new DAOEdicionImp();
	}

	@Override
	public DAO<Editorial> crearDAOEditorial() {
		// TODO Auto-generated method stub
		return new DAOEditorialImp();
	}

	@Override
	public DAO<Iva> crearDAOIva() {
		// TODO Auto-generated method stub
		return new DAOIvaImp();
	}

	@Override
	public DAO<Stock> crearDAOStock() {
		// TODO Auto-generated method stub
		return new DAOStockImp();
	}

	@Override
	public DAO<Valoracion> crearDAOValoracion() {
		// TODO Auto-generated method stub
		return new DAOValoracionImp();
	}

	@Override
	public DAO<DetalleCompra> crearDAODetalleCompra() {
		// TODO Auto-generated method stub
		return new DAODetalleCompraImp();
	}
	
}
