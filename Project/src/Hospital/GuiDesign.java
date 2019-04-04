package Hospital;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiDesign {

	private JFrame frame;
	private JTextField emailAdress;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiDesign window = new GuiDesign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 982, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmail = new JLabel("Email : ");
		lblEmail.setBounds(85, 122, 115, 33);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblSerialNumber = new JLabel("Serial Number : ");
		lblSerialNumber.setBounds(85, 228, 209, 33);
		frame.getContentPane().add(lblSerialNumber);
		
		emailAdress = new JTextField();
		emailAdress.setBounds(295, 119, 236, 39);
		frame.getContentPane().add(emailAdress);
		emailAdress.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(295, 225, 236, 36);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(325, 373, 171, 41);
		frame.getContentPane().add(btnNewButton);
	}

}
