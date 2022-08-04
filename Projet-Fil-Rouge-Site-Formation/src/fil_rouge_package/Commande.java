package fil_rouge_package;
import java.util.Date;

public class Commande {
    private int id;
    private int idProduit;
    private int idUser;
    private Date dateValidation;
    
    public Commande() {
		super();
	}

	public Commande(int id, int idProduit, int idUser, Date dateValidation) {
		super();
		this.id = id;
		this.idProduit = idProduit;
		this.idUser = idUser;
		this.dateValidation = dateValidation;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public Date getDateValidation() {
		return dateValidation;
	}


	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              