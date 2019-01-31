package com.commerce.petit.tests;

import com.commerce.petit.Livre;
import com.commerce.petit.Magasin;
import com.commerce.petit.Produit;

public class Test {

	public static void main(String[] args) {

//		Produit produit1 = new Produit("Nutela", 12, 14);
//		Produit produit2 = new Produit("coca", 1, 1.2);
//		Produit produit3 = new Produit("beure", 10, 10.75);
//		Produit produit4 = new Produit("L'eau", 1, 1.5);
//
//		Livre livre1 = new Livre("Bible", 10, 11, "auteur 1", "Editeur 1");
//
//		Produit[] produitsParis = new Produit[1000];
//
//		produitsParis[0] = produit1;
//		produitsParis[1] = produit2;
//		produitsParis[2] = produit3;
//		produitsParis[3] = produit4;
//		produitsParis[4] = livre1;
//
//		Magasin magParis = new Magasin(0, produitsParis);
//
//		magParis.acheterProduit(0, 10);
//
//		System.out.println("fin");

		try {
			System.err.println(100/0);
		}catch(Exception e) {
			System.out.println("Une erreur est survenue lors de traitement");
			//logs
			System.out.println(e.getMessage());
		}
		
	}

}
