package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity // Declare la classe Voiture comme entite a mapper sur la db ...
@Table(name = "voiture")
public class Voiture {
	@Id // Declare ce champ comme PK
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id;
	private String marque;
	private String modele;
	private String couleur;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Voiture [id=" + id + ", marque=" + marque + ", modele=" + modele + ", couleur=" + couleur + "]";
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Voiture(Long id, String marque, String modele, String couleur) {
		super();
		this.id = id;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
	}

	public Voiture(String marque, String modele, String couleur) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
	}

	public Voiture() {
		super();
	}

}
