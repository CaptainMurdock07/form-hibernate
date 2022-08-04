package com.example.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
//Declare l'heritage et le mapping des classes filles 
//ds une seule table (a la difference TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERSONNE")
@DiscriminatorValue(value = "PERS")
//Definit des contraintes d'unicites sur nom et prenom
@Table(name = "personne", uniqueConstraints = {
		@UniqueConstraint(name = "nom_prenom", columnNames = { "nom", "prenom" }) })
public class Personne {

	@Id // Declare ce champ comme PK
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id;
	private String nom;
	private String prenom;
	private int age;
	
	// Une personne ne peut avoir qu'une seule voiture
	//@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	
	// Plusieurs personnes peuvent avoir la meme voiture
	/*
	 * @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	 * 
	 * @JoinColumn(name = "voiture_id", referencedColumnName = "id", nullable =
	 * true) public Voiture voiture;
	 */
	// Par defaut, c'est du LAZY LOADING
	// Une personne peut avoir plusieurs voitures
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Voiture> voitures = new ArrayList<Voiture>();
	
	// La propriété cascade = CascadeType.ALL indique que lorsque nous persistons, supprimons, actualisons ou fusionnons cette entité, toutes les entités contenues dans ce champ seraient persistantes, supprimées, ou mises à jour.
	@ManyToMany(cascade = {CascadeType.ALL})
	private List<Sport> sports = new ArrayList<Sport>();
	
	public Personne() {
		super();
	}
	
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Personne(String nom, String prenom, int age, List<Voiture> voitures) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.voitures = voitures;
	}
	
	public Personne(String nom, String prenom, int age, List<Voiture> voitures, List<Sport> sports) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.voitures = voitures;
		this.sports = sports;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Voiture> getVoitures() {
		return voitures;
	}
	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}
	
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", voitures=" + voitures
				+ ", sports=" + sports + "]";
	}
	
	public boolean addVoiture(Voiture v) {
		return voitures.add(v);
	}
	public boolean removeVoiture(Voiture v) {
		return voitures.remove(v);
	}
	
	public List<Sport> getSports() {
		return sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}
	

	public boolean addSport(Sport o) {
		return sports.add(o);
		//o.getPersonnes().add(this);
	}

	public boolean removeSport(Sport o) {
		return sports.remove(o);
		//o.getPersonnes().remove(this);
	}
	
}
