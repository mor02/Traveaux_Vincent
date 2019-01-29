package com.cours.beans;

import com.cours.services.ServiceVoiture;

public class Voiture extends Vehicule implements ServiceVoiture{


	private int nbPlace;

	public int getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	@Override
	public void accelerer1() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
