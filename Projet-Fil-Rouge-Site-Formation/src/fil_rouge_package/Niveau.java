package fil_rouge_package;

public class Niveau {

	private int id;
	private String intitule;
	
	public Niveau() {
		super();
	}

	public Niveau(int id, String intitule) {
		super();
		this.id = id;
		this.intitule = intitule;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
}
