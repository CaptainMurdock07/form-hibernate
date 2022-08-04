package fil_rouge_package;

import java.util.Date;

/**
 * Produit
 */
public class Produit {

    private int id;
    private int idCategorie;
    private int idFormateur;
    private int duree;
    private Date dateDebut;
    private double prix;
    private String lieux;
    private String descriptif;
    private String lienTest;
    private int idNiveau;
    
    

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	public int getIdFormateur() {
		return idFormateur;
	}
	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getLieux() {
		return lieux;
	}
	public void setLieux(String lieux) {
		this.lieux = lieux;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public String getLienTest() {
		return lienTest;
	}
	public void setLienTest(String lienTest) {
		this.lienTest = lienTest;
	}
	public int getIdNiveau() {
		return idNiveau;
	}
	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}
	
public Produit() {
	super();
}
public Produit(int id, int idCategorie, int idFormateur, int duree, Date dateDebut, double prix, String lieux,
		String descriptif, String lienTest, int idNiveau) {
	super();
	this.id = id;
	this.idCategorie = idCategorie;
	this.idFormateur = idFormateur;
	this.duree = duree;
	this.dateDebut = dateDebut;
	this.prix = prix;
	this.lieux = lieux;
	this.descriptif = descriptif;
	this.lienTest = lienTest;
	this.idNiveau = idNiveau;
}

    
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         