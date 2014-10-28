package projet.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frmPayment extends JFrame {

	private JPanel pnlMain;
	private JTable jtabCart;
	private JTextField txtNumCB;
	private JTextField txtCryptogram;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPayment frame = new frmPayment();
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
	public frmPayment() {
		setTitle("Paiement de la commande");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 425);
		pnlMain = new JPanel();
		pnlMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlMain);
		pnlMain.setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel pnlTitle = new JPanel();
		pnlMain.add(pnlTitle);
		
		JLabel lblPaiement = new JLabel("Paiement");
		lblPaiement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pnlTitle.add(lblPaiement);
		
		JPanel pnlCart = new JPanel();
		pnlMain.add(pnlCart);
		pnlCart.setLayout(new GridLayout(1, 0, 0, 0));
		
		jtabCart = new JTable();
		pnlCart.add(jtabCart);
		
		JPanel pnlInfos = new JPanel();
		pnlMain.add(pnlInfos);
		
		JLabel lblInformationsBancaires = new JLabel("Informations bancaires");
		lblInformationsBancaires.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pnlInfos.add(lblInformationsBancaires);
		
		JPanel pnlBank = new JPanel();
		pnlMain.add(pnlBank);
		pnlBank.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblEntrezLes = new JLabel("Entrez les 16 chiffres de votre CB");
		pnlBank.add(lblEntrezLes);
		
		txtNumCB = new JTextField();
		pnlBank.add(txtNumCB);
		txtNumCB.setColumns(10);
		
		JLabel lblCryptogram = new JLabel("Cryptogramme");
		pnlBank.add(lblCryptogram);
		
		txtCryptogram = new JTextField();
		pnlBank.add(txtCryptogram);
		txtCryptogram.setColumns(10);
		
		JPanel pnlValidation = new JPanel();
		pnlMain.add(pnlValidation);
		
		JButton btnValiderLePaiement = new JButton("Valider le paiement");
		pnlValidation.add(btnValiderLePaiement);
	}

}
