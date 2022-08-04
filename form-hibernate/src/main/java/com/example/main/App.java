package com.example.main;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.example.entities.Enseignant;
import com.example.entities.Etudiant;
import com.example.entities.Personne;
import com.example.entities.Sport;
import com.example.entities.Voiture;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*List<Voiture> voitures = new ArrayList<Voiture>();
        voitures.add(new Voiture(1L, "Renault", "Modele4", "Bleu"));
        voitures.add(new Voiture(2L, "Peugeot", "304", "Blanc"));
        voitures.add(new Voiture(3L, "Citroen", "C4", "Rouge"));
        for(Voiture v : voitures) {
        	System.out.println(v);
        }
        voitures.forEach((v) -> System.out.println((v));*/
    	
    	// Creer un objet de configuration d’Hibernate   	
    	Configuration configuration = new Configuration();
    	
    	// Utiliser cet objet pour charger le fichier de 
    	// configuration hibernate.cfg.xml   	
    	configuration.configure();
    	// configuration.configure("org/eclipse/entities/hibernate.cfg.xml");
    	
    	// Creer une usine de gestionnaire d’entite
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	// Creer un gestionnaire d’entite
    	Session session = sessionFactory.openSession();
    	
    	// Demarrer une transaction
    	Transaction transaction = session.beginTransaction();
    	
    	// Utiliser le gestionnaire de donnees pour persister les donnees      	
    	Voiture v1 = new Voiture("Marque1", "Modele1", "Couleur1"); 
    	
    	// equivalent a une requete INSERT
    	//session.persist(v1);
    	
    	// Utiliser save pour recuperer la valeur de la PK
    	Long cle = (Long) session.save(v1);
    	System.out.println(cle); // Affiche la PK
    	
    	// Chercher une voiture (avec load) LAZY LOADING
    	// On charge a la 1iere utilisation
    	Voiture v2 = session.load(Voiture.class, cle);
    	v2.setMarque("Citroen");
    	System.out.println(v2);
    	
    	// Chercher une voiture (avec get) EAGER LOADING
    	// Avec get(), Hibernate recupere immediatement l'objet de la base de donnees
		
		  //Voiture v3 = session.get(Voiture.class, 3L); v3.setMarque("Lada");
		 // System.out.println(v3);
		 
    	
    	// Envoie tous les changements des entites managees dans la base de donnees
    	session.flush();
    	// Pour supprimer une voiture
    	//session.delete(v3);
    	
    	// Affiche la liste
    	CriteriaQuery<Voiture> cq = session.getCriteriaBuilder().createQuery(Voiture.class);
    	cq.from(Voiture.class);
    	List<Voiture> voitures = session.createQuery(cq).getResultList();
    	for(Voiture v : voitures) {
    		System.out.println(v);
    	}
    	
    	Voiture v4 = new Voiture("Marque4", "Modele4", "Couleur4");
    	Voiture v5 = new Voiture("Marque5", "Modele5", "Couleur5");
    	Personne p1 = new Personne("NomPers1", "PrenomPers1", 45);
    	Personne p2 = new Etudiant("NomPers2", "PrenomPers2", 47, "Niveau1");
    	Sport s1 = new Sport("Basket", "Ball");
    	Sport s2 = new Sport("Hand", "Ball");
    	Sport s3 = new Sport("Foot", "2Rue");
    	Sport s4 = new Sport("Tennis", "2Table");
    	p1.addVoiture(v1);
    	p1.addVoiture(v2);
    	
    	p1.addSport(s1);
    	p1.addSport(s2);
    	
    	p2.addVoiture(v4);
    	p2.addVoiture(v5);
    	
    	p2.addSport(s3);
    	p2.addSport(s4);
		/*
		 * Enseignant ens1 = new Enseignant("NomEns1", "PrenomEns1", 48, 2000.0d);
		 * Etudiant etu1 = new Etudiant("NomEtu1", "PrenomEtu1", 19, "BTS");
		 */
    	
    	session.persist(p1);
    	session.persist(p2);
		/*
		 * session.persist(ens1); session.persist(etu1);
		 */
    	
    	// Affiche la liste
    	CriteriaQuery<Personne> cq1 = session.getCriteriaBuilder().createQuery(Personne.class);
    	cq1.from(Personne.class);
    	List<Personne> personnes = session.createQuery(cq1).getResultList();
    	for(Personne p : personnes) {
    		System.out.println(p);
    	}
    	
    	transaction.commit();
    	
		session.close();
		sessionFactory.close();
    }
    
}
