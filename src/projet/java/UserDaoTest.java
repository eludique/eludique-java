package projet.java;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserDaoTest {

	private UserDAO userDAO = new UserDAO(ConnectionFactory.getConnection());
	private User user1;
	private User user2 = new User("armande@yopmail.com", "azerty", "Dugland",
			"Martine", "F", "0474587799", true, "5 allée Victor Hugo",
			"St Fons", "69190");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ToolboxTest() throws SQLException {
		assertEquals("e24202824e82e7d9df6e9287d0e9e567ae0c4109",
				Toolbox.hashSha1("bubu"));

	}

	@Test
	public void CrudBasicTest() throws SQLException {
		// userDAO.add(user1);
		user1 = userDAO.getById(1);
		assertEquals(1, this.user1.getId());
		assertEquals("Lyon", this.user1.getVille());
		
		

	}

}
