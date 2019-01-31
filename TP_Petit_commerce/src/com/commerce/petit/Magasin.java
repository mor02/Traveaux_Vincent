package com.commerce.petit;

public class Magasin {

	private double solde;

	private Produit[] produits;

	public void ajouterProduit(String nom, double pa, double pv) {

		Produit newProduit = new Produit(nom, pa, pv);
		int indiceRajout = 0;
		for (int i = 0; i < this.produits.length; i++) {
			if (this.produits[i] == null) {
				this.produits[i] = newProduit;
				indiceRajout = 1;
			}
		}

		if (indiceRajout == 0) {
			System.out.println("Attention - Pas de place pour rajouter le produit");
		}
		System.out.println(indiceRajout==0 ? "Attention - Pas de place pour rajouter le produit": "autre" );
	}

	public void acheterProduit(int refPrd, int nbExemplaire) {

		Produit produitChercher = this.produits[refPrd];
		if (produitChercher != null) {
			produitChercher.augmenterStock(nbExemplaire);
			this.produits[refPrd] = produitChercher;
		}
	}

	public void vendreProduit(int refPrd, int nbExemplaire) {

		Produit produitChercher = this.produits[refPrd];
		if (produitChercher != null) {
			produitChercher.diminuerStock(nbExemplaire);
			this.produits[refPrd] = produitChercher;
		}

	}

	public Magasin(double solde, Produit[] produits) {
		super();
		this.solde = solde;
		this.produits = produits;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Produit[] getProduits() {
		return produits;
	}

	public void setProduits(Produit[] produits) {
		this.produits = produits;
	}

}
