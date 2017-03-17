package com.lucatic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.lucatic.bean.Valoracion;
import com.lucatic.dao.conector.DataSourceDB;

public class DAOValoracionImp implements DAO<Valoracion>{
	private DataSourceDB con = new DataSourceDB();
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Valoracion t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Valoracion read(Valoracion t) throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM Valoracion WHERE idValoracion=" + t.getIdValoracion();
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                return null;
            }
          Valoracion v = new Valoracion(rs.getInt("idValoracion"), rs.getDouble("Valoracion"));
           
           return v;
            
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al buscar editorial en el DAO", se);
        }
	}

	@Override
	public List<Valoracion> readAll() throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM Valoracion";
            ResultSet rs = stmt.executeQuery(query);
            
            ArrayList<Valoracion> valoraciones = new ArrayList<>();
                        
            while (rs.next()) {
            	Valoracion v = new Valoracion(rs.getInt("idValoracion"), rs.getDouble("Valoracion"));
                
            	valoraciones.add(v);
            }
            return valoraciones;
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al obtener todas las editoriales en el DAO: " + se.getMessage(), se);
        }
	}

	@Override
	public void update(Valoracion t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Valoracion t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

}
