package com.example.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Sport {

	@Id // Declare ce champ comme PK
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id;
	private String libelle;
	private String description;
	
	// Fait reference a l'attribut sports ds Personne
	@ManyToMany(mappedBy = "sports")
	private List<Personne> personnes = new ArrayList<Personne>();
	
	public Sport() {
		super();
	}

	public Sport(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}

	public Sport(String libelle, String description, List<Personne> personnes) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.personnes = personnes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Sport [id=" + id + ", libelle=" + libelle + ", description=" + description + "]";
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	// Explication : le sport doit avoir une liste à jour de personnes (ce qui n'est pas fait automatiquement). 
		// Ainsi, chaque fois que vous ajoutez un sport à la liste des sports dans l'entité Personne
		// vous devez également ajouter une personne à la liste des personnes dans l'entité Sport
	public void addPersonne(Personne o) {
		personnes.add(o);
		o.getSports().add(this);
	}

	public void removePersonne(Personne o) {
		personnes.remove(o);
		o.getSports().remove(this);
	}
	
	
}
