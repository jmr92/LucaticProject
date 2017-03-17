package com.lucatic.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lucatic.bean.Cliente;
import com.lucatic.bean.Direccion;
import com.lucatic.dao.conector.DataSourceDB;

public class DAOClienteImp implements DAO<Cliente>{
	private DataSourceDB con = new DataSourceDB();
	
	
	/**
	*  Añade un cliente nuevo en la tabla cliente de la base de datos de libreria, mediante un comando INSERT.
	*  Se introducen los parametros de IDCliente, Nombre, Apellidos, email, Telefono, Contraseña y baja.
	*/
	@Override
	public void create(Cliente t) throws DAOException{
		Cliente cliente = (Cliente)t;
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "INSERT INTO cliente(NOMBRE, APELLIDOS, EMAIL, TELEFONO, CONTRASENA, BAJA, DIRECCION_IDDIRECCION) VALUES (" 
                    + "'" + cliente.getNombre() + "'," + "'" +cliente.getApellidos() + "'," + "'"
                    + cliente.getEmail() + "'," + cliente.getTelefono() + "," + "'"  + cliente.getContraseña() 
                    + "'," + cliente.isBaja() + ","+cliente.getDireccion().getIdDireccion()+ ")";
            if (stmt.executeUpdate(query) != 1) {
                throw new DAOException("Error al añadir el cliente");
            }
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al añadir al cliente en el DAO", se);
        }
		
	}

	@Override
	/**
     *  Lee los datos de un cliente en la tabla cliente de la base de datos de libreria, mediante un comando SELECT,
     *  cuando coincida la IDCliente introducida con la IDCliente a leer.
     */
	public Cliente read(Cliente t)throws DAOException {
		Cliente cliente = (Cliente)t;
		 try (Statement stmt = con.getConector().createStatement()) {
	            String query = "SELECT * FROM Cliente WHERE IDCliente=" + cliente.getIdCliente();
	            ResultSet rs = stmt.executeQuery(query);
	            if (!rs.next()) {
	                return null;
	            }
	            Cliente c = new Cliente();
	            c.setApellidos(rs.getString("Apellidos"));
	            c.setBaja(rs.getBoolean("baja"));
	            c.setContraseña(rs.getString("Contrasena"));
	            c.setDireccion(new Direccion());
	            c.setEmail(rs.getString("email"));
	            c.setIdCliente(rs.getInt("IDCliente"));
	            c.setNombre(rs.getString("Nombre"));
	            c.setTelefono(rs.getInt("Telefono"));
	            return c;
	            
	        } catch (SQLException se) {
	            //se.printStackTrace();
	            throw new DAOException("Error al buscar empleado en el DAO", se);
	        }
	}

	@Override
	public List<Cliente> readAll()throws DAOException {
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "SELECT * FROM cliente";
            ResultSet rs = stmt.executeQuery(query);
            
           
            ArrayList<Cliente> clientes = new ArrayList<>();
            
            
            while (rs.next()) {
            	Cliente c = new Cliente();
	            c.setApellidos(rs.getString("Apellidos"));
	            c.setBaja(rs.getBoolean("baja"));
	            c.setContraseña(rs.getString("Contrasena"));
	            c.setDireccion(new Direccion());
	            c.setEmail(rs.getString("email"));
	            c.setIdCliente(rs.getInt("IDCliente"));
	            c.setNombre(rs.getString("Nombre"));
	            c.setTelefono(rs.getInt("Telefono"));
                clientes.add(c);
            }
            return clientes;
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al obtener todos los clientes en el DAO: " + se.getMessage(), se);
        }
	}

	@Override
	 /**
     *  Modifica los datos de un cliente en la tabla cliente de la base de datos de libreria, mediante un comando UPDATE,
     *  cuando coincida la IDCliente introducida con la IDCliente a modificar.
     *  Se pueden modificar parametros de Nombre, Apellidos, email, Telefono, Contraseña y baja.
     */
	public void update(Cliente t) throws DAOException{
		Cliente cliente = (Cliente)t;
		try (Statement stmt = con.getConector().createStatement()) {
            String query = "UPDATE cliente "
                    + "SET Nombre='" + cliente.getNombre() + "',"
                    + "Apellidos='" + cliente.getApellidos() + "',"
                    + "email='" + cliente.getEmail() + "',"
                    + "Telefono=" + cliente.getTelefono() + ","
                    + "Contrasena='" + cliente.getContraseña() + "',"
                    + "baja=" + cliente.isBaja()        
                    + " WHERE IDCliente=" + cliente.getIdCliente();
            if (stmt.executeUpdate(query) != 1) {
                throw new DAOException("Error al actualizar cliente");
            }
        } catch (SQLException se) {
            throw new DAOException("Error al actualizar el cliente en el DAO", se);
        }
	}

	@Override
	/**
     *  Borra los datos de un cliente en la tabla cliente de la base de datos de libreria, mediante un comando DELETE,
     *  cuando coincida la IDCliente introducida con la IDCliente a borrar.
     */
	public void delete(Cliente t)throws DAOException {
		Cliente cliente = (Cliente)t;
		Cliente c = (Cliente) read(cliente);
        if (c == null) {
            throw new DAOException("Cliente id: " + cliente.getIdCliente() + " no existe para borrar.");
        }
        try (Statement stmt = con.getConector().createStatement()) {
            String query = "DELETE FROM Cliente WHERE IDCliente=" + cliente.getIdCliente();
            if (stmt.executeUpdate(query) != 1) {
                throw new DAOException("Error al borrar el cliente");
            }
        } catch (SQLException se) {
            //se.printStackTrace();
            throw new DAOException("Error al borrar el cliente en el DAO", se);
        }
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
