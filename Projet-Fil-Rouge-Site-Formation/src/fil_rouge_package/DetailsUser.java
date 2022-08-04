package fil_rouge_package;

public class DetailsUser {

	private int id;
	private Adresse adresse;
	private int telephone;
	
	public DetailsUser() {
		super();
	}
	
	public DetailsUser(int id, Adresse adresse, int telephone) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
}
