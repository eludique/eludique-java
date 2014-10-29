package projet.java;

public class Product {
	
	// Attributs
	
	private int id;
	private String reference;
	private String designation;
	private String description;
	private double prixUnitaire;
	private int qteStock;
	
	
	// Constructeur
	
	
	
	
	public Product(int id, String reference, String designation,
			String description, double prixUnitaire, int qteStock) {
		super();
		this.id = id;
		this.reference = reference;
		this.designation = designation;
		this.description = description;
		this.prixUnitaire = prixUnitaire;
		this.qteStock = qteStock;
	}


	public Product() {
		super();
	}

	
	// Get Set
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrixUnitaire() {
		return prixUnitaire;
	}


	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}


	public int getQteStock() {
		return qteStock;
	}


	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	

	
}
