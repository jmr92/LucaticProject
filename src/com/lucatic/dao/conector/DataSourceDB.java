package com.lucatic.dao.conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourceDB {
	private Connection connection;
	public DataSourceDB(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String servidor = "jdbc:mysql://localhost:3306/libreria";
	        String usuarioDB="root";
	        String passwordDB="1111";
	        connection = DriverManager.getConnection(servidor,usuarioDB,passwordDB);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConector(){
		return connection;
	}
}
