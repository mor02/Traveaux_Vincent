package com.commerce.petit;

public class Livre extends Produit {
	
	
	private String auteur;
	private String editeur;
	
	
	
	
	public Livre(String nom, double pa, double pv, String auteur, String editeur) {
		super(nom, pa, pv);
		this.auteur = auteur;
		this.editeur = editeur;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	
	

}
