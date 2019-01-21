package com.cours.tests;

import com.cours.beans.Camion;
import com.cours.beans.Vehicule;
import com.cours.beans.Voiture;



public class Test {

	public static void main(String[] args) {
		
		Voiture v1 = new Voiture();
		v1.setMarque("Honda");
		v1.setVitesseMax(220.00);
		v1.setStart(false);
		v1.accelerer(100);
		
		//Voiture.nbVehicule = 1;
		//v1.setNbVehicule(1);
		
		System.out.println(v1.toString());
		
		
		Camion v2 = new Camion();
		v2.accelerer();
		v2.accelerer();
		v2.getCharge();
		
		System.out.println("Le nombre de véhicule crées : " + Vehicule.getNbVehicule());
		
		

	}

}
