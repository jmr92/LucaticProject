package com.lucatic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lucatic.bean.Categoria;
import com.lucatic.bean.Edicion;
import com.lucatic.bean.Libro;
import com.lucatic.bean.Stock;
import com.lucatic.bean.Valoracion;
import com.lucatic.dao.conector.DataSourceDB;

/**
* A class that implements the basic CRUD methods
* for the libro table in the database.
*/

public class DAOLibroImp implements DAO<Libro> {
	private DataSourceDB con = new DataSourceDB();

	@Override
	/**
	* Inserts a new register into libro table.
	* @param lib The Libro class object to be created.
	* @throws DAOException If the iDCategoria, iDPublicacion or iDValoracion fields
	* from the in parameter doesn't match with an existing record from the respective tables.
	*/

	public void create(Libro t) throws DAOException {
		Libro lib = (Libro) t;
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "INSERT INTO libro(ISBN,NOMBRE,AUTOR,SINOPSIS,DESCATALOGADO,CATEGORIA_IDCATEGORIA,"
					+ "PUBLICACION_IDPUBLICACION,VALORACION_IDVALORACION,STOCK_IDSTOCK,EDICION_IDEDICION) "
					+ "VALUES (" + lib.getIsbn() + ",'"
					+ lib.getNombre() + "','" + lib.getAutor() + "','" + lib.getSinopsis() + "',"
					+ lib.isDescatalogado() + "," + lib.getCategoria().getIdCategoria() + "," + lib.getIdPublicacion()
					+ "," + lib.getValoracion().getIdValoracion() +","+lib.getStock().getIdStock() +","+lib.getEdicion().getIdEdicion()+ ")";
			System.out.println("-- Query: " + query);
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error creando libro");
			}
		} catch (SQLException se) {
			throw new DAOException("Error creando libro en DAO", se);
		}

	}

	@Override
	/**
	* Reads all columns from libro table whose idLibro column contents match the iDLibro field
	* from the in parameter.
	* @param lib The Libro object whose fields can be null except for iDLibro.
	* @return An Libro objects whose fields match the contents of the records that were read.
	* @throws DAOException If the iDLibro field from the in parameter doesn't match
	* with an existing record idLibro column contents.
	*/
	public Libro read(Libro t) throws DAOException {
		Libro lib = (Libro) t;
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "SELECT *"
					+ " FROM libro" + " WHERE idLibro = " + lib.getIdLibro();
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				return null;
			} else {

				Libro l = new Libro();
				l.setAutor(rs.getString("autor"));
				l.setCategoria(new Categoria(rs.getInt("Categoria_idCategoria")));
				l.setDescatalogado(rs.getBoolean("descatalogado"));
				l.setEdicion(new Edicion(rs.getInt("Edicion_idEdicion")));
				l.setIdLibro(rs.getInt("idLibro"));
				l.setIdPublicacion(rs.getInt("Publicacion_idPublicacion"));
				l.setIsbn(rs.getInt("ISBN"));
				l.setNombre(rs.getString("nombre"));
				l.setSinopsis(rs.getString("sinopsis"));
				l.setStock(new Stock(rs.getInt("Stock_idStock")));
				l.setValoracion(new Valoracion(rs.getInt("Valoracion_idValoracion")));

				return l;
			}
		} catch (SQLException se) {
			throw new DAOException("Error finding employee in DAO", se);
		}
	}

	@Override
	/**
	* Reads all registers from libro table.
	* @return An ArrayList of Libro objects whose fields match the contents of the records that were read.
	* @throws DAOException If there is a mistake writing the SQL code.
	*/
	public List<Libro> readAll() throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "SELECT *"
					+ " FROM libro";
			ResultSet rs = stmt.executeQuery(query);
			List<Libro> lista = new ArrayList<>();
			while (rs.next()) {
				Libro l = new Libro();
				l.setAutor(rs.getString("autor"));
				l.setCategoria(new Categoria(rs.getInt("Categoria_idCategoria")));
				l.setDescatalogado(rs.getBoolean("descatalogado"));
				l.setEdicion(new Edicion(rs.getInt("Edicion_idEdicion")));
				l.setIdLibro(rs.getInt("idLibro"));
				l.setIdPublicacion(rs.getInt("Publicacion_idPublicacion"));
				l.setIsbn(rs.getInt("ISBN"));
				l.setNombre(rs.getString("nombre"));
				l.setSinopsis(rs.getString("sinopsis"));
				l.setStock(new Stock(rs.getInt("Stock_idStock")));
				l.setValoracion(new Valoracion(rs.getInt("Valoracion_idValoracion")));

				lista.add(l);
			}
			return lista;
		} catch (SQLException se) {
			throw new DAOException("Error finding libro in DAO", se);
		}
	}

	@Override
	/**
	* Updates some columns from libro table whose idLibro column contents match the iDLibro field
	* from the in parameter.
	* @param lib The Libro class object to be updated.
	* @throws DAOException If the iDLibro field from the in parameter doesn't match
	* with an existing record idLibro column contents.
	*/

	public void update(Libro t) throws DAOException {
		Libro lib = (Libro) t;
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "UPDATE libro " + "SET ISBN = " + lib.getIsbn() + ", " + "nombre = '" + lib.getNombre()
					+ "', " + "autor = '" + lib.getAutor() + "', " + "sinopsis = '" + lib.getSinopsis() + "' "
					+ "WHERE idLibro = " + lib.getIdLibro();
			// Si hace el cambio en mas de una fila devuelve error
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error updating libro");
			}
		} catch (SQLException se) {
			throw new DAOException("Error updating libro en DAO", se);
		}

	}

	@Override
	/**
	* Updates descatalogado column from libro table whose idLibro column contents match
	* the iDLibro field from the in parameter.
	* @param lib The Libro class object to be updated.
	* @throws DAOException If the iDLibro field from the in parameter doesn't match
	* with an existing record idLibro column contents.
	*/

	public void delete(Libro t) throws DAOException {
		// TODO Auto-generated method stub
		Libro lib = (Libro) t;
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "UPDATE libro " + "SET DESCATALOGADO = " + lib.isDescatalogado()
					+ " WHERE idLibro=" + lib.getIdLibro();
			// Si hace el cambio en mas de una fila devuelve error
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error updating libro");
			}
		} catch (SQLException se) {
			throw new DAOException("Error updating libro en DAO", se);
		}

	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
