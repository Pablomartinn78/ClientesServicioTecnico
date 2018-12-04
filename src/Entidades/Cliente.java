package Entidades;

import dao.AdministradorPersistenciaCliente;

public class Cliente 
{
	private String nombre;
	private String domicilio;
	private String telefono;
	private String dni;
	
	public Cliente()
	{
		nombre = "";
		domicilio = "";
		telefono = "";
		dni = "";
	}
	public Cliente (String n, String d, String t, String doc)
	{
		nombre =n;
		domicilio = d;
		telefono = t;
		dni = doc;
		
		AdministradorPersistenciaCliente.getInstancia().insert(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
		AdministradorPersistenciaCliente.getInstancia().update(this);
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) 
	{
		this.domicilio = domicilio;
		AdministradorPersistenciaCliente.getInstancia().update(this);
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
		AdministradorPersistenciaCliente.getInstancia().update(this);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) 
	{
		this.dni = dni;
		AdministradorPersistenciaCliente.getInstancia().update(this);
	}
	
	public static Cliente buscarCliente(String c)
	{
		return AdministradorPersistenciaCliente.getInstancia().buscarCliente(c);
	}
	public void delete()
	{
		AdministradorPersistenciaCliente.getInstancia().delete(this);
	}
	public ClienteView getView() 
	{
		return new ClienteView(nombre,domicilio,telefono,dni);
	}
	

}
