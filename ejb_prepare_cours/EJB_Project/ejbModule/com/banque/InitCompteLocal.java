package com.banque;

import javax.ejb.Local;

@Local
public interface InitCompteLocal {

	
	public void saisirNom(String nom);
	
	public void saisirPrenom(String prenom);
	
	public String generateNumCompte();
	
}
