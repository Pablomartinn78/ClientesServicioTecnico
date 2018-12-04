package controlador;

import java.util.Vector;

import Entidades.Cliente;
import Entidades.ClienteView;

public class Sistema 
{
	private Vector <Cliente> clientes;
	private static Sistema instancia;
	
	public static Sistema getInstancia()
	{
		if (instancia== null)
			instancia = new Sistema();
		return instancia;
	}
	
	private Sistema()
	{
		clientes = new Vector <Cliente>();
	}
	public void altaCliente(String n, String d, String t, String doc)
	{
		clientes.add(new Cliente(n,d,t,doc));
	}
	
	public void modificarNombre(String n, String dni)
	{
		Cliente c = buscarCliente(dni);
		c.setNombre(n);
	}
	public void modificarDomicilio(String d, String dni)
	{
		Cliente c = buscarCliente(dni);
		c.setDomicilio(d);
	}
	public void modificarTelefono(String t, String dni)
	{
		Cliente c = buscarCliente(dni);
		c.setTelefono(t);
	}
	public Cliente buscarCliente(String dni)
	{
		Cliente c= new Cliente();
		boolean existe = false;
		int i=0;
		while (!existe && i<clientes.size())
		{
			c = clientes.elementAt(i);
			if (c.getDni().equalsIgnoreCase(dni))
			{
				existe = true;
				return c;
			}
			i++;
		}
		Cliente c1 = Cliente.buscarCliente(dni);
		if (c1!=null)
			clientes.add(c1);
		return  c1;
	}
	
	public void eliminarCliente (String dni)
	{
		Cliente c = buscarCliente(dni);
		clientes.remove(c);
		c.delete();
	}
	
	public ClienteView getCliente(String dni)
	{
		Cliente c = buscarCliente(dni);
		if (c!=null)
			return c.getView();
		else
			return null;
		
	}

}
