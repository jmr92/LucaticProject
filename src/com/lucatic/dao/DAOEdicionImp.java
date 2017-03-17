package com.lucatic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.lucatic.bean.Edicion;
import com.lucatic.bean.Editorial;
import com.lucatic.dao.conector.DataSourceDB;

public class DAOEdicionImp implements DAO<Edicion>{
	private DataSourceDB con = new DataSourceDB();
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Edicion t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Edicion read(Edicion t) throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM Edicion WHERE idEdicion=" + t.getIdEdicion();
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                return null;
            }
            Edicion e = new Edicion();
                        
            e.setEditorial(new Editorial(rs.getInt("Editorial_idEditorial")));
            e.setFechaPublicacion(rs.getDate("FechaPublicacion"));
            e.setFoto(rs.getString("Foto"));
            e.setIdEdicion(rs.getInt("idEdicion"));
            e.setNumeroEdicion(rs.getInt("numeroEdicion"));
            e.setPrecioSinIva(rs.getDouble("PrecioSinIva"));
                           
            return e;
            
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al buscar empleado en el DAO", se);
        }
	}

	@Override
	public List<Edicion> readAll() throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM edicion";
            ResultSet rs = stmt.executeQuery(query);
            
           
            ArrayList<Edicion> ediciones = new ArrayList<>();
            
            
            while (rs.next()) {
            	
            	Edicion e = new Edicion();
                
                e.setEditorial(new Editorial(rs.getInt("Editorial_idEditorial")));
                e.setFechaPublicacion(rs.getDate("FechaPublicacion"));
                e.setFoto(rs.getString("Foto"));
                e.setIdEdicion(rs.getInt("idEdicion"));
                e.setNumeroEdicion(rs.getInt("numeroEdicion"));
                e.setPrecioSinIva(rs.getDouble("PrecioSinIva"));
            	
                ediciones.add(e);
            }
            return ediciones;
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al obtener todas las categorias en el DAO: " + se.getMessage(), se);
        }
	}

	@Override
	public void update(Edicion t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Edicion t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

}
