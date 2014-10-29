package projet.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAO
{
	private Connection cnn;
	private Statement statement;

	public ProductDAO(Connection cnn)
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
	
	
	public ArrayList<Product> getAll() throws SQLException
	{
		ArrayList<Product> alProducts = new ArrayList<Product>();
		
		String strQuery = "SELECT * FROM product";
		ResultSet rs = null;
		Product product = null;
		try
		{
			PreparedStatement preparedStatement = cnn.prepareStatement(strQuery);

			rs = preparedStatement.executeQuery();

			while(rs.next())
			{
				product = new Product();
				product.setId(rs.getInt("id_product"));
				product.setReference(rs.getString("reference"));
				product.setDesignation(rs.getString("designation"));
				product.setDescription(rs.getString("description"));
				product.setPrixUnitaire(rs.getDouble("prix_unitaire"));
				product.setQteStock(rs.getInt("qte_stock"));
				alProducts.add(product);
			}
		} catch (SQLException e)
		{
			e.getStackTrace();
		}
		return alProducts;
	}
	
	public Product getById(int id) throws SQLException
	{
		String strQuery = "SELECT * FROM Product WHERE id_product=?";
		ResultSet rs = null;
		Product product = null;
		try
		{
			PreparedStatement preparedStatement = cnn.prepareStatement(strQuery);
			preparedStatement.setInt(1, id);
			rs = preparedStatement.executeQuery();

			if (rs.next())
			{
				product = new Product();
				product.setId(rs.getInt("id_product"));
				product.setReference(rs.getString("reference"));
				product.setDesignation(rs.getString("designation"));
				product.setDescription(rs.getString("description"));
				product.setPrixUnitaire(rs.getDouble("prix_unitaire"));
				product.setQteStock(rs.getInt("qte_stock"));
			}

		} catch (SQLException e)
		{
			e.getStackTrace();
		}
		return product;
	}

	
	public Product getByReference(String ref) throws SQLException
	{
		String strQuery = "SELECT * FROM Product WHERE email=?";
		ResultSet rs = null;
		Product product = null;
		try
		{
			PreparedStatement preparedStatement = cnn.prepareStatement(strQuery);
			preparedStatement.setString(1, ref);
			rs = preparedStatement.executeQuery();

			if (rs.next())
			{
				product = new Product();
				product.setId(rs.getInt("id_product"));
				product.setReference(rs.getString("reference"));
				product.setDesignation(rs.getString("designation"));
				product.setDescription(rs.getString("description"));
				product.setPrixUnitaire(rs.getDouble("prix_unitaire"));
				product.setQteStock(rs.getInt("qte_stock"));
			}
		} catch (SQLException e)
		{
			e.getStackTrace();
		}
		return product;
	}
	
	public void update(String reference, String designation ) throws SQLException
	{
		ResultSet resultSet = statement.executeQuery("SELECT * FROM PILOTE WHERE id_product=");
		if (resultSet.next())
		{
			PreparedStatement preparedStatement = cnn.prepareStatement("UPDATE eludique.Product SET nom = '?', prenom ='?', ecurie='?' WHERE id='?'");

		} else
		{
			System.out.println("id_Product n'existe pas");
		}

	}

	public boolean add(Product product) throws SQLException
	{
		PreparedStatement preparedStatement = cnn.prepareStatement("INSERT INTO  eludique.Product VALUES (default, ?,?,?,?,?,?,?,?,?,?)");
		preparedStatement.setString(1, product.getReference());
		preparedStatement.setString(2, product.getDesignation());
		preparedStatement.setString(3, product.getDescription());
		preparedStatement.setDouble(4, product.getPrixUnitaire());
		preparedStatement.setInt(5, product.getQteStock());
		return preparedStatement.execute();

	}
	
	
	public void remove(int id) throws SQLException
	{
		PreparedStatement preparedStatement = cnn.prepareStatement("DELETE FROM eludique.Product WHERE id_product = ? ; ");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();

	}
	
	

	public void removeByEmail(String email) throws SQLException
	{
		PreparedStatement preparedStatement = cnn.prepareStatement("DELETE FROM eludique.Product WHERE email = ? ; ");
		preparedStatement.setString(1, email);
		preparedStatement.executeUpdate();

	}
	
}
