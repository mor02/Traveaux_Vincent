package com.school.beans;

public class Etablissements {
 //Etablissements est la classe-mère
	
	private String nomEtablissement;
	private boolean isOpen;
	private static int nombreEleve;
	private final int nombreEleveMax;
	private String classe; //CP, CE1, 1ere, terminal, etc
	
	
	//constructeur:
	public Etablissements(String nomEtablissement, boolean isOpen, String classe, int nombreEleve, int nombreEleveMax) {
		this.nomEtablissement = nomEtablissement;
		this.isOpen = isOpen;
		this.classe = classe;
		this.nombreEleve = nombreEleve;
		this.nombreEleveMax = nombreEleveMax;
	}
	
	//méthodes
	public int AjoutEleve(int nombreAjout) {
		if (Etablissements.nombreEleve <= this.nombreEleveMax) {
			this.setNombreEleve(Etablissements.getNombreEleve() + nombreAjout);
		} else {
			System.out.println("école pleine");

		}
		return Etablissements.nombreEleve;
	}


	//getters et setters :
	public static int getNombreEleve() {
		return nombreEleve;
	}

	public void setNombreEleve(int nombreEleve) {
		this.nombreEleve = nombreEleve;
	}
	
	public String getNomEtablissement() {
		return nomEtablissement;
	}
	
	public void setNomEcole(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	//to String
	@Override
	public String toString() {
		//if this.isOpen = true
		return "L'établissement " + nomEtablissement + ConvertOuverture(isOpen) + ". Le nombre d'élève est " + nombreEleve;
	}
	
	//Conversion booléen
	public String ConvertOuverture(boolean isOpen) {
		if (isOpen == true) {
			return " est ouvert";
		}else {
			return " est fermé";
		}
	}
	
}
