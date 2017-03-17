package com.lucatic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.lucatic.bean.Iva;
import com.lucatic.dao.conector.DataSourceDB;

public class DAOIvaImp implements DAO<Iva>{
	private DataSourceDB con = new DataSourceDB();
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Iva t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iva read(Iva t) throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM IVA WHERE idIVA=" + t.getIdIva();
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                return null;
            }
           Iva i = new Iva(rs.getInt("idIVA"), rs.getDouble("valor"), new Date(rs.getTimestamp("fechaIVA").getTime()));
           
            return i;
            
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al buscar editorial en el DAO", se);
        }
	}

	@Override
	public List<Iva> readAll() throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM IVA";
            ResultSet rs = stmt.executeQuery(query);
            
            ArrayList<Iva> ivas = new ArrayList<>();
                        
            while (rs.next()) {
            	 Iva i = new Iva(rs.getInt("idIVA"), rs.getDouble("valor"), new Date(rs.getTimestamp("fechaIVA").getTime()));
            	ivas.add(i);
            }
            return ivas;
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al obtener todas las editoriales en el DAO: " + se.getMessage(), se);
        }
	}

	@Override
	public void update(Iva t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iva t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

}
