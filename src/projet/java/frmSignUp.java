package projet.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class frmSignUp extends JFrame {

	private JPanel cpMain;
	private JTextField txtEmail;
	private JTextField txtPassword;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtNumTel;
	private JTextField txtAdresse;
	private JTextField txtCodePostal;
	private JTextField txtVille;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSignUp frame = new frmSignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmSignUp() {
		setTitle("Inscription");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 406);
		cpMain = new JPanel();
		cpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpMain);
		cpMain.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel pnlTitle = new JPanel();
		cpMain.add(pnlTitle);

		JLabel lblInscription = new JLabel("Inscription");
		lblInscription.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pnlTitle.add(lblInscription);

		JPanel pnlInfo = new JPanel();
		cpMain.add(pnlInfo);
		pnlInfo.setLayout(new GridLayout(9, 2, 4, 1));

		JLabel lblEmail = new JLabel("Email");
		pnlInfo.add(lblEmail);

		txtEmail = new JTextField();
		pnlInfo.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		pnlInfo.add(lblPassword);

		txtPassword = new JTextField();
		pnlInfo.add(txtPassword);
		txtPassword.setColumns(10);

		JLabel lblNom = new JLabel("nom");
		pnlInfo.add(lblNom);

		txtNom = new JTextField();
		pnlInfo.add(txtNom);
		txtNom.setColumns(10);

		JLabel lblPrenom = new JLabel("Pr\u00E9nom");
		pnlInfo.add(lblPrenom);

		txtPrenom = new JTextField();
		pnlInfo.add(txtPrenom);
		txtPrenom.setColumns(10);

		JLabel lblNumtel = new JLabel("NumTel");
		pnlInfo.add(lblNumtel);

		txtNumTel = new JTextField();
		pnlInfo.add(txtNumTel);
		txtNumTel.setColumns(10);

		JLabel lblAdresse = new JLabel("Adresse");
		pnlInfo.add(lblAdresse);

		txtAdresse = new JTextField();
		pnlInfo.add(txtAdresse);
		txtAdresse.setColumns(10);

		JLabel lblCodePostal = new JLabel("Code Postal");
		pnlInfo.add(lblCodePostal);

		txtCodePostal = new JTextField();
		pnlInfo.add(txtCodePostal);
		txtCodePostal.setColumns(10);

		JLabel lblVille = new JLabel("Ville");
		pnlInfo.add(lblVille);

		txtVille = new JTextField();
		pnlInfo.add(txtVille);
		txtVille.setColumns(10);

		JButton btnReset = new JButton("Reset");
		pnlInfo.add(btnReset);

		JButton btnValid = new JButton("Valider");
		btnValid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		pnlInfo.add(btnValid);
	}

}
