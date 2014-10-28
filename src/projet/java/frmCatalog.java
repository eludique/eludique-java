package projet.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

import java.awt.GridLayout;

import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class frmCatalog extends JFrame {

	private JPanel pnlMain;
	private JTable jtabCatalog;
	private JTable jtabCart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCatalog frame = new frmCatalog();
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
	public frmCatalog() {
		setTitle("Catalogue");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 403);
		pnlMain = new JPanel();
		pnlMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlMain);
		pnlMain.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnlTitle = new JPanel();
		pnlMain.add(pnlTitle);
		pnlTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblLesProduits = new JLabel("Les produits");
		lblLesProduits.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pnlTitle.add(lblLesProduits);
		
		JPanel pnlCatalog = new JPanel();
		pnlMain.add(pnlCatalog);
		
		jtabCatalog = new JTable();
		jtabCatalog.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "KJD523", "GI Joe", "9", "voir"},
				{null, "ASR820", "La bonne paye", "23", "voir"},
				{null, "MHE555", "Dr Maboul", "99", "voir"},
				{null, "MNX967", "Twister", "14.90", "voir"},
				{null, "WHL482", "Monopoly Beyrouth", "5", "voir"},
				{null, "MPL417", null, "59.90", "voir"},
			},
			new String[] {
				"Miniature", "Reference", "Designation", "Prix", "Plus d'infos"
			}
		));
		jtabCatalog.getColumnModel().getColumn(0).setPreferredWidth(50);
		pnlCatalog.setLayout(new GridLayout(0, 1, 0, 0));
		pnlCatalog.	add(new JScrollPane(jtabCatalog));
		
		JPanel pnlPanier = new JPanel();
		pnlMain.add(pnlPanier);
		
		JLabel lblMonPanier = new JLabel("Mon Panier");
		lblMonPanier.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pnlPanier.add(lblMonPanier);
	//	pnlCatalog.add(jtabCatalog);
		
		JPanel pnlCart = new JPanel();
		pnlMain.add(pnlCart);
		pnlCart.setLayout(new GridLayout(0, 1, 0, 0));
		
		jtabCart = new JTable();
		jtabCart.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jtabCart.setModel(new DefaultTableModel(
			new Object[][] {
				{"NFE113", "Tortue Ninja", "2", "65"},
				{"MPJ405", "Barbie", "1", "49"},
				{"JHE", "Corde \u00E0 sauter", "1", "9"},
			},
			new String[] {
				"Ref Produit", "Designation", "Quantit\u00E9", "Prix"
			}
		));
		jtabCart.getColumnModel().getColumn(1).setPreferredWidth(170);
		jtabCart.getColumnModel().getColumn(3).setPreferredWidth(182);
		pnlCart.add(new JScrollPane(jtabCart));
//		pnlCart.add(jtabCart);
		
		JPanel pnlValidation = new JPanel();
		pnlMain.add(pnlValidation);
		pnlValidation.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPaiement = new JButton("Paiement");
		pnlValidation.add(btnPaiement);
	}

}
