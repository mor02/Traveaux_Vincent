package com.commerce.petit;

public class Produit {

	private String nom;
	private double pa;
	private double pv;
	private Integer nbStock;
	private String description;

	public double augmenterStock(int addStock) {
		
		if(this.nbStock !=null) {
			this.nbStock = this.nbStock + addStock;
		}else {
			this.nbStock = new Integer(addStock);
		}
		
		return this.nbStock;
	}

	/**
	 * Méthode pour diminuer le stock
	 * 
	 * @param removeStock
	 *            : la valeur à diminuer
	 * @return
	 */
	public double diminuerStock(int removeStock) {
		this.nbStock = this.nbStock - removeStock;
		return this.nbStock;
	}
	
	
	public Produit(String nom, double pa, double pv) {
		super();
		this.nom = nom;
		this.pa = pa;
		this.pv = pv;
		this.description = "Pas de description";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPa() {
		return pa;
	}

	public void setPa(double pa) {
		this.pa = pa;
	}

	public double getPv() {
		return pv;
	}

	public void setPv(double pv) {
		this.pv = pv;
	}

	public int getNbStock() {
		return nbStock;
	}

	public void setNbStock(int nbStock) {
		this.nbStock = nbStock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Nom : " + this.nom + "\n Description : " + this.description + "\nPrix de vente ;" + this.pv;
	}

}
