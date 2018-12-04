package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class MenuPrincipal extends javax.swing.JFrame {

	
	private static final long serialVersionUID = 1L;
	private JMenuBar jMenuBar1;
	private JMenuItem jMenuItem4;
	private JMenu jMenu3;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem2;
	private JMenuItem jMenuItem1;
	private JMenu jMenu2;

	
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MenuPrincipal inst = new MenuPrincipal();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MenuPrincipal() {
		super();
		initGUI();
	}
	
	private void initGUI() 
	{
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Menu Principal ");
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) 
				  {
				     System.exit(0);
				  }
			});

			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
						jMenu2 = new JMenu();
						jMenuBar1.add(jMenu2);
						jMenu2.setText("Clientes");
					{
						jMenuItem1 = new JMenuItem();
						jMenu2.add(jMenuItem1);
						jMenuItem1.setText("Alta Cliente");
						jMenuItem1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) 
							{
								AltaCliente app = new AltaCliente();
								app.setVisible(true);
								
							}
						});
					}
					{
						jMenuItem2 = new JMenuItem();
						jMenu2.add(jMenuItem2);
						jMenuItem2.setText("Modificar Cliente");
						jMenuItem2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) 
							{
								ModificacionCliente app = new ModificacionCliente();
								app.setVisible(true);}
						});
					}
					{
						jMenuItem3 = new JMenuItem();
						jMenu2.add(jMenuItem3);
						jMenuItem3.setText("Baja Cliente");
						jMenuItem3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) 
							{
								BajaCliente app = new BajaCliente();
								app.setVisible(true);}
						});
					}
				}
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("Salir");
					{
						jMenuItem4 = new JMenuItem();
						jMenu3.add(jMenuItem4);
						jMenuItem4.setText("Salir del Sistema");
						jMenuItem4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) 
							{
									System.exit(0);
							}
						});
					}
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
