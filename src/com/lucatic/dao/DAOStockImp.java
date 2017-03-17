package com.lucatic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.lucatic.bean.Stock;
import com.lucatic.dao.conector.DataSourceDB;

public class DAOStockImp implements DAO<Stock>{
	private DataSourceDB con = new DataSourceDB();
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Stock t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Stock read(Stock t) throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM Stock WHERE idStock=" + t.getIdStock();
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                return null;
            }
           Stock s = new Stock(rs.getInt("idStock"), rs.getInt("CantidadEjemplar"));
           
           return s;
            
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al buscar editorial en el DAO", se);
        }
	}

	@Override
	public List<Stock> readAll() throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM Stock";
            ResultSet rs = stmt.executeQuery(query);
            
            ArrayList<Stock> stocks = new ArrayList<>();
                        
            while (rs.next()) {
            	 Stock s = new Stock(rs.getInt("idStock"), rs.getInt("CantidadEjemplar"));
            	stocks.add(s);
            }
            return stocks;
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al obtener todas las editoriales en el DAO: " + se.getMessage(), se);
        }
	}

	@Override
	public void update(Stock t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Stock t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

}
