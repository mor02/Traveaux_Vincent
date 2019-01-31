package com.banque.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.banque.beans.Compte;
import com.banque.services.IServiceCompte;

public class ServiceCompte implements IServiceCompte {

	@Override
	public Compte saisirCompte(Scanner scInfos) {
		Compte cptCree = null;
		Compte cpt1 = new Compte();//Par défaut
		System.out.println("Merci de saisir le nom du prorietaire : ");
		String nomProprio = scInfos.nextLine();
		cpt1.setProprietaireCompte(nomProprio);
		cpt1.setNumeroCompte("FR00001"+nomProprio);
		cpt1.setSoldeCompte(0);
		cpt1.setDateOuvertureCompte(new Date());
		cptCree  = cpt1;
		return cptCree;
	}

	@Override
	public void saisirUnVersement(Scanner sc, List<Compte> comptesBanquairesBdd) {
		
		Scanner sc2 = new Scanner(System.in);
		//On demande le nom du priorio du compte
				System.out.println("Merci de saisir le nom du prorietaire : ");
				String nomProprio = sc2.nextLine();
				//On cherche le compte avec son priorio
				Compte cptRecherche = null;
				for(Compte cptTemp : comptesBanquairesBdd) {
					if(cptTemp.getProprietaireCompte().equals(nomProprio)) {
						//compte trouvé
						cptRecherche =cptTemp;
						break;
					}
				}
				if(cptRecherche !=null) {
					//On affiche le détail du compte trouvé 
					System.out.println(cptRecherche.toString());
					//on demande le montant de verssement
					System.out.println("Merci de saisir le montant de versement : ");
					float montantVers = sc2.nextFloat();
					cptRecherche.verser(montantVers, "Versement en agence");
					
					System.out.println(cptRecherche.toString());
					System.out.println(cptRecherche.getListeOperations().toString());
				}else {
					System.out.println("Aucun compte avec le nom " + nomProprio);
				}
				
				

	}

}
