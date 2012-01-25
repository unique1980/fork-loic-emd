package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Summary description for StandardWin
 *
 */
public class StandardWin extends JFrame
{
	private JLabel jLabel2;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JButton jButton1;
	private JPanel contentPane;
	private JTextField textField;
	// End of variables declaration


	public StandardWin()
	{
		super();
		getContentPane().setBackground(Color.ORANGE);
		initializeComponent();
		//
		// TODO: Add any constructor code after initializeComponent call
		//

		this.setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always regenerated
	 * by the Windows Form Designer. Otherwise, retrieving design might not work properly.
	 * Tip: If you must revise this method, please backup this GUI file for JFrameBuilder
	 * to retrieve your design properly in future, before revising this method.
	 */
	private void initializeComponent()
	{
		jLabel2 = new JLabel();
		jTextField1 = new JTextField();
		jTextField2 = new JTextField();
		jButton1 = new JButton();
		contentPane = (JPanel)this.getContentPane();
		//
		// jLabel2
		//
		jLabel2.setText("jLabel2");
		//
		// jTextField1
		//
		jTextField1.setText("IP");
		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField1_actionPerformed(e);
			}

		});
		//
		// jTextField2
		//
		jTextField2.setText("Threads");
		jTextField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField2_actionPerformed(e);
			}

		});
		//
		// jButton1
		//
		jButton1.setText("jButton1");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton1_actionPerformed(e);
			}

		});
		addComponent(contentPane, jLabel2, 16,38,60,18);
		addComponent(contentPane, jTextField1, 84,35,221,22);
		addComponent(contentPane, jTextField2, 84,64,80,22);
		addComponent(contentPane, jButton1, 306,170,83,28);
		getContentPane().setLayout(null);
		
		JComboBox protocol = new JComboBox();
		protocol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		protocol.setBounds(396, 368, 68, 22);
		protocol.setBackground(new Color(255, 255, 255));
		protocol.setModel(new DefaultComboBoxModel(new String[] {"HTTP", "TCP", "UDP"}));
		protocol.setSelectedIndex(0);
		getContentPane().add(protocol);
		
		JButton btnZentaaar = new JButton("ZENTARISATION");
		btnZentaaar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnZentaaar.setFont(new Font("Lucida Console", Font.BOLD, 17));
		btnZentaaar.setBounds(362, 407, 187, 45);
		getContentPane().add(btnZentaaar);
		
		JLabel lblProtocol = new JLabel("Protocol");
		lblProtocol.setBackground(Color.PINK);
		lblProtocol.setForeground(Color.DARK_GRAY);
		lblProtocol.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProtocol.setBounds(329, 368, 74, 22);
		getContentPane().add(lblProtocol);
		
		JLabel lblPort = new JLabel("Port");
		lblPort.setForeground(Color.DARK_GRAY);
		lblPort.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPort.setBackground(Color.PINK);
		lblPort.setBounds(484, 368, 37, 22);
		getContentPane().add(lblPort);
		
		textField = new JTextField();
		textField.setText("80");
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(519, 369, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 665, 21);
		getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("?");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnNewMenu_1.add(mntmAbout);
		//
		// StandardWin
		//
		this.setTitle("LOIC - Ecole des Mines de Douai - ISIC 2012");
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(661, 521));
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
	}

	//
	// TODO: Add any appropriate code in the following Event Handling Methods
	//
	private void jTextField1_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField1_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	private void jTextField2_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField2_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	private void jButton1_actionPerformed(ActionEvent e)
	{
		System.out.println("\njButton1_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	//
	// TODO: Add any method code to meet your needs in the following area
	//






























 

//============================= Testing ================================//
//=                                                                    =//
//= The following main method is just for testing this class you built.=//
//= After testing,you may simply delete it.                            =//
//======================================================================//
	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception ex)
		{
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}
		new StandardWin();
	}
}
