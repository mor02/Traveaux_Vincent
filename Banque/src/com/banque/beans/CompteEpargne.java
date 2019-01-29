package com.banque.beans;

import java.util.Date;
import java.util.List;

public class CompteEpargne extends Compte {

	private int taux;
	
	public CompteEpargne(String numeroCompte, String proprietaireCompte, float soldeCompte, Date dateOuvertureCompte,
			List<Operation> listeOperations) {
		super(numeroCompte, proprietaireCompte, soldeCompte, dateOuvertureCompte, listeOperations);
		// TODO Auto-generated constructor stub
	}

	

	public int getTaux() {
		return taux;
	}

	public void setTaux(int taux) {
		this.taux = taux;
	}
	
	
}
