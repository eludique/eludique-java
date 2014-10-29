package projet.java;

import java.awt.EventQueue;
import java.sql.SQLException;

public class Main {

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		
		System.out.println(Toolbox.sha1("bubu"));
		
//		User userTest = new User("jojo69@yopmail.com", "azerty", "Dupuis", "Joseph", "M", "0474589632", true, "5 rue Jean-Luc Lahaye", "Lyon", "69001");
//		UserDAO userDAO = new UserDAO(ConnectionFactory.getConnection());
//		userDAO.add(userTest);
		
		
		
		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frmLogin frame = new frmLogin();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}
}
