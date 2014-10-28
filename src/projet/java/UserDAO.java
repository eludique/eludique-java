package projet.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAO
{
	private Connection cnn;
	private Statement statement;

	public UserDAO(Connection cnn)
	{
		super();
		try
		{
			this.cnn = cnn;
		} catch (Exception e)
		{
			e.getStackTrace();
		}
	}
	
	
	
	public ArrayList<User> getAll() throws SQLException
	{
		ArrayList<User> alUsers = new ArrayList<User>();
		
		String strQuery = "SELECT * FROM USER";
		ResultSet rs = null;
		User user = null;
		try
		{
			PreparedStatement preparedStatement = cnn.prepareStatement(strQuery);

			rs = preparedStatement.executeQuery();

			while(rs.next())
			{
				user = new User();
				user.setId(rs.getInt("id_user"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setNom(rs.getString("nom"));
				user.setPrenom(rs.getString("prenom"));
				user.setSexe(rs.getString("sexe"));
				user.setNumtel(rs.getString("numtel"));
				user.setAdmin(rs.getBoolean("admin"));
				user.setAdresse(rs.getString("adresse"));
				user.setVille(rs.getString("ville"));
				alUsers.add(user);
			}
		} catch (SQLException e)
		{
			e.getStackTrace();
		}
		return alUsers;
	}
	
	
	
	
	
	

	public User getById(int id) throws SQLException
	{
		String strQuery = "SELECT * FROM User WHERE id_user=?";
		ResultSet rs = null;
		User user = null;
		try
		{
			PreparedStatement preparedStatement = cnn.prepareStatement(strQuery);
			preparedStatement.setInt(1, id);
			rs = preparedStatement.executeQuery();

			if (rs.next())
			{
				user = new User();
				user.setId(rs.getInt("id_user"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setNom(rs.getString("nom"));
				user.setPrenom(rs.getString("prenom"));
				user.setSexe(rs.getString("sexe"));
				user.setNumtel(rs.getString("numtel"));
				user.setAdmin(rs.getBoolean("admin"));
				user.setAdresse(rs.getString("adresse"));
				user.setVille(rs.getString("ville"));
				user.setCodePostal(rs.getString("code_postal"));
			}
		} catch (SQLException e)
		{
			e.getStackTrace();
		}
		return user;
	}

	
	public User getByEmail(String email) throws SQLException
	{
		String strQuery = "SELECT * FROM User WHERE email=?";
		ResultSet rs = null;
		User user = null;
		try
		{
			PreparedStatement preparedStatement = cnn.prepareStatement(strQuery);
			preparedStatement.setString(1, email);
			rs = preparedStatement.executeQuery();

			if (rs.next())
			{
				user = new User();
				user.setId(rs.getInt("id_user"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setNom(rs.getString("nom"));
				user.setPrenom(rs.getString("prenom"));
				user.setSexe(rs.getString("sexe"));
				user.setNumtel(rs.getString("numtel"));
				user.setAdmin(rs.getBoolean("admin"));
				user.setAdresse(rs.getString("adresse"));
				user.setVille(rs.getString("ville"));
				user.setCodePostal(rs.getString("code_postal"));
			}
		} catch (SQLException e)
		{
			e.getStackTrace();
		}
		return user;
	}
	
	
	
	
	
	public void update(int id, String nom, String prenom, String ecurie) throws SQLException
	{
		ResultSet resultSet = statement.executeQuery("SELECT * FROM PILOTE WHERE id_user=" + id);
		if (resultSet.next())
		{
			PreparedStatement preparedStatement = cnn.prepareStatement("UPDATE eludique.User SET nom = '?', prenom ='?', ecurie='?' WHERE id='?'");
			preparedStatement.setString(1, nom);
			preparedStatement.setString(2, prenom);
			preparedStatement.setString(3, ecurie);
			preparedStatement.setInt(4, id);
			preparedStatement.execute();
		} else
		{
			System.out.println("id_User n'existe pas");
		}

	}

	public boolean add(User user) throws SQLException
	{
		PreparedStatement preparedStatement = cnn.prepareStatement("INSERT INTO  eludique.User VALUES (default, ?,?,?,?,?,?,?,?,?,?)");
		preparedStatement.setString(1, user.getEmail());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getNom());
		preparedStatement.setString(4, user.getPrenom());
		preparedStatement.setString(5, user.getSexe());
		preparedStatement.setString(6, user.getNumtel());
		preparedStatement.setBoolean(7,user.isAdmin());
		preparedStatement.setString(8, user.getAdresse());
		preparedStatement.setString(9, user.getVille());
		preparedStatement.setString(10, user.getCodePostal());
		return preparedStatement.execute();

	}

	public void remove(String email) throws SQLException
	{
		PreparedStatement preparedStatement = cnn.prepareStatement("DELETE FROM eludique.User WHERE email = ? ; ");
		preparedStatement.setString(1, email);
		preparedStatement.executeUpdate();

	}
	
	

}
