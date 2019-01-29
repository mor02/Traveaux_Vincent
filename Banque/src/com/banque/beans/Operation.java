package com.banque.beans;

import java.util.Date;

public class Operation {
	
	private double montant;
	private Date date;
	private String libelle;
	
	
	
	public Operation(double montant, Date date, String libelle) {
		super();
		this.montant = montant;
		this.date = date;
		this.libelle = libelle;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Résumé de votre opération : \nMontant :" + montant + "\nDate : le " + date + "\nLibellé : " + libelle;
	}




	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	
}
