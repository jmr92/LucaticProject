package com.lucatic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lucatic.bean.Cliente;
import com.lucatic.bean.Compra;
import com.lucatic.bean.DetalleCompra;
import com.lucatic.bean.MetodoPago;
import com.lucatic.dao.conector.DataSourceDB;


/**
 * A class that implements the basic CRUD methods for the purchases table in the database.
 */
public class DAOCompraImp implements DAO<Compra> {
	private DataSourceDB con = new DataSourceDB();

	/**
     * Inserts a new register in purchases table.
     * @param comp The Compra class object to be inserted.
     * @throws DAOException If the metodoPago_idMetodoPago field or the cliente_IDCliente field from the in parameter
     *         don't match with an existing record idmetodoPago or idcliente column record contents from the MetodoPago
     *         and the Cliente tables respectively.
     */
	@Override
	public void create(Compra t) throws DAOException {
		Compra comp = (Compra) t;
		// TODO Auto-generated method stub
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "INSERT INTO COMPRA (METODOPAGO_IDMETODOPAGO, CLIENTE_IDCLIENTE, PRECIOTOTAL) VALUES ("
					+ comp.getMetodoPago().getIdMetodoPago() + ","
					+ comp.getCliente().getIdCliente() + "," + comp.getPrecioTotal() + ")";
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error añadiendo compra");
			}
		} catch (SQLException se) {
			// se.printStackTrace();
			throw new DAOException("Error añadiendo compra en DAO", se);
		}
	}

	@Override
	/**
	* Reads the register from purchases table whose idcompra column contents match the iDCompra field from the in parameter.
	* @param comp A Compra class object. All its fields can be null except for iDCompra.
	* @return A Compra object whose fields match the contents of the record that was read.
	* @throws DAOException If the iDCompra field from the in parameter doesn't match with an existing record idcompra column contents.
	*/
	public Compra read(Compra t) throws DAOException {
		Compra comp = (Compra) t;
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "SELECT * FROM COMPRA WHERE IDCOMPRA=" + comp.getIdCompra();
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				return null;
			}
			
			return new Compra(rs.getInt("IDCOMPRA"),new Date(rs.getTimestamp("FECHACOMPRA").getTime()),
					rs.getDouble("PRECIOTOTAL"),new ArrayList<DetalleCompra>(),new Cliente(rs.getInt("CLIENTE_IDCLIENTE")),new MetodoPago(rs.getInt("MetodoPago_idMetodoPago")));
		} catch (SQLException se) {
			// se.printStackTrace();
			throw new DAOException("Error encontrando compra en DAO", se);
		}
	}

	@Override
	/**
	* Reads all the registers from the purchases table.
	* @return An ArrayList of Compra objects whose fields match the contents of the table records.
	* @throws DAOException If an error occurs in the database.
	*/

	public List<Compra> readAll() throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "SELECT * FROM COMPRA";
			ResultSet rs = stmt.executeQuery(query);
			// Creacion de un ArrayList para guardar los resultados
			List<Compra> comps = new ArrayList<>();
			// Itera el ArrayList anterior y crea objetos de tipo Compra
			while (rs.next()) {
				Compra c = new Compra();
				c.setCliente(new Cliente(rs.getInt("CLIENTE_IDCLIENTE")));
				c.setFechaCompra(new Date(rs.getTimestamp("FECHACOMPRA").getTime()));
				c.setIdCompra(rs.getInt("IDCOMPRA"));
				c.setListaDetalleCompra(new ArrayList<DetalleCompra>());
				c.setMetodoPago(new MetodoPago(rs.getInt("MetodoPago_idMetodoPago")));
				c.setPrecioTotal(rs.getDouble("PRECIOTOTAL"));
				comps.add(c);
			}
			return (ArrayList<Compra>) comps;
		} catch (SQLException se) {
			// se.printStackTrace();
			throw new DAOException("Error getting all employees in DAO: " + se.getMessage(), se);
		}
	}

	/**
	* Updates the register from purchases table whose idcompra column contents match the iDCompra field from the in parameter.
	* @param comp The Compra class object to be updated.
	* @throws DAOException If the iDCompra field from the in parameter doesn't match with an existing record idcompra column contents.
	*/

	@Override
	public void update(Compra t) throws DAOException {
		// TODO Auto-generated method stub
		Compra comp = (Compra) t;
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "UPDATE COMPRA " + "SET METODOPAGO_IDMETODOPAGO=" + comp.getMetodoPago().getIdMetodoPago()
					+ "," + "CLIENTE_IDCLIENTE=" + comp.getCliente().getIdCliente() + "," + "PRECIOTOTAL="
					+ comp.getPrecioTotal() + " WHERE IDCOMPRA=" + comp.getIdCompra() + ";";
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error updating employee");
			}
		} catch (SQLException se) {
			throw new DAOException("Error updating employee in DAO", se);
		}

	}

	@Override
	/**
	* Deletes the register from purchases table whose idcompra column contents match the iDCompra field from the in parameter.
	* @param in A Compra class object. All its fields can be null except for iDCompra.
	* @throws DAOException If the iDCompra field from the in parameter doesn't match with an existing record idcompra column contents.
	*/

	public void delete(Compra t) throws DAOException {
		Compra c = (Compra) t;
		Compra comp = (Compra) read(c);
		if (comp == null) {
			throw new DAOException("La compra con ID: " + c.getIdCompra() + " no existe para ser borrada.");
		}
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "DELETE FROM COMPRA WHERE IDCOMPRA=" + c.getIdCompra();
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error borrando la compra");
			}
		} catch (SQLException se) {
			// se.printStackTrace();
			throw new DAOException("Error borrando la compra en DAO", se);
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
