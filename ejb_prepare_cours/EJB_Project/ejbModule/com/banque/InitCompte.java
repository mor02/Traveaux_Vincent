package com.banque;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

import com.banque.compte.beans.Compte;

/**
 * Session Bean implementation class InitCompte
 */
@Stateless
@LocalBean
public class InitCompte implements InitCompteLocal {

    Compte cpt = new Compte();
    


	@Override
	public void saisirNom(String nom) {
		cpt.setNom(nom);
		
	}

	@Override
	public void saisirPrenom(String prenom) {
		cpt.setPrenom(prenom);
		
	}

	@Override
	public String generateNumCompte() {
		
		return "FR00000"+cpt.getNom();
	}
    
    
}
