package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Entidades.Cliente;


public class AdministradorPersistenciaCliente 
{
	private static AdministradorPersistenciaCliente pool;
	
	
	private AdministradorPersistenciaCliente()
	{
		
	}
	public static AdministradorPersistenciaCliente getInstancia()
	{
		if (pool== null)
			pool =new AdministradorPersistenciaCliente();
		return pool;
	}
	
	public void insert(Cliente c)
	{
		//Obtener conexion BD 
		Connection con = PoolConnection.getPoolConnection().getConnection();
		
		//Generar sentencia SQL
		try
		{
			//Preparar sentencia insert en tabla destino
			String senten = "INSERT INTO TablaCliente (dni, nombre, domicilio, telefono) VALUES (?,?,?,?)" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			ps.setString(1,c.getDni());
			ps.setString(2,c.getNombre());
			ps.setString(3,c.getDomicilio());
			ps.setString(4,c.getTelefono());
			
			ps.execute();
			
			PoolConnection.getPoolConnection().realeaseConnection(con);
			
		}
	      catch( SQLException e ) 
	      {
				System.out.println("Mensaje Error al Insertar Cliente: " + e.getMessage());
				System.out.println("Stack Trace al Insertar Cliente: " + e.getStackTrace());
				PoolConnection.getPoolConnection().realeaseConnection(con);
	      }
	      
	}
	public void update(Cliente c)
	{
		//Obtener conexion BD 
		Connection con = PoolConnection.getPoolConnection().getConnection();
		
		//Generar sentencia SQL
		try
		{
			//Preparar sentencia insert en tabla destino
			String senten = "UPDATE TablaCliente set nombre = ? ,domicilio = ? ,telefono = ? where dni = ?" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			ps.setString(1,c.getNombre());
			ps.setString(2,c.getDomicilio());
			ps.setString(3,c.getTelefono());
			ps.setString(4,c.getDni());
			ps.execute();
			
			PoolConnection.getPoolConnection().realeaseConnection(con);
			
		}
	      catch( SQLException e ) 
	      {
				System.out.println("Mensaje Error al Modificar Cliente: " + e.getMessage());
				System.out.println("Stack Trace al Modificar Cliente: " + e.getStackTrace());
				PoolConnection.getPoolConnection().realeaseConnection(con);
	      }
	      
		
	}
	public void delete (Cliente c)
	{
		//Obtener conexion BD 
		Connection con = PoolConnection.getPoolConnection().getConnection();
		
		//Generar sentencia SQL
		try
		{
			//Preparar sentencia insert en tabla destino
			String senten = "DELETE from TablaCliente where dni = ?" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			ps.setString(1,c.getDni());
			ps.execute();
			
			PoolConnection.getPoolConnection().realeaseConnection(con);
			
		}
	      catch( SQLException e ) 
	      {
				System.out.println("Mensaje Error al Borrar Cliente: " + e.getMessage());
				System.out.println("Stack Trace al Borrar Cliente: " + e.getStackTrace());
				PoolConnection.getPoolConnection().realeaseConnection(con);
	      }
	      

	}
	public Cliente buscarCliente(String dni)
	{
		Cliente c = null;
		//Obtener conexion BD 
		Connection con = PoolConnection.getPoolConnection().getConnection();
		
		//Generar sentencia SQL
		try
		{
			//Preparar sentencia insert en tabla destino
			String senten = "SELECT nombre,domicilio,telefono,dni from TablaCliente where dni = ?" ;
			PreparedStatement ps = null;
			ps = con.prepareStatement(senten);
			ps.setString(1,dni);
			ResultSet result = ps.executeQuery();
			while (result.next())
			{
				c = new Cliente();
				c.setNombre(result.getString("nombre"));
				c.setDomicilio(result.getString("domicilio"));
				c.setTelefono(result.getString("telefono"));
				c.setDni(result.getString("dni"));
				
			}
			
			PoolConnection.getPoolConnection().realeaseConnection(con);
			return c;
		}
	      catch( SQLException e ) 
	      {
				System.out.println("Mensaje Error al Borrar Cliente: " + e.getMessage());
				System.out.println("Stack Trace al Borrar Cliente: " + e.getStackTrace());
				PoolConnection.getPoolConnection().realeaseConnection(con);
	      }
	      return c;
	}
	
}
