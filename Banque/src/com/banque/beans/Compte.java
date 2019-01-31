package com.banque.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.banque.exceptions.EMontantMinException;

public class Compte {
	private String numeroCompte;
	private String proprietaireCompte;
	private float soldeCompte;
	private Date dateOuvertureCompte;
	private List<Operation> listeOperations = new ArrayList<Operation>();

	
	public Compte() {
		super();
	}

	public Compte(String numeroCompte, String proprietaireCompte, float soldeCompte, Date dateOuvertureCompte,
			List<Operation> listeOperations) {
		super();
		this.numeroCompte = numeroCompte;
		this.proprietaireCompte = proprietaireCompte;
		this.soldeCompte = soldeCompte;
		this.dateOuvertureCompte = dateOuvertureCompte;
		this.listeOperations = listeOperations;
	}
	
	public Compte(String proprietaireCompte) {
		super();
		this.proprietaireCompte = proprietaireCompte;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getProprietaireCompte() {
		return proprietaireCompte;
	}

	public void setProprietaireCompte(String proprietaireCompte) {
		this.proprietaireCompte = proprietaireCompte;
	}

	public float getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(float soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public Date getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}

	public void setDateOuvertureCompte(Date dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}

	public List<Operation> getListeOperations() {
		return listeOperations;
	}

	public void setListeOperations(List<Operation> listeOperations) {
		this.listeOperations = listeOperations;
	}

	
	public void verser(float montant, String libelle) {
		Operation operationEnCours = new Operation(montant, new Date(), libelle);
		this.soldeCompte = this.soldeCompte + montant;
		this.listeOperations.add(operationEnCours);
	}

	// verser(float montant, String libelle) et retirer(float montant, String
	// libelle)
	public void retirer(float montant, String libelle) throws EMontantMinException {
		Operation operationEnCours = new Operation(montant, new Date(), libelle);
		this.soldeCompte = this.soldeCompte + montant;
		this.listeOperations.add(operationEnCours);

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "N° compte : " +this.numeroCompte + "\nPrioprietaire : " + this.proprietaireCompte + "\nSolde : " + this.soldeCompte ;
	}
}
