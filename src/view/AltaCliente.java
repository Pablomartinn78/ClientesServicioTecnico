package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import controlador.Sistema;


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
public class AltaCliente extends javax.swing.JFrame 
{
	
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField nombre;
	private JButton limpiar;
	private JButton ok;
	private JTextField dni;
	private JTextField telefono;
	private JTextField domicilio;
	private JLabel jLabel1;

	private static final long serialVersionUID = 1L;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AltaCliente inst = new AltaCliente();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				
			}
		});
	}
	
	public AltaCliente() {
		super();
		initGUI();
	}
	public AltaCliente(MenuPrincipal mnu) {
		super();
		initGUI();
		mnu.dispose();
	}
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Alta Cliente");

			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Nombre :");
				jLabel1.setBounds(21, 40, 64, 14);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Domicilio :");
				jLabel2.setBounds(21, 79, 64, 14);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Telefono :");
				jLabel3.setBounds(21, 112, 64, 14);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("DNI :");
				jLabel4.setBounds(21, 147, 64, 14);
			}
			{
				nombre = new JTextField();
				getContentPane().add(nombre);
				nombre.setBounds(97, 33, 219, 21);
			}
			{
				domicilio = new JTextField();
				getContentPane().add(domicilio);
				domicilio.setBounds(97, 72, 219, 21);
			}
			{
				telefono = new JTextField();
				getContentPane().add(telefono);
				telefono.setBounds(97, 105, 219, 21);
			}
			{
				dni = new JTextField();
				getContentPane().add(dni);
				dni.setBounds(97, 144, 219, 21);
			}
			{
				ok = new JButton();
				getContentPane().add(ok);
				ok.setText("Aceptar");
				ok.setBounds(120, 223, 105, 21);
				ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) 
					{
						Sistema.getInstancia().altaCliente(nombre.getText(), domicilio.getText(), telefono.getText(), dni.getText());
						limpiarPantalla();
					}
				});
			}
			{
				limpiar = new JButton();
				getContentPane().add(limpiar);
				limpiar.setText("Limpiar");
				limpiar.setBounds(243, 223, 114, 21);
				limpiar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt)
					{
						limpiarPantalla();
					}
				});
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		private void limpiarPantalla()
		{
			nombre.setText("");
			domicilio.setText("");
			telefono.setText("");
			dni.setText("");
		}
	

}
