package com.cours.beans;

public abstract class Vehicule {
	
	//Les attributs
	
	//les variables d'instance
	private String marque;
	private double vitesseMax;
	private boolean start;
	private int vitesseEncours;
	
	//les variables de classe.
	public static int nbVehicule;
	
	
	
	public static int getNbVehicule() {
		return nbVehicule;
	}

	public static void setNbVehicule(int nbVehicule) {
		Vehicule.nbVehicule = nbVehicule;
	}

	public void setVitesseEncours(int vitesseEncours) {
		this.vitesseEncours = vitesseEncours;
	}

	public void accelerer() {
		this.vitesseEncours = this.vitesseEncours + 10;
	}
	
	public int accelerer(int augVitesse) {
		this.vitesseEncours = this.vitesseEncours + augVitesse;
		return this.vitesseEncours;
	}
	
	
	public Vehicule() {
		
		Vehicule.nbVehicule++;
		//Vehicule.nbVehicule = Vehicule.nbVehicule +1;
	}
	

	public Vehicule(String marque1, double vitesseMax, boolean start) {
		
		this.marque = marque1;
		this.vitesseMax = vitesseMax;
		this.start = start;
		Vehicule.nbVehicule++;
	}
	
   public Vehicule(String marque1, double vitesseMax) {
		
		this.marque = marque1;
		this.vitesseMax = vitesseMax;
		
		Vehicule.nbVehicule++;
		
	}	


	public double getVitesseEncours() {
		return vitesseEncours;
	}

	public void setVitesseEncours(double vitesseEncours) {
		//casting
		this.vitesseEncours = (int) vitesseEncours;
	}


	public String getMarque() {
		//
		return this.marque;
	}


	public double getVitesseMax() {
		return this.vitesseMax;
	}


	public boolean isStart() {
		return this.start;
	}

	public void setMarque(String m) {
		this.marque = m;
	}


	public void setVitesseMax(double vitesseMax) {
		this.vitesseMax = vitesseMax;
	}


	public void setStart(boolean start) {
		this.start = start;
	}

	@Override
	public String toString() {
		return "La marque : " + this.marque + " La vitesse encours : " + this.vitesseEncours ;
	}
	
}
