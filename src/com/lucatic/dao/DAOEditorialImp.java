package com.lucatic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.lucatic.bean.Editorial;
import com.lucatic.dao.conector.DataSourceDB;

public class DAOEditorialImp implements DAO<Editorial>{
	private DataSourceDB con = new DataSourceDB();
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Editorial t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Editorial read(Editorial t) throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM Editorial WHERE idEditorial=" + t.getIdEditorial();
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                return null;
            }
           Editorial e = new Editorial(rs.getInt("idEditorial"), rs.getString("nombre"));
           
            return e;
            
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al buscar editorial en el DAO", se);
        }
	}

	@Override
	public List<Editorial> readAll() throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM Editorial";
            ResultSet rs = stmt.executeQuery(query);
            
            ArrayList<Editorial> editoriales = new ArrayList<>();
                        
            while (rs.next()) {
                Editorial e = new Editorial(rs.getInt("idEditorial"), rs.getString("nombre"));
            	editoriales.add(e);
            }
            return editoriales;
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al obtener todas las editoriales en el DAO: " + se.getMessage(), se);
        }
	}

	@Override
	public void update(Editorial t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Editorial t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

}
