package com.cours.tests;

import java.util.ArrayList;
import java.util.List;

import com.cours.beans.Camion;
import com.cours.beans.Vehicule;
import com.cours.beans.Voiture;
import com.sun.javafx.collections.MappingChange.Map;



public class Test {

	public static void main(String[] args) {
		
		for(int i = 0; i<args.length;i++) {
			
		}
		Voiture v1 = new Voiture();
		v1.setMarque("Honda");
		v1.setVitesseMax(220.00);
		v1.setStart(false);
		v1.accelerer(100);
		
		//Voiture.nbVehicule = 1;
		//v1.setNbVehicule(1);
		
		//System.out.println(v1.toString());
		
		
		Camion v2 = new Camion();
		v2.accelerer();
		v2.accelerer();
		v2.getCharge();
		
		Voiture v3 = new Voiture();
		v3.setMarque("Renaut");
		v3.setVitesseMax(220.00);
		v3.setStart(false);
		v3.accelerer(100);
		
		Voiture v4 = new Voiture();
		v4.setMarque("FERARI");
		v4.setVitesseMax(600.00);
		v4.setStart(false);
		v4.accelerer(100);
		
		Vehicule[] tableauVehicule = new Vehicule[3]; 
		tableauVehicule[0] = v1;
		tableauVehicule[1] = v2;
		tableauVehicule[2] = v3;
		
		//System.out.println("Le nombre de véhicule crées : " + Vehicule.getNbVehicule());
//		System.out.println("La première ligne : " + tableauVehicule[0].toString());
//		System.out.println("La deuxième ligne : " + tableauVehicule[1].toString());
//		System.out.println("La deuxième ligne : " + tableauVehicule[2].toString());
		
		//for(point de depart;la condition d'arrent;le pas)
		
		for(int i=0;i<tableauVehicule.length;i++) {
			System.out.println("i = " + i);
			//System.out.println("La deuxième ligne : " + tableauVehicule[i].toString());
			if(i==100) {
				break;//continue;
			}
		}
		
		List <Vehicule> listeVehicule = new ArrayList<Vehicule>();
		
		listeVehicule.add(v1);
		listeVehicule.add(v2);
		listeVehicule.add(v3);
		
		for(int i=0;i<listeVehicule.size();i++) {
			System.out.println("La deuxième ligne : " + listeVehicule.get(i).toString());
		}
		
		for(Vehicule vTemp : listeVehicule) {
			System.out.println("La deuxième ligne : " + vTemp.toString());
		}
		
		if(listeVehicule.contains(v3)) {
			System.out.println("Le v3 existe dans la liste");
		}
		
		listeVehicule.add(v4);
		if(listeVehicule.contains(v4)) {
			System.out.println("Le v4 existe dans la liste");
		}
		listeVehicule.remove(0);
		listeVehicule.add(1, v3);
		
		
		if(listeVehicule.contains(v1)) {
			System.out.println("Le v1 existe dans la liste");
		}
		System.out.println(listeVehicule.indexOf(v1));
		
		System.out.println( v1.equals(v4));
	}

}
