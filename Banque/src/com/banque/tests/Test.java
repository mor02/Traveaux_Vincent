package com.banque.tests;

import java.util.List;
import java.util.Scanner;

import com.banque.beans.Compte;
import com.banque.beans.Operation;
import com.banque.services.IServiceCompte;
import com.banque.services.impl.ServiceCompte;

import java.util.ArrayList;
import java.util.Date;

public class Test {
	
	
	public static void main(String[] args) {
		
		IServiceCompte monService= new ServiceCompte();
		
		Scanner sc = new Scanner(System.in);
		List<Compte> comptesBanquairesBdd = new ArrayList<Compte>();
		
		//String choix = Test.menu(sc);
		String choix ="0";
		while(!choix.equals("5")) {
			choix = Test.menu(sc);
			
			if(choix.equals("1")) {
				
				Compte cptTemp = monService.saisirCompte(sc);
				comptesBanquairesBdd.add(cptTemp);
				System.out.println(cptTemp.toString());
			}
			if(choix.equals("2")) {
				monService.saisirUnVersement(sc, comptesBanquairesBdd);
			}
			
			
		}
		
	
	}
	
	public static String menu(Scanner sc1) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("1. Création d'un compte");
		System.out.println("2. Versement");
		System.out.println("3. Prelevement");
		System.out.println("4. détail d'un compte");
		System.out.println("5.exit");
		System.out.println("Merci de taper votre choix : ");
		
		String choix = sc1.nextLine();
		return choix;
	}


	
	
	
	
}
