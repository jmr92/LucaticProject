package com.lucatic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.lucatic.bean.Compra;
import com.lucatic.bean.DetalleCompra;
import com.lucatic.bean.Iva;
import com.lucatic.bean.Publicacion;
import com.lucatic.dao.conector.DataSourceDB;

public class DAODetalleCompraImp implements DAO<DetalleCompra>{
	private DataSourceDB con = new DataSourceDB();
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(DetalleCompra t) throws DAOException {
		// TODO Auto-generated method stub
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "INSERT INTO DETALLECOMPRA (Publicacion_idPublicacion, Compra_IDCompra, IVA_idIVA, CantidadComprada, Descuento) "
					+ "VALUES (" + t.getPublicacion().getIdPublicacion()+","+ 
					t.getCompra().getIdCompra() + "," +t.getIva().getIdIva() +","+ t.getCantidadComprada() + ","+ t.getDescuento() + ")";
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error añadiendo detalle compra");
			}
		} catch (SQLException se) {
			// se.printStackTrace();
			throw new DAOException("Error añadiendo detalle compra en DAO", se);
		}
		
	}

	@Override
	public DetalleCompra read(DetalleCompra t) throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "SELECT * FROM DETALLECOMPRA WHERE IDDETALLECOMPRA=" + t.getIdDetalleCompra();
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				return null;
			}
			
			return new DetalleCompra(rs.getInt("idDetalleCompra"), rs.getInt("CantidadComprada"), rs.getDouble("descuento"), new Compra(rs.getInt("Compra_IDCompra")), new Publicacion(rs.getInt("Publicacion_idPublicacion")), new Iva(rs.getInt("IVA_idIVA")));
		} catch (SQLException se) {
			// se.printStackTrace();
			throw new DAOException("Error encontrando detalle compra en DAO", se);
		}
	}

	@Override
	public List<DetalleCompra> readAll() throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "SELECT * FROM DETALLECOMPRA";
			ResultSet rs = stmt.executeQuery(query);
			// Creacion de un ArrayList para guardar los resultados
			List<DetalleCompra> detallesCompra = new ArrayList<>();
			// Itera el ArrayList anterior y crea objetos de tipo Compra
			while (rs.next()) {
				DetalleCompra dc = new DetalleCompra(rs.getInt("idDetalleCompra"), rs.getInt("CantidadComprada"), rs.getDouble("descuento"), new Compra(rs.getInt("Compra_IDCompra")), new Publicacion(rs.getInt("Publicacion_idPublicacion")), new Iva(rs.getInt("IVA_idIVA")));
				detallesCompra.add(dc);
			}
			return detallesCompra;
		} catch (SQLException se) {
			// se.printStackTrace();
			throw new DAOException("Error encontrado detalle compra DAO: " + se.getMessage(), se);
		}
	}

	@Override
	public void update(DetalleCompra t) throws DAOException {
		// TODO Auto-generated method stub
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "UPDATE DETALLECOMPRA " + "SET Publicacion_idPublicacion=" + t.getPublicacion().getIdPublicacion()
					+ "," + "Compra_IDCompra=" + t.getCompra().getIdCompra() + "," + "IVA_idIVA="
					+ t.getIva().getIdIva()+"," + "CantidadComprada="+t.getCantidadComprada()+","+"Descuento="+t.getDescuento() + " WHERE idDetalleCompra=" + t.getIdDetalleCompra() + ";";
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error updating detalle compra");
			}
		} catch (SQLException se) {
			throw new DAOException("Error updating detalle compra in DAO", se);
		}
		
	}

	@Override
	public void delete(DetalleCompra t) throws DAOException {
		// TODO Auto-generated method stub
		DetalleCompra dc = read(t);
		if (dc == null) {
			throw new DAOException("La detalle compra con ID: " + t.getIdDetalleCompra() + " no existe para ser borrada.");
		}
		try (Statement stmt = con.getConector().createStatement()) {
			String query = "DELETE FROM DETALLECOMPRA WHERE idDetalleCompra=" + t.getIdDetalleCompra();
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error borrando la detalle compra");
			}
		} catch (SQLException se) {
			// se.printStackTrace();
			throw new DAOException("Error borrando la detalle compra en DAO", se);
		}
	}

}
