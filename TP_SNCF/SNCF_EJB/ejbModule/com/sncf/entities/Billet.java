package com.sncf.entities;

public class Billet {

	private String departVille;
	private String arriveeVille;
	private double prix;
	public String getDepartVille() {
		return departVille;
	}
	public void setDepartVille(String departVille) {
		this.departVille = departVille;
	}
	public String getArriveeVille() {
		return arriveeVille;
	}
	public void setArriveeVille(String arriveeVille) {
		this.arriveeVille = arriveeVille;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Billet(String departVille, String arriveeVille, double prix) {
		super();
		this.departVille = departVille;
		this.arriveeVille = arriveeVille;
		this.prix = prix;
	}
	
	
	
}
