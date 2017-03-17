package com.lucatic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lucatic.bean.Categoria;
import com.lucatic.dao.conector.DataSourceDB;

public class DAOCategoriaImp implements DAO<Categoria>{
	
	
	private DataSourceDB con = new DataSourceDB();
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Categoria t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categoria read(Categoria t) throws DAOException {
		 try (Statement stmt = con.getConector().createStatement()) {
	            String query = "SELECT * FROM Categoria WHERE idCategoria=" + t.getIdCategoria();
	            ResultSet rs = stmt.executeQuery(query);
	            if (!rs.next()) {
	                return null;
	            }
	           Categoria c = new Categoria(rs.getInt("idCategoria"), rs.getString("descripcion"));
	           
	            return c;
	            
	        } catch (SQLException se) {
	            //se.printStackTrace();
	            throw new DAOException("Error al buscar categoria en el DAO", se);
	        }
	}

	@Override
	public List<Categoria> readAll() throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM categoria";
            ResultSet rs = stmt.executeQuery(query);
            
           
            ArrayList<Categoria> categorias = new ArrayList<>();
            
            
            while (rs.next()) {
            	Categoria c = new Categoria(rs.getInt("idCategoria"), rs.getString("descripcion"));
                categorias.add(c);
            }
            return categorias;
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al obtener todas las categorias en el DAO: " + se.getMessage(), se);
        }
	}

	@Override
	public void update(Categoria t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Categoria t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

}
