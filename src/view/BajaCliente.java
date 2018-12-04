package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import controlador.Sistema;

import Entidades.ClienteView;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class BajaCliente extends javax.swing.JFrame {

	private ClienteView c;
	private static final long serialVersionUID = 1L;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel nombre;
	private JLabel telefono;
	private JLabel domicilio;
	private JPanel jPanel1;
	private JLabel jLabel1;
	private JTextField dni;
	private JButton buscar;
	private JButton ok;
	private JButton cancelar;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BajaCliente inst = new BajaCliente();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public BajaCliente() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				buscar = new JButton();
				getContentPane().add(buscar);
				buscar.setText("Buscar");
				buscar.setBounds(281, 9, 94, 21);
				buscar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						c = Sistema.getInstancia().getCliente(dni.getText());
						if (c!= null)
						{
							nombre.setText(c.getNombre());
							domicilio.setText(c.getDomicilio());
							telefono.setText(c.getTelefono());
							jPanel1.setVisible(true);
						}
					}
				});
			}
			{
				dni = new JTextField();
				getContentPane().add(dni);
				dni.setText("");
				dni.setBounds(54, 12, 155, 21);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("DNI :");
				jLabel1.setBounds(6, 15, 36, 14);
			}
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setLayout(null);
				jPanel1.setBounds(12, 52, 368, 202);
				jPanel1.setVisible(false);
				{
					jLabel4 = new JLabel();
					jPanel1.add(jLabel4);
					jLabel4.setText("Telefono :");
					jLabel4.setBounds(25, 122, 60, 14);
				}
				{
					jLabel3 = new JLabel();
					jPanel1.add(jLabel3);
					jLabel3.setText("Domicilio :");
					jLabel3.setBounds(25, 71, 60, 14);
				}
				{
					jLabel2 = new JLabel();
					jPanel1.add(jLabel2);
					jLabel2.setText("Nombre : ");
					jLabel2.setBounds(25, 31, 60, 14);
				}
				{
					ok = new JButton();
					jPanel1.add(ok);
					ok.setText("Aceptar");
					ok.setBounds(155, 170, 81, 21);
					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) 
						{
							Sistema.getInstancia().eliminarCliente(dni.getText());
							jPanel1.setVisible(false);
						}
					});
				}
				{
					cancelar = new JButton();
					jPanel1.add(cancelar);
					cancelar.setText("Cancelar");
					cancelar.setBounds(266, 170, 91, 21);
					cancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) 
						{
							jPanel1.setVisible(false);
						}
					});
				}
				{
					nombre = new JLabel();
					jPanel1.add(nombre);
					nombre.setBounds(103, 31, 199, 23);
				}
				{
					domicilio = new JLabel();
					jPanel1.add(domicilio);
					domicilio.setBounds(103, 73, 199, 23);
				}
				{
					telefono = new JLabel();
					jPanel1.add(telefono);
					telefono.setText("tel");
					telefono.setBounds(103, 115, 199, 23);
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
