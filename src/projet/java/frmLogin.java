package projet.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class frmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame connexion : email / mot de passe .
	 */
	public frmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 2, 0, 0));
		
		JLabel lblConnexion = new JLabel("CONNEXION ");
		lblConnexion.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblConnexion);
		
		JLabel lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("e-mail :");
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblPassword = new JLabel("password :");
		contentPane.add(lblPassword);
		
		txtPassword = new JTextField();
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1);
		
		JButton btnQuitter = new JButton("Quitter");
		contentPane.add(btnQuitter);
		
		JButton btnConnexion = new JButton("Connexion");
		contentPane.add(btnConnexion);
		
		JLabel lblVousNtes = new JLabel("Vous n \u00EAtes pas inscrit, Inscrivez-vous .");
		lblVousNtes.setForeground(Color.BLUE);
		contentPane.add(lblVousNtes);
	}

}
