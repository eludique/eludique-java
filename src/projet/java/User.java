package projet.java;

import java.util.ArrayList;

public class User {
	
	private int id;
	private String email;
	private String password;
	private String nom;
	private String prenom;
	private String sexe;
	private String numtel;
	private boolean admin;
	private String adresse;
	private String ville;
	private String codePostal;
	
	private ArrayList<Commande> alCommandes;
	
	// Constructeur
	
	
	public User() {
		super();
	}

	

	public User(String email, String password, String nom, String prenom,
			String sexe, String numtel, boolean admin, String adresse,
			String ville, String codePostal) {
		super();
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.numtel = numtel;
		this.admin = admin;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	
	
	// Get & Set

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getSexe() {
		return sexe;
	}



	public void setSexe(String sexe) {
		this.sexe = sexe;
	}



	public String getNumtel() {
		return numtel;
	}



	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}



	public boolean isAdmin() {
		return admin;
	}



	public void setAdmin(boolean admin) {
		this.admin = admin;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public String getCodePostal() {
		return codePostal;
	}



	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getId() {
		return id;
	}
	
	
	
	

	
	
	
	

}
