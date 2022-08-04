package com.example.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ENS")
public class Enseignant extends Personne {

	private double salaire;

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Enseignant() {
		super();
	}

	public Enseignant(String nom, String prenom, int age, double salaire) {
		super(nom, prenom, age, voitures, sports);
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Enseignant [salaire=" + salaire + "]";
	}
	
	
}
