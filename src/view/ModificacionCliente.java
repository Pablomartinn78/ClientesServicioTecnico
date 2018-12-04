package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import Entidades.ClienteView;
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
public class ModificacionCliente extends javax.swing.JFrame {

	private ClienteView c;
	private static final long serialVersionUID = 1L;
	private JPanel jPanel1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField nombre;
	private JButton limpiar;
	private JButton ok;
	private JTextField telefono;
	private JTextField domicilio;
	private JLabel jLabel2;
	private JButton buscar;
	private JTextField dni;
	private JLabel jLabel1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ModificacionCliente inst = new ModificacionCliente();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ModificacionCliente() {
		super();
		initGUI();
	}
	public ModificacionCliente(MenuPrincipal mnu) {
		super();
		initGUI();
		mnu.dispose();
	}
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Modificar Cliente");
			
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("DNI :");
				jLabel1.setBounds(12, 12, 25, 14);
			}
			{
				dni = new JTextField();
				getContentPane().add(dni);
				dni.setBounds(55, 9, 155, 21);
			}
			{
				buscar = new JButton();
				getContentPane().add(buscar);
				buscar.setText("Buscar");
				buscar.setBounds(280, 9, 95, 21);
				buscar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) 
					{
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
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setLayout(null);
				jPanel1.setBounds(12, 42, 368, 205);
				jPanel1.setVisible(false);
				{
					jLabel2 = new JLabel();
					jPanel1.add(jLabel2);
					jLabel2.setText("Nombre : ");
					jLabel2.setBounds(21, 19, 60, 14);
				}
				{
					jLabel3 = new JLabel();
					jPanel1.add(jLabel3);
					jLabel3.setText("Domicilio :");
					jLabel3.setBounds(21, 52, 60, 14);
				}
				{
					jLabel4 = new JLabel();
					jPanel1.add(jLabel4);
					jLabel4.setText("Telefono :");
					jLabel4.setBounds(21, 93, 60, 14);
				}
				{
					nombre = new JTextField();
					jPanel1.add(nombre);
					nombre.setBounds(106, 16, 178, 21);
				}
				{
					domicilio = new JTextField();
					jPanel1.add(domicilio);
					domicilio.setBounds(106, 49, 178, 21);
				}
				{
					telefono = new JTextField();
					jPanel1.add(telefono);
					telefono.setBounds(106, 82, 178, 21);
				}
				{
					ok = new JButton();
					jPanel1.add(ok);
					ok.setText("Aceptar");
					ok.setBounds(173, 163, 81, 21);
					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) 
						{
							if (!nombre.getText().equalsIgnoreCase(c.getNombre()))
								Sistema.getInstancia().modificarNombre(nombre.getText(), dni.getText());
							if (!domicilio.getText().equalsIgnoreCase(c.getDomicilio()))
								Sistema.getInstancia().modificarDomicilio(domicilio.getText(), dni.getText());
							if (!telefono.getText().equalsIgnoreCase(c.getNombre()))
								Sistema.getInstancia().modificarTelefono(telefono.getText(), dni.getText());
							limpiarPantalla();
							jPanel1.setVisible(false);
						}
					});
				}
				{
					limpiar = new JButton();
					jPanel1.add(limpiar);
					limpiar.setText("Limpiar");
					limpiar.setBounds(279, 163, 78, 21);
					limpiar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) 
						{
							limpiarPantalla();
							jPanel1.setVisible(false);
						}
					});
				}
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
