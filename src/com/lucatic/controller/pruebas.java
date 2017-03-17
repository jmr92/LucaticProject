package com.lucatic.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lucatic.bean.Categoria;
import com.lucatic.bean.Cliente;
import com.lucatic.bean.Compra;
import com.lucatic.bean.DetalleCompra;
import com.lucatic.bean.Direccion;
import com.lucatic.bean.Edicion;
import com.lucatic.bean.Editorial;
import com.lucatic.bean.Iva;
import com.lucatic.bean.Libro;
import com.lucatic.bean.MetodoPago;
import com.lucatic.bean.Publicacion;
import com.lucatic.bean.Stock;
import com.lucatic.bean.Valoracion;
import com.lucatic.dao.DAOException;
import com.lucatic.dao.FactoriaDAO;
import com.lucatic.utilities.LeerTeclado;

public class pruebas {

	public static void main(String[] args) throws DAOException {
		// TODO Auto-generated method stub
		
		//Valoracion
		Valoracion valoracion = new Valoracion(1);
		System.out.println(FactoriaDAO.getInstancia().crearDAOValoracion().read(valoracion));
		System.out.println(FactoriaDAO.getInstancia().crearDAOValoracion().readAll());
		
		
		//Stock
		Stock stock = new Stock(1);
		System.out.println(FactoriaDAO.getInstancia().crearDAOStock().read(stock));
		System.out.println(FactoriaDAO.getInstancia().crearDAOStock().readAll());
		
		
		
		//Iva
		Iva iva = new Iva(1);
		System.out.println(FactoriaDAO.getInstancia().crearDAOIva().read(iva));
		System.out.println(FactoriaDAO.getInstancia().crearDAOIva().readAll());
		
		//Editorial
		Editorial editorial = new Editorial(1);
		System.out.println(FactoriaDAO.getInstancia().crearDAOEditorial().read(editorial));
		System.out.println(FactoriaDAO.getInstancia().crearDAOEditorial().readAll());
		
		//Edicion
		Edicion edicion = new Edicion(1);
		System.out.println(FactoriaDAO.getInstancia().crearDAOEdicion().read(edicion));
		System.out.println(FactoriaDAO.getInstancia().crearDAOEdicion().readAll());
		
		//DetalleCompra
		DetalleCompra detalleCompra = new DetalleCompra();
		detalleCompra.setCantidadComprada(1);
		detalleCompra.setCompra(new Compra(1));
		detalleCompra.setDescuento(2.1);
		detalleCompra.setIdDetalleCompra(2);
		detalleCompra.setIva(new Iva(1));
		detalleCompra.setPublicacion(new Publicacion(1));
		
		FactoriaDAO.getInstancia().crearDAODetalleCompra().create(detalleCompra);
		System.out.println(FactoriaDAO.getInstancia().crearDAODetalleCompra().read(detalleCompra));
		System.out.println(FactoriaDAO.getInstancia().crearDAODetalleCompra().readAll());
		FactoriaDAO.getInstancia().crearDAODetalleCompra().update(detalleCompra);
		FactoriaDAO.getInstancia().crearDAODetalleCompra().delete(detalleCompra);
		
		//Categoria
		Categoria categoria = new Categoria(1);
		System.out.println(FactoriaDAO.getInstancia().crearDAOCategoria().read(categoria));
		System.out.println(FactoriaDAO.getInstancia().crearDAOCategoria().readAll());
		
		
		
		//Cliente
		
        /*
        Cliente pru1 = new Cliente ();
        pru1.setApellidos("sdaad");
        pru1.setBaja(false);
        pru1.setContraseña("asdasdasd");
        pru1.setDireccion(new Direccion(1));
        pru1.setEmail("asdsdasasasdas");
        pru1.setIdCliente(1);
        pru1.setNombre("aaaaa");
        pru1.setTelefono(1111111);
        Cliente pru2 = new Cliente ();
        pru2.setApellidos("yyyyyy");
        pru2.setBaja(false);
        pru2.setContraseña("xxxxxxx");
        pru2.setDireccion(new Direccion(1));
        pru2.setEmail("yyyyyyy");
        pru2.setIdCliente(2);
        pru2.setNombre("yyyyyyy");
        pru2.setTelefono(33333);
        Cliente pru3 = new Cliente ();
        pru3.setApellidos("uuuuuuuu");
        pru3.setBaja(false);
        pru3.setContraseña("iiiiiii");
        pru3.setDireccion(new Direccion(1));
        pru3.setEmail("uuuuu@uuu.com");
        pru3.setIdCliente(3);
        pru3.setNombre("uu");
        pru3.setTelefono(4444444);
        Cliente pru4 = new Cliente ();
        pru4.setApellidos("jjjjjj");
        pru4.setBaja(false);
        pru4.setContraseña("llllllll");
        pru4.setDireccion(new Direccion(1));
        pru4.setEmail("pppppppp");
        pru4.setIdCliente(4);
        pru4.setNombre("mmmmmm");
        pru4.setTelefono(5555555);
        Cliente pru5 = new Cliente ();
        pru5.setApellidos("ccccccc");
        pru5.setBaja(false);
        pru5.setContraseña("vvvvvvvvv");
        pru5.setDireccion(new Direccion(1));
        pru5.setEmail("abbbb");
        pru5.setIdCliente(1);
        pru5.setNombre("aaaaa");
        pru5.setTelefono(6666666);
        Cliente pru6 = new Cliente ();
        pru6.setApellidos("qqqqqq");
        pru6.setBaja(false);
        pru6.setContraseña("wwwwwwww");
        pru6.setDireccion(new Direccion(2));
        pru6.setEmail("padade");
        pru6.setIdCliente(3);
        pru6.setNombre("rrrrrrr");
        pru6.setTelefono(777777);
       
    
      int prueba;
      prueba = LeerTeclado.leerInt("elige una prueba: 1 CREATE 2 UPDATE 3 DELETE 4 READ 5 READ ALL");
       
       if (prueba == 1){ 
       
    	   try {
			FactoriaDAO.getInstancia().crearDAOCliente().create(pru1);
			FactoriaDAO.getInstancia().crearDAOCliente().create(pru2);
	    	FactoriaDAO.getInstancia().crearDAOCliente().create(pru3);
	    	FactoriaDAO.getInstancia().crearDAOCliente().create(pru4);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
        
       } else if (prueba == 2){ 
        
    	   try {
			FactoriaDAO.getInstancia().crearDAOCliente().update(pru6);
			FactoriaDAO.getInstancia().crearDAOCliente().update(pru5);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
        
       } else if (prueba == 3){ 
       
    	   try {
			FactoriaDAO.getInstancia().crearDAOCliente().delete(pru1);
			FactoriaDAO.getInstancia().crearDAOCliente().delete(pru2);
	    	FactoriaDAO.getInstancia().crearDAOCliente().delete(pru3);
	    	FactoriaDAO.getInstancia().crearDAOCliente().delete(pru4);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
    	   
        
       } else if (prueba == 4){ 
        
        try {
			System.out.println(FactoriaDAO.getInstancia().crearDAOCliente().read(pru1));
			System.out.println(FactoriaDAO.getInstancia().crearDAOCliente().read(pru2));
	        System.out.println(FactoriaDAO.getInstancia().crearDAOCliente().read(pru4));
        } catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    
        
       } else if (prueba == 5){  
    	  
        try {
			System.out.print(FactoriaDAO.getInstancia().crearDAOCliente().readAll());
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       } else {
     
       System.out.println("elige otra opcion");
       
       }
       */
		/*
		
		
		//Libro
       	Categoria c = new Categoria(1);
		Valoracion v = new Valoracion(1);
		Edicion e = new Edicion(1);
		Libro lib = new Libro();
		lib.setAutor("as");
		lib.setCategoria(c);
		lib.setDescatalogado(false);
		lib.setEdicion(e);
		lib.setIdLibro(5);
		lib.setIdPublicacion(1);
		lib.setIsbn(12);
		lib.setNombre("asd");
		lib.setSinopsis("asddadadsdadasdasd");
		Stock s = new Stock(1);
		lib.setStock(s);
		lib.setValoracion(v);
		try {
			//FactoriaDAO.getInstancia().crearDAOLibro().create(lib);
			System.out.println(FactoriaDAO.getInstancia().crearDAOLibro().read(lib));
			List<Libro> lista = FactoriaDAO.getInstancia().crearDAOLibro().readAll();
	       for (Libro libro : lista) {
	           System.out.println(libro + "\n");
	       }
	       lib.setDescatalogado(true);
	       lib.setIdLibro(5);
	       FactoriaDAO.getInstancia().crearDAOLibro().delete(lib);
		} catch (DAOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		/*
		//Compra
		Compra comp = new Compra();
		comp.setIdCompra(3);
		comp.setCliente(new Cliente(1));
		comp.setListaDetalleCompra(new ArrayList<DetalleCompra>());
		comp.setMetodoPago(new MetodoPago(1));
		comp.setPrecioTotal(88.22);
		FactoriaDAO.getInstancia().crearDAOCompra();
		
		try {
			FactoriaDAO.getInstancia().crearDAOCompra().create(comp);
			//Compra c = (Compra)FactoriaDAO.getInstancia().crearDAOCompra().read(comp);
			//System.out.println(c.toString());
			//System.out.println(FactoriaDAO.getInstancia().crearDAOCompra().readAll());
			//FactoriaDAO.getInstancia().crearDAOCompra().delete(comp);
		} catch (DAOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		*/
	}

}
