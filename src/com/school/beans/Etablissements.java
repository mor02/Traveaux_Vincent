package com.school.beans;

public class Etablissements {

	private String nomEtablissement;
	private boolean isOpen;
	private int nombreEleve;
	private String classe; //CP, CE1, 1ere, terminal, etc
	
	
	//constructeur:
	public Etablissements(String nomEtablissement, boolean isOpen, String classe, int nombreEleve) {
		this.nomEtablissement = nomEtablissement;
		this.isOpen = isOpen;
		this.classe = classe;
		this.nombreEleve = nombreEleve;
	}
	
	//méthodes
	
	public void AjoutEleve(int nombreAjout) {
		this.nombreEleve = nombreEleve + nombreAjout;
	}

	//getters et setters :
	public int getNombreEleve() {
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
