package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 * Summary description for StandardWin
 *
 */
public class StandardWin extends JFrame
{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
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
		
		getContentPane().setLayout(null);
		
		
		JLabel image = new JLabel();
		image.setIcon(new ImageIcon(StandardWin.class.getResource("/ui/logo-mines.jpg")));
		image.setBounds(10, 27, 303, 285);
		getContentPane().add(image);
		
		
		JComboBox protocol = new JComboBox();
		protocol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		protocol.setBounds(396, 368, 68, 22);
		protocol.setBackground(new Color(255, 255, 255));
		protocol.setModel(new DefaultComboBoxModel(new String[] {"HTTP", "TCP", "UDP"}));
		protocol.setSelectedIndex(0);
		getContentPane().add(protocol);
		
		
		
		JButton btnZentaaar = new JButton("ZENTARISATION");
		btnZentaaar.setBackground(Color.RED);
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
		
	
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 665, 21);
		getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("?");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnNewMenu_1.add(mntmAbout);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(318, 32, 12, 440);
		getContentPane().add(verticalStrut);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 312, 303, 12);
		getContentPane().add(horizontalStrut);
		
				
		JLabel lblThreads = new JLabel("Threads");
		lblThreads.setForeground(Color.DARK_GRAY);
		lblThreads.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblThreads.setBackground(Color.PINK);
		lblThreads.setBounds(384, 335, 68, 22);
		getContentPane().add(lblThreads);
		
				
		JLabel lblFrequency = new JLabel("Frequency");
		lblFrequency.setForeground(Color.DARK_GRAY);
		lblFrequency.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFrequency.setBackground(Color.PINK);
		lblFrequency.setBounds(369, 302, 83, 22);
		getContentPane().add(lblFrequency);
		
		textField = new JTextField();
		textField.setText("50\r\n");
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(449, 305, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("50\r\n");
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(449, 337, 86, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("80");
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(524, 368, 86, 20);
		getContentPane().add(textField_2);
		
		//
		// StandardWin
		//
		this.setTitle("LOIC - ENSM Douai - ISIC 2012");
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(661, 521));
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
