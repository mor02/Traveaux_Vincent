package com.banque.beans;

import java.util.Date;
import java.util.List;

import com.banque.exceptions.EMontantMinException;

public class CompteCourant extends Compte {
	
	
	private float montantDecouvertAutorise;
	
	
	public CompteCourant(String numeroCompte, String proprietaireCompte, float soldeCompte, Date dateOuvertureCompte,
			List<Operation> listeOperations) {
		super(numeroCompte, proprietaireCompte, soldeCompte, dateOuvertureCompte, listeOperations);
		// TODO Auto-generated constructor stub
	}

	public void retirer(float montant, String libelle) throws EMontantMinException {
		float soldeTemporaire;
		
		Operation operationEnCours = new Operation(montant, new Date(), libelle);
		
		soldeTemporaire = this.getSoldeCompte() + montant;
		
		if (soldeTemporaire < this.montantDecouvertAutorise) {
			// TODO gérer l'exception
			throw new EMontantMinException();
			
		} else {
			this.setSoldeCompte(soldeTemporaire);
		}
		//this.soldeCompte = this.soldeCompte + montant;
		
		this.getListeOperations().add(operationEnCours);
	}
	
	public float getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}

	public void setMontantDecouvertAutorise(float montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

	
}
