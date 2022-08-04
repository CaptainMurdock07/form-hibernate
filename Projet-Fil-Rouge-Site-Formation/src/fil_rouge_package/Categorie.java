package fil_rouge_package;

public class Categorie {

	private int id;
	private int idMere;
	private String intitule;
	
	public Categorie() {
		super();
	}
	
	public Categorie(int id, int idMere, String intitule) {
		super();
		this.id = id;
		this.idMere = idMere;
		this.intitule = intitule;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdMere() {
		return idMere;
	}
	public void setIdMere(int idMere) {
		this.idMere = idMere;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
}
