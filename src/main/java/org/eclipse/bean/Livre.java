package org.eclipse.bean;

public class Livre {
    private int code;
    private String titre,langue,auteur,prix,quantity,livre_id;
    
    public Livre() {}
	public Livre(String titrelivre, String langue, String auteur, String prixachat) {		
		this.titre = titrelivre;
		this.langue = langue;
		this.auteur = auteur;
		this.prix = prixachat;
	}
	
public Livre(String titrelivre, String langue, String auteur, String prixachat,String quantity,String livre_id) {
		this.titre = titrelivre;
		this.langue = langue;
		this.auteur = auteur;
		this.prix = prixachat;
		this.quantity=quantity;
		this.livre_id=livre_id;
	}
public Livre(int code,String titrelivre, String langue, String auteur, String prixachat) {
	this.code=code;
	this.titre = titrelivre;
	this.langue = langue;
	this.auteur = auteur;
	this.prix = prixachat;
}
	
	public String getQuantity() {
	return quantity;
}
   public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getLivre_id() {
	return livre_id;
}
public void setLivre_id(String livre_id) {
	this.livre_id = livre_id;
}
	public int getCode() {
		return code;
	}

	public void setCode(int codelivre) {
		this.code = codelivre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titrelivre) {
		titre = titrelivre;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prixachat) {
		this.prix = prixachat;
	}

	@Override
	public String toString() {
		return "Livre [codelivre=" + code + ", Titrelivre=" + titre + ", langue=" + langue + ", auteur="
				+ auteur + ", prixachat=" + prix + "]";
	}
    
}
