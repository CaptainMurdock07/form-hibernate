package com.example.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ETU")
public class Etudiant extends Personne {

	private String niveau;

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, int age, String niveau) {
		super(nom, prenom, age, voitures, sports);
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant [niveau=" + niveau + "]";
	}
	
	
}
